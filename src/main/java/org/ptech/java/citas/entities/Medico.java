package org.ptech.java.citas.entities;

public class Medico {

    // POR REGLA GENERAL:
    // los atributos de una clase 
    // debe ser private
    private int id;
    private String nombres;
    private String apéllidos;
    private tipoDocumento tipoIdentificacion;
    private Long numeroIdentificacion;
    private Long registroMedico;
    private Especialidad especialidad;

    // Constructor por defecto
    // siempre debe ser public
    public Medico() {

    }

    // constructor parametrizado

    public Medico(int id, String nombres, String apéllidos, tipoDocumento tipoIdentificacion, Long numeroIdentificacion,
            Long registroMedico, Especialidad especialidad) {
        this.id = id;
        this.nombres = nombres;
        this.apéllidos = apéllidos;
        this.tipoIdentificacion = tipoIdentificacion;
        this.numeroIdentificacion = numeroIdentificacion;
        this.registroMedico = registroMedico;
        this.especialidad = especialidad;
    }

    //Getters y Setters
    //deben ser publicos
    //Firma de un Getter:
    //Tipo de dato de retorno:
    //                         es el t.d del atributo 
    //Nombre del metodo:
    //            get seguido del nombre del atributo 
    //Parametros: 0
    //Retorna: El valor del atributo
    public String getNombres() {
        //return sirve para
        //retornar el valor
        //al invocante
        return this.nombres;
    }

    //Setter: sirve para asignar
    //un valor a un atributo privado
    //Firma de un setter:
    //- Tipo de dato de retorno: void
    //- Nombre: set seguido del nombre del atributo 
    //- Parametros: 1, input del valor a asignar al atributo
    //- Retorna: nada
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
