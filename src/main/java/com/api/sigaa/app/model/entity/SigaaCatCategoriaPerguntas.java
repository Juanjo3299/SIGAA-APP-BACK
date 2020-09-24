package com.api.sigaa.app.model.entity;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "SIGAA_CAT_CATEGORIA_PERGUNTAS", schema = "dbo", catalog = "SIGAA")
public class SigaaCatCategoriaPerguntas {
    private int idCategoria;
    private String descripcion;
    private String estatus;
    private List<SigaaCatPreguntas> sigaaCatPreguntasByIdCategoria;

    @Id
    @Column(name = "ID_CATEGORIA")
    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
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
        SigaaCatCategoriaPerguntas that = (SigaaCatCategoriaPerguntas) o;
        return idCategoria == that.idCategoria &&
                Objects.equals(descripcion, that.descripcion) &&
                Objects.equals(estatus, that.estatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCategoria, descripcion, estatus);
    }

    @OneToMany(mappedBy = "sigaaCatCategoriaPerguntasByIdCategoria")
    public List<SigaaCatPreguntas> getSigaaCatPreguntasByIdCategoria() {
        return sigaaCatPreguntasByIdCategoria;
    }

    public void setSigaaCatPreguntasByIdCategoria(List<SigaaCatPreguntas> sigaaCatPreguntasByIdCategoria) {
        this.sigaaCatPreguntasByIdCategoria = sigaaCatPreguntasByIdCategoria;
    }
}
