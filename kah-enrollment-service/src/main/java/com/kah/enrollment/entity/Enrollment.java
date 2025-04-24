package com.kah.enrollment.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "enrollments")
public class Enrollment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long studentId;
    private Long courseId;
    private String ciclo;

    private LocalDate fechaMatricula;

    public Enrollment() {
        this.fechaMatricula = LocalDate.now();
    }

    public Enrollment(Long studentId, Long courseId, String ciclo) {
        this.studentId = studentId;
        this.courseId = courseId;
        this.ciclo = ciclo;
        this.fechaMatricula = LocalDate.now();
    }

    // Getters y Setters
    public Long getId() { return id; }

    public Long getStudentId() { return studentId; }

    public Long getCourseId() { return courseId; }

    public String getCiclo() { return ciclo; }

    public LocalDate getFechaMatricula() { return fechaMatricula; }

    public void setId(Long id) { this.id = id; }

    public void setStudentId(Long studentId) { this.studentId = studentId; }

    public void setCourseId(Long courseId) { this.courseId = courseId; }

    public void setCiclo(String ciclo) { this.ciclo = ciclo; }

    public void setFechaMatricula(LocalDate fechaMatricula) { this.fechaMatricula = fechaMatricula; }
}
