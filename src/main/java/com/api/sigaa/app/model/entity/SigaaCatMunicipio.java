package com.api.sigaa.app.model.entity;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "SIGAA_CAT_MUNICIPIO", schema = "dbo", catalog = "SIGAA")
public class SigaaCatMunicipio {
    private int idMunicipio;
    private int idEntidadFederativa;
    private String claveMunicipio;
    private String municipio;
    private String cabeceraMunicipal;
    private List<SigaaCatInstitucion> sigaaCatInstitucionsByIdMunicipio;
    private List<SigaaCatInstitucionuniversitaria> sigaaCatInstitucionuniversitariasByIdMunicipio;
    private SigaaCatEntidadFederativa sigaaCatEntidadFederativaByIdEntidadFederativa;

    @Id
    @Column(name = "ID_MUNICIPIO")
    public int getIdMunicipio() {
        return idMunicipio;
    }

    public void setIdMunicipio(int idMunicipio) {
        this.idMunicipio = idMunicipio;
    }

    @Basic
    @Column(name = "ID_ENTIDAD_FEDERATIVA")
    public int getIdEntidadFederativa() {
        return idEntidadFederativa;
    }

    public void setIdEntidadFederativa(int idEntidadFederativa) {
        this.idEntidadFederativa = idEntidadFederativa;
    }

    @Basic
    @Column(name = "CLAVE_MUNICIPIO")
    public String getClaveMunicipio() {
        return claveMunicipio;
    }

    public void setClaveMunicipio(String claveMunicipio) {
        this.claveMunicipio = claveMunicipio;
    }

    @Basic
    @Column(name = "MUNICIPIO")
    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    @Basic
    @Column(name = "CABECERA_MUNICIPAL")
    public String getCabeceraMunicipal() {
        return cabeceraMunicipal;
    }

    public void setCabeceraMunicipal(String cabeceraMunicipal) {
        this.cabeceraMunicipal = cabeceraMunicipal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SigaaCatMunicipio that = (SigaaCatMunicipio) o;
        return idMunicipio == that.idMunicipio &&
                idEntidadFederativa == that.idEntidadFederativa &&
                Objects.equals(claveMunicipio, that.claveMunicipio) &&
                Objects.equals(municipio, that.municipio) &&
                Objects.equals(cabeceraMunicipal, that.cabeceraMunicipal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idMunicipio, idEntidadFederativa, claveMunicipio, municipio, cabeceraMunicipal);
    }

    @OneToMany(mappedBy = "sigaaCatMunicipioByIdMunicipio")
    public List<SigaaCatInstitucion> getSigaaCatInstitucionsByIdMunicipio() {
        return sigaaCatInstitucionsByIdMunicipio;
    }

    public void setSigaaCatInstitucionsByIdMunicipio(List<SigaaCatInstitucion> sigaaCatInstitucionsByIdMunicipio) {
        this.sigaaCatInstitucionsByIdMunicipio = sigaaCatInstitucionsByIdMunicipio;
    }

    @OneToMany(mappedBy = "sigaaCatMunicipioByIdMunicipio")
    public List<SigaaCatInstitucionuniversitaria> getSigaaCatInstitucionuniversitariasByIdMunicipio() {
        return sigaaCatInstitucionuniversitariasByIdMunicipio;
    }

    public void setSigaaCatInstitucionuniversitariasByIdMunicipio(List<SigaaCatInstitucionuniversitaria> sigaaCatInstitucionuniversitariasByIdMunicipio) {
        this.sigaaCatInstitucionuniversitariasByIdMunicipio = sigaaCatInstitucionuniversitariasByIdMunicipio;
    }

    @ManyToOne
    @JoinColumn(name = "ID_ENTIDAD_FEDERATIVA", referencedColumnName = "ID_ENTIDAD_FEDERATIVA", nullable = false, insertable = false, updatable = false)
    public SigaaCatEntidadFederativa getSigaaCatEntidadFederativaByIdEntidadFederativa() {
        return sigaaCatEntidadFederativaByIdEntidadFederativa;
    }

    public void setSigaaCatEntidadFederativaByIdEntidadFederativa(SigaaCatEntidadFederativa sigaaCatEntidadFederativaByIdEntidadFederativa) {
        this.sigaaCatEntidadFederativaByIdEntidadFederativa = sigaaCatEntidadFederativaByIdEntidadFederativa;
    }
}
