package com.api.sigaa.app.model.entity;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "SIGAA_CAT_INSTITUCION", schema = "dbo", catalog = "SIGAA")
public class SigaaCatInstitucion {
    private int idInstitucion;
    private String institucion;
    private String localidad;
    private Integer idMunicipio;
    private SigaaCatMunicipio sigaaCatMunicipioByIdMunicipio;
    private List<SigaaHistoacademico> sigaaHistoacademicosByIdInstitucion;

    @Id
    @Column(name = "ID_INSTITUCION")
    public int getIdInstitucion() {
        return idInstitucion;
    }

    public void setIdInstitucion(int idInstitucion) {
        this.idInstitucion = idInstitucion;
    }

    @Basic
    @Column(name = "INSTITUCION")
    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
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
        SigaaCatInstitucion that = (SigaaCatInstitucion) o;
        return idInstitucion == that.idInstitucion &&
                Objects.equals(institucion, that.institucion) &&
                Objects.equals(localidad, that.localidad) &&
                Objects.equals(idMunicipio, that.idMunicipio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idInstitucion, institucion, localidad, idMunicipio);
    }

    @ManyToOne
    @JoinColumn(name = "ID_MUNICIPIO", referencedColumnName = "ID_MUNICIPIO", insertable = false, updatable = false)
    public SigaaCatMunicipio getSigaaCatMunicipioByIdMunicipio() {
        return sigaaCatMunicipioByIdMunicipio;
    }

    public void setSigaaCatMunicipioByIdMunicipio(SigaaCatMunicipio sigaaCatMunicipioByIdMunicipio) {
        this.sigaaCatMunicipioByIdMunicipio = sigaaCatMunicipioByIdMunicipio;
    }

    @OneToMany(mappedBy = "sigaaCatInstitucionByIdInstitucion")
    public List<SigaaHistoacademico> getSigaaHistoacademicosByIdInstitucion() {
        return sigaaHistoacademicosByIdInstitucion;
    }

    public void setSigaaHistoacademicosByIdInstitucion(List<SigaaHistoacademico> sigaaHistoacademicosByIdInstitucion) {
        this.sigaaHistoacademicosByIdInstitucion = sigaaHistoacademicosByIdInstitucion;
    }
}
