package org.ptech.java.citas.entities;

import org.ptech.java.citas.entities.enums.Especialidad;
import org.ptech.java.citas.entities.enums.tipoDocumento;

//Clases que heredan: 
//- clases hijas
// - subclases
// - clases detalle
// - clases especificas

public class Medico extends Usuario {
    
    private Long registroMedico;
    private Especialidad especialidad;

    public Medico(int id, 
                String nombres, 
                String apéllidos, 
                tipoDocumento tipoIdentificacion,
                Long numeroIdentificacion,
                Long registroMedico,
                Especialidad especialidad) {
        
        //Si quieres instanciar un medico
        //Tambien debes instanciar el usuario
        //Super en el constructor invoca (llama, ejecuta)
        //Al constructor de la clase padre (superclase)
        
        //Super () llamada al constructor de la super clase 
        //Debe ser lo primero que aparezca
        //Constructor de la clase hija 

        super(id, nombres, apéllidos, tipoIdentificacion, numeroIdentificacion);
        //a continuacion inicializamos
        //atributos propios de la clase hija
        this.registroMedico = registroMedico;
        this.especialidad = especialidad;
    }

    public Long getRegistroMedico() {
        return registroMedico;
    }

    public void setRegistroMedico(Long registroMedico) {
        this.registroMedico = registroMedico;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }


    
}
   
    
    