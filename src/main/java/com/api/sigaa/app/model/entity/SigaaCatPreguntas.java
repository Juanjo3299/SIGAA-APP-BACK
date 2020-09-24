package com.api.sigaa.app.model.entity;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "SIGAA_CAT_PREGUNTAS", schema = "dbo", catalog = "SIGAA")
public class SigaaCatPreguntas {
    private int idPregunta;
    private String descripcion;
    private Integer idCategoria;
    private String estatus;
    private List<SigaaAlumnoPreguntas> sigaaAlumnoPreguntasByIdPregunta;
    private SigaaCatCategoriaPerguntas sigaaCatCategoriaPerguntasByIdCategoria;

    @Id
    @Column(name = "ID_PREGUNTA")
    public int getIdPregunta() {
        return idPregunta;
    }

    public void setIdPregunta(int idPregunta) {
        this.idPregunta = idPregunta;
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
    @Column(name = "ID_CATEGORIA")
    public Integer getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
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
        SigaaCatPreguntas that = (SigaaCatPreguntas) o;
        return idPregunta == that.idPregunta &&
                Objects.equals(descripcion, that.descripcion) &&
                Objects.equals(idCategoria, that.idCategoria) &&
                Objects.equals(estatus, that.estatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idPregunta, descripcion, idCategoria, estatus);
    }

    @OneToMany(mappedBy = "sigaaCatPreguntasByIdPregunta")
    public List<SigaaAlumnoPreguntas> getSigaaAlumnoPreguntasByIdPregunta() {
        return sigaaAlumnoPreguntasByIdPregunta;
    }

    public void setSigaaAlumnoPreguntasByIdPregunta(List<SigaaAlumnoPreguntas> sigaaAlumnoPreguntasByIdPregunta) {
        this.sigaaAlumnoPreguntasByIdPregunta = sigaaAlumnoPreguntasByIdPregunta;
    }

    @ManyToOne
    @JoinColumn(name = "ID_CATEGORIA", referencedColumnName = "ID_CATEGORIA", insertable = false, updatable = false)
    public SigaaCatCategoriaPerguntas getSigaaCatCategoriaPerguntasByIdCategoria() {
        return sigaaCatCategoriaPerguntasByIdCategoria;
    }

    public void setSigaaCatCategoriaPerguntasByIdCategoria(SigaaCatCategoriaPerguntas sigaaCatCategoriaPerguntasByIdCategoria) {
        this.sigaaCatCategoriaPerguntasByIdCategoria = sigaaCatCategoriaPerguntasByIdCategoria;
    }
}
