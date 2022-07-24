/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.LinkedList;

/**
 *
 * @author jucue
 */
public class ClsEleccion {
    
    private LinkedList<ClsCandidato> listaCandidatos;
    private LinkedList<ClsVotante> listaVotantes;
    private String fechaInicio;
    private String fechaFin;
    private String estado;
    private ClsCandidato ganador;

    public ClsEleccion(LinkedList<ClsCandidato> listaCandidatos, LinkedList<ClsVotante> listaVotantes, String fechaInicio, String fechaFin, String estado, ClsCandidato ganador) {
        this.listaCandidatos = listaCandidatos;
        this.listaVotantes = listaVotantes;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.estado = estado;
        this.ganador = ganador;
    }

    public LinkedList<ClsCandidato> getListaCandidatos() {
        return listaCandidatos;
    }

    public void setListaCandidatos(LinkedList<ClsCandidato> listaCandidatos) {
        this.listaCandidatos = listaCandidatos;
    }

    public LinkedList<ClsVotante> getListaVotantes() {
        return listaVotantes;
    }

    public void setListaVotantes(LinkedList<ClsVotante> listaVotantes) {
        this.listaVotantes = listaVotantes;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public ClsCandidato getGanador() {
        return ganador;
    }

    public void setGanador(ClsCandidato ganador) {
        this.ganador = ganador;
    }
    
    
}
