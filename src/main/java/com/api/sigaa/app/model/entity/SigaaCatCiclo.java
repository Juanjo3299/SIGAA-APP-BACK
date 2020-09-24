package com.api.sigaa.app.model.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "SIGAA_CAT_CICLO", schema = "dbo", catalog = "SIGAA")
public class SigaaCatCiclo {
    private int idCiclo;
    private String nombre;
    private Date fechaIni;
    private Date fechaFin;
    private String estatus;
    private List<SigaaCatPeriodo> sigaaCatPeriodosByIdCiclo;

    @Id
    @Column(name = "ID_CICLO")
    public int getIdCiclo() {
        return idCiclo;
    }

    public void setIdCiclo(int idCiclo) {
        this.idCiclo = idCiclo;
    }

    @Basic
    @Column(name = "NOMBRE")
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
        SigaaCatCiclo that = (SigaaCatCiclo) o;
        return idCiclo == that.idCiclo &&
                Objects.equals(nombre, that.nombre) &&
                Objects.equals(fechaIni, that.fechaIni) &&
                Objects.equals(fechaFin, that.fechaFin) &&
                Objects.equals(estatus, that.estatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCiclo, nombre, fechaIni, fechaFin, estatus);
    }

    @OneToMany(mappedBy = "sigaaCatCicloByIdCiclo")
    public List<SigaaCatPeriodo> getSigaaCatPeriodosByIdCiclo() {
        return sigaaCatPeriodosByIdCiclo;
    }

    public void setSigaaCatPeriodosByIdCiclo(List<SigaaCatPeriodo> sigaaCatPeriodosByIdCiclo) {
        this.sigaaCatPeriodosByIdCiclo = sigaaCatPeriodosByIdCiclo;
    }
}
