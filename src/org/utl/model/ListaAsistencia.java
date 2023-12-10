/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.utl.model;

/**
 *
 * @author DaniV
 */
public class ListaAsistencia {
    private int idListaAsistencia;
    private int semana;
    private Alumno alumno;
    private Materia materia;
    private Docente docente;
    private String dia, hora;
    private char asistencia;

    public ListaAsistencia() {
    }

    public ListaAsistencia(int idListaAsistencia, int semana, Alumno alumno, Materia materia, Docente docente, String dia, String hora, char asistencia) {
        this.idListaAsistencia = idListaAsistencia;
        this.semana = semana;
        this.alumno = alumno;
        this.materia = materia;
        this.docente = docente;
        this.dia = dia;
        this.hora = hora;
        this.asistencia = asistencia;
    }

    public int getIdListaAsistencia() {
        return idListaAsistencia;
    }

    public void setIdListaAsistencia(int idListaAsistencia) {
        this.idListaAsistencia = idListaAsistencia;
    }

    public int getSemana() {
        return semana;
    }

    public void setSemana(int semana) {
        this.semana = semana;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
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

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public char getAsistencia() {
        return asistencia;
    }

    public void setAsistencia(char asistencia) {
        this.asistencia = asistencia;
    }


    @Override
    public String toString() {
        return "ListaAsistencia{" + "idListaAsistencia=" + idListaAsistencia + ", semana=" + semana + ", alumno=" + alumno + ", materia=" + materia + ", docente=" + docente + ", dia=" + dia + ", hora=" + hora + ", asistencia=" + asistencia + '}';
    }

    
    
    
}
