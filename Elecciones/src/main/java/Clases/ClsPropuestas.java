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
public class ClsPropuestas {
    
    private LinkedList<String> sociales;
    private LinkedList<String> politicas;
    private LinkedList<String> economicas;

    public ClsPropuestas(LinkedList<String> sociales, LinkedList<String> politicas, LinkedList<String> economicas) {
        this.sociales = sociales;
        this.politicas = politicas;
        this.economicas = economicas;
    }

    public LinkedList<String> getSociales() {
        return sociales;
    }

    public void setSociales(LinkedList<String> sociales) {
        this.sociales = sociales;
    }

    public LinkedList<String> getPoliticas() {
        return politicas;
    }

    public void setPoliticas(LinkedList<String> politicas) {
        this.politicas = politicas;
    }

    public LinkedList<String> getEconomicas() {
        return economicas;
    }

    public void setEconomicas(LinkedList<String> economicas) {
        this.economicas = economicas;
    }
    
    
}
