package com.api.sigaa.app.model.entity;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "SIGAA_CAT_ESTATUS_TITULO", schema = "dbo", catalog = "SIGAA")
public class SigaaCatEstatusTitulo {
    private int idEstatusTitulo;
    private String descripcion;
    private List<SigaaCatTituloElectronico> sigaaCatTituloElectronicosByIdEstatusTitulo;

    @Id
    @Column(name = "ID_ESTATUS_TITULO")
    public int getIdEstatusTitulo() {
        return idEstatusTitulo;
    }

    public void setIdEstatusTitulo(int idEstatusTitulo) {
        this.idEstatusTitulo = idEstatusTitulo;
    }

    @Basic
    @Column(name = "DESCRIPCION")
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SigaaCatEstatusTitulo that = (SigaaCatEstatusTitulo) o;
        return idEstatusTitulo == that.idEstatusTitulo &&
                Objects.equals(descripcion, that.descripcion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idEstatusTitulo, descripcion);
    }

    @OneToMany(mappedBy = "sigaaCatEstatusTituloByIdEstatusTitulo")
    public List<SigaaCatTituloElectronico> getSigaaCatTituloElectronicosByIdEstatusTitulo() {
        return sigaaCatTituloElectronicosByIdEstatusTitulo;
    }

    public void setSigaaCatTituloElectronicosByIdEstatusTitulo(List<SigaaCatTituloElectronico> sigaaCatTituloElectronicosByIdEstatusTitulo) {
        this.sigaaCatTituloElectronicosByIdEstatusTitulo = sigaaCatTituloElectronicosByIdEstatusTitulo;
    }
}
