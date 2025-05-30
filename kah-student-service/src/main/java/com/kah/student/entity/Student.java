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
    private String estado; // Ej: ACTIVO, INACTIVO
    private String ciclo;

    public Student(String kevin, String abarca, String number, String mail, String sistemas, String activo, String vii) {
    }

    public Student() {

    }

    // Getters y setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNombres() { return nombres; }
    public void setNombres(String nombres) { this.nombres = nombres; }

    public String getApellidos() { return apellidos; }
    public void setApellidos(String apellidos) { this.apellidos = apellidos; }

    public String getDocumento() { return documento; }
    public void setDocumento(String documento) { this.documento = documento; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getCarrera() { return carrera; }
    public void setCarrera(String carrera) { this.carrera = carrera; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }

    public String getCiclo() { return ciclo; }
    public void setCiclo(String ciclo) { this.ciclo = ciclo; }
}
