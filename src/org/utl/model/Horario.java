/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.utl.model;

/**
 *
 * @author DaniV
 */
public class Horario {
    private int idHorario;
    private String horario;
    private DiaClase diaClase;

    public Horario() {
    }

    public Horario(int idHorario, String horario, DiaClase diaClase) {
        this.idHorario = idHorario;
        this.horario = horario;
        this.diaClase = diaClase;
    }

    public int getIdHorario() {
        return idHorario;
    }

    public void setIdHorario(int idHorario) {
        this.idHorario = idHorario;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public DiaClase getDiaClase() {
        return diaClase;
    }

    public void setDiaClase(DiaClase diaClase) {
        this.diaClase = diaClase;
    }

    @Override
    public String toString() {
        return "Horario{" + "idHorario=" + idHorario + ", horario=" + horario + ", diaClase=" + diaClase + '}';
    }
    
    
}
