package org.ptech.java.citas;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.ptech.java.citas.entities.Enfermero;
import org.ptech.java.citas.entities.Medico;
import org.ptech.java.citas.entities.enums.Especialidad;
import org.ptech.java.citas.entities.enums.tipoDocumento;

public class Main {
        public static void main(String[] args) {
                // crear un medico
                Medico m1 = new Medico(1, "Josefa",
                                "Gomez",
                                tipoDocumento.CC,
                                2165421L,
                                346445L,
                                Especialidad.CARDIOLOGIA);
                System.out.println("Id del medico: " + m1.getId() + "   " + "Nombre del medico: " + m1.getNombres()
                                + " " + m1.getApéllidos() + "  " + "Especialidad:  " + " " + Especialidad.DERMATOLOGIA);

                // Crear un enfermero:
                Enfermero e1 = new Enfermero(8, "Jarisco", "Rendon", tipoDocumento.CC, 478963258L);
                // añadir dos procedimientos al enfermero
                e1.addProcedure("Aplicar inyecciones");
                e1.addProcedure("Lavado de oidos");
                // recorrer los porcedimientos de e1
                for (String p : e1.getProcedimientos()) {
                        System.out.println("Procedimiento: " + p);
                }
        }

}