package com.api.sigaa.app.model.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "SIGAA_DOCUMENTOS_TITULACION", schema = "dbo", catalog = "SIGAA")
public class SigaaDocumentosTitulacion {
    private int idDocumentosTitulacion;
    private Integer matricula;
    private String tipoDocumento;
    private String folio;
    private String libro;
    private String aFojas;
    private Date fechaExpedicion;
    private Date fechaExamen;
    private Date fechaTitulacion;
    private Date fecharegistro;
    private String institucion;
    private SigaaCatAlumno sigaaCatAlumnoByMatricula;

    @Id
    @Column(name = "ID_DOCUMENTOS_TITULACION")
    public int getIdDocumentosTitulacion() {
        return idDocumentosTitulacion;
    }

    public void setIdDocumentosTitulacion(int idDocumentosTitulacion) {
        this.idDocumentosTitulacion = idDocumentosTitulacion;
    }

    @Basic
    @Column(name = "MATRICULA")
    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    @Basic
    @Column(name = "TIPO_DOCUMENTO")
    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    @Basic
    @Column(name = "FOLIO")
    public String getFolio() {
        return folio;
    }

    public void setFolio(String folio) {
        this.folio = folio;
    }

    @Basic
    @Column(name = "LIBRO")
    public String getLibro() {
        return libro;
    }

    public void setLibro(String libro) {
        this.libro = libro;
    }

    @Basic
    @Column(name = "A_FOJAS")
    public String getaFojas() {
        return aFojas;
    }

    public void setaFojas(String aFojas) {
        this.aFojas = aFojas;
    }

    @Basic
    @Column(name = "FECHA_EXPEDICION")
    public Date getFechaExpedicion() {
        return fechaExpedicion;
    }

    public void setFechaExpedicion(Date fechaExpedicion) {
        this.fechaExpedicion = fechaExpedicion;
    }

    @Basic
    @Column(name = "FECHA_EXAMEN")
    public Date getFechaExamen() {
        return fechaExamen;
    }

    public void setFechaExamen(Date fechaExamen) {
        this.fechaExamen = fechaExamen;
    }

    @Basic
    @Column(name = "FECHA_TITULACION")
    public Date getFechaTitulacion() {
        return fechaTitulacion;
    }

    public void setFechaTitulacion(Date fechaTitulacion) {
        this.fechaTitulacion = fechaTitulacion;
    }

    @Basic
    @Column(name = "FECHAREGISTRO")
    public Date getFecharegistro() {
        return fecharegistro;
    }

    public void setFecharegistro(Date fecharegistro) {
        this.fecharegistro = fecharegistro;
    }

    @Basic
    @Column(name = "INSTITUCION")
    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SigaaDocumentosTitulacion that = (SigaaDocumentosTitulacion) o;
        return idDocumentosTitulacion == that.idDocumentosTitulacion &&
                Objects.equals(matricula, that.matricula) &&
                Objects.equals(tipoDocumento, that.tipoDocumento) &&
                Objects.equals(folio, that.folio) &&
                Objects.equals(libro, that.libro) &&
                Objects.equals(aFojas, that.aFojas) &&
                Objects.equals(fechaExpedicion, that.fechaExpedicion) &&
                Objects.equals(fechaExamen, that.fechaExamen) &&
                Objects.equals(fechaTitulacion, that.fechaTitulacion) &&
                Objects.equals(fecharegistro, that.fecharegistro) &&
                Objects.equals(institucion, that.institucion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idDocumentosTitulacion, matricula, tipoDocumento, folio, libro, aFojas, fechaExpedicion, fechaExamen, fechaTitulacion, fecharegistro, institucion);
    }

    @ManyToOne
    @JoinColumn(name = "MATRICULA", referencedColumnName = "MATRICULA", insertable = false, updatable = false)
    public SigaaCatAlumno getSigaaCatAlumnoByMatricula() {
        return sigaaCatAlumnoByMatricula;
    }

    public void setSigaaCatAlumnoByMatricula(SigaaCatAlumno sigaaCatAlumnoByMatricula) {
        this.sigaaCatAlumnoByMatricula = sigaaCatAlumnoByMatricula;
    }
}
