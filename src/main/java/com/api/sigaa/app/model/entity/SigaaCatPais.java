package com.api.sigaa.app.model.entity;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "SIGAA_CAT_PAIS", schema = "dbo", catalog = "SIGAA")
public class SigaaCatPais {
    private int idPais;
    private String descripcion;
    private String abreviatura;
    private List<SigaaCatEntidadFederativa> sigaaCatEntidadFederativasByIdPais;

    @Id
    @Column(name = "ID_PAIS")
    public int getIdPais() {
        return idPais;
    }

    public void setIdPais(int idPais) {
        this.idPais = idPais;
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
    @Column(name = "ABREVIATURA")
    public String getAbreviatura() {
        return abreviatura;
    }

    public void setAbreviatura(String abreviatura) {
        this.abreviatura = abreviatura;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SigaaCatPais that = (SigaaCatPais) o;
        return idPais == that.idPais &&
                Objects.equals(descripcion, that.descripcion) &&
                Objects.equals(abreviatura, that.abreviatura);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idPais, descripcion, abreviatura);
    }

    @OneToMany(mappedBy = "sigaaCatPaisByIdPais")
    public List<SigaaCatEntidadFederativa> getSigaaCatEntidadFederativasByIdPais() {
        return sigaaCatEntidadFederativasByIdPais;
    }

    public void setSigaaCatEntidadFederativasByIdPais(List<SigaaCatEntidadFederativa> sigaaCatEntidadFederativasByIdPais) {
        this.sigaaCatEntidadFederativasByIdPais = sigaaCatEntidadFederativasByIdPais;
    }
}
