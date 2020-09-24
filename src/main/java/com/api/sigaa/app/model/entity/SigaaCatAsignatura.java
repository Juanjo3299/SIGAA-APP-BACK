package com.api.sigaa.app.model.entity;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "SIGAA_CAT_ASIGNATURA", schema = "dbo", catalog = "SIGAA")
public class SigaaCatAsignatura {
    private int idAsignatura;
    private String claveAsig;
    private String nombre;
    private String creditos;
    private int hrsTeoricas;
    private int hrsPracticas;
    private String cicloForm;
    private String certificable;
    private String estatus;
    private Integer cuatrimestre;
    private Integer limiteFaltas;
    private int idPlanestudio;
    private String cargaAlumno;
    private List<SigaaCargaAcademicaAlumno> sigaaCargaAcademicaAlumnosByIdAsignatura;
    private List<SigaaCargaAcademicaDocente> sigaaCargaAcademicaDocentesByIdAsignatura;
    private List<SigaaCargaTemporal> sigaaCargaTemporalsByIdAsignatura;
    private List<SigaaCarreraAsignatura> sigaaCarreraAsignaturasByIdAsignatura;
    private SigaaCatPlanestudio sigaaCatPlanestudioByIdPlanestudio;
    private List<SigaaDetCalificaciones> sigaaDetCalificacionesByIdAsignatura;
    private List<SigaaGrupoAsignatura> sigaaGrupoAsignaturasByIdAsignatura;

    @Id
    @Column(name = "ID_ASIGNATURA")
    public int getIdAsignatura() {
        return idAsignatura;
    }

    public void setIdAsignatura(int idAsignatura) {
        this.idAsignatura = idAsignatura;
    }

    @Basic
    @Column(name = "CLAVE_ASIG")
    public String getClaveAsig() {
        return claveAsig;
    }

    public void setClaveAsig(String claveAsig) {
        this.claveAsig = claveAsig;
    }

    @Basic
    @Column(name = "NOMBRE")
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Basic
    @Column(name = "CREDITOS")
    public String getCreditos() {
        return creditos;
    }

    public void setCreditos(String creditos) {
        this.creditos = creditos;
    }

    @Basic
    @Column(name = "HRS_TEORICAS")
    public int getHrsTeoricas() {
        return hrsTeoricas;
    }

    public void setHrsTeoricas(int hrsTeoricas) {
        this.hrsTeoricas = hrsTeoricas;
    }

    @Basic
    @Column(name = "HRS_PRACTICAS")
    public int getHrsPracticas() {
        return hrsPracticas;
    }

    public void setHrsPracticas(int hrsPracticas) {
        this.hrsPracticas = hrsPracticas;
    }

    @Basic
    @Column(name = "CICLO_FORM")
    public String getCicloForm() {
        return cicloForm;
    }

    public void setCicloForm(String cicloForm) {
        this.cicloForm = cicloForm;
    }

    @Basic
    @Column(name = "CERTIFICABLE")
    public String getCertificable() {
        return certificable;
    }

    public void setCertificable(String certificable) {
        this.certificable = certificable;
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
    @Column(name = "CUATRIMESTRE")
    public Integer getCuatrimestre() {
        return cuatrimestre;
    }

    public void setCuatrimestre(Integer cuatrimestre) {
        this.cuatrimestre = cuatrimestre;
    }

    @Basic
    @Column(name = "LIMITE_FALTAS")
    public Integer getLimiteFaltas() {
        return limiteFaltas;
    }

    public void setLimiteFaltas(Integer limiteFaltas) {
        this.limiteFaltas = limiteFaltas;
    }

    @Basic
    @Column(name = "ID_PLANESTUDIO")
    public int getIdPlanestudio() {
        return idPlanestudio;
    }

    public void setIdPlanestudio(int idPlanestudio) {
        this.idPlanestudio = idPlanestudio;
    }

    @Basic
    @Column(name = "CARGA_ALUMNO")
    public String getCargaAlumno() {
        return cargaAlumno;
    }

    public void setCargaAlumno(String cargaAlumno) {
        this.cargaAlumno = cargaAlumno;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SigaaCatAsignatura that = (SigaaCatAsignatura) o;
        return idAsignatura == that.idAsignatura &&
                hrsTeoricas == that.hrsTeoricas &&
                hrsPracticas == that.hrsPracticas &&
                idPlanestudio == that.idPlanestudio &&
                Objects.equals(claveAsig, that.claveAsig) &&
                Objects.equals(nombre, that.nombre) &&
                Objects.equals(creditos, that.creditos) &&
                Objects.equals(cicloForm, that.cicloForm) &&
                Objects.equals(certificable, that.certificable) &&
                Objects.equals(estatus, that.estatus) &&
                Objects.equals(cuatrimestre, that.cuatrimestre) &&
                Objects.equals(limiteFaltas, that.limiteFaltas) &&
                Objects.equals(cargaAlumno, that.cargaAlumno);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idAsignatura, claveAsig, nombre, creditos, hrsTeoricas, hrsPracticas, cicloForm, certificable, estatus, cuatrimestre, limiteFaltas, idPlanestudio, cargaAlumno);
    }

    @OneToMany(mappedBy = "sigaaCatAsignaturaByIdAsignatura")
    public List<SigaaCargaAcademicaAlumno> getSigaaCargaAcademicaAlumnosByIdAsignatura() {
        return sigaaCargaAcademicaAlumnosByIdAsignatura;
    }

    public void setSigaaCargaAcademicaAlumnosByIdAsignatura(List<SigaaCargaAcademicaAlumno> sigaaCargaAcademicaAlumnosByIdAsignatura) {
        this.sigaaCargaAcademicaAlumnosByIdAsignatura = sigaaCargaAcademicaAlumnosByIdAsignatura;
    }

    @OneToMany(mappedBy = "sigaaCatAsignaturaByIdAsignatura")
    public List<SigaaCargaAcademicaDocente> getSigaaCargaAcademicaDocentesByIdAsignatura() {
        return sigaaCargaAcademicaDocentesByIdAsignatura;
    }

    public void setSigaaCargaAcademicaDocentesByIdAsignatura(List<SigaaCargaAcademicaDocente> sigaaCargaAcademicaDocentesByIdAsignatura) {
        this.sigaaCargaAcademicaDocentesByIdAsignatura = sigaaCargaAcademicaDocentesByIdAsignatura;
    }

    @OneToMany(mappedBy = "sigaaCatAsignaturaByIdAsignatura")
    public List<SigaaCargaTemporal> getSigaaCargaTemporalsByIdAsignatura() {
        return sigaaCargaTemporalsByIdAsignatura;
    }

    public void setSigaaCargaTemporalsByIdAsignatura(List<SigaaCargaTemporal> sigaaCargaTemporalsByIdAsignatura) {
        this.sigaaCargaTemporalsByIdAsignatura = sigaaCargaTemporalsByIdAsignatura;
    }

    @OneToMany(mappedBy = "sigaaCatAsignaturaByIdAsignatura")
    public List<SigaaCarreraAsignatura> getSigaaCarreraAsignaturasByIdAsignatura() {
        return sigaaCarreraAsignaturasByIdAsignatura;
    }

    public void setSigaaCarreraAsignaturasByIdAsignatura(List<SigaaCarreraAsignatura> sigaaCarreraAsignaturasByIdAsignatura) {
        this.sigaaCarreraAsignaturasByIdAsignatura = sigaaCarreraAsignaturasByIdAsignatura;
    }

    @ManyToOne
    @JoinColumn(name = "ID_PLANESTUDIO", referencedColumnName = "ID_PLANESTUDIO", nullable = false, insertable = false, updatable = false)
    public SigaaCatPlanestudio getSigaaCatPlanestudioByIdPlanestudio() {
        return sigaaCatPlanestudioByIdPlanestudio;
    }

    public void setSigaaCatPlanestudioByIdPlanestudio(SigaaCatPlanestudio sigaaCatPlanestudioByIdPlanestudio) {
        this.sigaaCatPlanestudioByIdPlanestudio = sigaaCatPlanestudioByIdPlanestudio;
    }

    @OneToMany(mappedBy = "sigaaCatAsignaturaByIdAsignatura")
    public List<SigaaDetCalificaciones> getSigaaDetCalificacionesByIdAsignatura() {
        return sigaaDetCalificacionesByIdAsignatura;
    }

    public void setSigaaDetCalificacionesByIdAsignatura(List<SigaaDetCalificaciones> sigaaDetCalificacionesByIdAsignatura) {
        this.sigaaDetCalificacionesByIdAsignatura = sigaaDetCalificacionesByIdAsignatura;
    }

    @OneToMany(mappedBy = "sigaaCatAsignaturaByIdAsignatura")
    public List<SigaaGrupoAsignatura> getSigaaGrupoAsignaturasByIdAsignatura() {
        return sigaaGrupoAsignaturasByIdAsignatura;
    }

    public void setSigaaGrupoAsignaturasByIdAsignatura(List<SigaaGrupoAsignatura> sigaaGrupoAsignaturasByIdAsignatura) {
        this.sigaaGrupoAsignaturasByIdAsignatura = sigaaGrupoAsignaturasByIdAsignatura;
    }
}
