package com.kah.course.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "courses")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String codigo;
    private String nombre;
    private String ciclo;
    private String horario;
    private int capacidad;

    public Course() {}

    public Course(String codigo, String nombre, String ciclo, String horario, int capacidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.ciclo = ciclo;
        this.horario = horario;
        this.capacidad = capacidad;
    }

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCiclo() {
        return ciclo;
    }

    public String getHorario() {
        return horario;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCiclo(String ciclo) {
        this.ciclo = ciclo;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
}
