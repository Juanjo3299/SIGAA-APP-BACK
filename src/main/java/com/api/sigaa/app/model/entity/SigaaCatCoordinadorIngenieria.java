package com.api.sigaa.app.model.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "SIGAA_CAT_COORDINADOR_INGENIERIA", schema = "dbo", catalog = "SIGAA")
public class SigaaCatCoordinadorIngenieria {
    private int idCoordinadorIngenieria;
    private Integer idDocente;
    private Integer idCarrera;
    private Date fechaInicio;
    private Date fechaFin;
    private Integer estatus;
    private SigaaCatDocente sigaaCatDocenteByIdDocente;
    private SigaaCatCarrera sigaaCatCarreraByIdCarrera;

    @Id
    @Column(name = "ID_COORDINADOR_INGENIERIA")
    public int getIdCoordinadorIngenieria() {
        return idCoordinadorIngenieria;
    }

    public void setIdCoordinadorIngenieria(int idCoordinadorIngenieria) {
        this.idCoordinadorIngenieria = idCoordinadorIngenieria;
    }

    @Basic
    @Column(name = "ID_DOCENTE")
    public Integer getIdDocente() {
        return idDocente;
    }

    public void setIdDocente(Integer idDocente) {
        this.idDocente = idDocente;
    }

    @Basic
    @Column(name = "ID_CARRERA")
    public Integer getIdCarrera() {
        return idCarrera;
    }

    public void setIdCarrera(Integer idCarrera) {
        this.idCarrera = idCarrera;
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

    @Basic
    @Column(name = "ESTATUS")
    public Integer getEstatus() {
        return estatus;
    }

    public void setEstatus(Integer estatus) {
        this.estatus = estatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SigaaCatCoordinadorIngenieria that = (SigaaCatCoordinadorIngenieria) o;
        return idCoordinadorIngenieria == that.idCoordinadorIngenieria &&
                Objects.equals(idDocente, that.idDocente) &&
                Objects.equals(idCarrera, that.idCarrera) &&
                Objects.equals(fechaInicio, that.fechaInicio) &&
                Objects.equals(fechaFin, that.fechaFin) &&
                Objects.equals(estatus, that.estatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCoordinadorIngenieria, idDocente, idCarrera, fechaInicio, fechaFin, estatus);
    }

    @ManyToOne
    @JoinColumn(name = "ID_DOCENTE", referencedColumnName = "ID_DOCENTE", insertable = false, updatable = false)
    public SigaaCatDocente getSigaaCatDocenteByIdDocente() {
        return sigaaCatDocenteByIdDocente;
    }

    public void setSigaaCatDocenteByIdDocente(SigaaCatDocente sigaaCatDocenteByIdDocente) {
        this.sigaaCatDocenteByIdDocente = sigaaCatDocenteByIdDocente;
    }

    @ManyToOne
    @JoinColumn(name = "ID_CARRERA", referencedColumnName = "ID_CARRERA", insertable = false, updatable = false)
    public SigaaCatCarrera getSigaaCatCarreraByIdCarrera() {
        return sigaaCatCarreraByIdCarrera;
    }

    public void setSigaaCatCarreraByIdCarrera(SigaaCatCarrera sigaaCatCarreraByIdCarrera) {
        this.sigaaCatCarreraByIdCarrera = sigaaCatCarreraByIdCarrera;
    }
}
