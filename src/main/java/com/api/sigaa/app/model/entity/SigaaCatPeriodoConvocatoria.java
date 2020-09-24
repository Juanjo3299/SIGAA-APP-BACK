package com.api.sigaa.app.model.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "SIGAA_CAT_PERIODO_CONVOCATORIA", schema = "dbo", catalog = "SIGAA")
public class SigaaCatPeriodoConvocatoria {
    private int idPeriodo;
    private String periodo;
    private Date fechaInicio;
    private Date fechaFin;
    private String estatus;
    private List<ConvocatoriaCarrera> convocatoriaCarrerasByIdPeriodo;

    @Id
    @Column(name = "ID_PERIODO")
    public int getIdPeriodo() {
        return idPeriodo;
    }

    public void setIdPeriodo(int idPeriodo) {
        this.idPeriodo = idPeriodo;
    }

    @Basic
    @Column(name = "PERIODO")
    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
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
        SigaaCatPeriodoConvocatoria that = (SigaaCatPeriodoConvocatoria) o;
        return idPeriodo == that.idPeriodo &&
                Objects.equals(periodo, that.periodo) &&
                Objects.equals(fechaInicio, that.fechaInicio) &&
                Objects.equals(fechaFin, that.fechaFin) &&
                Objects.equals(estatus, that.estatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idPeriodo, periodo, fechaInicio, fechaFin, estatus);
    }

    @OneToMany(mappedBy = "sigaaCatPeriodoConvocatoriaByIdPeriodo")
    public List<ConvocatoriaCarrera> getConvocatoriaCarrerasByIdPeriodo() {
        return convocatoriaCarrerasByIdPeriodo;
    }

    public void setConvocatoriaCarrerasByIdPeriodo(List<ConvocatoriaCarrera> convocatoriaCarrerasByIdPeriodo) {
        this.convocatoriaCarrerasByIdPeriodo = convocatoriaCarrerasByIdPeriodo;
    }
}
