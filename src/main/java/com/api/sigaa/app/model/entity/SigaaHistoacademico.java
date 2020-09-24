package com.api.sigaa.app.model.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "SIGAA_HISTOACADEMICO", schema = "dbo", catalog = "SIGAA")
public class SigaaHistoacademico {
    private int idHistorial;
    private String nomEsc;
    private String pais;
    private String estado;
    private String municipio;
    private String localidad;
    private Double promFinal;
    private Integer añoTerm;
    private Integer idAreabach;
    private String nivel;
    private Date fechaInicio;
    private Date fechaFin;
    private Integer idInstitucion;
    private Integer idEntidadFederativa;
    private List<SigaaCatAlumno> sigaaCatAlumnosByIdHistorial;
    private List<SigaaCatAlumnoModificaso> sigaaCatAlumnoModificasosByIdHistorial;
    private SigaaCatAreabachillerato sigaaCatAreabachilleratoByIdAreabach;
    private SigaaCatInstitucion sigaaCatInstitucionByIdInstitucion;
    private SigaaCatEntidadFederativa sigaaCatEntidadFederativaByIdEntidadFederativa;

    @Id
    @Column(name = "ID_HISTORIAL")
    public int getIdHistorial() {
        return idHistorial;
    }

    public void setIdHistorial(int idHistorial) {
        this.idHistorial = idHistorial;
    }

    @Basic
    @Column(name = "NOM_ESC")
    public String getNomEsc() {
        return nomEsc;
    }

    public void setNomEsc(String nomEsc) {
        this.nomEsc = nomEsc;
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
    @Column(name = "MUNICIPIO")
    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
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
    @Column(name = "PROM_FINAL")
    public Double getPromFinal() {
        return promFinal;
    }

    public void setPromFinal(Double promFinal) {
        this.promFinal = promFinal;
    }

    @Basic
    @Column(name = "AÑO_TERM")
    public Integer getAñoTerm() {
        return añoTerm;
    }

    public void setAñoTerm(Integer añoTerm) {
        this.añoTerm = añoTerm;
    }

    @Basic
    @Column(name = "ID_AREABACH")
    public Integer getIdAreabach() {
        return idAreabach;
    }

    public void setIdAreabach(Integer idAreabach) {
        this.idAreabach = idAreabach;
    }

    @Basic
    @Column(name = "NIVEL")
    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    @Basic
    @Column(name = "FECHA_INICIO")
    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    @Basic
    @Column(name = "FECHA_FIN")
    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    @Basic
    @Column(name = "ID_INSTITUCION")
    public Integer getIdInstitucion() {
        return idInstitucion;
    }

    public void setIdInstitucion(Integer idInstitucion) {
        this.idInstitucion = idInstitucion;
    }

    @Basic
    @Column(name = "ID_ENTIDAD_FEDERATIVA")
    public Integer getIdEntidadFederativa() {
        return idEntidadFederativa;
    }

    public void setIdEntidadFederativa(Integer idEntidadFederativa) {
        this.idEntidadFederativa = idEntidadFederativa;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SigaaHistoacademico that = (SigaaHistoacademico) o;
        return idHistorial == that.idHistorial &&
                Objects.equals(nomEsc, that.nomEsc) &&
                Objects.equals(pais, that.pais) &&
                Objects.equals(estado, that.estado) &&
                Objects.equals(municipio, that.municipio) &&
                Objects.equals(localidad, that.localidad) &&
                Objects.equals(promFinal, that.promFinal) &&
                Objects.equals(añoTerm, that.añoTerm) &&
                Objects.equals(idAreabach, that.idAreabach) &&
                Objects.equals(nivel, that.nivel) &&
                Objects.equals(fechaInicio, that.fechaInicio) &&
                Objects.equals(fechaFin, that.fechaFin) &&
                Objects.equals(idInstitucion, that.idInstitucion) &&
                Objects.equals(idEntidadFederativa, that.idEntidadFederativa);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idHistorial, nomEsc, pais, estado, municipio, localidad, promFinal, añoTerm, idAreabach, nivel, fechaInicio, fechaFin, idInstitucion, idEntidadFederativa);
    }

    @OneToMany(mappedBy = "sigaaHistoacademicoByIdHistorial")
    public List<SigaaCatAlumno> getSigaaCatAlumnosByIdHistorial() {
        return sigaaCatAlumnosByIdHistorial;
    }

    public void setSigaaCatAlumnosByIdHistorial(List<SigaaCatAlumno> sigaaCatAlumnosByIdHistorial) {
        this.sigaaCatAlumnosByIdHistorial = sigaaCatAlumnosByIdHistorial;
    }

    @OneToMany(mappedBy = "sigaaHistoacademicoByIdHistorial")
    public List<SigaaCatAlumnoModificaso> getSigaaCatAlumnoModificasosByIdHistorial() {
        return sigaaCatAlumnoModificasosByIdHistorial;
    }

    public void setSigaaCatAlumnoModificasosByIdHistorial(List<SigaaCatAlumnoModificaso> sigaaCatAlumnoModificasosByIdHistorial) {
        this.sigaaCatAlumnoModificasosByIdHistorial = sigaaCatAlumnoModificasosByIdHistorial;
    }

    @ManyToOne
    @JoinColumn(name = "ID_AREABACH", referencedColumnName = "ID_AREABACH", insertable = false, updatable = false)
    public SigaaCatAreabachillerato getSigaaCatAreabachilleratoByIdAreabach() {
        return sigaaCatAreabachilleratoByIdAreabach;
    }

    public void setSigaaCatAreabachilleratoByIdAreabach(SigaaCatAreabachillerato sigaaCatAreabachilleratoByIdAreabach) {
        this.sigaaCatAreabachilleratoByIdAreabach = sigaaCatAreabachilleratoByIdAreabach;
    }

    @ManyToOne
    @JoinColumn(name = "ID_INSTITUCION", referencedColumnName = "ID_INSTITUCION", insertable = false, updatable = false)
    public SigaaCatInstitucion getSigaaCatInstitucionByIdInstitucion() {
        return sigaaCatInstitucionByIdInstitucion;
    }

    public void setSigaaCatInstitucionByIdInstitucion(SigaaCatInstitucion sigaaCatInstitucionByIdInstitucion) {
        this.sigaaCatInstitucionByIdInstitucion = sigaaCatInstitucionByIdInstitucion;
    }

    @ManyToOne
    @JoinColumn(name = "ID_ENTIDAD_FEDERATIVA", referencedColumnName = "ID_ENTIDAD_FEDERATIVA", insertable = false, updatable = false)
    public SigaaCatEntidadFederativa getSigaaCatEntidadFederativaByIdEntidadFederativa() {
        return sigaaCatEntidadFederativaByIdEntidadFederativa;
    }

    public void setSigaaCatEntidadFederativaByIdEntidadFederativa(SigaaCatEntidadFederativa sigaaCatEntidadFederativaByIdEntidadFederativa) {
        this.sigaaCatEntidadFederativaByIdEntidadFederativa = sigaaCatEntidadFederativaByIdEntidadFederativa;
    }
}
