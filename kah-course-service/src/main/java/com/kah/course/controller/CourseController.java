package com.kah.course.controller;

import com.kah.course.dto.CourseDto;
import com.kah.course.service.ICourseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/courses")
public class CourseController {

    private final ICourseService service;

    public CourseController(ICourseService service) {
        this.service = service;
    }

    @GetMapping
    public List<CourseDto> listar() {
        return service.listar();
    }

    @PostMapping
    public CourseDto guardar(@RequestBody CourseDto dto) {
        return service.guardar(dto);
    }

    @GetMapping("/{id}")
    public CourseDto buscar(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        service.eliminar(id);
    }
}
