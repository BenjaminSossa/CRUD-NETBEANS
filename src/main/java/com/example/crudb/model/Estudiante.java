package com.example.crudb.model;


import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import org.springframework.data.annotation.Id;

public class Estudiante {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String nombreCompleto;
    private String materia;
    private String calificacion;
    
    // Constructores
    public Estudiante() {
    }
    
    public Estudiante(String nombreCompleto, String materia, String calificacion) {
        this.nombreCompleto = nombreCompleto;
        this.materia = materia;
        this.calificacion = calificacion;
    }
    
    // Getters y Setters
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getNombreCompleto() {
        return nombreCompleto;
    }
    
    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }
    
    public String getMateria() {
        return materia;
    }
    
    public void setMateria(String materia) {
        this.materia = materia;
    }
    
    public String getCalificacion() {
        return calificacion;
    }
    
    public void setCalificacion(String calificacion) {
        this.calificacion = calificacion;
    }
    
    @Override
    public String toString() {
        return "Estudiante{" +
                "id=" + id +
                ", nombreCompleto='" + nombreCompleto + '\'' +
                ", materia='" + materia + '\'' +
                ", calificacion='" + calificacion + '\'' +
                '}';
    }
}