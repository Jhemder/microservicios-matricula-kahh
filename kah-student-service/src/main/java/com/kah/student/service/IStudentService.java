package com.kah.student.service;

import com.kah.student.dto.StudentDto;
import java.util.List;

public interface IStudentService {
    List<StudentDto> listar();
    StudentDto guardar(StudentDto dto);
    StudentDto buscarPorId(Long id);
    void eliminar(Long id);
}
