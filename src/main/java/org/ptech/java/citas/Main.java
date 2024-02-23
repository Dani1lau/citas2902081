package org.ptech.java.citas;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.ptech.java.citas.entities.Citas;
import org.ptech.java.citas.entities.Consultorio;
import org.ptech.java.citas.entities.Especialidad;
import org.ptech.java.citas.entities.EstadoCita;
import org.ptech.java.citas.entities.Medico;
import org.ptech.java.citas.entities.Paciente;
import org.ptech.java.citas.entities.TipoSangre;
import org.ptech.java.citas.entities.tipoDocumento;

public class Main {
    public static void main(String[] args) {
        // Crear un objeto medico
        // Instanciar medico
        // Una manera de dar valor
        // a atributos privados en una clase
        // es a traves de el constructor
        // parametrico
        Medico m = new Medico(1,
                "Martha",
                "Diaz",
                tipoDocumento.CC,
                1425242214L,
                354321354L,
                Especialidad.MEDICINA_GENERAL);

        // Instanciar otro medico
        Medico m2 = new Medico();
        // Se debe utilizar primero el setter
        // del atributo a asignar
        m2.setNombres("Tulio");
        m2.setApéllidos("Hernandez");
        m2.setNumeroIdentificacion(9485223L);
        System.out.println(m2.getNombres() + " " +
                m2.getApéllidos());

        Consultorio c = new Consultorio(12,
                "calle127#21",
                45274);
        Consultorio c2 = new Consultorio();
        c2.setDireccion("calle126");
        c2.setNumero(47631);
        System.out.println(c2.getDireccion() + " " +
                c2.getNumero());

        Paciente p = new Paciente(14, "Cesar", "Perez", tipoDocumento.CC, 4554545L, "df@gmail", 3045784628L,
                LocalDate.now(), 186.1, 56.4, TipoSangre.AB, '-');

        Paciente p2 = new Paciente();
        p2.setTipoIdentificacion(tipoDocumento.CC);
        p2.setNombres("Hortencia");
        p2.setApéllidos("Ochoa");
        p2.setNumeroIdentificacion(45467458745L);
        p2.setEmail("fgwe@gmail");

        System.out.println(p2.getNombres() + " " + p2.getApéllidos() + " " + p2.getTipoIdentificacion() + " "
                + p2.getNumeroIdentificacion());

        Citas ct = new Citas(54, LocalDateTime.now(), m2, p2, c2, EstadoCita.AGENDADA);

        Citas ct2 = new Citas();
        ct2.setConsultorio(c);
        ct2.setMedico(m);
        ct2.setPaciente(p);
        ct2.setEstado(EstadoCita.AGENDADA);
        ct2.setFecha(LocalDateTime.now());

        System.out.println(ct2.getConsultorio() + " " + ct2.getEstado() + " " + ct2.getFecha() + " " + ct2.getMedico()
                + " " + ct2.getPaciente());
    }
}