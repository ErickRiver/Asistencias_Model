/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.utl.model;

/**
 *
 * @author DaniV
 */
public class Usuario {

    private int idUsuario;
    private String username, contrasenia, rol;

    public Usuario() {
    }

    public Usuario(int idUsuario, String username, String contrasenia, String rol) {
        this.idUsuario = idUsuario;
        this.username = username;
        this.contrasenia = contrasenia;
        this.rol = rol;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    @Override
    public String toString() {
        return "Usuario{" + "idUsuario=" + idUsuario + ", username=" + username + ", contrasenia=" + contrasenia + ", rol=" + rol + '}';
    }

}
