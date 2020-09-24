package com.api.sigaa.app.model.entity;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "SIGAA_CAT_SERVICIOS", schema = "dbo", catalog = "SIGAA")
public class SigaaCatServicios {
    private int idServicio;
    private String concepto;
    private String estatus;
    private Integer idCategorizarServicios;
    private SigaaCatCategorizarServicios sigaaCatCategorizarServiciosByIdCategorizarServicios;
    private List<SigaaDetServicios> sigaaDetServiciosByIdServicio;

    @Id
    @Column(name = "ID_SERVICIO")
    public int getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(int idServicio) {
        this.idServicio = idServicio;
    }

    @Basic
    @Column(name = "CONCEPTO")
    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
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
    @Column(name = "ID_CATEGORIZAR_SERVICIOS")
    public Integer getIdCategorizarServicios() {
        return idCategorizarServicios;
    }

    public void setIdCategorizarServicios(Integer idCategorizarServicios) {
        this.idCategorizarServicios = idCategorizarServicios;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SigaaCatServicios that = (SigaaCatServicios) o;
        return idServicio == that.idServicio &&
                Objects.equals(concepto, that.concepto) &&
                Objects.equals(estatus, that.estatus) &&
                Objects.equals(idCategorizarServicios, that.idCategorizarServicios);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idServicio, concepto, estatus, idCategorizarServicios);
    }

    @ManyToOne
    @JoinColumn(name = "ID_CATEGORIZAR_SERVICIOS", referencedColumnName = "ID_CATEGORIZAR_SERVICIOS", insertable = false, updatable = false)
    public SigaaCatCategorizarServicios getSigaaCatCategorizarServiciosByIdCategorizarServicios() {
        return sigaaCatCategorizarServiciosByIdCategorizarServicios;
    }

    public void setSigaaCatCategorizarServiciosByIdCategorizarServicios(SigaaCatCategorizarServicios sigaaCatCategorizarServiciosByIdCategorizarServicios) {
        this.sigaaCatCategorizarServiciosByIdCategorizarServicios = sigaaCatCategorizarServiciosByIdCategorizarServicios;
    }

    @OneToMany(mappedBy = "sigaaCatServiciosByIdServicio")
    public List<SigaaDetServicios> getSigaaDetServiciosByIdServicio() {
        return sigaaDetServiciosByIdServicio;
    }

    public void setSigaaDetServiciosByIdServicio(List<SigaaDetServicios> sigaaDetServiciosByIdServicio) {
        this.sigaaDetServiciosByIdServicio = sigaaDetServiciosByIdServicio;
    }
}
