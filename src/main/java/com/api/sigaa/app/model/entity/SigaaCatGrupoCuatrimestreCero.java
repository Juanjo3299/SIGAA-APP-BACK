package com.api.sigaa.app.model.entity;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "SIGAA_CAT_GRUPO_CUATRIMESTRE_CERO", schema = "dbo", catalog = "SIGAA")
public class SigaaCatGrupoCuatrimestreCero {
    private int idGrupo;
    private String grupo;
    private int cupo;
    private String estatus;
    private int idCarrera;
    private int idPeriodo;
    private int idTipogrupo;
    private String turno;
    private Integer cuatrimestre;
    private String clave;
    private List<SigaaAlumnoCuatriCero> sigaaAlumnoCuatriCerosByIdGrupo;
    private List<SigaaCargaAcademicaAlumnoCuatriCero> sigaaCargaAcademicaAlumnoCuatriCerosByIdGrupo;
    private List<SigaaCargaAcademicaDocenteCuatriCero> sigaaCargaAcademicaDocenteCuatriCerosByIdGrupo;
    private SigaaCatCarrera sigaaCatCarreraByIdCarrera;
    private SigaaCatPeriodo sigaaCatPeriodoByIdPeriodo;
    private SigaaCatTipogrupo sigaaCatTipogrupoByIdTipogrupo;
    private List<SigaaDetCalificacionesCuatriCero> sigaaDetCalificacionesCuatriCerosByIdGrupo;
    private List<SigaaGrupoAsignaturaCuatricero> sigaaGrupoAsignaturaCuatricerosByIdGrupo;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SigaaCatGrupoCuatrimestreCero that = (SigaaCatGrupoCuatrimestreCero) o;
        return idGrupo == that.idGrupo &&
                cupo == that.cupo &&
                idCarrera == that.idCarrera &&
                idPeriodo == that.idPeriodo &&
                idTipogrupo == that.idTipogrupo &&
                Objects.equals(grupo, that.grupo) &&
                Objects.equals(estatus, that.estatus) &&
                Objects.equals(turno, that.turno) &&
                Objects.equals(cuatrimestre, that.cuatrimestre) &&
                Objects.equals(clave, that.clave);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idGrupo, grupo, cupo, estatus, idCarrera, idPeriodo, idTipogrupo, turno, cuatrimestre, clave);
    }

    @OneToMany(mappedBy = "sigaaCatGrupoCuatrimestreCeroByIdGrupo")
    public List<SigaaAlumnoCuatriCero> getSigaaAlumnoCuatriCerosByIdGrupo() {
        return sigaaAlumnoCuatriCerosByIdGrupo;
    }

    public void setSigaaAlumnoCuatriCerosByIdGrupo(List<SigaaAlumnoCuatriCero> sigaaAlumnoCuatriCerosByIdGrupo) {
        this.sigaaAlumnoCuatriCerosByIdGrupo = sigaaAlumnoCuatriCerosByIdGrupo;
    }

    @OneToMany(mappedBy = "sigaaCatGrupoCuatrimestreCeroByIdGrupo")
    public List<SigaaCargaAcademicaAlumnoCuatriCero> getSigaaCargaAcademicaAlumnoCuatriCerosByIdGrupo() {
        return sigaaCargaAcademicaAlumnoCuatriCerosByIdGrupo;
    }

    public void setSigaaCargaAcademicaAlumnoCuatriCerosByIdGrupo(List<SigaaCargaAcademicaAlumnoCuatriCero> sigaaCargaAcademicaAlumnoCuatriCerosByIdGrupo) {
        this.sigaaCargaAcademicaAlumnoCuatriCerosByIdGrupo = sigaaCargaAcademicaAlumnoCuatriCerosByIdGrupo;
    }

    @OneToMany(mappedBy = "sigaaCatGrupoCuatrimestreCeroByIdGrupo")
    public List<SigaaCargaAcademicaDocenteCuatriCero> getSigaaCargaAcademicaDocenteCuatriCerosByIdGrupo() {
        return sigaaCargaAcademicaDocenteCuatriCerosByIdGrupo;
    }

    public void setSigaaCargaAcademicaDocenteCuatriCerosByIdGrupo(List<SigaaCargaAcademicaDocenteCuatriCero> sigaaCargaAcademicaDocenteCuatriCerosByIdGrupo) {
        this.sigaaCargaAcademicaDocenteCuatriCerosByIdGrupo = sigaaCargaAcademicaDocenteCuatriCerosByIdGrupo;
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

    @OneToMany(mappedBy = "sigaaCatGrupoCuatrimestreCeroByIdGrupo")
    public List<SigaaDetCalificacionesCuatriCero> getSigaaDetCalificacionesCuatriCerosByIdGrupo() {
        return sigaaDetCalificacionesCuatriCerosByIdGrupo;
    }

    public void setSigaaDetCalificacionesCuatriCerosByIdGrupo(List<SigaaDetCalificacionesCuatriCero> sigaaDetCalificacionesCuatriCerosByIdGrupo) {
        this.sigaaDetCalificacionesCuatriCerosByIdGrupo = sigaaDetCalificacionesCuatriCerosByIdGrupo;
    }

    @OneToMany(mappedBy = "sigaaCatGrupoCuatrimestreCeroByIdGrupoCuatricero")
    public List<SigaaGrupoAsignaturaCuatricero> getSigaaGrupoAsignaturaCuatricerosByIdGrupo() {
        return sigaaGrupoAsignaturaCuatricerosByIdGrupo;
    }

    public void setSigaaGrupoAsignaturaCuatricerosByIdGrupo(List<SigaaGrupoAsignaturaCuatricero> sigaaGrupoAsignaturaCuatricerosByIdGrupo) {
        this.sigaaGrupoAsignaturaCuatricerosByIdGrupo = sigaaGrupoAsignaturaCuatricerosByIdGrupo;
    }
}
