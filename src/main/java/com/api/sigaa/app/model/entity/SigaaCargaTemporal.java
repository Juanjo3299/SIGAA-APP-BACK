package com.api.sigaa.app.model.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "SIGAA_CARGA_TEMPORAL", schema = "dbo", catalog = "SIGAA")
public class SigaaCargaTemporal {
    private int idSigaaCargaTemporal;
    private int matricula;
    private int idAsignatura;
    private int idPeriodo;
    private int idGrupo;
    private String estatus;
    private SigaaCatAlumno sigaaCatAlumnoByMatricula;
    private SigaaCatAsignatura sigaaCatAsignaturaByIdAsignatura;
    private SigaaCatPeriodo sigaaCatPeriodoByIdPeriodo;
    private SigaaCatGrupo sigaaCatGrupoByIdGrupo;

    @Id
    @Column(name = "ID_SIGAA_CARGA_TEMPORAL")
    public int getIdSigaaCargaTemporal() {
        return idSigaaCargaTemporal;
    }

    public void setIdSigaaCargaTemporal(int idSigaaCargaTemporal) {
        this.idSigaaCargaTemporal = idSigaaCargaTemporal;
    }

    @Basic
    @Column(name = "MATRICULA")
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    @Basic
    @Column(name = "ID_ASIGNATURA")
    public int getIdAsignatura() {
        return idAsignatura;
    }

    public void setIdAsignatura(int idAsignatura) {
        this.idAsignatura = idAsignatura;
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
    @Column(name = "ID_GRUPO")
    public int getIdGrupo() {
        return idGrupo;
    }

    public void setIdGrupo(int idGrupo) {
        this.idGrupo = idGrupo;
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
        SigaaCargaTemporal that = (SigaaCargaTemporal) o;
        return idSigaaCargaTemporal == that.idSigaaCargaTemporal &&
                matricula == that.matricula &&
                idAsignatura == that.idAsignatura &&
                idPeriodo == that.idPeriodo &&
                idGrupo == that.idGrupo &&
                Objects.equals(estatus, that.estatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idSigaaCargaTemporal, matricula, idAsignatura, idPeriodo, idGrupo, estatus);
    }

    @ManyToOne
    @JoinColumn(name = "MATRICULA", referencedColumnName = "MATRICULA", nullable = false, insertable = false, updatable = false)
    public SigaaCatAlumno getSigaaCatAlumnoByMatricula() {
        return sigaaCatAlumnoByMatricula;
    }

    public void setSigaaCatAlumnoByMatricula(SigaaCatAlumno sigaaCatAlumnoByMatricula) {
        this.sigaaCatAlumnoByMatricula = sigaaCatAlumnoByMatricula;
    }

    @ManyToOne
    @JoinColumn(name = "ID_ASIGNATURA", referencedColumnName = "ID_ASIGNATURA", nullable = false, insertable = false, updatable = false)
    public SigaaCatAsignatura getSigaaCatAsignaturaByIdAsignatura() {
        return sigaaCatAsignaturaByIdAsignatura;
    }

    public void setSigaaCatAsignaturaByIdAsignatura(SigaaCatAsignatura sigaaCatAsignaturaByIdAsignatura) {
        this.sigaaCatAsignaturaByIdAsignatura = sigaaCatAsignaturaByIdAsignatura;
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
    @JoinColumn(name = "ID_GRUPO", referencedColumnName = "ID_GRUPO", nullable = false, insertable = false, updatable = false)
    public SigaaCatGrupo getSigaaCatGrupoByIdGrupo() {
        return sigaaCatGrupoByIdGrupo;
    }

    public void setSigaaCatGrupoByIdGrupo(SigaaCatGrupo sigaaCatGrupoByIdGrupo) {
        this.sigaaCatGrupoByIdGrupo = sigaaCatGrupoByIdGrupo;
    }
}
