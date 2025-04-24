package com.kah.enrollment.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "kah-student-service")
public interface StudentClient {
    @GetMapping("/api/students/{id}")
    StudentResponse getStudentById(@PathVariable Long id);
}
