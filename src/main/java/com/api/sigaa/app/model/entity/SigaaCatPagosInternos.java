package com.api.sigaa.app.model.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "SIGAA_CAT_PAGOS_INTERNOS", schema = "dbo", catalog = "SIGAA")
public class SigaaCatPagosInternos {
    private int idPagosInternos;
    private String referencia;
    private Double importeNeto;
    private String medioPago;
    private String formaPago;
    private Date fecha;
    private int matricula;
    private int cns;
    private List<FolioConsecutivo> folioConsecutivosByIdPagosInternos;
    private SigaaCatAlumno sigaaCatAlumnoByMatricula;
    private SigaaDetServicios sigaaDetServiciosByCns;
    private List<SigaaDetPagosAlumno> sigaaDetPagosAlumnosByIdPagosInternos;

    @Id
    @Column(name = "ID_PAGOS_INTERNOS")
    public int getIdPagosInternos() {
        return idPagosInternos;
    }

    public void setIdPagosInternos(int idPagosInternos) {
        this.idPagosInternos = idPagosInternos;
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
    @Column(name = "MATRICULA")
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    @Basic
    @Column(name = "CNS")
    public int getCns() {
        return cns;
    }

    public void setCns(int cns) {
        this.cns = cns;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SigaaCatPagosInternos that = (SigaaCatPagosInternos) o;
        return idPagosInternos == that.idPagosInternos &&
                matricula == that.matricula &&
                cns == that.cns &&
                Objects.equals(referencia, that.referencia) &&
                Objects.equals(importeNeto, that.importeNeto) &&
                Objects.equals(medioPago, that.medioPago) &&
                Objects.equals(formaPago, that.formaPago) &&
                Objects.equals(fecha, that.fecha);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idPagosInternos, referencia, importeNeto, medioPago, formaPago, fecha, matricula, cns);
    }

    @OneToMany(mappedBy = "sigaaCatPagosInternosByIdPagosInternos")
    public List<FolioConsecutivo> getFolioConsecutivosByIdPagosInternos() {
        return folioConsecutivosByIdPagosInternos;
    }

    public void setFolioConsecutivosByIdPagosInternos(List<FolioConsecutivo> folioConsecutivosByIdPagosInternos) {
        this.folioConsecutivosByIdPagosInternos = folioConsecutivosByIdPagosInternos;
    }

    @ManyToOne
    @JoinColumn(name = "MATRICULA", referencedColumnName = "MATRICULA", nullable = false, insertable = false, updatable = false)
    public SigaaCatAlumno getSigaaCatAlumnoByMatricula() {
        return sigaaCatAlumnoByMatricula;
    }

    public void setSigaaCatAlumnoByMatricula(SigaaCatAlumno sigaaCatAlumnoByMatricula) {
        this.sigaaCatAlumnoByMatricula = sigaaCatAlumnoByMatricula;
    }

    @ManyToOne
    @JoinColumn(name = "CNS", referencedColumnName = "CNS", nullable = false, insertable = false, updatable = false)
    public SigaaDetServicios getSigaaDetServiciosByCns() {
        return sigaaDetServiciosByCns;
    }

    public void setSigaaDetServiciosByCns(SigaaDetServicios sigaaDetServiciosByCns) {
        this.sigaaDetServiciosByCns = sigaaDetServiciosByCns;
    }

    @OneToMany(mappedBy = "sigaaCatPagosInternosByIdPagosInternos")
    public List<SigaaDetPagosAlumno> getSigaaDetPagosAlumnosByIdPagosInternos() {
        return sigaaDetPagosAlumnosByIdPagosInternos;
    }

    public void setSigaaDetPagosAlumnosByIdPagosInternos(List<SigaaDetPagosAlumno> sigaaDetPagosAlumnosByIdPagosInternos) {
        this.sigaaDetPagosAlumnosByIdPagosInternos = sigaaDetPagosAlumnosByIdPagosInternos;
    }
}
