package org.ptech.java.citas.entities;

import org.ptech.java.citas.entities.enums.tipoDocumento;

//Clase padre
//Superclase
//Clase maestra
//clase base
public class Usuario {

    //atributos a heredarse
    //deben ser protected

    protected int id;
    protected String nombres;
    protected String apéllidos;
    protected tipoDocumento tipoIdentificacion;
    protected Long numeroIdentificacion;
    
    //sobreescribir el metodo toString
    public String toString(){
        return "nombre: " + this.nombres;
    }
    public Usuario(int id, String nombres, String apéllidos, tipoDocumento tipoIdentificacion,
            Long numeroIdentificacion) {
        this.id = id;
        this.nombres = nombres;
        this.apéllidos = apéllidos;
        this.tipoIdentificacion = tipoIdentificacion;
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApéllidos() {
        return apéllidos;
    }

    public void setApéllidos(String apéllidos) {
        this.apéllidos = apéllidos;
    }

    public tipoDocumento getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public void setTipoIdentificacion(tipoDocumento tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

    public Long getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(Long numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    
}
