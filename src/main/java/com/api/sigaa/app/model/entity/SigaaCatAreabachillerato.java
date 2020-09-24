package com.api.sigaa.app.model.entity;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "SIGAA_CAT_AREABACHILLERATO", schema = "dbo", catalog = "SIGAA")
public class SigaaCatAreabachillerato {
    private int idAreabach;
    private String descripcion;
    private String estatus;
    private List<SigaaDetEscolaridadAspirante> sigaaDetEscolaridadAspirantesByIdAreabach;
    private List<SigaaHistoacademico> sigaaHistoacademicosByIdAreabach;

    @Id
    @Column(name = "ID_AREABACH")
    public int getIdAreabach() {
        return idAreabach;
    }

    public void setIdAreabach(int idAreabach) {
        this.idAreabach = idAreabach;
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
        SigaaCatAreabachillerato that = (SigaaCatAreabachillerato) o;
        return idAreabach == that.idAreabach &&
                Objects.equals(descripcion, that.descripcion) &&
                Objects.equals(estatus, that.estatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idAreabach, descripcion, estatus);
    }

    @OneToMany(mappedBy = "sigaaCatAreabachilleratoByIdAreaBachillerato")
    public List<SigaaDetEscolaridadAspirante> getSigaaDetEscolaridadAspirantesByIdAreabach() {
        return sigaaDetEscolaridadAspirantesByIdAreabach;
    }

    public void setSigaaDetEscolaridadAspirantesByIdAreabach(List<SigaaDetEscolaridadAspirante> sigaaDetEscolaridadAspirantesByIdAreabach) {
        this.sigaaDetEscolaridadAspirantesByIdAreabach = sigaaDetEscolaridadAspirantesByIdAreabach;
    }

    @OneToMany(mappedBy = "sigaaCatAreabachilleratoByIdAreabach")
    public List<SigaaHistoacademico> getSigaaHistoacademicosByIdAreabach() {
        return sigaaHistoacademicosByIdAreabach;
    }

    public void setSigaaHistoacademicosByIdAreabach(List<SigaaHistoacademico> sigaaHistoacademicosByIdAreabach) {
        this.sigaaHistoacademicosByIdAreabach = sigaaHistoacademicosByIdAreabach;
    }
}
