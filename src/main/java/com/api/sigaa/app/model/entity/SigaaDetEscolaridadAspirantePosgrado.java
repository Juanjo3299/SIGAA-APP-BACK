package com.api.sigaa.app.model.entity;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "SIGAA_DET_ESCOLARIDAD_ASPIRANTE_POSGRADO", schema = "dbo", catalog = "SIGAA")
public class SigaaDetEscolaridadAspirantePosgrado {
    private int idDetEscolaridad;
    private String añoTermino;
    private String estado;
    private String localidad;
    private String municipio;
    private String nomCarrera;
    private String pais;
    private Float promedioFinal;
    private String universidadProcedencia;
    private List<SigaaCatAspirantePosgrado> sigaaCatAspirantePosgradosByIdDetEscolaridad;

    @Id
    @Column(name = "ID_DET_ESCOLARIDAD")
    public int getIdDetEscolaridad() {
        return idDetEscolaridad;
    }

    public void setIdDetEscolaridad(int idDetEscolaridad) {
        this.idDetEscolaridad = idDetEscolaridad;
    }

    @Basic
    @Column(name = "AÑO_TERMINO")
    public String getAñoTermino() {
        return añoTermino;
    }

    public void setAñoTermino(String añoTermino) {
        this.añoTermino = añoTermino;
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
    @Column(name = "NOM_CARRERA")
    public String getNomCarrera() {
        return nomCarrera;
    }

    public void setNomCarrera(String nomCarrera) {
        this.nomCarrera = nomCarrera;
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
    @Column(name = "PROMEDIO_FINAL")
    public Float getPromedioFinal() {
        return promedioFinal;
    }

    public void setPromedioFinal(Float promedioFinal) {
        this.promedioFinal = promedioFinal;
    }

    @Basic
    @Column(name = "UNIVERSIDAD_PROCEDENCIA")
    public String getUniversidadProcedencia() {
        return universidadProcedencia;
    }

    public void setUniversidadProcedencia(String universidadProcedencia) {
        this.universidadProcedencia = universidadProcedencia;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SigaaDetEscolaridadAspirantePosgrado that = (SigaaDetEscolaridadAspirantePosgrado) o;
        return idDetEscolaridad == that.idDetEscolaridad &&
                Objects.equals(añoTermino, that.añoTermino) &&
                Objects.equals(estado, that.estado) &&
                Objects.equals(localidad, that.localidad) &&
                Objects.equals(municipio, that.municipio) &&
                Objects.equals(nomCarrera, that.nomCarrera) &&
                Objects.equals(pais, that.pais) &&
                Objects.equals(promedioFinal, that.promedioFinal) &&
                Objects.equals(universidadProcedencia, that.universidadProcedencia);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idDetEscolaridad, añoTermino, estado, localidad, municipio, nomCarrera, pais, promedioFinal, universidadProcedencia);
    }

    @OneToMany(mappedBy = "sigaaDetEscolaridadAspirantePosgradoByIdDetEscolaridad")
    public List<SigaaCatAspirantePosgrado> getSigaaCatAspirantePosgradosByIdDetEscolaridad() {
        return sigaaCatAspirantePosgradosByIdDetEscolaridad;
    }

    public void setSigaaCatAspirantePosgradosByIdDetEscolaridad(List<SigaaCatAspirantePosgrado> sigaaCatAspirantePosgradosByIdDetEscolaridad) {
        this.sigaaCatAspirantePosgradosByIdDetEscolaridad = sigaaCatAspirantePosgradosByIdDetEscolaridad;
    }
}
