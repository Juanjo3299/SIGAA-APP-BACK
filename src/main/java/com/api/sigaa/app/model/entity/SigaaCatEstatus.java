package com.api.sigaa.app.model.entity;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "SIGAA_CAT_ESTATUS", schema = "dbo", catalog = "SIGAA")
public class SigaaCatEstatus {
    private int idEstatus;
    private String descripcion;
    private String estatus;
    private List<SigaaBajas> sigaaBajasByIdEstatus;
    private List<SigaaCatAlumno> sigaaCatAlumnosByIdEstatus;
    private List<SigaaCatAlumnoModificaso> sigaaCatAlumnoModificasosByIdEstatus;

    @Id
    @Column(name = "ID_ESTATUS")
    public int getIdEstatus() {
        return idEstatus;
    }

    public void setIdEstatus(int idEstatus) {
        this.idEstatus = idEstatus;
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
        SigaaCatEstatus that = (SigaaCatEstatus) o;
        return idEstatus == that.idEstatus &&
                Objects.equals(descripcion, that.descripcion) &&
                Objects.equals(estatus, that.estatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idEstatus, descripcion, estatus);
    }

    @OneToMany(mappedBy = "sigaaCatEstatusByIdEstatus")
    public List<SigaaBajas> getSigaaBajasByIdEstatus() {
        return sigaaBajasByIdEstatus;
    }

    public void setSigaaBajasByIdEstatus(List<SigaaBajas> sigaaBajasByIdEstatus) {
        this.sigaaBajasByIdEstatus = sigaaBajasByIdEstatus;
    }

    @OneToMany(mappedBy = "sigaaCatEstatusByIdEstatus")
    public List<SigaaCatAlumno> getSigaaCatAlumnosByIdEstatus() {
        return sigaaCatAlumnosByIdEstatus;
    }

    public void setSigaaCatAlumnosByIdEstatus(List<SigaaCatAlumno> sigaaCatAlumnosByIdEstatus) {
        this.sigaaCatAlumnosByIdEstatus = sigaaCatAlumnosByIdEstatus;
    }

    @OneToMany(mappedBy = "sigaaCatEstatusByIdEstatus")
    public List<SigaaCatAlumnoModificaso> getSigaaCatAlumnoModificasosByIdEstatus() {
        return sigaaCatAlumnoModificasosByIdEstatus;
    }

    public void setSigaaCatAlumnoModificasosByIdEstatus(List<SigaaCatAlumnoModificaso> sigaaCatAlumnoModificasosByIdEstatus) {
        this.sigaaCatAlumnoModificasosByIdEstatus = sigaaCatAlumnoModificasosByIdEstatus;
    }
}
