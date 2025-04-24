package com.kah.enrollment.controller;

import com.kah.enrollment.dto.EnrollmentDTO;
import com.kah.enrollment.entity.Enrollment;
import com.kah.enrollment.service.EnrollmentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/enrollments")
public class EnrollmentController {

    private final EnrollmentService enrollmentService;

    public EnrollmentController(EnrollmentService enrollmentService) {
        this.enrollmentService = enrollmentService;
    }

    @GetMapping
    public List<Enrollment> getAll() {
        return enrollmentService.getAll();
    }

    @PostMapping
    public Enrollment enroll(@RequestBody EnrollmentDTO dto) {
        return enrollmentService.enroll(dto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        enrollmentService.deleteEnrollment(id);
    }
}
