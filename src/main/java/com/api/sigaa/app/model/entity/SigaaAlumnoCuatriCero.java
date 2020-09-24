package com.api.sigaa.app.model.entity;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "SIGAA_ALUMNO_CUATRI_CERO", schema = "dbo", catalog = "SIGAA")
public class SigaaAlumnoCuatriCero {
    private int idAlumnoCuatriCero;
    private int matricula;
    private String estatus;
    private int idHistorialAlumno;
    private int folio;
    private Integer idGrupo;
    private SigaaAlumnoCuatriCeroEscolaridad sigaaAlumnoCuatriCeroEscolaridadByIdHistorialAlumno;
    private SigaaCatAspirante sigaaCatAspiranteByFolio;
    private SigaaCatGrupoCuatrimestreCero sigaaCatGrupoCuatrimestreCeroByIdGrupo;
    private List<SigaaAlumnoCuatriCeroFamilia> sigaaAlumnoCuatriCeroFamiliasByIdAlumnoCuatriCero;

    @Id
    @Column(name = "ID_ALUMNO_CUATRI_CERO")
    public int getIdAlumnoCuatriCero() {
        return idAlumnoCuatriCero;
    }

    public void setIdAlumnoCuatriCero(int idAlumnoCuatriCero) {
        this.idAlumnoCuatriCero = idAlumnoCuatriCero;
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
    @Column(name = "ESTATUS")
    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    @Basic
    @Column(name = "ID_HISTORIAL_ALUMNO")
    public int getIdHistorialAlumno() {
        return idHistorialAlumno;
    }

    public void setIdHistorialAlumno(int idHistorialAlumno) {
        this.idHistorialAlumno = idHistorialAlumno;
    }

    @Basic
    @Column(name = "FOLIO")
    public int getFolio() {
        return folio;
    }

    public void setFolio(int folio) {
        this.folio = folio;
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
        SigaaAlumnoCuatriCero that = (SigaaAlumnoCuatriCero) o;
        return idAlumnoCuatriCero == that.idAlumnoCuatriCero &&
                matricula == that.matricula &&
                idHistorialAlumno == that.idHistorialAlumno &&
                folio == that.folio &&
                Objects.equals(estatus, that.estatus) &&
                Objects.equals(idGrupo, that.idGrupo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idAlumnoCuatriCero, matricula, estatus, idHistorialAlumno, folio, idGrupo);
    }

    @ManyToOne
    @JoinColumn(name = "ID_HISTORIAL_ALUMNO", referencedColumnName = "ID_DET_ESCOLARIDAD_ALUMNO_CUATRI_CERO", nullable = false, insertable = false, updatable = false)
    public SigaaAlumnoCuatriCeroEscolaridad getSigaaAlumnoCuatriCeroEscolaridadByIdHistorialAlumno() {
        return sigaaAlumnoCuatriCeroEscolaridadByIdHistorialAlumno;
    }

    public void setSigaaAlumnoCuatriCeroEscolaridadByIdHistorialAlumno(SigaaAlumnoCuatriCeroEscolaridad sigaaAlumnoCuatriCeroEscolaridadByIdHistorialAlumno) {
        this.sigaaAlumnoCuatriCeroEscolaridadByIdHistorialAlumno = sigaaAlumnoCuatriCeroEscolaridadByIdHistorialAlumno;
    }

    @ManyToOne
    @JoinColumn(name = "FOLIO", referencedColumnName = "FOLIO", nullable = false, insertable = false, updatable = false)
    public SigaaCatAspirante getSigaaCatAspiranteByFolio() {
        return sigaaCatAspiranteByFolio;
    }

    public void setSigaaCatAspiranteByFolio(SigaaCatAspirante sigaaCatAspiranteByFolio) {
        this.sigaaCatAspiranteByFolio = sigaaCatAspiranteByFolio;
    }

    @ManyToOne
    @JoinColumn(name = "ID_GRUPO", referencedColumnName = "ID_GRUPO", insertable = false, updatable = false)
    public SigaaCatGrupoCuatrimestreCero getSigaaCatGrupoCuatrimestreCeroByIdGrupo() {
        return sigaaCatGrupoCuatrimestreCeroByIdGrupo;
    }

    public void setSigaaCatGrupoCuatrimestreCeroByIdGrupo(SigaaCatGrupoCuatrimestreCero sigaaCatGrupoCuatrimestreCeroByIdGrupo) {
        this.sigaaCatGrupoCuatrimestreCeroByIdGrupo = sigaaCatGrupoCuatrimestreCeroByIdGrupo;
    }

    @OneToMany(mappedBy = "sigaaAlumnoCuatriCeroByIdAlumno")
    public List<SigaaAlumnoCuatriCeroFamilia> getSigaaAlumnoCuatriCeroFamiliasByIdAlumnoCuatriCero() {
        return sigaaAlumnoCuatriCeroFamiliasByIdAlumnoCuatriCero;
    }

    public void setSigaaAlumnoCuatriCeroFamiliasByIdAlumnoCuatriCero(List<SigaaAlumnoCuatriCeroFamilia> sigaaAlumnoCuatriCeroFamiliasByIdAlumnoCuatriCero) {
        this.sigaaAlumnoCuatriCeroFamiliasByIdAlumnoCuatriCero = sigaaAlumnoCuatriCeroFamiliasByIdAlumnoCuatriCero;
    }
}
