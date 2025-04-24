package com.kah.enrollment.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "kah-course-service")
public interface CourseClient {
    @GetMapping("/api/courses/{id}")
    CourseResponse getCourseById(@PathVariable Long id);
}
