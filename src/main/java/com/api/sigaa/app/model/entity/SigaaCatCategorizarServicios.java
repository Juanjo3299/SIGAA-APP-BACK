package com.api.sigaa.app.model.entity;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "SIGAA_CAT_CATEGORIZAR_SERVICIOS", schema = "dbo", catalog = "SIGAA")
public class SigaaCatCategorizarServicios {
    private int idCategorizarServicios;
    private String categoria;
    private String estatus;
    private String tipoCategoria;
    private SigaaCatCategorizarServicios sigaaCatCategorizarServiciosByIdCategorizarServicios;
    private SigaaCatCategorizarServicios sigaaCatCategorizarServiciosByIdCategorizarServicios_0;
    private SigaaCatCategorizarServicios sigaaCatCategorizarServiciosByIdCategorizarServicios_1;
    private SigaaCatCategorizarServicios sigaaCatCategorizarServiciosByIdCategorizarServicios_2;
    private List<SigaaCatServicios> sigaaCatServiciosByIdCategorizarServicios;

    @Id
    @Column(name = "ID_CATEGORIZAR_SERVICIOS")
    public int getIdCategorizarServicios() {
        return idCategorizarServicios;
    }

    public void setIdCategorizarServicios(int idCategorizarServicios) {
        this.idCategorizarServicios = idCategorizarServicios;
    }

    @Basic
    @Column(name = "CATEGORIA")
    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
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
    @Column(name = "TIPO_CATEGORIA")
    public String getTipoCategoria() {
        return tipoCategoria;
    }

    public void setTipoCategoria(String tipoCategoria) {
        this.tipoCategoria = tipoCategoria;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SigaaCatCategorizarServicios that = (SigaaCatCategorizarServicios) o;
        return idCategorizarServicios == that.idCategorizarServicios &&
                Objects.equals(categoria, that.categoria) &&
                Objects.equals(estatus, that.estatus) &&
                Objects.equals(tipoCategoria, that.tipoCategoria);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCategorizarServicios, categoria, estatus, tipoCategoria);
    }

    @OneToOne
    @JoinColumn(name = "ID_CATEGORIZAR_SERVICIOS", referencedColumnName = "ID_CATEGORIZAR_SERVICIOS", nullable = false, insertable = false, updatable = false)
    public SigaaCatCategorizarServicios getSigaaCatCategorizarServiciosByIdCategorizarServicios() {
        return sigaaCatCategorizarServiciosByIdCategorizarServicios;
    }

    public void setSigaaCatCategorizarServiciosByIdCategorizarServicios(SigaaCatCategorizarServicios sigaaCatCategorizarServiciosByIdCategorizarServicios) {
        this.sigaaCatCategorizarServiciosByIdCategorizarServicios = sigaaCatCategorizarServiciosByIdCategorizarServicios;
    }

    @OneToOne(mappedBy = "sigaaCatCategorizarServiciosByIdCategorizarServicios")
    public SigaaCatCategorizarServicios getSigaaCatCategorizarServiciosByIdCategorizarServicios_0() {
        return sigaaCatCategorizarServiciosByIdCategorizarServicios_0;
    }

    public void setSigaaCatCategorizarServiciosByIdCategorizarServicios_0(SigaaCatCategorizarServicios sigaaCatCategorizarServiciosByIdCategorizarServicios_0) {
        this.sigaaCatCategorizarServiciosByIdCategorizarServicios_0 = sigaaCatCategorizarServiciosByIdCategorizarServicios_0;
    }

    @OneToOne
    @JoinColumn(name = "ID_CATEGORIZAR_SERVICIOS", referencedColumnName = "ID_CATEGORIZAR_SERVICIOS", nullable = false, insertable = false, updatable = false)
    public SigaaCatCategorizarServicios getSigaaCatCategorizarServiciosByIdCategorizarServicios_1() {
        return sigaaCatCategorizarServiciosByIdCategorizarServicios_1;
    }

    public void setSigaaCatCategorizarServiciosByIdCategorizarServicios_1(SigaaCatCategorizarServicios sigaaCatCategorizarServiciosByIdCategorizarServicios_1) {
        this.sigaaCatCategorizarServiciosByIdCategorizarServicios_1 = sigaaCatCategorizarServiciosByIdCategorizarServicios_1;
    }

    @OneToOne(mappedBy = "sigaaCatCategorizarServiciosByIdCategorizarServicios_1")
    public SigaaCatCategorizarServicios getSigaaCatCategorizarServiciosByIdCategorizarServicios_2() {
        return sigaaCatCategorizarServiciosByIdCategorizarServicios_2;
    }

    public void setSigaaCatCategorizarServiciosByIdCategorizarServicios_2(SigaaCatCategorizarServicios sigaaCatCategorizarServiciosByIdCategorizarServicios_2) {
        this.sigaaCatCategorizarServiciosByIdCategorizarServicios_2 = sigaaCatCategorizarServiciosByIdCategorizarServicios_2;
    }

    @OneToMany(mappedBy = "sigaaCatCategorizarServiciosByIdCategorizarServicios")
    public List<SigaaCatServicios> getSigaaCatServiciosByIdCategorizarServicios() {
        return sigaaCatServiciosByIdCategorizarServicios;
    }

    public void setSigaaCatServiciosByIdCategorizarServicios(List<SigaaCatServicios> sigaaCatServiciosByIdCategorizarServicios) {
        this.sigaaCatServiciosByIdCategorizarServicios = sigaaCatServiciosByIdCategorizarServicios;
    }
}
