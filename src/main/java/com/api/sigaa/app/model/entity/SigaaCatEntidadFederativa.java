package com.api.sigaa.app.model.entity;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "SIGAA_CAT_ENTIDAD_FEDERATIVA", schema = "dbo", catalog = "SIGAA")
public class SigaaCatEntidadFederativa {
    private int idEntidadFederativa;
    private String descripcion;
    private String claveEntidad;
    private String abreviatura;
    private int idPais;
    private SigaaCatPais sigaaCatPaisByIdPais;
    private List<SigaaCatMunicipio> sigaaCatMunicipiosByIdEntidadFederativa;
    private List<SigaaHistoacademico> sigaaHistoacademicosByIdEntidadFederativa;

    @Id
    @Column(name = "ID_ENTIDAD_FEDERATIVA")
    public int getIdEntidadFederativa() {
        return idEntidadFederativa;
    }

    public void setIdEntidadFederativa(int idEntidadFederativa) {
        this.idEntidadFederativa = idEntidadFederativa;
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
    @Column(name = "CLAVE_ENTIDAD")
    public String getClaveEntidad() {
        return claveEntidad;
    }

    public void setClaveEntidad(String claveEntidad) {
        this.claveEntidad = claveEntidad;
    }

    @Basic
    @Column(name = "ABREVIATURA")
    public String getAbreviatura() {
        return abreviatura;
    }

    public void setAbreviatura(String abreviatura) {
        this.abreviatura = abreviatura;
    }

    @Basic
    @Column(name = "ID_PAIS")
    public int getIdPais() {
        return idPais;
    }

    public void setIdPais(int idPais) {
        this.idPais = idPais;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SigaaCatEntidadFederativa that = (SigaaCatEntidadFederativa) o;
        return idEntidadFederativa == that.idEntidadFederativa &&
                idPais == that.idPais &&
                Objects.equals(descripcion, that.descripcion) &&
                Objects.equals(claveEntidad, that.claveEntidad) &&
                Objects.equals(abreviatura, that.abreviatura);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idEntidadFederativa, descripcion, claveEntidad, abreviatura, idPais);
    }

    @ManyToOne
    @JoinColumn(name = "ID_PAIS", referencedColumnName = "ID_PAIS", nullable = false, insertable = false, updatable = false)
    public SigaaCatPais getSigaaCatPaisByIdPais() {
        return sigaaCatPaisByIdPais;
    }

    public void setSigaaCatPaisByIdPais(SigaaCatPais sigaaCatPaisByIdPais) {
        this.sigaaCatPaisByIdPais = sigaaCatPaisByIdPais;
    }

    @OneToMany(mappedBy = "sigaaCatEntidadFederativaByIdEntidadFederativa")
    public List<SigaaCatMunicipio> getSigaaCatMunicipiosByIdEntidadFederativa() {
        return sigaaCatMunicipiosByIdEntidadFederativa;
    }

    public void setSigaaCatMunicipiosByIdEntidadFederativa(List<SigaaCatMunicipio> sigaaCatMunicipiosByIdEntidadFederativa) {
        this.sigaaCatMunicipiosByIdEntidadFederativa = sigaaCatMunicipiosByIdEntidadFederativa;
    }

    @OneToMany(mappedBy = "sigaaCatEntidadFederativaByIdEntidadFederativa")
    public List<SigaaHistoacademico> getSigaaHistoacademicosByIdEntidadFederativa() {
        return sigaaHistoacademicosByIdEntidadFederativa;
    }

    public void setSigaaHistoacademicosByIdEntidadFederativa(List<SigaaHistoacademico> sigaaHistoacademicosByIdEntidadFederativa) {
        this.sigaaHistoacademicosByIdEntidadFederativa = sigaaHistoacademicosByIdEntidadFederativa;
    }
}
