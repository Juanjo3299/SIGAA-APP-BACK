package com.api.sigaa.app.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "SIGAA_CAT_GRUPO", schema = "dbo", catalog = "SIGAA")
public class SigaaCatGrupo {
    private int idGrupo;
    private String grupo;
    private int cupo;
    private String estatus;
    private int idCarrera;
    private int idGeneracion;
    private int idPeriodo;
    private int idTipogrupo;
    private String turno;
    private Integer cuatrimestre;
    private String clave;
    private Integer idDocente;
    @JsonIgnore
    private List<SigaaCargaAcademicaAlumno> sigaaCargaAcademicaAlumnosByIdGrupo;
    @JsonIgnore
    private List<SigaaCargaAcademicaDocente> sigaaCargaAcademicaDocentesByIdGrupo;
    @JsonIgnore
    private List<SigaaCargaTemporal> sigaaCargaTemporalsByIdGrupo;
    @JsonIgnore
    private List<SigaaCatAlumno> sigaaCatAlumnosByIdGrupo;
    @JsonIgnore
    private List<SigaaCatAlumnoModificaso> sigaaCatAlumnoModificasosByIdGrupo;
    @JsonManagedReference
    private SigaaCatCarrera sigaaCatCarreraByIdCarrera;
    @JsonIgnore
    private SigaaCatGeneracion sigaaCatGeneracionByIdGeneracion;
    @JsonIgnore
    private SigaaCatPeriodo sigaaCatPeriodoByIdPeriodo;
    @JsonIgnore
    private SigaaCatTipogrupo sigaaCatTipogrupoByIdTipogrupo;
    @JsonIgnore
    private SigaaCatDocente sigaaCatDocenteByIdDocente;
    @JsonIgnore
    private List<SigaaDetCalificaciones> sigaaDetCalificacionesByIdGrupo;
    @JsonIgnore
    private List<SigaaExtraordinario> sigaaExtraordinariosByIdGrupo;
    @JsonIgnore
    private List<SigaaGrupoAsignatura> sigaaGrupoAsignaturasByIdGrupo;

    @Id
    @Column(name = "ID_GRUPO")
    public int getIdGrupo() {
        return idGrupo;
    }

    public void setIdGrupo(int idGrupo) {
        this.idGrupo = idGrupo;
    }

    @Basic
    @Column(name = "GRUPO")
    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    @Basic
    @Column(name = "CUPO")
    public int getCupo() {
        return cupo;
    }

    public void setCupo(int cupo) {
        this.cupo = cupo;
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
    @Column(name = "ID_CARRERA")
    public int getIdCarrera() {
        return idCarrera;
    }

    public void setIdCarrera(int idCarrera) {
        this.idCarrera = idCarrera;
    }

    @Basic
    @Column(name = "ID_GENERACION")
    public int getIdGeneracion() {
        return idGeneracion;
    }

    public void setIdGeneracion(int idGeneracion) {
        this.idGeneracion = idGeneracion;
    }

    @Basic
    @Column(name = "ID_PERIODO")
    public int getIdPeriodo() {
        return idPeriodo;
    }

    public void setIdPeriodo(int idPeriodo) {
        this.idPeriodo = idPeriodo;
    }

    @Basic
    @Column(name = "ID_TIPOGRUPO")
    public int getIdTipogrupo() {
        return idTipogrupo;
    }

    public void setIdTipogrupo(int idTipogrupo) {
        this.idTipogrupo = idTipogrupo;
    }

    @Basic
    @Column(name = "TURNO")
    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    @Basic
    @Column(name = "CUATRIMESTRE")
    public Integer getCuatrimestre() {
        return cuatrimestre;
    }

    public void setCuatrimestre(Integer cuatrimestre) {
        this.cuatrimestre = cuatrimestre;
    }

    @Basic
    @Column(name = "CLAVE")
    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    @Basic
    @Column(name = "ID_DOCENTE")
    public Integer getIdDocente() {
        return idDocente;
    }

    public void setIdDocente(Integer idDocente) {
        this.idDocente = idDocente;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SigaaCatGrupo that = (SigaaCatGrupo) o;
        return idGrupo == that.idGrupo &&
                cupo == that.cupo &&
                idCarrera == that.idCarrera &&
                idGeneracion == that.idGeneracion &&
                idPeriodo == that.idPeriodo &&
                idTipogrupo == that.idTipogrupo &&
                Objects.equals(grupo, that.grupo) &&
                Objects.equals(estatus, that.estatus) &&
                Objects.equals(turno, that.turno) &&
                Objects.equals(cuatrimestre, that.cuatrimestre) &&
                Objects.equals(clave, that.clave) &&
                Objects.equals(idDocente, that.idDocente);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idGrupo, grupo, cupo, estatus, idCarrera, idGeneracion, idPeriodo, idTipogrupo, turno, cuatrimestre, clave, idDocente);
    }

    @OneToMany(mappedBy = "sigaaCatGrupoByIdGrupo")
    public List<SigaaCargaAcademicaAlumno> getSigaaCargaAcademicaAlumnosByIdGrupo() {
        return sigaaCargaAcademicaAlumnosByIdGrupo;
    }

    public void setSigaaCargaAcademicaAlumnosByIdGrupo(List<SigaaCargaAcademicaAlumno> sigaaCargaAcademicaAlumnosByIdGrupo) {
        this.sigaaCargaAcademicaAlumnosByIdGrupo = sigaaCargaAcademicaAlumnosByIdGrupo;
    }

    @OneToMany(mappedBy = "sigaaCatGrupoByIdGrupo")
    public List<SigaaCargaAcademicaDocente> getSigaaCargaAcademicaDocentesByIdGrupo() {
        return sigaaCargaAcademicaDocentesByIdGrupo;
    }

    public void setSigaaCargaAcademicaDocentesByIdGrupo(List<SigaaCargaAcademicaDocente> sigaaCargaAcademicaDocentesByIdGrupo) {
        this.sigaaCargaAcademicaDocentesByIdGrupo = sigaaCargaAcademicaDocentesByIdGrupo;
    }

    @OneToMany(mappedBy = "sigaaCatGrupoByIdGrupo")
    public List<SigaaCargaTemporal> getSigaaCargaTemporalsByIdGrupo() {
        return sigaaCargaTemporalsByIdGrupo;
    }

    public void setSigaaCargaTemporalsByIdGrupo(List<SigaaCargaTemporal> sigaaCargaTemporalsByIdGrupo) {
        this.sigaaCargaTemporalsByIdGrupo = sigaaCargaTemporalsByIdGrupo;
    }

    @OneToMany(mappedBy = "sigaaCatGrupoByIdGrupo")
    public List<SigaaCatAlumno> getSigaaCatAlumnosByIdGrupo() {
        return sigaaCatAlumnosByIdGrupo;
    }

    public void setSigaaCatAlumnosByIdGrupo(List<SigaaCatAlumno> sigaaCatAlumnosByIdGrupo) {
        this.sigaaCatAlumnosByIdGrupo = sigaaCatAlumnosByIdGrupo;
    }

    @OneToMany(mappedBy = "sigaaCatGrupoByIdGrupo")
    public List<SigaaCatAlumnoModificaso> getSigaaCatAlumnoModificasosByIdGrupo() {
        return sigaaCatAlumnoModificasosByIdGrupo;
    }

    public void setSigaaCatAlumnoModificasosByIdGrupo(List<SigaaCatAlumnoModificaso> sigaaCatAlumnoModificasosByIdGrupo) {
        this.sigaaCatAlumnoModificasosByIdGrupo = sigaaCatAlumnoModificasosByIdGrupo;
    }

    @ManyToOne
    @JoinColumn(name = "ID_CARRERA", referencedColumnName = "ID_CARRERA", nullable = false, insertable = false, updatable = false)
    public SigaaCatCarrera getSigaaCatCarreraByIdCarrera() {
        return sigaaCatCarreraByIdCarrera;
    }

    public void setSigaaCatCarreraByIdCarrera(SigaaCatCarrera sigaaCatCarreraByIdCarrera) {
        this.sigaaCatCarreraByIdCarrera = sigaaCatCarreraByIdCarrera;
    }

    @ManyToOne
    @JoinColumn(name = "ID_GENERACION", referencedColumnName = "ID_GENERACION", nullable = false, insertable = false, updatable = false)
    public SigaaCatGeneracion getSigaaCatGeneracionByIdGeneracion() {
        return sigaaCatGeneracionByIdGeneracion;
    }

    public void setSigaaCatGeneracionByIdGeneracion(SigaaCatGeneracion sigaaCatGeneracionByIdGeneracion) {
        this.sigaaCatGeneracionByIdGeneracion = sigaaCatGeneracionByIdGeneracion;
    }

    @ManyToOne
    @JoinColumn(name = "ID_PERIODO", referencedColumnName = "ID_PERIODO", nullable = false, insertable = false, updatable = false)
    public SigaaCatPeriodo getSigaaCatPeriodoByIdPeriodo() {
        return sigaaCatPeriodoByIdPeriodo;
    }

    public void setSigaaCatPeriodoByIdPeriodo(SigaaCatPeriodo sigaaCatPeriodoByIdPeriodo) {
        this.sigaaCatPeriodoByIdPeriodo = sigaaCatPeriodoByIdPeriodo;
    }

    @ManyToOne
    @JoinColumn(name = "ID_TIPOGRUPO", referencedColumnName = "ID_TIPOGRUPO", nullable = false, insertable = false, updatable = false)
    public SigaaCatTipogrupo getSigaaCatTipogrupoByIdTipogrupo() {
        return sigaaCatTipogrupoByIdTipogrupo;
    }

    public void setSigaaCatTipogrupoByIdTipogrupo(SigaaCatTipogrupo sigaaCatTipogrupoByIdTipogrupo) {
        this.sigaaCatTipogrupoByIdTipogrupo = sigaaCatTipogrupoByIdTipogrupo;
    }

    @ManyToOne
    @JoinColumn(name = "ID_DOCENTE", referencedColumnName = "ID_DOCENTE", insertable = false, updatable = false)
    public SigaaCatDocente getSigaaCatDocenteByIdDocente() {
        return sigaaCatDocenteByIdDocente;
    }

    public void setSigaaCatDocenteByIdDocente(SigaaCatDocente sigaaCatDocenteByIdDocente) {
        this.sigaaCatDocenteByIdDocente = sigaaCatDocenteByIdDocente;
    }

    @OneToMany(mappedBy = "sigaaCatGrupoByIdGrupo")
    public List<SigaaDetCalificaciones> getSigaaDetCalificacionesByIdGrupo() {
        return sigaaDetCalificacionesByIdGrupo;
    }

    public void setSigaaDetCalificacionesByIdGrupo(List<SigaaDetCalificaciones> sigaaDetCalificacionesByIdGrupo) {
        this.sigaaDetCalificacionesByIdGrupo = sigaaDetCalificacionesByIdGrupo;
    }

    @OneToMany(mappedBy = "sigaaCatGrupoByIdGrupo")
    public List<SigaaExtraordinario> getSigaaExtraordinariosByIdGrupo() {
        return sigaaExtraordinariosByIdGrupo;
    }

    public void setSigaaExtraordinariosByIdGrupo(List<SigaaExtraordinario> sigaaExtraordinariosByIdGrupo) {
        this.sigaaExtraordinariosByIdGrupo = sigaaExtraordinariosByIdGrupo;
    }

    @OneToMany(mappedBy = "sigaaCatGrupoByIdGrupo")
    public List<SigaaGrupoAsignatura> getSigaaGrupoAsignaturasByIdGrupo() {
        return sigaaGrupoAsignaturasByIdGrupo;
    }

    public void setSigaaGrupoAsignaturasByIdGrupo(List<SigaaGrupoAsignatura> sigaaGrupoAsignaturasByIdGrupo) {
        this.sigaaGrupoAsignaturasByIdGrupo = sigaaGrupoAsignaturasByIdGrupo;
    }
}
