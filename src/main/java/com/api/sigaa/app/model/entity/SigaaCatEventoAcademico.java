package com.api.sigaa.app.model.entity;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "SIGAA_CAT_EVENTO_ACADEMICO", schema = "dbo", catalog = "SIGAA")
public class SigaaCatEventoAcademico {
    private int idEventoAcademico;
    private String descripcion;
    private String rutaImagen;
    private Integer idPeriodo;
    private List<SigaaAlumnoEvento> sigaaAlumnoEventosByIdEventoAcademico;
    private SigaaCatPeriodo sigaaCatPeriodoByIdPeriodo;

    @Id
    @Column(name = "ID_EVENTO_ACADEMICO")
    public int getIdEventoAcademico() {
        return idEventoAcademico;
    }

    public void setIdEventoAcademico(int idEventoAcademico) {
        this.idEventoAcademico = idEventoAcademico;
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
    @Column(name = "RUTA_IMAGEN")
    public String getRutaImagen() {
        return rutaImagen;
    }

    public void setRutaImagen(String rutaImagen) {
        this.rutaImagen = rutaImagen;
    }

    @Basic
    @Column(name = "ID_PERIODO")
    public Integer getIdPeriodo() {
        return idPeriodo;
    }

    public void setIdPeriodo(Integer idPeriodo) {
        this.idPeriodo = idPeriodo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SigaaCatEventoAcademico that = (SigaaCatEventoAcademico) o;
        return idEventoAcademico == that.idEventoAcademico &&
                Objects.equals(descripcion, that.descripcion) &&
                Objects.equals(rutaImagen, that.rutaImagen) &&
                Objects.equals(idPeriodo, that.idPeriodo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idEventoAcademico, descripcion, rutaImagen, idPeriodo);
    }

    @OneToMany(mappedBy = "sigaaCatEventoAcademicoByIdEventoAcademico")
    public List<SigaaAlumnoEvento> getSigaaAlumnoEventosByIdEventoAcademico() {
        return sigaaAlumnoEventosByIdEventoAcademico;
    }

    public void setSigaaAlumnoEventosByIdEventoAcademico(List<SigaaAlumnoEvento> sigaaAlumnoEventosByIdEventoAcademico) {
        this.sigaaAlumnoEventosByIdEventoAcademico = sigaaAlumnoEventosByIdEventoAcademico;
    }

    @ManyToOne
    @JoinColumn(name = "ID_PERIODO", referencedColumnName = "ID_PERIODO", insertable = false, updatable = false)
    public SigaaCatPeriodo getSigaaCatPeriodoByIdPeriodo() {
        return sigaaCatPeriodoByIdPeriodo;
    }

    public void setSigaaCatPeriodoByIdPeriodo(SigaaCatPeriodo sigaaCatPeriodoByIdPeriodo) {
        this.sigaaCatPeriodoByIdPeriodo = sigaaCatPeriodoByIdPeriodo;
    }
}
