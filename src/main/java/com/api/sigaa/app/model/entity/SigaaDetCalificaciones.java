package com.api.sigaa.app.model.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "SIGAA_DET_CALIFICACIONES", schema = "dbo", catalog = "SIGAA")
public class SigaaDetCalificaciones {
    private int cns;
    private Double calificacion;
    private Date fecha;
    private int idAsignatura;
    private int idTipocalif;
    private int idGrupo;
    private int matricula;
    private Integer faltas;
    private String estatus;
    private SigaaCatAsignatura sigaaCatAsignaturaByIdAsignatura;
    private SigaaCatTipocalificaciones sigaaCatTipocalificacionesByIdTipocalif;
    private SigaaCatGrupo sigaaCatGrupoByIdGrupo;
    private SigaaCatAlumno sigaaCatAlumnoByMatricula;

    @Id
    @Column(name = "CNS")
    public int getCns() {
        return cns;
    }

    public void setCns(int cns) {
        this.cns = cns;
    }

    @Basic
    @Column(name = "CALIFICACION")
    public Double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Double calificacion) {
        this.calificacion = calificacion;
    }

    @Basic
    @Column(name = "FECHA")
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
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
    @Column(name = "ID_TIPOCALIF")
    public int getIdTipocalif() {
        return idTipocalif;
    }

    public void setIdTipocalif(int idTipocalif) {
        this.idTipocalif = idTipocalif;
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
    @Column(name = "MATRICULA")
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    @Basic
    @Column(name = "FALTAS")
    public Integer getFaltas() {
        return faltas;
    }

    public void setFaltas(Integer faltas) {
        this.faltas = faltas;
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
        SigaaDetCalificaciones that = (SigaaDetCalificaciones) o;
        return cns == that.cns &&
                idAsignatura == that.idAsignatura &&
                idTipocalif == that.idTipocalif &&
                idGrupo == that.idGrupo &&
                matricula == that.matricula &&
                Objects.equals(calificacion, that.calificacion) &&
                Objects.equals(fecha, that.fecha) &&
                Objects.equals(faltas, that.faltas) &&
                Objects.equals(estatus, that.estatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cns, calificacion, fecha, idAsignatura, idTipocalif, idGrupo, matricula, faltas, estatus);
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
    @JoinColumn(name = "ID_TIPOCALIF", referencedColumnName = "ID_TIPOCALIF", nullable = false, insertable = false, updatable = false)
    public SigaaCatTipocalificaciones getSigaaCatTipocalificacionesByIdTipocalif() {
        return sigaaCatTipocalificacionesByIdTipocalif;
    }

    public void setSigaaCatTipocalificacionesByIdTipocalif(SigaaCatTipocalificaciones sigaaCatTipocalificacionesByIdTipocalif) {
        this.sigaaCatTipocalificacionesByIdTipocalif = sigaaCatTipocalificacionesByIdTipocalif;
    }

    @ManyToOne
    @JoinColumn(name = "ID_GRUPO", referencedColumnName = "ID_GRUPO", nullable = false, insertable = false, updatable = false)
    public SigaaCatGrupo getSigaaCatGrupoByIdGrupo() {
        return sigaaCatGrupoByIdGrupo;
    }

    public void setSigaaCatGrupoByIdGrupo(SigaaCatGrupo sigaaCatGrupoByIdGrupo) {
        this.sigaaCatGrupoByIdGrupo = sigaaCatGrupoByIdGrupo;
    }

    @ManyToOne
    @JoinColumn(name = "MATRICULA", referencedColumnName = "MATRICULA", nullable = false, insertable = false, updatable = false)
    public SigaaCatAlumno getSigaaCatAlumnoByMatricula() {
        return sigaaCatAlumnoByMatricula;
    }

    public void setSigaaCatAlumnoByMatricula(SigaaCatAlumno sigaaCatAlumnoByMatricula) {
        this.sigaaCatAlumnoByMatricula = sigaaCatAlumnoByMatricula;
    }
}
