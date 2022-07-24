/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import Clases.ClsCandidato;
import Modelos.MdlCandidato;

/**
 *
 * @author jucue
 */
public class CtlCandidato {
    
    MdlCandidato modelo;

    public CtlCandidato() {
        
            this.modelo = new MdlCandidato();
                
    }
    
    public boolean agregarCandidato(ClsCandidato candidato){
        
        boolean respuesta = this.modelo.agregarCandidato(candidato);
        return respuesta;
    }
    
}
