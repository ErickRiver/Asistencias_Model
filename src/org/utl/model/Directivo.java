/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.utl.model;

/**
 *
 * @author DaniV
 */
public class Directivo {
    private int idDirectivo;
    private String nombre, apellido, puesto;
    private Usuario usuario;

    public Directivo() {
    }

    public Directivo(int idDirectivo, String nombre, String apellido, String puesto, Usuario usuario) {
        this.idDirectivo = idDirectivo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.puesto = puesto;
        this.usuario = usuario;
    }

    public int getIdDirectivo() {
        return idDirectivo;
    }

    public void setIdDirectivo(int idDirectivo) {
        this.idDirectivo = idDirectivo;
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

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "Directivo{" + "idDirectivo=" + idDirectivo + ", nombre=" + nombre + ", apellido=" + apellido + ", puesto=" + puesto + ", usuario=" + usuario + '}';
    }

    
    
    
}
