package org.ptech.java.citas.entities;

import java.util.ArrayList;
import java.util.List;

import org.ptech.java.citas.entities.enums.tipoDocumento;

public class Enfermero extends Usuario {

    private List<String> procedimientos;

    public Enfermero(int id,
            String nombres,
            String apéllidos,
            tipoDocumento tipoIdentificacion,
            Long numeroIdentificacion) {
                
                //1. llamar al constructor de
                //la superclase
        super(id,
                nombres,
                apéllidos,
                tipoIdentificacion,
                numeroIdentificacion);
                //2. inicializar atributos
                //intrinsecos del objeto

                this.procedimientos = new ArrayList<String>();
    }

    @Override
    public String toString() {
        return "Enfermero [procedimientos=" + procedimientos + "]" + super.id + super.nombres + super.apéllidos;
    }

    public void addProcedure(String procedure) {
        // añadir el procedimiento
        // a la lista de procedimientos
        this.procedimientos.add(procedure);
    }

    public List<String> getProcedimientos() {
        return procedimientos;
    }

    
}
