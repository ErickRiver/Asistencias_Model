/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.utl.model;

/**
 *
 * @author DaniV
 */
public class Alumno {
    private int idAlumno;
    private String nombre, apellido, fechaNacimiento;
    private Usuario usuario;
    private Grupo grupo;

    public Alumno() {
    }

    public Alumno(int idAlumno, String nombre, String apellido, String fechaNacimiento, Usuario usuario, Grupo grupo) {
        this.idAlumno = idAlumno;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.usuario = usuario;
        this.grupo = grupo;
    }

    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
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

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    @Override
    public String toString() {
        return "Alumno{" + "idAlumno=" + idAlumno + ", nombre=" + nombre + ", apellido=" + apellido + ", fechaNacimiento=" + fechaNacimiento + ", usuario=" + usuario + ", grupo=" + grupo + '}';
    }

   
    
}
