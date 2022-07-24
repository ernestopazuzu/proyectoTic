/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author jucue
 */
public class ClsVotante extends ClsPersona {
    
    private String direccion;

    public ClsVotante(String direccion, String numeroDocumento, String nombre, String numeroTelefonico, String correo) {
        super(numeroDocumento, nombre, numeroTelefonico, correo);
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    
}
