package com.api.sigaa.app.model.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "SIGAA_BAJAS", schema = "dbo", catalog = "SIGAA")
public class SigaaBajas {
    private int idBajas;
    private int matricula;
    private int idEstatus;
    private Date fechaInicio;
    private Date fechaFin;
    private SigaaCatAlumno sigaaCatAlumnoByMatricula;
    private SigaaCatEstatus sigaaCatEstatusByIdEstatus;

    @Id
    @Column(name = "ID_BAJAS")
    public int getIdBajas() {
        return idBajas;
    }

    public void setIdBajas(int idBajas) {
        this.idBajas = idBajas;
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
    @Column(name = "ID_ESTATUS")
    public int getIdEstatus() {
        return idEstatus;
    }

    public void setIdEstatus(int idEstatus) {
        this.idEstatus = idEstatus;
    }

    @Basic
    @Column(name = "FECHA_INICIO")
    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    @Basic
    @Column(name = "FECHA_FIN")
    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SigaaBajas that = (SigaaBajas) o;
        return idBajas == that.idBajas &&
                matricula == that.matricula &&
                idEstatus == that.idEstatus &&
                Objects.equals(fechaInicio, that.fechaInicio) &&
                Objects.equals(fechaFin, that.fechaFin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idBajas, matricula, idEstatus, fechaInicio, fechaFin);
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
    @JoinColumn(name = "ID_ESTATUS", referencedColumnName = "ID_ESTATUS", nullable = false, insertable = false, updatable = false)
    public SigaaCatEstatus getSigaaCatEstatusByIdEstatus() {
        return sigaaCatEstatusByIdEstatus;
    }

    public void setSigaaCatEstatusByIdEstatus(SigaaCatEstatus sigaaCatEstatusByIdEstatus) {
        this.sigaaCatEstatusByIdEstatus = sigaaCatEstatusByIdEstatus;
    }
}
