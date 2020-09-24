package com.api.sigaa.app.model.entity;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "SIGAA_CAT_MODALIDAD", schema = "dbo", catalog = "SIGAA")
public class SigaaCatModalidad {
    private int idModalidad;
    private String descripcion;
    private String estatus;
    private List<SigaaCatAspirantePosgrado> sigaaCatAspirantePosgradosByIdModalidad;
    private List<SigaaCatCarrera> sigaaCatCarrerasByIdModalidad;

    @Id
    @Column(name = "ID_MODALIDAD")
    public int getIdModalidad() {
        return idModalidad;
    }

    public void setIdModalidad(int idModalidad) {
        this.idModalidad = idModalidad;
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
        SigaaCatModalidad that = (SigaaCatModalidad) o;
        return idModalidad == that.idModalidad &&
                Objects.equals(descripcion, that.descripcion) &&
                Objects.equals(estatus, that.estatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idModalidad, descripcion, estatus);
    }

    @OneToMany(mappedBy = "sigaaCatModalidadByIdModalidad")
    public List<SigaaCatAspirantePosgrado> getSigaaCatAspirantePosgradosByIdModalidad() {
        return sigaaCatAspirantePosgradosByIdModalidad;
    }

    public void setSigaaCatAspirantePosgradosByIdModalidad(List<SigaaCatAspirantePosgrado> sigaaCatAspirantePosgradosByIdModalidad) {
        this.sigaaCatAspirantePosgradosByIdModalidad = sigaaCatAspirantePosgradosByIdModalidad;
    }

    @OneToMany(mappedBy = "sigaaCatModalidadByIdModalidad")
    public List<SigaaCatCarrera> getSigaaCatCarrerasByIdModalidad() {
        return sigaaCatCarrerasByIdModalidad;
    }

    public void setSigaaCatCarrerasByIdModalidad(List<SigaaCatCarrera> sigaaCatCarrerasByIdModalidad) {
        this.sigaaCatCarrerasByIdModalidad = sigaaCatCarrerasByIdModalidad;
    }
}
