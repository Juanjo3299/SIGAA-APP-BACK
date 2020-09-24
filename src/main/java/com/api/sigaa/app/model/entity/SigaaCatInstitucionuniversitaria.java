package com.api.sigaa.app.model.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "SIGAA_CAT_INSTITUCIONUNIVERSITARIA", schema = "dbo", catalog = "SIGAA")
public class SigaaCatInstitucionuniversitaria {
    private int idInstitucion;
    private String nomIntitucion;
    private String localidad;
    private Integer idMunicipio;
    private SigaaCatMunicipio sigaaCatMunicipioByIdMunicipio;

    @Id
    @Column(name = "ID_INSTITUCION")
    public int getIdInstitucion() {
        return idInstitucion;
    }

    public void setIdInstitucion(int idInstitucion) {
        this.idInstitucion = idInstitucion;
    }

    @Basic
    @Column(name = "NOM_INTITUCION")
    public String getNomIntitucion() {
        return nomIntitucion;
    }

    public void setNomIntitucion(String nomIntitucion) {
        this.nomIntitucion = nomIntitucion;
    }

    @Basic
    @Column(name = "LOCALIDAD")
    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    @Basic
    @Column(name = "ID_MUNICIPIO")
    public Integer getIdMunicipio() {
        return idMunicipio;
    }

    public void setIdMunicipio(Integer idMunicipio) {
        this.idMunicipio = idMunicipio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SigaaCatInstitucionuniversitaria that = (SigaaCatInstitucionuniversitaria) o;
        return idInstitucion == that.idInstitucion &&
                Objects.equals(nomIntitucion, that.nomIntitucion) &&
                Objects.equals(localidad, that.localidad) &&
                Objects.equals(idMunicipio, that.idMunicipio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idInstitucion, nomIntitucion, localidad, idMunicipio);
    }

    @ManyToOne
    @JoinColumn(name = "ID_MUNICIPIO", referencedColumnName = "ID_MUNICIPIO", insertable = false, updatable = false)
    public SigaaCatMunicipio getSigaaCatMunicipioByIdMunicipio() {
        return sigaaCatMunicipioByIdMunicipio;
    }

    public void setSigaaCatMunicipioByIdMunicipio(SigaaCatMunicipio sigaaCatMunicipioByIdMunicipio) {
        this.sigaaCatMunicipioByIdMunicipio = sigaaCatMunicipioByIdMunicipio;
    }
}
