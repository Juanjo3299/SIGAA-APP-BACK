package com.api.sigaa.app.model.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "SIGAA_CAT_PLANESTUDIO", schema = "dbo", catalog = "SIGAA")
public class SigaaCatPlanestudio {
    private int idPlanestudio;
    private int idCarrera;
    private int noPeriodos;
    private String descripcion;
    private Date fechaAut;
    private int nocreditos;
    private Date fechaIni;
    private Date fechaFin;
    private int año;
    private String estatus;
    private List<SigaaCatAsignatura> sigaaCatAsignaturasByIdPlanestudio;
    private List<SigaaCatAsignaturaCuatricero> sigaaCatAsignaturaCuatricerosByIdPlanestudio;
    private SigaaCatCarrera sigaaCatCarreraByIdCarrera;

    @Id
    @Column(name = "ID_PLANESTUDIO")
    public int getIdPlanestudio() {
        return idPlanestudio;
    }

    public void setIdPlanestudio(int idPlanestudio) {
        this.idPlanestudio = idPlanestudio;
    }

    @Basic
    @Column(name = "ID_CARRERA")
    public int getIdCarrera() {
        return idCarrera;
    }

    public void setIdCarrera(int idCarrera) {
        this.idCarrera = idCarrera;
    }

    @Basic
    @Column(name = "NO_PERIODOS")
    public int getNoPeriodos() {
        return noPeriodos;
    }

    public void setNoPeriodos(int noPeriodos) {
        this.noPeriodos = noPeriodos;
    }

    @Basic
    @Column(name = "DESCRIPCION")
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Basic
    @Column(name = "FECHA_AUT")
    public Date getFechaAut() {
        return fechaAut;
    }

    public void setFechaAut(Date fechaAut) {
        this.fechaAut = fechaAut;
    }

    @Basic
    @Column(name = "NOCREDITOS")
    public int getNocreditos() {
        return nocreditos;
    }

    public void setNocreditos(int nocreditos) {
        this.nocreditos = nocreditos;
    }

    @Basic
    @Column(name = "FECHA_INI")
    public Date getFechaIni() {
        return fechaIni;
    }

    public void setFechaIni(Date fechaIni) {
        this.fechaIni = fechaIni;
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
    @Column(name = "AÑO")
    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
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
        SigaaCatPlanestudio that = (SigaaCatPlanestudio) o;
        return idPlanestudio == that.idPlanestudio &&
                idCarrera == that.idCarrera &&
                noPeriodos == that.noPeriodos &&
                nocreditos == that.nocreditos &&
                año == that.año &&
                Objects.equals(descripcion, that.descripcion) &&
                Objects.equals(fechaAut, that.fechaAut) &&
                Objects.equals(fechaIni, that.fechaIni) &&
                Objects.equals(fechaFin, that.fechaFin) &&
                Objects.equals(estatus, that.estatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idPlanestudio, idCarrera, noPeriodos, descripcion, fechaAut, nocreditos, fechaIni, fechaFin, año, estatus);
    }

    @OneToMany(mappedBy = "sigaaCatPlanestudioByIdPlanestudio")
    public List<SigaaCatAsignatura> getSigaaCatAsignaturasByIdPlanestudio() {
        return sigaaCatAsignaturasByIdPlanestudio;
    }

    public void setSigaaCatAsignaturasByIdPlanestudio(List<SigaaCatAsignatura> sigaaCatAsignaturasByIdPlanestudio) {
        this.sigaaCatAsignaturasByIdPlanestudio = sigaaCatAsignaturasByIdPlanestudio;
    }

    @OneToMany(mappedBy = "sigaaCatPlanestudioByIdPlanestudio")
    public List<SigaaCatAsignaturaCuatricero> getSigaaCatAsignaturaCuatricerosByIdPlanestudio() {
        return sigaaCatAsignaturaCuatricerosByIdPlanestudio;
    }

    public void setSigaaCatAsignaturaCuatricerosByIdPlanestudio(List<SigaaCatAsignaturaCuatricero> sigaaCatAsignaturaCuatricerosByIdPlanestudio) {
        this.sigaaCatAsignaturaCuatricerosByIdPlanestudio = sigaaCatAsignaturaCuatricerosByIdPlanestudio;
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
