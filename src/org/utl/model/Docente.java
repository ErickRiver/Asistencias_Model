/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.utl.model;

/**
 *
 * @author DaniV
 */
public class Docente {
    private int idDocente;
    private String nombre, apellido, especialidad;
    private Usuario usuario;

    public Docente() {
    }

    public Docente(int idDocente, String nombre, String apellido, String especialidad, Usuario usuario) {
        this.idDocente = idDocente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.especialidad = especialidad;
        this.usuario = usuario;
    }

    public int getIdDocente() {
        return idDocente;
    }

    public void setIdDocente(int idDocente) {
        this.idDocente = idDocente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "Docente{" + "idDocente=" + idDocente + ", nombre=" + nombre + ", apellido=" + apellido + ", especialidad=" + especialidad + ", usuario=" + usuario + '}';
    }
    
    
}
