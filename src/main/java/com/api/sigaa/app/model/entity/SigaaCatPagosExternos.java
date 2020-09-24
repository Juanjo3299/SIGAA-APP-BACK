package com.api.sigaa.app.model.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "SIGAA_CAT_PAGOS_EXTERNOS", schema = "dbo", catalog = "SIGAA")
public class SigaaCatPagosExternos {
    private int idPagosExternos;
    private String nombre;
    private String referencia;
    private Double importeNeto;
    private String medioPago;
    private String formaPago;
    private Date fecha;
    private int cns;
    private Integer folio;
    private Integer folioPosgrado;
    private List<FolioConsecutivo> folioConsecutivosByIdPagosExternos;
    private SigaaDetServicios sigaaDetServiciosByCns;
    private SigaaCatAspirante sigaaCatAspiranteByFolio;
    private SigaaCatAspirantePosgrado sigaaCatAspirantePosgradoByFolioPosgrado;
    private List<SigaaDetPagosAspirante> sigaaDetPagosAspirantesByIdPagosExternos;
    private List<SigaaDetPagosAspirantePosgrado> sigaaDetPagosAspirantePosgradosByIdPagosExternos;

    @Id
    @Column(name = "ID_PAGOS_EXTERNOS")
    public int getIdPagosExternos() {
        return idPagosExternos;
    }

    public void setIdPagosExternos(int idPagosExternos) {
        this.idPagosExternos = idPagosExternos;
    }

    @Basic
    @Column(name = "NOMBRE")
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Basic
    @Column(name = "REFERENCIA")
    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    @Basic
    @Column(name = "IMPORTE_NETO")
    public Double getImporteNeto() {
        return importeNeto;
    }

    public void setImporteNeto(Double importeNeto) {
        this.importeNeto = importeNeto;
    }

    @Basic
    @Column(name = "MEDIO_PAGO")
    public String getMedioPago() {
        return medioPago;
    }

    public void setMedioPago(String medioPago) {
        this.medioPago = medioPago;
    }

    @Basic
    @Column(name = "FORMA_PAGO")
    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    @Basic
    @Column(name = "FECHA")
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Basic
    @Column(name = "CNS")
    public int getCns() {
        return cns;
    }

    public void setCns(int cns) {
        this.cns = cns;
    }

    @Basic
    @Column(name = "FOLIO")
    public Integer getFolio() {
        return folio;
    }

    public void setFolio(Integer folio) {
        this.folio = folio;
    }

    @Basic
    @Column(name = "FOLIO_POSGRADO")
    public Integer getFolioPosgrado() {
        return folioPosgrado;
    }

    public void setFolioPosgrado(Integer folioPosgrado) {
        this.folioPosgrado = folioPosgrado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SigaaCatPagosExternos that = (SigaaCatPagosExternos) o;
        return idPagosExternos == that.idPagosExternos &&
                cns == that.cns &&
                Objects.equals(nombre, that.nombre) &&
                Objects.equals(referencia, that.referencia) &&
                Objects.equals(importeNeto, that.importeNeto) &&
                Objects.equals(medioPago, that.medioPago) &&
                Objects.equals(formaPago, that.formaPago) &&
                Objects.equals(fecha, that.fecha) &&
                Objects.equals(folio, that.folio) &&
                Objects.equals(folioPosgrado, that.folioPosgrado);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idPagosExternos, nombre, referencia, importeNeto, medioPago, formaPago, fecha, cns, folio, folioPosgrado);
    }

    @OneToMany(mappedBy = "sigaaCatPagosExternosByIdPagosExternos")
    public List<FolioConsecutivo> getFolioConsecutivosByIdPagosExternos() {
        return folioConsecutivosByIdPagosExternos;
    }

    public void setFolioConsecutivosByIdPagosExternos(List<FolioConsecutivo> folioConsecutivosByIdPagosExternos) {
        this.folioConsecutivosByIdPagosExternos = folioConsecutivosByIdPagosExternos;
    }

    @ManyToOne
    @JoinColumn(name = "CNS", referencedColumnName = "CNS", nullable = false, insertable = false, updatable = false)
    public SigaaDetServicios getSigaaDetServiciosByCns() {
        return sigaaDetServiciosByCns;
    }

    public void setSigaaDetServiciosByCns(SigaaDetServicios sigaaDetServiciosByCns) {
        this.sigaaDetServiciosByCns = sigaaDetServiciosByCns;
    }

    @ManyToOne
    @JoinColumn(name = "FOLIO", referencedColumnName = "FOLIO", insertable = false, updatable = false)
    public SigaaCatAspirante getSigaaCatAspiranteByFolio() {
        return sigaaCatAspiranteByFolio;
    }

    public void setSigaaCatAspiranteByFolio(SigaaCatAspirante sigaaCatAspiranteByFolio) {
        this.sigaaCatAspiranteByFolio = sigaaCatAspiranteByFolio;
    }

    @ManyToOne
    @JoinColumn(name = "FOLIO_POSGRADO", referencedColumnName = "FOLIO", insertable = false, updatable = false)
    public SigaaCatAspirantePosgrado getSigaaCatAspirantePosgradoByFolioPosgrado() {
        return sigaaCatAspirantePosgradoByFolioPosgrado;
    }

    public void setSigaaCatAspirantePosgradoByFolioPosgrado(SigaaCatAspirantePosgrado sigaaCatAspirantePosgradoByFolioPosgrado) {
        this.sigaaCatAspirantePosgradoByFolioPosgrado = sigaaCatAspirantePosgradoByFolioPosgrado;
    }

    @OneToMany(mappedBy = "sigaaCatPagosExternosByIdPagosExternos")
    public List<SigaaDetPagosAspirante> getSigaaDetPagosAspirantesByIdPagosExternos() {
        return sigaaDetPagosAspirantesByIdPagosExternos;
    }

    public void setSigaaDetPagosAspirantesByIdPagosExternos(List<SigaaDetPagosAspirante> sigaaDetPagosAspirantesByIdPagosExternos) {
        this.sigaaDetPagosAspirantesByIdPagosExternos = sigaaDetPagosAspirantesByIdPagosExternos;
    }

    @OneToMany(mappedBy = "sigaaCatPagosExternosByIdPagosExternos")
    public List<SigaaDetPagosAspirantePosgrado> getSigaaDetPagosAspirantePosgradosByIdPagosExternos() {
        return sigaaDetPagosAspirantePosgradosByIdPagosExternos;
    }

    public void setSigaaDetPagosAspirantePosgradosByIdPagosExternos(List<SigaaDetPagosAspirantePosgrado> sigaaDetPagosAspirantePosgradosByIdPagosExternos) {
        this.sigaaDetPagosAspirantePosgradosByIdPagosExternos = sigaaDetPagosAspirantePosgradosByIdPagosExternos;
    }
}
