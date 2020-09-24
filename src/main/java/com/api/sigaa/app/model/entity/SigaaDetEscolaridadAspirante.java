package com.api.sigaa.app.model.entity;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "SIGAA_DET_ESCOLARIDAD_ASPIRANTE", schema = "dbo", catalog = "SIGAA")
public class SigaaDetEscolaridadAspirante {
    private int cns;
    private String escuelaProcedencia;
    private Integer añoTermino;
    private Float promedioFinal;
    private String pais;
    private String estado;
    private String localidad;
    private String municipio;
    private String bachillerato;
    private Integer idAreaBachillerato;
    private String universidadTecnologica;
    private String nomCarrera;
    private int folio;
    private List<SigaaAlumnoCuatriCeroEscolaridad> sigaaAlumnoCuatriCeroEscolaridadsByCns;
    private SigaaCatAreabachillerato sigaaCatAreabachilleratoByIdAreaBachillerato;
    private SigaaCatAspirante sigaaCatAspiranteByFolio;

    @Id
    @Column(name = "CNS")
    public int getCns() {
        return cns;
    }

    public void setCns(int cns) {
        this.cns = cns;
    }

    @Basic
    @Column(name = "ESCUELA_PROCEDENCIA")
    public String getEscuelaProcedencia() {
        return escuelaProcedencia;
    }

    public void setEscuelaProcedencia(String escuelaProcedencia) {
        this.escuelaProcedencia = escuelaProcedencia;
    }

    @Basic
    @Column(name = "AÑO_TERMINO")
    public Integer getAñoTermino() {
        return añoTermino;
    }

    public void setAñoTermino(Integer añoTermino) {
        this.añoTermino = añoTermino;
    }

    @Basic
    @Column(name = "PROMEDIO_FINAL")
    public Float getPromedioFinal() {
        return promedioFinal;
    }

    public void setPromedioFinal(Float promedioFinal) {
        this.promedioFinal = promedioFinal;
    }

    @Basic
    @Column(name = "PAIS")
    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Basic
    @Column(name = "ESTADO")
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
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
    @Column(name = "MUNICIPIO")
    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    @Basic
    @Column(name = "BACHILLERATO")
    public String getBachillerato() {
        return bachillerato;
    }

    public void setBachillerato(String bachillerato) {
        this.bachillerato = bachillerato;
    }

    @Basic
    @Column(name = "ID_AREA_BACHILLERATO")
    public Integer getIdAreaBachillerato() {
        return idAreaBachillerato;
    }

    public void setIdAreaBachillerato(Integer idAreaBachillerato) {
        this.idAreaBachillerato = idAreaBachillerato;
    }

    @Basic
    @Column(name = "UNIVERSIDAD_TECNOLOGICA")
    public String getUniversidadTecnologica() {
        return universidadTecnologica;
    }

    public void setUniversidadTecnologica(String universidadTecnologica) {
        this.universidadTecnologica = universidadTecnologica;
    }

    @Basic
    @Column(name = "NOM_CARRERA")
    public String getNomCarrera() {
        return nomCarrera;
    }

    public void setNomCarrera(String nomCarrera) {
        this.nomCarrera = nomCarrera;
    }

    @Basic
    @Column(name = "FOLIO")
    public int getFolio() {
        return folio;
    }

    public void setFolio(int folio) {
        this.folio = folio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SigaaDetEscolaridadAspirante that = (SigaaDetEscolaridadAspirante) o;
        return cns == that.cns &&
                folio == that.folio &&
                Objects.equals(escuelaProcedencia, that.escuelaProcedencia) &&
                Objects.equals(añoTermino, that.añoTermino) &&
                Objects.equals(promedioFinal, that.promedioFinal) &&
                Objects.equals(pais, that.pais) &&
                Objects.equals(estado, that.estado) &&
                Objects.equals(localidad, that.localidad) &&
                Objects.equals(municipio, that.municipio) &&
                Objects.equals(bachillerato, that.bachillerato) &&
                Objects.equals(idAreaBachillerato, that.idAreaBachillerato) &&
                Objects.equals(universidadTecnologica, that.universidadTecnologica) &&
                Objects.equals(nomCarrera, that.nomCarrera);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cns, escuelaProcedencia, añoTermino, promedioFinal, pais, estado, localidad, municipio, bachillerato, idAreaBachillerato, universidadTecnologica, nomCarrera, folio);
    }

    @OneToMany(mappedBy = "sigaaDetEscolaridadAspiranteByIdDetEscolaridad")
    public List<SigaaAlumnoCuatriCeroEscolaridad> getSigaaAlumnoCuatriCeroEscolaridadsByCns() {
        return sigaaAlumnoCuatriCeroEscolaridadsByCns;
    }

    public void setSigaaAlumnoCuatriCeroEscolaridadsByCns(List<SigaaAlumnoCuatriCeroEscolaridad> sigaaAlumnoCuatriCeroEscolaridadsByCns) {
        this.sigaaAlumnoCuatriCeroEscolaridadsByCns = sigaaAlumnoCuatriCeroEscolaridadsByCns;
    }

    @ManyToOne
    @JoinColumn(name = "ID_AREA_BACHILLERATO", referencedColumnName = "ID_AREABACH", insertable = false, updatable = false)
    public SigaaCatAreabachillerato getSigaaCatAreabachilleratoByIdAreaBachillerato() {
        return sigaaCatAreabachilleratoByIdAreaBachillerato;
    }

    public void setSigaaCatAreabachilleratoByIdAreaBachillerato(SigaaCatAreabachillerato sigaaCatAreabachilleratoByIdAreaBachillerato) {
        this.sigaaCatAreabachilleratoByIdAreaBachillerato = sigaaCatAreabachilleratoByIdAreaBachillerato;
    }

    @ManyToOne
    @JoinColumn(name = "FOLIO", referencedColumnName = "FOLIO", nullable = false, insertable = false, updatable = false)
    public SigaaCatAspirante getSigaaCatAspiranteByFolio() {
        return sigaaCatAspiranteByFolio;
    }

    public void setSigaaCatAspiranteByFolio(SigaaCatAspirante sigaaCatAspiranteByFolio) {
        this.sigaaCatAspiranteByFolio = sigaaCatAspiranteByFolio;
    }
}
