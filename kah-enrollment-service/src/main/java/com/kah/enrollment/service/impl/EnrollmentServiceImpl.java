package com.kah.enrollment.service.impl;

import com.kah.enrollment.client.CourseClient;
import com.kah.enrollment.client.CourseResponse;
import com.kah.enrollment.client.StudentClient;
import com.kah.enrollment.client.StudentResponse;
import com.kah.enrollment.dto.EnrollmentDto;
import com.kah.enrollment.entity.Enrollment;
import com.kah.enrollment.repository.EnrollmentRepository;
import com.kah.enrollment.service.IEnrollmentService;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class EnrollmentServiceImpl implements IEnrollmentService {

    private final EnrollmentRepository repository;
    private final StudentClient studentClient;
    private final CourseClient courseClient;

    public EnrollmentServiceImpl(
            EnrollmentRepository repository,
            StudentClient studentClient,
            CourseClient courseClient
    ) {
        this.repository = repository;
        this.studentClient = studentClient;
        this.courseClient = courseClient;
    }

    @Override
    public List<EnrollmentDto> listar() {
        return repository.findAll().stream().map(e -> {
            EnrollmentDto dto = new EnrollmentDto();
            dto.setStudentId(e.getStudentId());
            dto.setCourseId(e.getCourseId());
            dto.setCiclo(e.getCiclo());
            dto.setFechaMatricula(e.getFechaMatricula());
            return dto;
        }).collect(Collectors.toList());
    }

    @Override
    public EnrollmentDto matricular(EnrollmentDto dto) {
        StudentResponse student = studentClient.getStudentById(dto.getStudentId());
        CourseResponse course = courseClient.getCourseById(dto.getCourseId());

        if (!"ACTIVO".equalsIgnoreCase(student.getEstado())) {
            throw new RuntimeException("El estudiante no está activo");
        }

        if (course.getCapacidad() <= 0) {
            throw new RuntimeException("El curso no tiene capacidad");
        }

        Enrollment e = new Enrollment();
        e.setStudentId(dto.getStudentId());
        e.setCourseId(dto.getCourseId());
        e.setCiclo(dto.getCiclo());
        e.setFechaMatricula(LocalDate.now());

        repository.save(e);
        return dto;
    }
}
