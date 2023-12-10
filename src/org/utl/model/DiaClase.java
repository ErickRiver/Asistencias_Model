/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.utl.model;

/**
 *
 * @author DaniV
 */
public class DiaClase {
    private int idDiaClase;
    private String dia;
    private FormatoLista formatoLista;

    public DiaClase() {
    }

    public DiaClase(int idDiaClase, String dia, FormatoLista formatoLista) {
        this.idDiaClase = idDiaClase;
        this.dia = dia;
        this.formatoLista = formatoLista;
    }

    public int getIdDiaClase() {
        return idDiaClase;
    }

    public void setIdDiaClase(int idDiaClase) {
        this.idDiaClase = idDiaClase;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public FormatoLista getFormatoLista() {
        return formatoLista;
    }

    public void setFormatoLista(FormatoLista formatoLista) {
        this.formatoLista = formatoLista;
    }

    @Override
    public String toString() {
        return "DiaClase{" + "idDiaClase=" + idDiaClase + ", dia=" + dia + ", formatoLista=" + formatoLista + '}';
    }

    
}
