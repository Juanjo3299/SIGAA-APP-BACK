package com.api.sigaa.app.model.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "SIGAA_CAT_PERIODO_ESTANCIAS_CONVOCATORIA", schema = "dbo", catalog = "SIGAA")
public class SigaaCatPeriodoEstanciasConvocatoria {
    private int idPeriodoConvocatoria;
    private Date fechaInicioRegistro;
    private Date fechaFinRegistro;
    private Date fechaInicioRecepciondoc;
    private Date fechaFinRecepciondoc;
    private Date fechaInicioEntregacartas;
    private Date fechaFinEntregacartas;
    private int idPeriodoEstancias;
    private int estatus;
    private SigaaCatPeriodoEstancias sigaaCatPeriodoEstanciasByIdPeriodoEstancias;

    @Id
    @Column(name = "ID_PERIODO_CONVOCATORIA")
    public int getIdPeriodoConvocatoria() {
        return idPeriodoConvocatoria;
    }

    public void setIdPeriodoConvocatoria(int idPeriodoConvocatoria) {
        this.idPeriodoConvocatoria = idPeriodoConvocatoria;
    }

    @Basic
    @Column(name = "FECHA_INICIO_REGISTRO")
    public Date getFechaInicioRegistro() {
        return fechaInicioRegistro;
    }

    public void setFechaInicioRegistro(Date fechaInicioRegistro) {
        this.fechaInicioRegistro = fechaInicioRegistro;
    }

    @Basic
    @Column(name = "FECHA_FIN_REGISTRO")
    public Date getFechaFinRegistro() {
        return fechaFinRegistro;
    }

    public void setFechaFinRegistro(Date fechaFinRegistro) {
        this.fechaFinRegistro = fechaFinRegistro;
    }

    @Basic
    @Column(name = "FECHA_INICIO_RECEPCIONDOC")
    public Date getFechaInicioRecepciondoc() {
        return fechaInicioRecepciondoc;
    }

    public void setFechaInicioRecepciondoc(Date fechaInicioRecepciondoc) {
        this.fechaInicioRecepciondoc = fechaInicioRecepciondoc;
    }

    @Basic
    @Column(name = "FECHA_FIN_RECEPCIONDOC")
    public Date getFechaFinRecepciondoc() {
        return fechaFinRecepciondoc;
    }

    public void setFechaFinRecepciondoc(Date fechaFinRecepciondoc) {
        this.fechaFinRecepciondoc = fechaFinRecepciondoc;
    }

    @Basic
    @Column(name = "FECHA_INICIO_ENTREGACARTAS")
    public Date getFechaInicioEntregacartas() {
        return fechaInicioEntregacartas;
    }

    public void setFechaInicioEntregacartas(Date fechaInicioEntregacartas) {
        this.fechaInicioEntregacartas = fechaInicioEntregacartas;
    }

    @Basic
    @Column(name = "FECHA_FIN_ENTREGACARTAS")
    public Date getFechaFinEntregacartas() {
        return fechaFinEntregacartas;
    }

    public void setFechaFinEntregacartas(Date fechaFinEntregacartas) {
        this.fechaFinEntregacartas = fechaFinEntregacartas;
    }

    @Basic
    @Column(name = "ID_PERIODO_ESTANCIAS")
    public int getIdPeriodoEstancias() {
        return idPeriodoEstancias;
    }

    public void setIdPeriodoEstancias(int idPeriodoEstancias) {
        this.idPeriodoEstancias = idPeriodoEstancias;
    }

    @Basic
    @Column(name = "ESTATUS")
    public int getEstatus() {
        return estatus;
    }

    public void setEstatus(int estatus) {
        this.estatus = estatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SigaaCatPeriodoEstanciasConvocatoria that = (SigaaCatPeriodoEstanciasConvocatoria) o;
        return idPeriodoConvocatoria == that.idPeriodoConvocatoria &&
                idPeriodoEstancias == that.idPeriodoEstancias &&
                estatus == that.estatus &&
                Objects.equals(fechaInicioRegistro, that.fechaInicioRegistro) &&
                Objects.equals(fechaFinRegistro, that.fechaFinRegistro) &&
                Objects.equals(fechaInicioRecepciondoc, that.fechaInicioRecepciondoc) &&
                Objects.equals(fechaFinRecepciondoc, that.fechaFinRecepciondoc) &&
                Objects.equals(fechaInicioEntregacartas, that.fechaInicioEntregacartas) &&
                Objects.equals(fechaFinEntregacartas, that.fechaFinEntregacartas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idPeriodoConvocatoria, fechaInicioRegistro, fechaFinRegistro, fechaInicioRecepciondoc, fechaFinRecepciondoc, fechaInicioEntregacartas, fechaFinEntregacartas, idPeriodoEstancias, estatus);
    }

    @ManyToOne
    @JoinColumn(name = "ID_PERIODO_ESTANCIAS", referencedColumnName = "ID_PERIODO_ESTANCIAS", nullable = false, insertable = false, updatable = false)
    public SigaaCatPeriodoEstancias getSigaaCatPeriodoEstanciasByIdPeriodoEstancias() {
        return sigaaCatPeriodoEstanciasByIdPeriodoEstancias;
    }

    public void setSigaaCatPeriodoEstanciasByIdPeriodoEstancias(SigaaCatPeriodoEstancias sigaaCatPeriodoEstanciasByIdPeriodoEstancias) {
        this.sigaaCatPeriodoEstanciasByIdPeriodoEstancias = sigaaCatPeriodoEstanciasByIdPeriodoEstancias;
    }
}
