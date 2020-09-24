package com.api.sigaa.app.model.entity;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "SIGAA_CAT_PUESTOS", schema = "dbo", catalog = "SIGAA")
public class SigaaCatPuestos {
    private int idPuesto;
    private String descripcion;
    private String estatus;
    private List<SigaaCatDocente> sigaaCatDocentesByIdPuesto;

    @Id
    @Column(name = "ID_PUESTO")
    public int getIdPuesto() {
        return idPuesto;
    }

    public void setIdPuesto(int idPuesto) {
        this.idPuesto = idPuesto;
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
        SigaaCatPuestos that = (SigaaCatPuestos) o;
        return idPuesto == that.idPuesto &&
                Objects.equals(descripcion, that.descripcion) &&
                Objects.equals(estatus, that.estatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idPuesto, descripcion, estatus);
    }

    @OneToMany(mappedBy = "sigaaCatPuestosByIdPuesto")
    public List<SigaaCatDocente> getSigaaCatDocentesByIdPuesto() {
        return sigaaCatDocentesByIdPuesto;
    }

    public void setSigaaCatDocentesByIdPuesto(List<SigaaCatDocente> sigaaCatDocentesByIdPuesto) {
        this.sigaaCatDocentesByIdPuesto = sigaaCatDocentesByIdPuesto;
    }
}
