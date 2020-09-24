package com.api.sigaa.app.model.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "SIGAA_COHORTE_GENERADO", schema = "dbo", catalog = "SIGAA")
public class SigaaCohorteGenerado {
    private int idCohorte;
    private Date fechaEgreso;
    private Date fechaIngreso;
    private int idGeneracion;
    private int idPeriodo;
    private int idCarrera;
    private List<SigaaCatAlumno> sigaaCatAlumnosByIdCohorte;
    private SigaaCatGeneracion sigaaCatGeneracionByIdGeneracion;
    private SigaaCatPeriodo sigaaCatPeriodoByIdPeriodo;
    private SigaaCatCarrera sigaaCatCarreraByIdCarrera;

    @Id
    @Column(name = "ID_COHORTE")
    public int getIdCohorte() {
        return idCohorte;
    }

    public void setIdCohorte(int idCohorte) {
        this.idCohorte = idCohorte;
    }

    @Basic
    @Column(name = "FECHA_EGRESO")
    public Date getFechaEgreso() {
        return fechaEgreso;
    }

    public void setFechaEgreso(Date fechaEgreso) {
        this.fechaEgreso = fechaEgreso;
    }

    @Basic
    @Column(name = "FECHA_INGRESO")
    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    @Basic
    @Column(name = "ID_GENERACION")
    public int getIdGeneracion() {
        return idGeneracion;
    }

    public void setIdGeneracion(int idGeneracion) {
        this.idGeneracion = idGeneracion;
    }

    @Basic
    @Column(name = "ID_PERIODO")
    public int getIdPeriodo() {
        return idPeriodo;
    }

    public void setIdPeriodo(int idPeriodo) {
        this.idPeriodo = idPeriodo;
    }

    @Basic
    @Column(name = "ID_CARRERA")
    public int getIdCarrera() {
        return idCarrera;
    }

    public void setIdCarrera(int idCarrera) {
        this.idCarrera = idCarrera;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SigaaCohorteGenerado that = (SigaaCohorteGenerado) o;
        return idCohorte == that.idCohorte &&
                idGeneracion == that.idGeneracion &&
                idPeriodo == that.idPeriodo &&
                idCarrera == that.idCarrera &&
                Objects.equals(fechaEgreso, that.fechaEgreso) &&
                Objects.equals(fechaIngreso, that.fechaIngreso);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCohorte, fechaEgreso, fechaIngreso, idGeneracion, idPeriodo, idCarrera);
    }

    @OneToMany(mappedBy = "sigaaCohorteGeneradoByIdCohorte")
    public List<SigaaCatAlumno> getSigaaCatAlumnosByIdCohorte() {
        return sigaaCatAlumnosByIdCohorte;
    }

    public void setSigaaCatAlumnosByIdCohorte(List<SigaaCatAlumno> sigaaCatAlumnosByIdCohorte) {
        this.sigaaCatAlumnosByIdCohorte = sigaaCatAlumnosByIdCohorte;
    }

    @ManyToOne
    @JoinColumn(name = "ID_GENERACION", referencedColumnName = "ID_GENERACION", nullable = false, insertable = false, updatable = false)
    public SigaaCatGeneracion getSigaaCatGeneracionByIdGeneracion() {
        return sigaaCatGeneracionByIdGeneracion;
    }

    public void setSigaaCatGeneracionByIdGeneracion(SigaaCatGeneracion sigaaCatGeneracionByIdGeneracion) {
        this.sigaaCatGeneracionByIdGeneracion = sigaaCatGeneracionByIdGeneracion;
    }

    @ManyToOne
    @JoinColumn(name = "ID_PERIODO", referencedColumnName = "ID_PERIODO", nullable = false, insertable = false, updatable = false)
    public SigaaCatPeriodo getSigaaCatPeriodoByIdPeriodo() {
        return sigaaCatPeriodoByIdPeriodo;
    }

    public void setSigaaCatPeriodoByIdPeriodo(SigaaCatPeriodo sigaaCatPeriodoByIdPeriodo) {
        this.sigaaCatPeriodoByIdPeriodo = sigaaCatPeriodoByIdPeriodo;
    }

    @ManyToOne
    @JoinColumn(name = "ID_CARRERA", referencedColumnName = "ID_CARRERA", nullable = false, insertable = false, updatable = false)
    public SigaaCatCarrera getSigaaCatCarreraByIdCarrera() {
        return sigaaCatCarreraByIdCarrera;
    }

    public void setSigaaCatCarreraByIdCarrera(SigaaCatCarrera sigaaCatCarreraByIdCarrera) {
        this.sigaaCatCarreraByIdCarrera = sigaaCatCarreraByIdCarrera;
    }
}
