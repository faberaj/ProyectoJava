package com.example.capacitacionJava.controller;

public class Habilidad {
    private String nombre;
    private String nivel;
    private String experiencia;
    private String descripcion;

    // Constructor
    public Habilidad(String nombre, String nivel, String experiencia, String descripcion) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.experiencia = experiencia;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
