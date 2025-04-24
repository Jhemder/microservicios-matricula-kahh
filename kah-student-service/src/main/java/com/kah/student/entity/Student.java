package com.kah.student.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "students", uniqueConstraints = @UniqueConstraint(columnNames = "documento"))
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombres;
    private String apellidos;

    @Column(nullable = false, unique = true)
    private String documento;

    private String email;
    private String carrera;
    private String estado;
    private String ciclo;

    public Student() {}

    public Student(String nombres, String apellidos, String documento, String email, String carrera, String estado, String ciclo) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.documento = documento;
        this.email = email;
        this.carrera = carrera;
        this.estado = estado;
        this.ciclo = ciclo;
    }

    public Long getId() {
        return id;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getDocumento() {
        return documento;
    }

    public String getEmail() {
        return email;
    }

    public String getCarrera() {
        return carrera;
    }

    public String getEstado() {
        return estado;
    }

    public String getCiclo() {
        return ciclo;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setCiclo(String ciclo) {
        this.ciclo = ciclo;
    }
}
