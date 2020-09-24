package com.api.sigaa.app.model.entity;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "SIGAA_CAT_GENERACION", schema = "dbo", catalog = "SIGAA")
public class SigaaCatGeneracion {
    private int idGeneracion;
    private String descripcion;
    private String estatus;
    private List<SigaaCatAlumnoModificaso> sigaaCatAlumnoModificasosByIdGeneracion;
    private List<SigaaCatGrupo> sigaaCatGruposByIdGeneracion;
    private List<SigaaCohorteGenerado> sigaaCohorteGeneradosByIdGeneracion;

    @Id
    @Column(name = "ID_GENERACION")
    public int getIdGeneracion() {
        return idGeneracion;
    }

    public void setIdGeneracion(int idGeneracion) {
        this.idGeneracion = idGeneracion;
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
        SigaaCatGeneracion that = (SigaaCatGeneracion) o;
        return idGeneracion == that.idGeneracion &&
                Objects.equals(descripcion, that.descripcion) &&
                Objects.equals(estatus, that.estatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idGeneracion, descripcion, estatus);
    }

    @OneToMany(mappedBy = "sigaaCatGeneracionByIdGeneracion")
    public List<SigaaCatAlumnoModificaso> getSigaaCatAlumnoModificasosByIdGeneracion() {
        return sigaaCatAlumnoModificasosByIdGeneracion;
    }

    public void setSigaaCatAlumnoModificasosByIdGeneracion(List<SigaaCatAlumnoModificaso> sigaaCatAlumnoModificasosByIdGeneracion) {
        this.sigaaCatAlumnoModificasosByIdGeneracion = sigaaCatAlumnoModificasosByIdGeneracion;
    }

    @OneToMany(mappedBy = "sigaaCatGeneracionByIdGeneracion")
    public List<SigaaCatGrupo> getSigaaCatGruposByIdGeneracion() {
        return sigaaCatGruposByIdGeneracion;
    }

    public void setSigaaCatGruposByIdGeneracion(List<SigaaCatGrupo> sigaaCatGruposByIdGeneracion) {
        this.sigaaCatGruposByIdGeneracion = sigaaCatGruposByIdGeneracion;
    }

    @OneToMany(mappedBy = "sigaaCatGeneracionByIdGeneracion")
    public List<SigaaCohorteGenerado> getSigaaCohorteGeneradosByIdGeneracion() {
        return sigaaCohorteGeneradosByIdGeneracion;
    }

    public void setSigaaCohorteGeneradosByIdGeneracion(List<SigaaCohorteGenerado> sigaaCohorteGeneradosByIdGeneracion) {
        this.sigaaCohorteGeneradosByIdGeneracion = sigaaCohorteGeneradosByIdGeneracion;
    }
}
