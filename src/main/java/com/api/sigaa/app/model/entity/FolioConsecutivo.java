package com.api.sigaa.app.model.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "FOLIO_CONSECUTIVO", schema = "dbo", catalog = "SIGAA")
public class FolioConsecutivo {
    private int idFolioCns;
    private int folio;
    private Integer idPagosExternos;
    private Integer idPagosInternos;
    private String estatus;
    private String observaciones;
    private Date fecha;
    private SigaaCatPagosExternos sigaaCatPagosExternosByIdPagosExternos;
    private SigaaCatPagosInternos sigaaCatPagosInternosByIdPagosInternos;

    @Id
    @Column(name = "ID_FOLIO_CNS")
    public int getIdFolioCns() {
        return idFolioCns;
    }

    public void setIdFolioCns(int idFolioCns) {
        this.idFolioCns = idFolioCns;
    }

    @Basic
    @Column(name = "FOLIO")
    public int getFolio() {
        return folio;
    }

    public void setFolio(int folio) {
        this.folio = folio;
    }

    @Basic
    @Column(name = "ID_PAGOS_EXTERNOS")
    public Integer getIdPagosExternos() {
        return idPagosExternos;
    }

    public void setIdPagosExternos(Integer idPagosExternos) {
        this.idPagosExternos = idPagosExternos;
    }

    @Basic
    @Column(name = "ID_PAGOS_INTERNOS")
    public Integer getIdPagosInternos() {
        return idPagosInternos;
    }

    public void setIdPagosInternos(Integer idPagosInternos) {
        this.idPagosInternos = idPagosInternos;
    }

    @Basic
    @Column(name = "ESTATUS")
    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    @Basic
    @Column(name = "OBSERVACIONES")
    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    @Basic
    @Column(name = "FECHA")
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FolioConsecutivo that = (FolioConsecutivo) o;
        return idFolioCns == that.idFolioCns &&
                folio == that.folio &&
                Objects.equals(idPagosExternos, that.idPagosExternos) &&
                Objects.equals(idPagosInternos, that.idPagosInternos) &&
                Objects.equals(estatus, that.estatus) &&
                Objects.equals(observaciones, that.observaciones) &&
                Objects.equals(fecha, that.fecha);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idFolioCns, folio, idPagosExternos, idPagosInternos, estatus, observaciones, fecha);
    }

    @ManyToOne
    @JoinColumn(name = "ID_PAGOS_EXTERNOS", referencedColumnName = "ID_PAGOS_EXTERNOS", insertable = false, updatable = false)
    public SigaaCatPagosExternos getSigaaCatPagosExternosByIdPagosExternos() {
        return sigaaCatPagosExternosByIdPagosExternos;
    }

    public void setSigaaCatPagosExternosByIdPagosExternos(SigaaCatPagosExternos sigaaCatPagosExternosByIdPagosExternos) {
        this.sigaaCatPagosExternosByIdPagosExternos = sigaaCatPagosExternosByIdPagosExternos;
    }

    @ManyToOne
    @JoinColumn(name = "ID_PAGOS_INTERNOS", referencedColumnName = "ID_PAGOS_INTERNOS", insertable = false, updatable = false)
    public SigaaCatPagosInternos getSigaaCatPagosInternosByIdPagosInternos() {
        return sigaaCatPagosInternosByIdPagosInternos;
    }

    public void setSigaaCatPagosInternosByIdPagosInternos(SigaaCatPagosInternos sigaaCatPagosInternosByIdPagosInternos) {
        this.sigaaCatPagosInternosByIdPagosInternos = sigaaCatPagosInternosByIdPagosInternos;
    }
}
