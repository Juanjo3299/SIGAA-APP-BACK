package com.api.sigaa.app.model.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "SIGAA_ALUMNO_PREGUNTAS", schema = "dbo", catalog = "SIGAA")
public class SigaaAlumnoPreguntas {
    private int idAlumnoPreguntas;
    private Integer matricula;
    private Integer idPregunta;
    private String respuesta;
    private Integer idPeriodo;
    private Integer idCargaAcademicaDocente;
    private SigaaCatAlumno sigaaCatAlumnoByMatricula;
    private SigaaCatPreguntas sigaaCatPreguntasByIdPregunta;
    private SigaaCatPeriodo sigaaCatPeriodoByIdPeriodo;
    private SigaaCargaAcademicaDocente sigaaCargaAcademicaDocenteByIdCargaAcademicaDocente;

    @Id
    @Column(name = "ID_ALUMNO_PREGUNTAS")
    public int getIdAlumnoPreguntas() {
        return idAlumnoPreguntas;
    }

    public void setIdAlumnoPreguntas(int idAlumnoPreguntas) {
        this.idAlumnoPreguntas = idAlumnoPreguntas;
    }

    @Basic
    @Column(name = "MATRICULA")
    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    @Basic
    @Column(name = "ID_PREGUNTA")
    public Integer getIdPregunta() {
        return idPregunta;
    }

    public void setIdPregunta(Integer idPregunta) {
        this.idPregunta = idPregunta;
    }

    @Basic
    @Column(name = "RESPUESTA")
    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    @Basic
    @Column(name = "ID_PERIODO")
    public Integer getIdPeriodo() {
        return idPeriodo;
    }

    public void setIdPeriodo(Integer idPeriodo) {
        this.idPeriodo = idPeriodo;
    }

    @Basic
    @Column(name = "ID_CARGA_ACADEMICA_DOCENTE")
    public Integer getIdCargaAcademicaDocente() {
        return idCargaAcademicaDocente;
    }

    public void setIdCargaAcademicaDocente(Integer idCargaAcademicaDocente) {
        this.idCargaAcademicaDocente = idCargaAcademicaDocente;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SigaaAlumnoPreguntas that = (SigaaAlumnoPreguntas) o;
        return idAlumnoPreguntas == that.idAlumnoPreguntas &&
                Objects.equals(matricula, that.matricula) &&
                Objects.equals(idPregunta, that.idPregunta) &&
                Objects.equals(respuesta, that.respuesta) &&
                Objects.equals(idPeriodo, that.idPeriodo) &&
                Objects.equals(idCargaAcademicaDocente, that.idCargaAcademicaDocente);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idAlumnoPreguntas, matricula, idPregunta, respuesta, idPeriodo, idCargaAcademicaDocente);
    }

    @ManyToOne
    @JoinColumn(name = "MATRICULA", referencedColumnName = "MATRICULA", insertable = false, updatable = false)
    public SigaaCatAlumno getSigaaCatAlumnoByMatricula() {
        return sigaaCatAlumnoByMatricula;
    }

    public void setSigaaCatAlumnoByMatricula(SigaaCatAlumno sigaaCatAlumnoByMatricula) {
        this.sigaaCatAlumnoByMatricula = sigaaCatAlumnoByMatricula;
    }

    @ManyToOne
    @JoinColumn(name = "ID_PREGUNTA", referencedColumnName = "ID_PREGUNTA", insertable = false, updatable = false)
    public SigaaCatPreguntas getSigaaCatPreguntasByIdPregunta() {
        return sigaaCatPreguntasByIdPregunta;
    }

    public void setSigaaCatPreguntasByIdPregunta(SigaaCatPreguntas sigaaCatPreguntasByIdPregunta) {
        this.sigaaCatPreguntasByIdPregunta = sigaaCatPreguntasByIdPregunta;
    }

    @ManyToOne
    @JoinColumn(name = "ID_PERIODO", referencedColumnName = "ID_PERIODO", insertable = false, updatable = false)
    public SigaaCatPeriodo getSigaaCatPeriodoByIdPeriodo() {
        return sigaaCatPeriodoByIdPeriodo;
    }

    public void setSigaaCatPeriodoByIdPeriodo(SigaaCatPeriodo sigaaCatPeriodoByIdPeriodo) {
        this.sigaaCatPeriodoByIdPeriodo = sigaaCatPeriodoByIdPeriodo;
    }

    @ManyToOne
    @JoinColumn(name = "ID_CARGA_ACADEMICA_DOCENTE", referencedColumnName = "ID_CARGA_ACADEMICA_DOCENTE", insertable = false, updatable = false)
    public SigaaCargaAcademicaDocente getSigaaCargaAcademicaDocenteByIdCargaAcademicaDocente() {
        return sigaaCargaAcademicaDocenteByIdCargaAcademicaDocente;
    }

    public void setSigaaCargaAcademicaDocenteByIdCargaAcademicaDocente(SigaaCargaAcademicaDocente sigaaCargaAcademicaDocenteByIdCargaAcademicaDocente) {
        this.sigaaCargaAcademicaDocenteByIdCargaAcademicaDocente = sigaaCargaAcademicaDocenteByIdCargaAcademicaDocente;
    }
}
