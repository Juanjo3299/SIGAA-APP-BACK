package com.api.sigaa.app.model.entity;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "SIGAA_CAT_TIPO_CALIFICACIONES_CUATRI_CERO", schema = "dbo", catalog = "SIGAA")
public class SigaaCatTipoCalificacionesCuatriCero {
    private int idTipoCalificacion;
    private String descripcion;
    private String estatus;
    private List<SigaaDetCalificacionesCuatriCero> sigaaDetCalificacionesCuatriCerosByIdTipoCalificacion;

    @Id
    @Column(name = "ID_TIPO_CALIFICACION")
    public int getIdTipoCalificacion() {
        return idTipoCalificacion;
    }

    public void setIdTipoCalificacion(int idTipoCalificacion) {
        this.idTipoCalificacion = idTipoCalificacion;
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
        SigaaCatTipoCalificacionesCuatriCero that = (SigaaCatTipoCalificacionesCuatriCero) o;
        return idTipoCalificacion == that.idTipoCalificacion &&
                Objects.equals(descripcion, that.descripcion) &&
                Objects.equals(estatus, that.estatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idTipoCalificacion, descripcion, estatus);
    }

    @OneToMany(mappedBy = "sigaaCatTipoCalificacionesCuatriCeroByIdTipoCalificacion")
    public List<SigaaDetCalificacionesCuatriCero> getSigaaDetCalificacionesCuatriCerosByIdTipoCalificacion() {
        return sigaaDetCalificacionesCuatriCerosByIdTipoCalificacion;
    }

    public void setSigaaDetCalificacionesCuatriCerosByIdTipoCalificacion(List<SigaaDetCalificacionesCuatriCero> sigaaDetCalificacionesCuatriCerosByIdTipoCalificacion) {
        this.sigaaDetCalificacionesCuatriCerosByIdTipoCalificacion = sigaaDetCalificacionesCuatriCerosByIdTipoCalificacion;
    }
}
