package com.api.sigaa.app.model.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "SIGAA_CAT_PERIODO", schema = "dbo", catalog = "SIGAA")
public class SigaaCatPeriodo {
    private int idPeriodo;
    private String periodo;
    private Date fechaIni;
    private Date fechaFin;
    private String estatus;
    private int idCiclo;
    private List<SigaaAlumnoPreguntas> sigaaAlumnoPreguntasByIdPeriodo;
    private List<SigaaCargaAcademicaAlumno> sigaaCargaAcademicaAlumnosByIdPeriodo;
    private List<SigaaCargaTemporal> sigaaCargaTemporalsByIdPeriodo;
    private List<SigaaCatAspirante> sigaaCatAspirantesByIdPeriodo;
    private List<SigaaCatAspirante> sigaaCatAspirantesByIdPeriodo_0;
    private List<SigaaCatEventoAcademico> sigaaCatEventoAcademicosByIdPeriodo;
    private List<SigaaCatGrupo> sigaaCatGruposByIdPeriodo;
    private List<SigaaCatGrupoCuatrimestreCero> sigaaCatGrupoCuatrimestreCerosByIdPeriodo;
    private SigaaCatCiclo sigaaCatCicloByIdCiclo;
    private List<SigaaCohorteGenerado> sigaaCohorteGeneradosByIdPeriodo;
    private List<SigaaDetAlumnoExento> sigaaDetAlumnoExentosByIdPeriodo;

    @Id
    @Column(name = "ID_PERIODO")
    public int getIdPeriodo() {
        return idPeriodo;
    }

    public void setIdPeriodo(int idPeriodo) {
        this.idPeriodo = idPeriodo;
    }

    @Basic
    @Column(name = "PERIODO")
    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    @Basic
    @Column(name = "FECHA_INI")
    public Date getFechaIni() {
        return fechaIni;
    }

    public void setFechaIni(Date fechaIni) {
        this.fechaIni = fechaIni;
    }

    @Basic
    @Column(name = "FECHA_FIN")
    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
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
    @Column(name = "ID_CICLO")
    public int getIdCiclo() {
        return idCiclo;
    }

    public void setIdCiclo(int idCiclo) {
        this.idCiclo = idCiclo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SigaaCatPeriodo that = (SigaaCatPeriodo) o;
        return idPeriodo == that.idPeriodo &&
                idCiclo == that.idCiclo &&
                Objects.equals(periodo, that.periodo) &&
                Objects.equals(fechaIni, that.fechaIni) &&
                Objects.equals(fechaFin, that.fechaFin) &&
                Objects.equals(estatus, that.estatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idPeriodo, periodo, fechaIni, fechaFin, estatus, idCiclo);
    }

    @OneToMany(mappedBy = "sigaaCatPeriodoByIdPeriodo")
    public List<SigaaAlumnoPreguntas> getSigaaAlumnoPreguntasByIdPeriodo() {
        return sigaaAlumnoPreguntasByIdPeriodo;
    }

    public void setSigaaAlumnoPreguntasByIdPeriodo(List<SigaaAlumnoPreguntas> sigaaAlumnoPreguntasByIdPeriodo) {
        this.sigaaAlumnoPreguntasByIdPeriodo = sigaaAlumnoPreguntasByIdPeriodo;
    }

    @OneToMany(mappedBy = "sigaaCatPeriodoByIdPeriodo")
    public List<SigaaCargaAcademicaAlumno> getSigaaCargaAcademicaAlumnosByIdPeriodo() {
        return sigaaCargaAcademicaAlumnosByIdPeriodo;
    }

    public void setSigaaCargaAcademicaAlumnosByIdPeriodo(List<SigaaCargaAcademicaAlumno> sigaaCargaAcademicaAlumnosByIdPeriodo) {
        this.sigaaCargaAcademicaAlumnosByIdPeriodo = sigaaCargaAcademicaAlumnosByIdPeriodo;
    }

    @OneToMany(mappedBy = "sigaaCatPeriodoByIdPeriodo")
    public List<SigaaCargaTemporal> getSigaaCargaTemporalsByIdPeriodo() {
        return sigaaCargaTemporalsByIdPeriodo;
    }

    public void setSigaaCargaTemporalsByIdPeriodo(List<SigaaCargaTemporal> sigaaCargaTemporalsByIdPeriodo) {
        this.sigaaCargaTemporalsByIdPeriodo = sigaaCargaTemporalsByIdPeriodo;
    }

    @OneToMany(mappedBy = "sigaaCatPeriodoByIdPeriodo")
    public List<SigaaCatAspirante> getSigaaCatAspirantesByIdPeriodo() {
        return sigaaCatAspirantesByIdPeriodo;
    }

    public void setSigaaCatAspirantesByIdPeriodo(List<SigaaCatAspirante> sigaaCatAspirantesByIdPeriodo) {
        this.sigaaCatAspirantesByIdPeriodo = sigaaCatAspirantesByIdPeriodo;
    }

    @OneToMany(mappedBy = "sigaaCatPeriodoByIdPeriodoOrdinario")
    public List<SigaaCatAspirante> getSigaaCatAspirantesByIdPeriodo_0() {
        return sigaaCatAspirantesByIdPeriodo_0;
    }

    public void setSigaaCatAspirantesByIdPeriodo_0(List<SigaaCatAspirante> sigaaCatAspirantesByIdPeriodo_0) {
        this.sigaaCatAspirantesByIdPeriodo_0 = sigaaCatAspirantesByIdPeriodo_0;
    }

    @OneToMany(mappedBy = "sigaaCatPeriodoByIdPeriodo")
    public List<SigaaCatEventoAcademico> getSigaaCatEventoAcademicosByIdPeriodo() {
        return sigaaCatEventoAcademicosByIdPeriodo;
    }

    public void setSigaaCatEventoAcademicosByIdPeriodo(List<SigaaCatEventoAcademico> sigaaCatEventoAcademicosByIdPeriodo) {
        this.sigaaCatEventoAcademicosByIdPeriodo = sigaaCatEventoAcademicosByIdPeriodo;
    }

    @OneToMany(mappedBy = "sigaaCatPeriodoByIdPeriodo")
    public List<SigaaCatGrupo> getSigaaCatGruposByIdPeriodo() {
        return sigaaCatGruposByIdPeriodo;
    }

    public void setSigaaCatGruposByIdPeriodo(List<SigaaCatGrupo> sigaaCatGruposByIdPeriodo) {
        this.sigaaCatGruposByIdPeriodo = sigaaCatGruposByIdPeriodo;
    }

    @OneToMany(mappedBy = "sigaaCatPeriodoByIdPeriodo")
    public List<SigaaCatGrupoCuatrimestreCero> getSigaaCatGrupoCuatrimestreCerosByIdPeriodo() {
        return sigaaCatGrupoCuatrimestreCerosByIdPeriodo;
    }

    public void setSigaaCatGrupoCuatrimestreCerosByIdPeriodo(List<SigaaCatGrupoCuatrimestreCero> sigaaCatGrupoCuatrimestreCerosByIdPeriodo) {
        this.sigaaCatGrupoCuatrimestreCerosByIdPeriodo = sigaaCatGrupoCuatrimestreCerosByIdPeriodo;
    }

    @ManyToOne
    @JoinColumn(name = "ID_CICLO", referencedColumnName = "ID_CICLO", nullable = false, insertable = false, updatable = false)
    public SigaaCatCiclo getSigaaCatCicloByIdCiclo() {
        return sigaaCatCicloByIdCiclo;
    }

    public void setSigaaCatCicloByIdCiclo(SigaaCatCiclo sigaaCatCicloByIdCiclo) {
        this.sigaaCatCicloByIdCiclo = sigaaCatCicloByIdCiclo;
    }

    @OneToMany(mappedBy = "sigaaCatPeriodoByIdPeriodo")
    public List<SigaaCohorteGenerado> getSigaaCohorteGeneradosByIdPeriodo() {
        return sigaaCohorteGeneradosByIdPeriodo;
    }

    public void setSigaaCohorteGeneradosByIdPeriodo(List<SigaaCohorteGenerado> sigaaCohorteGeneradosByIdPeriodo) {
        this.sigaaCohorteGeneradosByIdPeriodo = sigaaCohorteGeneradosByIdPeriodo;
    }

    @OneToMany(mappedBy = "sigaaCatPeriodoByIdPeriodo")
    public List<SigaaDetAlumnoExento> getSigaaDetAlumnoExentosByIdPeriodo() {
        return sigaaDetAlumnoExentosByIdPeriodo;
    }

    public void setSigaaDetAlumnoExentosByIdPeriodo(List<SigaaDetAlumnoExento> sigaaDetAlumnoExentosByIdPeriodo) {
        this.sigaaDetAlumnoExentosByIdPeriodo = sigaaDetAlumnoExentosByIdPeriodo;
    }
}
