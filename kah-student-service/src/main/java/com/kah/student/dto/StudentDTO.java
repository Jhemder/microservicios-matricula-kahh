package com.kah.student.dto;

public class StudentDTO {

    private Long id;
    private String nombres;
    private String apellidos;
    private String documento;
    private String email;
    private String carrera;
    private String estado;
    private String ciclo;

    public StudentDTO() {}

    public StudentDTO(Long id, String nombres, String apellidos, String documento, String email, String carrera, String estado, String ciclo) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.documento = documento;
        this.email = email;
        this.carrera = carrera;
        this.estado = estado;
        this.ciclo = ciclo;
    }

    // Getters y Setters
}
