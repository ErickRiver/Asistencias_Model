/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.utl.model;

/**
 *
 * @author DaniV
 */
public class DiaInhabil {
    private int idDiaInhabil;
    private String fecha;
    private FormatoLista formatoLista;

    public DiaInhabil() {
    }

    public DiaInhabil(int idDiaInhabil, String fecha, FormatoLista formatoLista) {
        this.idDiaInhabil = idDiaInhabil;
        this.fecha = fecha;
        this.formatoLista = formatoLista;
    }

    public int getIdDiaInhabil() {
        return idDiaInhabil;
    }

    public void setIdDiaInhabil(int idDiaInhabil) {
        this.idDiaInhabil = idDiaInhabil;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public FormatoLista getFormatoLista() {
        return formatoLista;
    }

    public void setFormatoLista(FormatoLista formatoLista) {
        this.formatoLista = formatoLista;
    }

    @Override
    public String toString() {
        return "DiaInhabil{" + "idDiaInhabil=" + idDiaInhabil + ", fecha=" + fecha + ", formatoLista=" + formatoLista + '}';
    }

    
}
