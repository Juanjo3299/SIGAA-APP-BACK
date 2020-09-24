package com.api.sigaa.app.model.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "SIGAA_DET_ALUMNO_EXENTO", schema = "dbo", catalog = "SIGAA")
public class SigaaDetAlumnoExento {
    private int idDetAlumnoExento;
    private String estatus;
    private Integer idPeriodo;
    private Integer matricula;
    private Integer idServicio;
    private SigaaCatPeriodo sigaaCatPeriodoByIdPeriodo;
    private SigaaCatAlumno sigaaCatAlumnoByMatricula;
    private SigaaDetServicios sigaaDetServiciosByIdServicio;

    @Id
    @Column(name = "ID_DET_ALUMNO_EXENTO")
    public int getIdDetAlumnoExento() {
        return idDetAlumnoExento;
    }

    public void setIdDetAlumnoExento(int idDetAlumnoExento) {
        this.idDetAlumnoExento = idDetAlumnoExento;
    }

    @Basic
    @Column(name = "ESTATUS")
    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    @Basic
    @Column(name = "ID_PERIODO")
    public Integer getIdPeriodo() {
        return idPeriodo;
    }

    public void setIdPeriodo(Integer idPeriodo) {
        this.idPeriodo = idPeriodo;
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
    @Column(name = "ID_SERVICIO")
    public Integer getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(Integer idServicio) {
        this.idServicio = idServicio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SigaaDetAlumnoExento that = (SigaaDetAlumnoExento) o;
        return idDetAlumnoExento == that.idDetAlumnoExento &&
                Objects.equals(estatus, that.estatus) &&
                Objects.equals(idPeriodo, that.idPeriodo) &&
                Objects.equals(matricula, that.matricula) &&
                Objects.equals(idServicio, that.idServicio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idDetAlumnoExento, estatus, idPeriodo, matricula, idServicio);
    }

    @ManyToOne
    @JoinColumn(name = "ID_PERIODO", referencedColumnName = "ID_PERIODO", insertable = false, updatable = false)
    public SigaaCatPeriodo getSigaaCatPeriodoByIdPeriodo() {
        return sigaaCatPeriodoByIdPeriodo;
    }

    public void setSigaaCatPeriodoByIdPeriodo(SigaaCatPeriodo sigaaCatPeriodoByIdPeriodo) {
        this.sigaaCatPeriodoByIdPeriodo = sigaaCatPeriodoByIdPeriodo;
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
    @JoinColumn(name = "ID_SERVICIO", referencedColumnName = "CNS", insertable = false, updatable = false)
    public SigaaDetServicios getSigaaDetServiciosByIdServicio() {
        return sigaaDetServiciosByIdServicio;
    }

    public void setSigaaDetServiciosByIdServicio(SigaaDetServicios sigaaDetServiciosByIdServicio) {
        this.sigaaDetServiciosByIdServicio = sigaaDetServiciosByIdServicio;
    }
}
