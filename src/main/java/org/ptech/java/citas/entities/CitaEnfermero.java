package org.ptech.java.citas.entities;

import java.time.LocalDateTime;

import org.ptech.java.citas.entities.enums.EstadoCita;
import org.ptech.java.citas.interfaces.IAgendable;

public class CitaEnfermero extends Citas implements IAgendable{
    Enfermero enfermero;
    EstadoCita estado;
    String motivoCita;
    


    public CitaEnfermero(int id, LocalDateTime fecha, Paciente paciente, Consultorio consultorio, Enfermero enfermero,
            EstadoCita estado, String motivoCita) {
        super(id, fecha, paciente, consultorio);
        this.enfermero = enfermero;
        this.estado = estado;
        this.motivoCita = motivoCita;
    }

    public Enfermero getEnfermero() {
        return enfermero;
    }

    public void setEnfermero(Enfermero enfermero) {
        this.enfermero = enfermero;
    }

    public EstadoCita getEstado() {
        return estado;
    }

    public void setEstado(EstadoCita estado) {
        this.estado = estado;
    }

     @Override
    public boolean agendarCita(LocalDateTime fecha, 
                                Consultorio c) {
        this.setFecha(fecha);
        this.setConsultorio(c);
        return true;
    }


    @Override
    public boolean reAgendarCita(LocalDateTime nuevaFecha, 
                                Consultorio nuevoC) {
        this.setFecha(nuevaFecha);
        this.setConsultorio(nuevoC);
        return true;
    }

    @Override
    public boolean cancelarCita() {
        this.estado = EstadoCita.CANCELADA;
        return true;
    }

    public String getMotivoCita() {
        return motivoCita;
    }

    public void setMotivoCita(String motivoCita) {
        this.motivoCita = motivoCita;
    }

}
