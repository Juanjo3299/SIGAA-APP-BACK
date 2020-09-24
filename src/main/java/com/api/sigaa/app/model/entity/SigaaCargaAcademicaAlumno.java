package com.api.sigaa.app.model.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "SIGAA_CARGA_ACADEMICA_ALUMNO", schema = "dbo", catalog = "SIGAA")
public class SigaaCargaAcademicaAlumno {
    private int sigaaCargaAcademicaAlumno;
    private Integer matricula;
    private Integer idAsignatura;
    private Integer idPeriodo;
    private Integer idGrupo;
    private Integer cuatrimestre;
    private String estatus;
    private SigaaCatAlumno sigaaCatAlumnoByMatricula;
    private SigaaCatAsignatura sigaaCatAsignaturaByIdAsignatura;
    private SigaaCatPeriodo sigaaCatPeriodoByIdPeriodo;
    private SigaaCatGrupo sigaaCatGrupoByIdGrupo;

    @Id
    @Column(name = "SIGAA_CARGA_ACADEMICA_ALUMNO")
    public int getSigaaCargaAcademicaAlumno() {
        return sigaaCargaAcademicaAlumno;
    }

    public void setSigaaCargaAcademicaAlumno(int sigaaCargaAcademicaAlumno) {
        this.sigaaCargaAcademicaAlumno = sigaaCargaAcademicaAlumno;
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
    @Column(name = "ID_ASIGNATURA")
    public Integer getIdAsignatura() {
        return idAsignatura;
    }

    public void setIdAsignatura(Integer idAsignatura) {
        this.idAsignatura = idAsignatura;
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
    @Column(name = "ID_GRUPO")
    public Integer getIdGrupo() {
        return idGrupo;
    }

    public void setIdGrupo(Integer idGrupo) {
        this.idGrupo = idGrupo;
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
        SigaaCargaAcademicaAlumno that = (SigaaCargaAcademicaAlumno) o;
        return sigaaCargaAcademicaAlumno == that.sigaaCargaAcademicaAlumno &&
                Objects.equals(matricula, that.matricula) &&
                Objects.equals(idAsignatura, that.idAsignatura) &&
                Objects.equals(idPeriodo, that.idPeriodo) &&
                Objects.equals(idGrupo, that.idGrupo) &&
                Objects.equals(cuatrimestre, that.cuatrimestre) &&
                Objects.equals(estatus, that.estatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sigaaCargaAcademicaAlumno, matricula, idAsignatura, idPeriodo, idGrupo, cuatrimestre, estatus);
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
    @JoinColumn(name = "ID_ASIGNATURA", referencedColumnName = "ID_ASIGNATURA", insertable = false, updatable = false)
    public SigaaCatAsignatura getSigaaCatAsignaturaByIdAsignatura() {
        return sigaaCatAsignaturaByIdAsignatura;
    }

    public void setSigaaCatAsignaturaByIdAsignatura(SigaaCatAsignatura sigaaCatAsignaturaByIdAsignatura) {
        this.sigaaCatAsignaturaByIdAsignatura = sigaaCatAsignaturaByIdAsignatura;
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
    @JoinColumn(name = "ID_GRUPO", referencedColumnName = "ID_GRUPO", insertable = false, updatable = false)
    public SigaaCatGrupo getSigaaCatGrupoByIdGrupo() {
        return sigaaCatGrupoByIdGrupo;
    }

    public void setSigaaCatGrupoByIdGrupo(SigaaCatGrupo sigaaCatGrupoByIdGrupo) {
        this.sigaaCatGrupoByIdGrupo = sigaaCatGrupoByIdGrupo;
    }
}
