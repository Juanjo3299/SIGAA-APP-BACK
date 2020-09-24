package com.api.sigaa.app.model.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "CONVOCATORIA_CARRERA", schema = "dbo", catalog = "SIGAA")
public class ConvocatoriaCarrera {
    private int idConvocatoriaCarrera;
    private int idPeriodo;
    private int idCarrera;
    private Integer idCampus;
    private SigaaCatPeriodoConvocatoria sigaaCatPeriodoConvocatoriaByIdPeriodo;
    private SigaaCatCarrera sigaaCatCarreraByIdCarrera;
    private SigaaCatCampus sigaaCatCampusByIdCampus;

    @Id
    @Column(name = "ID_CONVOCATORIA_CARRERA")
    public int getIdConvocatoriaCarrera() {
        return idConvocatoriaCarrera;
    }

    public void setIdConvocatoriaCarrera(int idConvocatoriaCarrera) {
        this.idConvocatoriaCarrera = idConvocatoriaCarrera;
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

    @Basic
    @Column(name = "ID_CAMPUS")
    public Integer getIdCampus() {
        return idCampus;
    }

    public void setIdCampus(Integer idCampus) {
        this.idCampus = idCampus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ConvocatoriaCarrera that = (ConvocatoriaCarrera) o;
        return idConvocatoriaCarrera == that.idConvocatoriaCarrera &&
                idPeriodo == that.idPeriodo &&
                idCarrera == that.idCarrera &&
                Objects.equals(idCampus, that.idCampus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idConvocatoriaCarrera, idPeriodo, idCarrera, idCampus);
    }

    @ManyToOne
    @JoinColumn(name = "ID_PERIODO", referencedColumnName = "ID_PERIODO", nullable = false, insertable = false, updatable = false)
    public SigaaCatPeriodoConvocatoria getSigaaCatPeriodoConvocatoriaByIdPeriodo() {
        return sigaaCatPeriodoConvocatoriaByIdPeriodo;
    }

    public void setSigaaCatPeriodoConvocatoriaByIdPeriodo(SigaaCatPeriodoConvocatoria sigaaCatPeriodoConvocatoriaByIdPeriodo) {
        this.sigaaCatPeriodoConvocatoriaByIdPeriodo = sigaaCatPeriodoConvocatoriaByIdPeriodo;
    }

    @ManyToOne
    @JoinColumn(name = "ID_CARRERA", referencedColumnName = "ID_CARRERA", nullable = false, insertable = false, updatable = false)
    public SigaaCatCarrera getSigaaCatCarreraByIdCarrera() {
        return sigaaCatCarreraByIdCarrera;
    }

    public void setSigaaCatCarreraByIdCarrera(SigaaCatCarrera sigaaCatCarreraByIdCarrera) {
        this.sigaaCatCarreraByIdCarrera = sigaaCatCarreraByIdCarrera;
    }

    @ManyToOne
    @JoinColumn(name = "ID_CAMPUS", referencedColumnName = "ID_CAMPUS", insertable = false, updatable = false)
    public SigaaCatCampus getSigaaCatCampusByIdCampus() {
        return sigaaCatCampusByIdCampus;
    }

    public void setSigaaCatCampusByIdCampus(SigaaCatCampus sigaaCatCampusByIdCampus) {
        this.sigaaCatCampusByIdCampus = sigaaCatCampusByIdCampus;
    }
}
