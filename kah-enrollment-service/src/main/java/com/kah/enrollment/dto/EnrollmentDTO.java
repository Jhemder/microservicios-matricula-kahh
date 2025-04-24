package com.kah.enrollment.dto;

public class EnrollmentDTO {
    private Long studentId;
    private Long courseId;
    private String ciclo;

    public EnrollmentDTO() {}

    public EnrollmentDTO(Long studentId, Long courseId, String ciclo) {
        this.studentId = studentId;
        this.courseId = courseId;
        this.ciclo = ciclo;
    }

    public Long getStudentId() {
        return studentId;
    }

    public Long getCourseId() {
        return courseId;
    }

    public String getCiclo() {
        return ciclo;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    public void setCiclo(String ciclo) {
        this.ciclo = ciclo;
    }
}
