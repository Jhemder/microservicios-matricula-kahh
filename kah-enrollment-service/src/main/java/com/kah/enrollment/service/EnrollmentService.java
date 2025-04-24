package com.kah.enrollment.service;

import com.kah.enrollment.dto.EnrollmentDTO;
import com.kah.enrollment.entity.Enrollment;
import com.kah.enrollment.repository.EnrollmentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnrollmentService {

    private final EnrollmentRepository enrollmentRepository;

    public EnrollmentService(EnrollmentRepository enrollmentRepository) {
        this.enrollmentRepository = enrollmentRepository;
    }

    public List<Enrollment> getAll() {
        return enrollmentRepository.findAll();
    }

    public Enrollment enroll(EnrollmentDTO dto) {
        Enrollment enrollment = new Enrollment(dto.getStudentId(), dto.getCourseId(), dto.getCiclo());
        return enrollmentRepository.save(enrollment);
    }

    public void deleteEnrollment(Long id) {
        enrollmentRepository.deleteById(id);
    }
}
