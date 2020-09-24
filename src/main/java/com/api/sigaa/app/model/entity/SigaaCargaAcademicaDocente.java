package com.api.sigaa.app.model.entity;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "SIGAA_CARGA_ACADEMICA_DOCENTE", schema = "dbo", catalog = "SIGAA")
public class SigaaCargaAcademicaDocente {
    private int idCargaAcademicaDocente;
    private Integer idDocente;
    private Integer idAsignatura;
    private Integer idGrupo;
    private List<SigaaAlumnoPreguntas> sigaaAlumnoPreguntasByIdCargaAcademicaDocente;
    private SigaaCatDocente sigaaCatDocenteByIdDocente;
    private SigaaCatAsignatura sigaaCatAsignaturaByIdAsignatura;
    private SigaaCatGrupo sigaaCatGrupoByIdGrupo;

    @Id
    @Column(name = "ID_CARGA_ACADEMICA_DOCENTE")
    public int getIdCargaAcademicaDocente() {
        return idCargaAcademicaDocente;
    }

    public void setIdCargaAcademicaDocente(int idCargaAcademicaDocente) {
        this.idCargaAcademicaDocente = idCargaAcademicaDocente;
    }

    @Basic
    @Column(name = "ID_DOCENTE")
    public Integer getIdDocente() {
        return idDocente;
    }

    public void setIdDocente(Integer idDocente) {
        this.idDocente = idDocente;
    }

    @Basic
    @Column(name = "ID_ASIGNATURA")
    public Integer getIdAsignatura() {
        return idAsignatura;
    }

    public void setIdAsignatura(Integer idAsignatura) {
        this.idAsignatura = idAsignatura;
    }

    @Basic
    @Column(name = "ID_GRUPO")
    public Integer getIdGrupo() {
        return idGrupo;
    }

    public void setIdGrupo(Integer idGrupo) {
        this.idGrupo = idGrupo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SigaaCargaAcademicaDocente that = (SigaaCargaAcademicaDocente) o;
        return idCargaAcademicaDocente == that.idCargaAcademicaDocente &&
                Objects.equals(idDocente, that.idDocente) &&
                Objects.equals(idAsignatura, that.idAsignatura) &&
                Objects.equals(idGrupo, that.idGrupo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCargaAcademicaDocente, idDocente, idAsignatura, idGrupo);
    }

    @OneToMany(mappedBy = "sigaaCargaAcademicaDocenteByIdCargaAcademicaDocente")
    public List<SigaaAlumnoPreguntas> getSigaaAlumnoPreguntasByIdCargaAcademicaDocente() {
        return sigaaAlumnoPreguntasByIdCargaAcademicaDocente;
    }

    public void setSigaaAlumnoPreguntasByIdCargaAcademicaDocente(List<SigaaAlumnoPreguntas> sigaaAlumnoPreguntasByIdCargaAcademicaDocente) {
        this.sigaaAlumnoPreguntasByIdCargaAcademicaDocente = sigaaAlumnoPreguntasByIdCargaAcademicaDocente;
    }

    @ManyToOne
    @JoinColumn(name = "ID_DOCENTE", referencedColumnName = "ID_DOCENTE", insertable = false, updatable = false)
    public SigaaCatDocente getSigaaCatDocenteByIdDocente() {
        return sigaaCatDocenteByIdDocente;
    }

    public void setSigaaCatDocenteByIdDocente(SigaaCatDocente sigaaCatDocenteByIdDocente) {
        this.sigaaCatDocenteByIdDocente = sigaaCatDocenteByIdDocente;
    }

    @ManyToOne
    @JoinColumn(name = "ID_ASIGNATURA", referencedColumnName = "ID_ASIGNATURA", insertable = false, updatable = false)
    public SigaaCatAsignatura getSigaaCatAsignaturaByIdAsignatura() {
        return sigaaCatAsignaturaByIdAsignatura;
    }

    public void setSigaaCatAsignaturaByIdAsignatura(SigaaCatAsignatura sigaaCatAsignaturaByIdAsignatura) {
        this.sigaaCatAsignaturaByIdAsignatura = sigaaCatAsignaturaByIdAsignatura;
    }

    @ManyToOne
    @JoinColumn(name = "ID_GRUPO", referencedColumnName = "ID_GRUPO", insertable = false, updatable = false)
    public SigaaCatGrupo getSigaaCatGrupoByIdGrupo() {
        return sigaaCatGrupoByIdGrupo;
    }

    public void setSigaaCatGrupoByIdGrupo(SigaaCatGrupo sigaaCatGrupoByIdGrupo) {
        this.sigaaCatGrupoByIdGrupo = sigaaCatGrupoByIdGrupo;
    }
}
