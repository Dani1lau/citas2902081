package org.ptech.java.citas.entities;

import java.time.LocalDate;

public class Paciente {
   private int id;
   private String nombres;
   private String apéllidos;
   private tipoDocumento tipoIdentificacion;
   private Long numeroIdentificacion;
   private String email;
   private Long celular;
   private LocalDate fechaNacimiento;
   private Double altura;
   private Double peso;
   private TipoSangre tipoSangre;
   private char factorRH;

    public Paciente() {
    }

    public Paciente(int id, String nombres, String apéllidos, tipoDocumento tipoIdentificacion,
            Long numeroIdentificacion, String email, Long celular, LocalDate fechaNacimiento, Double altura,
            Double peso, TipoSangre tipoSangre, char factorRH) {
        this.id = id;
        this.nombres = nombres;
        this.apéllidos = apéllidos;
        this.tipoIdentificacion = tipoIdentificacion;
        this.numeroIdentificacion = numeroIdentificacion;
        this.email = email;
        this.celular = celular;
        this.fechaNacimiento = fechaNacimiento;
        this.altura = altura;
        this.peso = peso;
        this.tipoSangre = tipoSangre;
        this.factorRH = factorRH;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getCelular() {
        return celular;
    }

    public void setCelular(Long celular) {
        this.celular = celular;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public TipoSangre getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(TipoSangre tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    public char getFactorRH() {
        return factorRH;
    }

    public void setFactorRH(char factorRH) {
        this.factorRH = factorRH;
    }

}
