package com.api.sigaa.app.model.entity;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "SIGAA_CAT_CAMPUS", schema = "dbo", catalog = "SIGAA")
public class SigaaCatCampus {
    private int idCampus;
    private String descripcion;
    private String direccion;
    private List<ConvocatoriaCarrera> convocatoriaCarrerasByIdCampus;

    @Id
    @Column(name = "ID_CAMPUS")
    public int getIdCampus() {
        return idCampus;
    }

    public void setIdCampus(int idCampus) {
        this.idCampus = idCampus;
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
    @Column(name = "DIRECCION")
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SigaaCatCampus that = (SigaaCatCampus) o;
        return idCampus == that.idCampus &&
                Objects.equals(descripcion, that.descripcion) &&
                Objects.equals(direccion, that.direccion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCampus, descripcion, direccion);
    }

    @OneToMany(mappedBy = "sigaaCatCampusByIdCampus")
    public List<ConvocatoriaCarrera> getConvocatoriaCarrerasByIdCampus() {
        return convocatoriaCarrerasByIdCampus;
    }

    public void setConvocatoriaCarrerasByIdCampus(List<ConvocatoriaCarrera> convocatoriaCarrerasByIdCampus) {
        this.convocatoriaCarrerasByIdCampus = convocatoriaCarrerasByIdCampus;
    }
}
