package com.kah.course.service;

import com.kah.course.dto.CourseDto;
import java.util.List;

public interface ICourseService {
    List<CourseDto> listar();
    CourseDto guardar(CourseDto dto);
    CourseDto buscarPorId(Long id);
    void eliminar(Long id);
}
