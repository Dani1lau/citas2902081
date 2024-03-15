package org.ptech.java.citas.entities;

import java.time.LocalDateTime;

import org.ptech.java.citas.entities.enums.EstadoCita;
import org.ptech.java.citas.interfaces.IAgendable;

public class CitaMedico extends Citas implements IAgendable {

    Medico medico;
    EstadoCita estado;
    private String motivoCita;

    public CitaMedico(int id, LocalDateTime fecha, Paciente paciente, Consultorio consultorio, Medico medico,
            EstadoCita estado, String motivoCita) {
        super(id, fecha, paciente, consultorio);
        this.medico = medico;
        this.estado = estado;
        this.motivoCita = motivoCita;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public EstadoCita getEstado() {
        return estado;
    }

    public void setEstado(EstadoCita estado) {
        this.estado = estado;
    }
    public String getmotivoCita() {
        return motivoCita;
    }

    public void setmotivoCita(String motivoCita) {
        this.motivoCita = motivoCita;
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
