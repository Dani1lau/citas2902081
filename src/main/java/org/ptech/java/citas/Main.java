package org.ptech.java.citas;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.ptech.java.citas.entities.CitaEnfermero;
import org.ptech.java.citas.entities.CitaMedico;
import org.ptech.java.citas.entities.Consultorio;
import org.ptech.java.citas.entities.Enfermero;
import org.ptech.java.citas.entities.Medico;
import org.ptech.java.citas.entities.Paciente;
import org.ptech.java.citas.entities.enums.Especialidad;
import org.ptech.java.citas.entities.enums.EstadoCita;
import org.ptech.java.citas.entities.enums.TipoSangre;
import org.ptech.java.citas.entities.enums.tipoDocumento;

public class Main {
        public static void main(String[] args) {

                // Crear un consultorio
                Consultorio c1 = new Consultorio(6, "cra87", 9);

                Consultorio c2 = new Consultorio(2, "av 76 b", 87);

                Consultorio c3 = new Consultorio(5, "dg 45 ", 8);

                // crear un medico
                Medico m1 = new Medico(1, "Josefa",
                                "Gomez",
                                tipoDocumento.CC,
                                2165421L,
                                346445L,
                                Especialidad.MEDICINA_GENERAL);
                System.out.println("Id del medico: " + m1.getId() + "   " + "Nombre del medico: " + m1.getNombres()
                                + " " + m1.getApéllidos() + "  " + "Especialidad:  " + " "
                                + Especialidad.MEDICINA_GENERAL);

                Medico m2 = new Medico(2, "Jose",
                                "Gomez",
                                tipoDocumento.CC,
                                2166521L,
                                346475L,
                                Especialidad.MEDICINA_GENERAL);
                System.out.println("Id del medico: " + m1.getId() + "   " + "Nombre del medico: " + m2.getNombres()
                                + " " + m2.getApéllidos() + "  " + "Especialidad:  " + " "
                                + Especialidad.MEDICINA_GENERAL);

                // Crear un enfermero:
                Enfermero e1 = new Enfermero(8, "Jarisco", "Rendon", tipoDocumento.CC, 478963258L);
                // añadir dos procedimientos al enfermero
                e1.addProcedure("Aplicar inyecciones");
                e1.addProcedure("Lavado de oidos");
                // recorrer los porcedimientos de e1
                for (String p : e1.getProcedimientos()) {
                        System.out.println("Procedimiento: " + p);
                }

                Enfermero e2 = new Enfermero(4, "Javier", "Ramos", tipoDocumento.CE, 4963258L);
                // añadir dos procedimientos al enfermero
                e2.addProcedure("Aplicar inyecciones");
                e2.addProcedure("Lavado de oidos");
                // recorrer los porcedimientos de e2
                for (String p : e2.getProcedimientos()) {
                        System.out.println("Procedimiento: " + p);
                }

                Enfermero e3 = new Enfermero(6, "Petunia", "Rosales", tipoDocumento.PPT, 494598658L);
                // añadir dos procedimientos al enfermero
                e3.addProcedure("Aplicar inyecciones");
                e3.addProcedure("Lavado de oidos");
                // recorrer los porcedimientos de e1
                for (String p : e3.getProcedimientos()) {
                        System.out.println("Procedimiento: " + p);
                }

                // Crear un paciente
                Paciente p1 = new Paciente(3, "Cristian", "Rojas", tipoDocumento.RC, 76465456545L, "Cr1230@", 65479652L,
                                LocalDate.now(), 1.55, 54.1, TipoSangre.AB, '+');

                Paciente p2 = new Paciente(4, "Sofia", "Guzman", tipoDocumento.TI, 576445L, "sogu@", 56472522L,
                                LocalDate.now(), 1.60, 53.9, TipoSangre.B, '+');

                Paciente p3 = new Paciente(5, "Rasputia", "Lopez", tipoDocumento.PPT, 043045L, "Rasplo@", 3205762L,
                                LocalDate.now(), 1.66, 55.3, TipoSangre.O, '+');

                Paciente p4 = new Paciente(6, "Rebeca", "Suarez", tipoDocumento.RC, 7876545L, "Sua098@", 63456782L,
                                LocalDate.now(), 1.50, 55.9, TipoSangre.AB, '-');

                Paciente p5 = new Paciente(7, "Norbith", "Ruiz", tipoDocumento.CM, 041245L, "norS9@", 98765L,
                                LocalDate.now(), 1.80, 70.2, TipoSangre.A, '+');

                CitaMedico cm1 = new CitaMedico(134, LocalDateTime.now(), p1, c1, m1, EstadoCita.AGENDADA, "Gripa");

                System.out.println(cm1.getFecha() + " | " + "Consultorio: " + c1.getNumero() + " | "
                                + "nombre del medico: " + m1.getNombres() + " | " + "Apellido del medico: "
                                + m1.getApéllidos());
                cm1.cancelarCita();
                System.out.println("El estado de la cita es: " + cm1.getEstado());

                CitaMedico cm2 = new CitaMedico(14, LocalDateTime.now(), p2, c2, m2, EstadoCita.AGENDADA,
                                "Escopolamina");
                System.out.println(cm2.getFecha() + " | " + "Consultorio: " + c2.getNumero() + " | "
                                + "Nombre del medico: " + m2.getNombres() + " | " + "Apellido del medico: "
                                + m2.getApéllidos());

                CitaEnfermero ce1 = new CitaEnfermero(45, LocalDateTime.now(), p3, c3, e1, EstadoCita.AGENDADA,
                                "Vacuna covid");
                System.out.println(ce1.getFecha() + " | " + "Consultorio: " + c3.getNumero() + " | "
                                + "Nombre del enfermero: " + e1.getNombres() + " | " + "Apellido del enfermero: "
                                + e1.getApéllidos());

                CitaEnfermero ce2 = new CitaEnfermero(78, LocalDateTime.now(), p4, c1, e2, EstadoCita.AGENDADA,
                                "Dolor de oidos");
                System.out.println(ce2.getFecha() + " | " + "Consultorio: " + c1.getNumero() + " | "
                                + "Nombre del enfermero: " + e2.getNombres() + " | " + "Apellido del enfermero: "
                                + e2.getApéllidos());

                CitaEnfermero ce3 = new CitaEnfermero(38, LocalDateTime.now(), p5, c2, e3, EstadoCita.AGENDADA,
                                "Vacuna rabia");
                System.out.println(ce3.getFecha() + " | " + "Consultorio: " + c2.getNumero() + " | "
                                + "Nombre del enfermero: " + e3.getNombres() + " | " + "Apellido del enfermero: "
                                + e3.getApéllidos());

        }

}