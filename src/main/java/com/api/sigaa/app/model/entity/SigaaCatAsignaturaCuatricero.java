package com.api.sigaa.app.model.entity;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "SIGAA_CAT_ASIGNATURA_CUATRICERO", schema = "dbo", catalog = "SIGAA")
public class SigaaCatAsignaturaCuatricero {
    private int idAsignatura;
    private String claveAsig;
    private String nombre;
    private String creditos;
    private int hrsTeoricas;
    private int hrsPrcaticas;
    private String cicloForm;
    private String certificable;
    private String estatus;
    private Integer cuatrimestre;
    private Integer limiteFaltas;
    private Integer idPlanestudio;
    private List<SigaaCargaAcademicaAlumnoCuatriCero> sigaaCargaAcademicaAlumnoCuatriCerosByIdAsignatura;
    private List<SigaaCargaAcademicaDocenteCuatriCero> sigaaCargaAcademicaDocenteCuatriCerosByIdAsignatura;
    private List<SigaaCarreraAsignaturaCuatricero> sigaaCarreraAsignaturaCuatricerosByIdAsignatura;
    private SigaaCatPlanestudio sigaaCatPlanestudioByIdPlanestudio;
    private List<SigaaDetCalificacionesCuatriCero> sigaaDetCalificacionesCuatriCerosByIdAsignatura;
    private List<SigaaGrupoAsignaturaCuatricero> sigaaGrupoAsignaturaCuatricerosByIdAsignatura;

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
    @Column(name = "HRS_PRCATICAS")
    public int getHrsPrcaticas() {
        return hrsPrcaticas;
    }

    public void setHrsPrcaticas(int hrsPrcaticas) {
        this.hrsPrcaticas = hrsPrcaticas;
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
    public Integer getIdPlanestudio() {
        return idPlanestudio;
    }

    public void setIdPlanestudio(Integer idPlanestudio) {
        this.idPlanestudio = idPlanestudio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SigaaCatAsignaturaCuatricero that = (SigaaCatAsignaturaCuatricero) o;
        return idAsignatura == that.idAsignatura &&
                hrsTeoricas == that.hrsTeoricas &&
                hrsPrcaticas == that.hrsPrcaticas &&
                Objects.equals(claveAsig, that.claveAsig) &&
                Objects.equals(nombre, that.nombre) &&
                Objects.equals(creditos, that.creditos) &&
                Objects.equals(cicloForm, that.cicloForm) &&
                Objects.equals(certificable, that.certificable) &&
                Objects.equals(estatus, that.estatus) &&
                Objects.equals(cuatrimestre, that.cuatrimestre) &&
                Objects.equals(limiteFaltas, that.limiteFaltas) &&
                Objects.equals(idPlanestudio, that.idPlanestudio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idAsignatura, claveAsig, nombre, creditos, hrsTeoricas, hrsPrcaticas, cicloForm, certificable, estatus, cuatrimestre, limiteFaltas, idPlanestudio);
    }

    @OneToMany(mappedBy = "sigaaCatAsignaturaCuatriceroByIdAsignatura")
    public List<SigaaCargaAcademicaAlumnoCuatriCero> getSigaaCargaAcademicaAlumnoCuatriCerosByIdAsignatura() {
        return sigaaCargaAcademicaAlumnoCuatriCerosByIdAsignatura;
    }

    public void setSigaaCargaAcademicaAlumnoCuatriCerosByIdAsignatura(List<SigaaCargaAcademicaAlumnoCuatriCero> sigaaCargaAcademicaAlumnoCuatriCerosByIdAsignatura) {
        this.sigaaCargaAcademicaAlumnoCuatriCerosByIdAsignatura = sigaaCargaAcademicaAlumnoCuatriCerosByIdAsignatura;
    }

    @OneToMany(mappedBy = "sigaaCatAsignaturaCuatriceroByIdAsignatura")
    public List<SigaaCargaAcademicaDocenteCuatriCero> getSigaaCargaAcademicaDocenteCuatriCerosByIdAsignatura() {
        return sigaaCargaAcademicaDocenteCuatriCerosByIdAsignatura;
    }

    public void setSigaaCargaAcademicaDocenteCuatriCerosByIdAsignatura(List<SigaaCargaAcademicaDocenteCuatriCero> sigaaCargaAcademicaDocenteCuatriCerosByIdAsignatura) {
        this.sigaaCargaAcademicaDocenteCuatriCerosByIdAsignatura = sigaaCargaAcademicaDocenteCuatriCerosByIdAsignatura;
    }

    @OneToMany(mappedBy = "sigaaCatAsignaturaCuatriceroByIdAsignatura")
    public List<SigaaCarreraAsignaturaCuatricero> getSigaaCarreraAsignaturaCuatricerosByIdAsignatura() {
        return sigaaCarreraAsignaturaCuatricerosByIdAsignatura;
    }

    public void setSigaaCarreraAsignaturaCuatricerosByIdAsignatura(List<SigaaCarreraAsignaturaCuatricero> sigaaCarreraAsignaturaCuatricerosByIdAsignatura) {
        this.sigaaCarreraAsignaturaCuatricerosByIdAsignatura = sigaaCarreraAsignaturaCuatricerosByIdAsignatura;
    }

    @ManyToOne
    @JoinColumn(name = "ID_PLANESTUDIO", referencedColumnName = "ID_PLANESTUDIO", insertable = false, updatable = false)
    public SigaaCatPlanestudio getSigaaCatPlanestudioByIdPlanestudio() {
        return sigaaCatPlanestudioByIdPlanestudio;
    }

    public void setSigaaCatPlanestudioByIdPlanestudio(SigaaCatPlanestudio sigaaCatPlanestudioByIdPlanestudio) {
        this.sigaaCatPlanestudioByIdPlanestudio = sigaaCatPlanestudioByIdPlanestudio;
    }

    @OneToMany(mappedBy = "sigaaCatAsignaturaCuatriceroByIdAsignatura")
    public List<SigaaDetCalificacionesCuatriCero> getSigaaDetCalificacionesCuatriCerosByIdAsignatura() {
        return sigaaDetCalificacionesCuatriCerosByIdAsignatura;
    }

    public void setSigaaDetCalificacionesCuatriCerosByIdAsignatura(List<SigaaDetCalificacionesCuatriCero> sigaaDetCalificacionesCuatriCerosByIdAsignatura) {
        this.sigaaDetCalificacionesCuatriCerosByIdAsignatura = sigaaDetCalificacionesCuatriCerosByIdAsignatura;
    }

    @OneToMany(mappedBy = "sigaaCatAsignaturaCuatriceroByIdAsignaturaCuatricero")
    public List<SigaaGrupoAsignaturaCuatricero> getSigaaGrupoAsignaturaCuatricerosByIdAsignatura() {
        return sigaaGrupoAsignaturaCuatricerosByIdAsignatura;
    }

    public void setSigaaGrupoAsignaturaCuatricerosByIdAsignatura(List<SigaaGrupoAsignaturaCuatricero> sigaaGrupoAsignaturaCuatricerosByIdAsignatura) {
        this.sigaaGrupoAsignaturaCuatricerosByIdAsignatura = sigaaGrupoAsignaturaCuatricerosByIdAsignatura;
    }
}
