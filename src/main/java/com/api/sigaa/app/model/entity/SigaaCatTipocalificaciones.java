package com.api.sigaa.app.model.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "SIGAA_CAT_TIPOCALIFICACIONES", schema = "dbo", catalog = "SIGAA")
public class SigaaCatTipocalificaciones {
    private int idTipocalif;
    private String descripcion;
    private String estatus;
    @JsonBackReference
    private List<SigaaDetCalificaciones> sigaaDetCalificacionesByIdTipocalif;

    @Id
    @Column(name = "ID_TIPOCALIF")
    public int getIdTipocalif() {
        return idTipocalif;
    }

    public void setIdTipocalif(int idTipocalif) {
        this.idTipocalif = idTipocalif;
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
        SigaaCatTipocalificaciones that = (SigaaCatTipocalificaciones) o;
        return idTipocalif == that.idTipocalif &&
                Objects.equals(descripcion, that.descripcion) &&
                Objects.equals(estatus, that.estatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idTipocalif, descripcion, estatus);
    }

    @OneToMany(mappedBy = "sigaaCatTipocalificacionesByIdTipocalif")
    public List<SigaaDetCalificaciones> getSigaaDetCalificacionesByIdTipocalif() {
        return sigaaDetCalificacionesByIdTipocalif;
    }

    public void setSigaaDetCalificacionesByIdTipocalif(List<SigaaDetCalificaciones> sigaaDetCalificacionesByIdTipocalif) {
        this.sigaaDetCalificacionesByIdTipocalif = sigaaDetCalificacionesByIdTipocalif;
    }
}
