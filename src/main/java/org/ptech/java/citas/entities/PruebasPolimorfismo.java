package org.ptech.java.citas.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.ptech.java.citas.entities.enums.Especialidad;
import org.ptech.java.citas.entities.enums.TipoSangre;
import org.ptech.java.citas.entities.enums.tipoDocumento;

public class PruebasPolimorfismo {
    public static void main(String[] args) {
        // Instanciar un usuario
        Usuario u = new Medico(1,
                "Betulia",
                "Rojas",
                tipoDocumento.CC,
                7461874L,
                8512545L,
                Especialidad.OTORRINOLARINGOLOGIA);

        System.out.println(u.toString());

        Usuario u2 = new Paciente(2,
                "Julio",
                "Campos",
                tipoDocumento.CE,
                7964554L,
                "fghj@",
                87465L, LocalDate.now(),
                1.50,
                55.6,
                TipoSangre.AB,
                '+');

        System.out.println(u2.toString());

        Consultorio c2 = new Consultorio(510,
                "Calle 16 # 25",
                54);

        System.out.println(c2.toString());
    }

}
