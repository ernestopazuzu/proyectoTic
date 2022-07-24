/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author jucue
 */
public class ClsCandidato extends ClsPersona {
    
    private String partidoPolitico;
    private String ciudadNatal;
    private String descripcion;
    private String mensajeCampania;
    private String propuestas;

    public ClsCandidato(String partidoPolitico, String ciudadNatal, String descripcion, String mensajeCampania, String propuestas, String numeroDocumento, String nombre, String numeroTelefonico, String correo) {
        super(numeroDocumento, nombre, numeroTelefonico, correo);
        this.partidoPolitico = partidoPolitico;
        this.ciudadNatal = ciudadNatal;
        this.descripcion = descripcion;
        this.mensajeCampania = mensajeCampania;
        this.propuestas = propuestas;
    }

    public String getPartidoPolitico() {
        return partidoPolitico;
    }

    public void setPartidoPolitico(String partidoPolitico) {
        this.partidoPolitico = partidoPolitico;
    }

    public String getCiudadNatal() {
        return ciudadNatal;
    }

    public void setCiudadNatal(String ciudadNatal) {
        this.ciudadNatal = ciudadNatal;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getMensajeCampania() {
        return mensajeCampania;
    }

    public void setMensajeCampania(String mensajeCampania) {
        this.mensajeCampania = mensajeCampania;
    }

    public String getPropuestas() {
        return propuestas;
    }

    public void setPropuestas(String propuestas) {
        this.propuestas = propuestas;
    }
    
    
}
