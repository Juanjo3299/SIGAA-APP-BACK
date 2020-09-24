package com.api.sigaa.app.model.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "SIGAA_ALUMNO_EVENTO", schema = "dbo", catalog = "SIGAA")
public class SigaaAlumnoEvento {
    private int idAlumnoEvento;
    private int matricula;
    private int idEventoAcademico;
    private Date horaEntrada;
    private Date horaSalida;
    private SigaaCatAlumno sigaaCatAlumnoByMatricula;
    private SigaaCatEventoAcademico sigaaCatEventoAcademicoByIdEventoAcademico;

    @Id
    @Column(name = "ID_ALUMNO_EVENTO")
    public int getIdAlumnoEvento() {
        return idAlumnoEvento;
    }

    public void setIdAlumnoEvento(int idAlumnoEvento) {
        this.idAlumnoEvento = idAlumnoEvento;
    }

    @Basic
    @Column(name = "MATRICULA")
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    @Basic
    @Column(name = "ID_EVENTO_ACADEMICO")
    public int getIdEventoAcademico() {
        return idEventoAcademico;
    }

    public void setIdEventoAcademico(int idEventoAcademico) {
        this.idEventoAcademico = idEventoAcademico;
    }

    @Basic
    @Column(name = "HORA_ENTRADA")
    public Date getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(Date horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    @Basic
    @Column(name = "HORA_SALIDA")
    public Date getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(Date horaSalida) {
        this.horaSalida = horaSalida;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SigaaAlumnoEvento that = (SigaaAlumnoEvento) o;
        return idAlumnoEvento == that.idAlumnoEvento &&
                matricula == that.matricula &&
                idEventoAcademico == that.idEventoAcademico &&
                Objects.equals(horaEntrada, that.horaEntrada) &&
                Objects.equals(horaSalida, that.horaSalida);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idAlumnoEvento, matricula, idEventoAcademico, horaEntrada, horaSalida);
    }

    @ManyToOne
    @JoinColumn(name = "MATRICULA", referencedColumnName = "MATRICULA", nullable = false, insertable = false, updatable = false)
    public SigaaCatAlumno getSigaaCatAlumnoByMatricula() {
        return sigaaCatAlumnoByMatricula;
    }

    public void setSigaaCatAlumnoByMatricula(SigaaCatAlumno sigaaCatAlumnoByMatricula) {
        this.sigaaCatAlumnoByMatricula = sigaaCatAlumnoByMatricula;
    }

    @ManyToOne
    @JoinColumn(name = "ID_EVENTO_ACADEMICO", referencedColumnName = "ID_EVENTO_ACADEMICO", nullable = false, insertable = false, updatable = false)
    public SigaaCatEventoAcademico getSigaaCatEventoAcademicoByIdEventoAcademico() {
        return sigaaCatEventoAcademicoByIdEventoAcademico;
    }

    public void setSigaaCatEventoAcademicoByIdEventoAcademico(SigaaCatEventoAcademico sigaaCatEventoAcademicoByIdEventoAcademico) {
        this.sigaaCatEventoAcademicoByIdEventoAcademico = sigaaCatEventoAcademicoByIdEventoAcademico;
    }
}
