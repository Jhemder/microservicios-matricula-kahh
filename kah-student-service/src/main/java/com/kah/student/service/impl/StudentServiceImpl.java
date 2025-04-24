package com.kah.student.service.impl;

import com.kah.student.dto.StudentDto;
import com.kah.student.entity.Student;
import com.kah.student.repository.StudentRepository;
import com.kah.student.service.IStudentService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentServiceImpl implements IStudentService {

    private final StudentRepository repository;

    public StudentServiceImpl(StudentRepository repository) {
        this.repository = repository;
    }

    private StudentDto toDto(Student s) {
        StudentDto dto = new StudentDto();
        dto.setId(s.getId());
        dto.setNombres(s.getNombres());
        dto.setApellidos(s.getApellidos());
        dto.setDocumento(s.getDocumento());
        dto.setEmail(s.getEmail());
        dto.setCarrera(s.getCarrera());
        dto.setEstado(s.getEstado());
        dto.setCiclo(s.getCiclo());
        return dto;
    }

    private Student toEntity(StudentDto dto) {
        Student s = new Student();
        s.setId(dto.getId());
        s.setNombres(dto.getNombres());
        s.setApellidos(dto.getApellidos());
        s.setDocumento(dto.getDocumento());
        s.setEmail(dto.getEmail());
        s.setCarrera(dto.getCarrera());
        s.setEstado(dto.getEstado());
        s.setCiclo(dto.getCiclo());
        return s;
    }

    @Override
    public List<StudentDto> listar() {
        return repository.findAll().stream().map(this::toDto).collect(Collectors.toList());
    }

    @Override
    public StudentDto guardar(StudentDto dto) {
        Student s = toEntity(dto);
        return toDto(repository.save(s));
    }

    @Override
    public StudentDto buscarPorId(Long id) {
        return repository.findById(id).map(this::toDto).orElse(null);
    }

    @Override
    public void eliminar(Long id) {
        repository.deleteById(id);
    }
}
