package com.kah.enrollment.service;

import com.kah.enrollment.dto.EnrollmentDto;
import java.util.List;

public interface IEnrollmentService {
    List<EnrollmentDto> listar();
    EnrollmentDto matricular(EnrollmentDto dto);
}
