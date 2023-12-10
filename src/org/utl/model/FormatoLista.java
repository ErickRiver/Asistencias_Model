/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.utl.model;

/**
 *
 * @author DaniV
 */
public class FormatoLista {
    private int idFormatoLista, semanas;
    private Materia materia;
    private Docente docente;
    private Grupo grupo;
    private String periodo;
    private int nomenclatura;

    public FormatoLista() {
    }

    public FormatoLista(int idFormatoLista, int semanas, Materia materia, Docente docente, Grupo grupo, String periodo, int nomenclatura) {
        this.idFormatoLista = idFormatoLista;
        this.semanas = semanas;
        this.materia = materia;
        this.docente = docente;
        this.grupo = grupo;
        this.periodo = periodo;
        this.nomenclatura = nomenclatura;
    }

    public int getIdFormatoLista() {
        return idFormatoLista;
    }

    public void setIdFormatoLista(int idFormatoLista) {
        this.idFormatoLista = idFormatoLista;
    }

    public int getSemanas() {
        return semanas;
    }

    public void setSemanas(int semanas) {
        this.semanas = semanas;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public Docente getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    public int getNomenclatura() {
        return nomenclatura;
    }

    public void setNomenclatura(int nomenclatura) {
        this.nomenclatura = nomenclatura;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    @Override
    public String toString() {
        return "FormatoLista{" + "idFormatoLista=" + idFormatoLista + ", semanas=" + semanas + ", materia=" + materia + ", docente=" + docente + ", grupo=" + grupo + ", periodo=" + periodo + ", nomenclatura=" + nomenclatura + '}';
    }
    
}
