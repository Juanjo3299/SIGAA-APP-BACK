package com.api.sigaa.app.model.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "SIGAA_DET_SERVICIOS", schema = "dbo", catalog = "SIGAA")
public class SigaaDetServicios {
    private int cns;
    private int idServicio;
    private String descripcion;
    private double importe;
    private String moneda;
    private Date fechaInicio;
    private Date fechaFin;
    private String estatus;
    private List<SigaaAlumnoDetServicios> sigaaAlumnoDetServiciosByCns;
    private List<SigaaCatPagosExternos> sigaaCatPagosExternosByCns;
    private List<SigaaCatPagosInternos> sigaaCatPagosInternosByCns;
    private List<SigaaDetAlumnoExento> sigaaDetAlumnoExentosByCns;
    private SigaaCatServicios sigaaCatServiciosByIdServicio;

    @Id
    @Column(name = "CNS")
    public int getCns() {
        return cns;
    }

    public void setCns(int cns) {
        this.cns = cns;
    }

    @Basic
    @Column(name = "ID_SERVICIO")
    public int getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(int idServicio) {
        this.idServicio = idServicio;
    }

    @Basic
    @Column(name = "DESCRIPCION")
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Basic
    @Column(name = "IMPORTE")
    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    @Basic
    @Column(name = "MONEDA")
    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
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
    @Column(name = "ESTATUS")
    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SigaaDetServicios that = (SigaaDetServicios) o;
        return cns == that.cns &&
                idServicio == that.idServicio &&
                Double.compare(that.importe, importe) == 0 &&
                Objects.equals(descripcion, that.descripcion) &&
                Objects.equals(moneda, that.moneda) &&
                Objects.equals(fechaInicio, that.fechaInicio) &&
                Objects.equals(fechaFin, that.fechaFin) &&
                Objects.equals(estatus, that.estatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cns, idServicio, descripcion, importe, moneda, fechaInicio, fechaFin, estatus);
    }

    @OneToMany(mappedBy = "sigaaDetServiciosByCnsDetServicios")
    public List<SigaaAlumnoDetServicios> getSigaaAlumnoDetServiciosByCns() {
        return sigaaAlumnoDetServiciosByCns;
    }

    public void setSigaaAlumnoDetServiciosByCns(List<SigaaAlumnoDetServicios> sigaaAlumnoDetServiciosByCns) {
        this.sigaaAlumnoDetServiciosByCns = sigaaAlumnoDetServiciosByCns;
    }

    @OneToMany(mappedBy = "sigaaDetServiciosByCns")
    public List<SigaaCatPagosExternos> getSigaaCatPagosExternosByCns() {
        return sigaaCatPagosExternosByCns;
    }

    public void setSigaaCatPagosExternosByCns(List<SigaaCatPagosExternos> sigaaCatPagosExternosByCns) {
        this.sigaaCatPagosExternosByCns = sigaaCatPagosExternosByCns;
    }

    @OneToMany(mappedBy = "sigaaDetServiciosByCns")
    public List<SigaaCatPagosInternos> getSigaaCatPagosInternosByCns() {
        return sigaaCatPagosInternosByCns;
    }

    public void setSigaaCatPagosInternosByCns(List<SigaaCatPagosInternos> sigaaCatPagosInternosByCns) {
        this.sigaaCatPagosInternosByCns = sigaaCatPagosInternosByCns;
    }

    @OneToMany(mappedBy = "sigaaDetServiciosByIdServicio")
    public List<SigaaDetAlumnoExento> getSigaaDetAlumnoExentosByCns() {
        return sigaaDetAlumnoExentosByCns;
    }

    public void setSigaaDetAlumnoExentosByCns(List<SigaaDetAlumnoExento> sigaaDetAlumnoExentosByCns) {
        this.sigaaDetAlumnoExentosByCns = sigaaDetAlumnoExentosByCns;
    }

    @ManyToOne
    @JoinColumn(name = "ID_SERVICIO", referencedColumnName = "ID_SERVICIO", nullable = false, insertable = false, updatable = false)
    public SigaaCatServicios getSigaaCatServiciosByIdServicio() {
        return sigaaCatServiciosByIdServicio;
    }

    public void setSigaaCatServiciosByIdServicio(SigaaCatServicios sigaaCatServiciosByIdServicio) {
        this.sigaaCatServiciosByIdServicio = sigaaCatServiciosByIdServicio;
    }
}
