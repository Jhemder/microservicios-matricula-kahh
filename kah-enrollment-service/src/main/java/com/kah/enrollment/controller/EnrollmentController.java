package com.kah.enrollment.controller;

import com.kah.enrollment.dto.EnrollmentDto;
import com.kah.enrollment.service.IEnrollmentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/enrollments")
public class EnrollmentController {

    private final IEnrollmentService service;

    public EnrollmentController(IEnrollmentService service) {
        this.service = service;
    }

    @GetMapping
    public List<EnrollmentDto> listar() {
        return service.listar();
    }

    @PostMapping
    public EnrollmentDto matricular(@RequestBody EnrollmentDto dto) {
        return service.matricular(dto);
    }
}
