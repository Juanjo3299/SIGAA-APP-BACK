package com.api.sigaa.app.model.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "SIGAA_TUTORIAS", schema = "dbo", catalog = "SIGAA")
public class SigaaTutorias {
    private int idTutorias;
    private Integer matricula;
    private Integer idDocente;
    private Date fechaInicio;
    private Date fechaFin;
    private String estatus;
    private SigaaCatAlumno sigaaCatAlumnoByMatricula;
    private SigaaCatDocente sigaaCatDocenteByIdDocente;

    @Id
    @Column(name = "ID_TUTORIAS")
    public int getIdTutorias() {
        return idTutorias;
    }

    public void setIdTutorias(int idTutorias) {
        this.idTutorias = idTutorias;
    }

    @Basic
    @Column(name = "MATRICULA")
    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
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
    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SigaaTutorias that = (SigaaTutorias) o;
        return idTutorias == that.idTutorias &&
                Objects.equals(matricula, that.matricula) &&
                Objects.equals(idDocente, that.idDocente) &&
                Objects.equals(fechaInicio, that.fechaInicio) &&
                Objects.equals(fechaFin, that.fechaFin) &&
                Objects.equals(estatus, that.estatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idTutorias, matricula, idDocente, fechaInicio, fechaFin, estatus);
    }

    @ManyToOne
    @JoinColumn(name = "MATRICULA", referencedColumnName = "MATRICULA", insertable = false, updatable = false)
    public SigaaCatAlumno getSigaaCatAlumnoByMatricula() {
        return sigaaCatAlumnoByMatricula;
    }

    public void setSigaaCatAlumnoByMatricula(SigaaCatAlumno sigaaCatAlumnoByMatricula) {
        this.sigaaCatAlumnoByMatricula = sigaaCatAlumnoByMatricula;
    }

    @ManyToOne
    @JoinColumn(name = "ID_DOCENTE", referencedColumnName = "ID_DOCENTE", insertable = false, updatable = false)
    public SigaaCatDocente getSigaaCatDocenteByIdDocente() {
        return sigaaCatDocenteByIdDocente;
    }

    public void setSigaaCatDocenteByIdDocente(SigaaCatDocente sigaaCatDocenteByIdDocente) {
        this.sigaaCatDocenteByIdDocente = sigaaCatDocenteByIdDocente;
    }
}
