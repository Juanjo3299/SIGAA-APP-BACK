package com.api.sigaa.app.model.entity;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "SIGAA_CAT_DOCUMENTOS_ESTANCIAS", schema = "dbo", catalog = "SIGAA")
public class SigaaCatDocumentosEstancias {
    private int idCatDocumentosEstancias;
    private int estatusSolicitud;
    private int estatusCarta;
    private int estatusIne;
    private int estatusSeguro;
    private Integer estatusPropuestaProyecto;
    private String rutaSolicitud;
    private String rutaCarta;
    private String rutaIne;
    private String rutaSeguro;
    private String observaciones;
    private List<SigaaDatosEstancias> sigaaDatosEstanciasByIdCatDocumentosEstancias;

    @Id
    @Column(name = "ID_CAT_DOCUMENTOS_ESTANCIAS")
    public int getIdCatDocumentosEstancias() {
        return idCatDocumentosEstancias;
    }

    public void setIdCatDocumentosEstancias(int idCatDocumentosEstancias) {
        this.idCatDocumentosEstancias = idCatDocumentosEstancias;
    }

    @Basic
    @Column(name = "ESTATUS_SOLICITUD")
    public int getEstatusSolicitud() {
        return estatusSolicitud;
    }

    public void setEstatusSolicitud(int estatusSolicitud) {
        this.estatusSolicitud = estatusSolicitud;
    }

    @Basic
    @Column(name = "ESTATUS_CARTA")
    public int getEstatusCarta() {
        return estatusCarta;
    }

    public void setEstatusCarta(int estatusCarta) {
        this.estatusCarta = estatusCarta;
    }

    @Basic
    @Column(name = "ESTATUS_INE")
    public int getEstatusIne() {
        return estatusIne;
    }

    public void setEstatusIne(int estatusIne) {
        this.estatusIne = estatusIne;
    }

    @Basic
    @Column(name = "ESTATUS_SEGURO")
    public int getEstatusSeguro() {
        return estatusSeguro;
    }

    public void setEstatusSeguro(int estatusSeguro) {
        this.estatusSeguro = estatusSeguro;
    }

    @Basic
    @Column(name = "ESTATUS_PROPUESTA_PROYECTO")
    public Integer getEstatusPropuestaProyecto() {
        return estatusPropuestaProyecto;
    }

    public void setEstatusPropuestaProyecto(Integer estatusPropuestaProyecto) {
        this.estatusPropuestaProyecto = estatusPropuestaProyecto;
    }

    @Basic
    @Column(name = "RUTA_SOLICITUD")
    public String getRutaSolicitud() {
        return rutaSolicitud;
    }

    public void setRutaSolicitud(String rutaSolicitud) {
        this.rutaSolicitud = rutaSolicitud;
    }

    @Basic
    @Column(name = "RUTA_CARTA")
    public String getRutaCarta() {
        return rutaCarta;
    }

    public void setRutaCarta(String rutaCarta) {
        this.rutaCarta = rutaCarta;
    }

    @Basic
    @Column(name = "RUTA_INE")
    public String getRutaIne() {
        return rutaIne;
    }

    public void setRutaIne(String rutaIne) {
        this.rutaIne = rutaIne;
    }

    @Basic
    @Column(name = "RUTA_SEGURO")
    public String getRutaSeguro() {
        return rutaSeguro;
    }

    public void setRutaSeguro(String rutaSeguro) {
        this.rutaSeguro = rutaSeguro;
    }

    @Basic
    @Column(name = "OBSERVACIONES")
    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SigaaCatDocumentosEstancias that = (SigaaCatDocumentosEstancias) o;
        return idCatDocumentosEstancias == that.idCatDocumentosEstancias &&
                estatusSolicitud == that.estatusSolicitud &&
                estatusCarta == that.estatusCarta &&
                estatusIne == that.estatusIne &&
                estatusSeguro == that.estatusSeguro &&
                Objects.equals(estatusPropuestaProyecto, that.estatusPropuestaProyecto) &&
                Objects.equals(rutaSolicitud, that.rutaSolicitud) &&
                Objects.equals(rutaCarta, that.rutaCarta) &&
                Objects.equals(rutaIne, that.rutaIne) &&
                Objects.equals(rutaSeguro, that.rutaSeguro) &&
                Objects.equals(observaciones, that.observaciones);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCatDocumentosEstancias, estatusSolicitud, estatusCarta, estatusIne, estatusSeguro, estatusPropuestaProyecto, rutaSolicitud, rutaCarta, rutaIne, rutaSeguro, observaciones);
    }

    @OneToMany(mappedBy = "sigaaCatDocumentosEstanciasByIdCatDocumentosEstancias")
    public List<SigaaDatosEstancias> getSigaaDatosEstanciasByIdCatDocumentosEstancias() {
        return sigaaDatosEstanciasByIdCatDocumentosEstancias;
    }

    public void setSigaaDatosEstanciasByIdCatDocumentosEstancias(List<SigaaDatosEstancias> sigaaDatosEstanciasByIdCatDocumentosEstancias) {
        this.sigaaDatosEstanciasByIdCatDocumentosEstancias = sigaaDatosEstanciasByIdCatDocumentosEstancias;
    }
}
