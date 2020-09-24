package com.api.sigaa.app.model.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "SIGAA_CAT_PERIODO_ESTANCIAS", schema = "dbo", catalog = "SIGAA")
public class SigaaCatPeriodoEstancias {
    private int idPeriodoEstancias;
    private String periodo;
    private Date fechaIni;
    private Date fechaFin;
    private int estatus;
    private String actividad;
    private List<SigaaCatAsesoresAcademicos> sigaaCatAsesoresAcademicosByIdPeriodoEstancias;
    private List<SigaaCatPeriodoEstanciasConvocatoria> sigaaCatPeriodoEstanciasConvocatoriasByIdPeriodoEstancias;
    private List<SigaaDatosEstancias> sigaaDatosEstanciasByIdPeriodoEstancias;

    @Id
    @Column(name = "ID_PERIODO_ESTANCIAS")
    public int getIdPeriodoEstancias() {
        return idPeriodoEstancias;
    }

    public void setIdPeriodoEstancias(int idPeriodoEstancias) {
        this.idPeriodoEstancias = idPeriodoEstancias;
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
    @Column(name = "ESTATUS")
    public int getEstatus() {
        return estatus;
    }

    public void setEstatus(int estatus) {
        this.estatus = estatus;
    }

    @Basic
    @Column(name = "ACTIVIDAD")
    public String getActividad() {
        return actividad;
    }

    public void setActividad(String actividad) {
        this.actividad = actividad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SigaaCatPeriodoEstancias that = (SigaaCatPeriodoEstancias) o;
        return idPeriodoEstancias == that.idPeriodoEstancias &&
                estatus == that.estatus &&
                Objects.equals(periodo, that.periodo) &&
                Objects.equals(fechaIni, that.fechaIni) &&
                Objects.equals(fechaFin, that.fechaFin) &&
                Objects.equals(actividad, that.actividad);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idPeriodoEstancias, periodo, fechaIni, fechaFin, estatus, actividad);
    }

    @OneToMany(mappedBy = "sigaaCatPeriodoEstanciasByIdPeriodoEstancias")
    public List<SigaaCatAsesoresAcademicos> getSigaaCatAsesoresAcademicosByIdPeriodoEstancias() {
        return sigaaCatAsesoresAcademicosByIdPeriodoEstancias;
    }

    public void setSigaaCatAsesoresAcademicosByIdPeriodoEstancias(List<SigaaCatAsesoresAcademicos> sigaaCatAsesoresAcademicosByIdPeriodoEstancias) {
        this.sigaaCatAsesoresAcademicosByIdPeriodoEstancias = sigaaCatAsesoresAcademicosByIdPeriodoEstancias;
    }

    @OneToMany(mappedBy = "sigaaCatPeriodoEstanciasByIdPeriodoEstancias")
    public List<SigaaCatPeriodoEstanciasConvocatoria> getSigaaCatPeriodoEstanciasConvocatoriasByIdPeriodoEstancias() {
        return sigaaCatPeriodoEstanciasConvocatoriasByIdPeriodoEstancias;
    }

    public void setSigaaCatPeriodoEstanciasConvocatoriasByIdPeriodoEstancias(List<SigaaCatPeriodoEstanciasConvocatoria> sigaaCatPeriodoEstanciasConvocatoriasByIdPeriodoEstancias) {
        this.sigaaCatPeriodoEstanciasConvocatoriasByIdPeriodoEstancias = sigaaCatPeriodoEstanciasConvocatoriasByIdPeriodoEstancias;
    }

    @OneToMany(mappedBy = "sigaaCatPeriodoEstanciasByIdPeriodoEstancias")
    public List<SigaaDatosEstancias> getSigaaDatosEstanciasByIdPeriodoEstancias() {
        return sigaaDatosEstanciasByIdPeriodoEstancias;
    }

    public void setSigaaDatosEstanciasByIdPeriodoEstancias(List<SigaaDatosEstancias> sigaaDatosEstanciasByIdPeriodoEstancias) {
        this.sigaaDatosEstanciasByIdPeriodoEstancias = sigaaDatosEstanciasByIdPeriodoEstancias;
    }
}
