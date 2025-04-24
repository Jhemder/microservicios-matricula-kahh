package com.kah.student.controller;

import com.kah.student.dto.StudentDto;
import com.kah.student.service.IStudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    private final IStudentService service;

    public StudentController(IStudentService service) {
        this.service = service;
    }

    @GetMapping
    public List<StudentDto> listar() {
        return service.listar();
    }

    @PostMapping
    public StudentDto guardar(@RequestBody StudentDto dto) {
        return service.guardar(dto);
    }

    @GetMapping("/{id}")
    public StudentDto buscar(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        service.eliminar(id);
    }
}
