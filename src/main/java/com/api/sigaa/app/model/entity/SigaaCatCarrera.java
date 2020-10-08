package com.api.sigaa.app.model.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "SIGAA_CAT_CARRERA", schema = "dbo", catalog = "SIGAA")
public class SigaaCatCarrera {
    private int idCarrera;
    private String nomProgacademico;
    private String homosigla;
    private String clave911;
    private String estatus;
    private Integer idModalidad;
    private String claveDgp;
    private String nomProgacademicoDgp;
    @JsonIgnore
    private List<ConvocatoriaCarrera> convocatoriaCarrerasByIdCarrera;
    @JsonIgnore
    private List<SigaaCarreraAsignatura> sigaaCarreraAsignaturasByIdCarrera;
    @JsonIgnore
    private List<SigaaCarreraAsignaturaCuatricero> sigaaCarreraAsignaturaCuatricerosByIdCarrera;
    @JsonIgnore
    private List<SigaaCatAlumnoModificaso> sigaaCatAlumnoModificasosByIdCarrera;
    @JsonIgnore
    private List<SigaaCatAsesoresAcademicos> sigaaCatAsesoresAcademicosByIdCarrera;
    @JsonIgnore
    private List<SigaaCatAspirante> sigaaCatAspirantesByIdCarrera;
    @JsonIgnore
    private List<SigaaCatAspirante> sigaaCatAspirantesByIdCarrera_0;
    @JsonIgnore
    private List<SigaaCatAspirantePosgrado> sigaaCatAspirantePosgradosByIdCarrera;
    @JsonIgnore
    private List<SigaaCatAspirantePosgrado> sigaaCatAspirantePosgradosByIdCarrera_0;
    @JsonIgnore
    private SigaaCatModalidad sigaaCatModalidadByIdModalidad;
    @JsonIgnore
    private List<SigaaCatCoordinadorIngenieria> sigaaCatCoordinadorIngenieriasByIdCarrera;
    @JsonBackReference
    private List<SigaaCatGrupo> sigaaCatGruposByIdCarrera;
    @JsonIgnore
    private List<SigaaCatGrupoCuatrimestreCero> sigaaCatGrupoCuatrimestreCerosByIdCarrera;
    @JsonIgnore
    private List<SigaaCatPlanestudio> sigaaCatPlanestudiosByIdCarrera;
    @JsonIgnore
    private List<SigaaCohorteGenerado> sigaaCohorteGeneradosByIdCarrera;

    @Id
    @Column(name = "ID_CARRERA")
    public int getIdCarrera() {
        return idCarrera;
    }

    public void setIdCarrera(int idCarrera) {
        this.idCarrera = idCarrera;
    }

    @Basic
    @Column(name = "NOM_PROGACADEMICO")
    public String getNomProgacademico() {
        return nomProgacademico;
    }

    public void setNomProgacademico(String nomProgacademico) {
        this.nomProgacademico = nomProgacademico;
    }

    @Basic
    @Column(name = "HOMOSIGLA")
    public String getHomosigla() {
        return homosigla;
    }

    public void setHomosigla(String homosigla) {
        this.homosigla = homosigla;
    }

    @Basic
    @Column(name = "CLAVE911")
    public String getClave911() {
        return clave911;
    }

    public void setClave911(String clave911) {
        this.clave911 = clave911;
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
    @Column(name = "ID_MODALIDAD")
    public Integer getIdModalidad() {
        return idModalidad;
    }

    public void setIdModalidad(Integer idModalidad) {
        this.idModalidad = idModalidad;
    }

    @Basic
    @Column(name = "CLAVE_DGP")
    public String getClaveDgp() {
        return claveDgp;
    }

    public void setClaveDgp(String claveDgp) {
        this.claveDgp = claveDgp;
    }

    @Basic
    @Column(name = "NOM_PROGACADEMICO_DGP")
    public String getNomProgacademicoDgp() {
        return nomProgacademicoDgp;
    }

    public void setNomProgacademicoDgp(String nomProgacademicoDgp) {
        this.nomProgacademicoDgp = nomProgacademicoDgp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SigaaCatCarrera that = (SigaaCatCarrera) o;
        return idCarrera == that.idCarrera &&
                Objects.equals(nomProgacademico, that.nomProgacademico) &&
                Objects.equals(homosigla, that.homosigla) &&
                Objects.equals(clave911, that.clave911) &&
                Objects.equals(estatus, that.estatus) &&
                Objects.equals(idModalidad, that.idModalidad) &&
                Objects.equals(claveDgp, that.claveDgp) &&
                Objects.equals(nomProgacademicoDgp, that.nomProgacademicoDgp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCarrera, nomProgacademico, homosigla, clave911, estatus, idModalidad, claveDgp, nomProgacademicoDgp);
    }

    @OneToMany(mappedBy = "sigaaCatCarreraByIdCarrera")
    public List<ConvocatoriaCarrera> getConvocatoriaCarrerasByIdCarrera() {
        return convocatoriaCarrerasByIdCarrera;
    }

    public void setConvocatoriaCarrerasByIdCarrera(List<ConvocatoriaCarrera> convocatoriaCarrerasByIdCarrera) {
        this.convocatoriaCarrerasByIdCarrera = convocatoriaCarrerasByIdCarrera;
    }

    @OneToMany(mappedBy = "sigaaCatCarreraByIdCarrera")
    public List<SigaaCarreraAsignatura> getSigaaCarreraAsignaturasByIdCarrera() {
        return sigaaCarreraAsignaturasByIdCarrera;
    }

    public void setSigaaCarreraAsignaturasByIdCarrera(List<SigaaCarreraAsignatura> sigaaCarreraAsignaturasByIdCarrera) {
        this.sigaaCarreraAsignaturasByIdCarrera = sigaaCarreraAsignaturasByIdCarrera;
    }

    @OneToMany(mappedBy = "sigaaCatCarreraByIdCarrera")
    public List<SigaaCarreraAsignaturaCuatricero> getSigaaCarreraAsignaturaCuatricerosByIdCarrera() {
        return sigaaCarreraAsignaturaCuatricerosByIdCarrera;
    }

    public void setSigaaCarreraAsignaturaCuatricerosByIdCarrera(List<SigaaCarreraAsignaturaCuatricero> sigaaCarreraAsignaturaCuatricerosByIdCarrera) {
        this.sigaaCarreraAsignaturaCuatricerosByIdCarrera = sigaaCarreraAsignaturaCuatricerosByIdCarrera;
    }

    @OneToMany(mappedBy = "sigaaCatCarreraByIdCarrera")
    public List<SigaaCatAlumnoModificaso> getSigaaCatAlumnoModificasosByIdCarrera() {
        return sigaaCatAlumnoModificasosByIdCarrera;
    }

    public void setSigaaCatAlumnoModificasosByIdCarrera(List<SigaaCatAlumnoModificaso> sigaaCatAlumnoModificasosByIdCarrera) {
        this.sigaaCatAlumnoModificasosByIdCarrera = sigaaCatAlumnoModificasosByIdCarrera;
    }

    @OneToMany(mappedBy = "sigaaCatCarreraByIdCarrera")
    public List<SigaaCatAsesoresAcademicos> getSigaaCatAsesoresAcademicosByIdCarrera() {
        return sigaaCatAsesoresAcademicosByIdCarrera;
    }

    public void setSigaaCatAsesoresAcademicosByIdCarrera(List<SigaaCatAsesoresAcademicos> sigaaCatAsesoresAcademicosByIdCarrera) {
        this.sigaaCatAsesoresAcademicosByIdCarrera = sigaaCatAsesoresAcademicosByIdCarrera;
    }

    @OneToMany(mappedBy = "sigaaCatCarreraByOp1")
    public List<SigaaCatAspirante> getSigaaCatAspirantesByIdCarrera() {
        return sigaaCatAspirantesByIdCarrera;
    }

    public void setSigaaCatAspirantesByIdCarrera(List<SigaaCatAspirante> sigaaCatAspirantesByIdCarrera) {
        this.sigaaCatAspirantesByIdCarrera = sigaaCatAspirantesByIdCarrera;
    }

    @OneToMany(mappedBy = "sigaaCatCarreraByOp2")
    public List<SigaaCatAspirante> getSigaaCatAspirantesByIdCarrera_0() {
        return sigaaCatAspirantesByIdCarrera_0;
    }

    public void setSigaaCatAspirantesByIdCarrera_0(List<SigaaCatAspirante> sigaaCatAspirantesByIdCarrera_0) {
        this.sigaaCatAspirantesByIdCarrera_0 = sigaaCatAspirantesByIdCarrera_0;
    }

    @OneToMany(mappedBy = "sigaaCatCarreraByOp1")
    public List<SigaaCatAspirantePosgrado> getSigaaCatAspirantePosgradosByIdCarrera() {
        return sigaaCatAspirantePosgradosByIdCarrera;
    }

    public void setSigaaCatAspirantePosgradosByIdCarrera(List<SigaaCatAspirantePosgrado> sigaaCatAspirantePosgradosByIdCarrera) {
        this.sigaaCatAspirantePosgradosByIdCarrera = sigaaCatAspirantePosgradosByIdCarrera;
    }

    @OneToMany(mappedBy = "sigaaCatCarreraByOp2")
    public List<SigaaCatAspirantePosgrado> getSigaaCatAspirantePosgradosByIdCarrera_0() {
        return sigaaCatAspirantePosgradosByIdCarrera_0;
    }

    public void setSigaaCatAspirantePosgradosByIdCarrera_0(List<SigaaCatAspirantePosgrado> sigaaCatAspirantePosgradosByIdCarrera_0) {
        this.sigaaCatAspirantePosgradosByIdCarrera_0 = sigaaCatAspirantePosgradosByIdCarrera_0;
    }

    @ManyToOne
    @JoinColumn(name = "ID_MODALIDAD", referencedColumnName = "ID_MODALIDAD", insertable = false, updatable = false)
    public SigaaCatModalidad getSigaaCatModalidadByIdModalidad() {
        return sigaaCatModalidadByIdModalidad;
    }

    public void setSigaaCatModalidadByIdModalidad(SigaaCatModalidad sigaaCatModalidadByIdModalidad) {
        this.sigaaCatModalidadByIdModalidad = sigaaCatModalidadByIdModalidad;
    }

    @OneToMany(mappedBy = "sigaaCatCarreraByIdCarrera")
    public List<SigaaCatCoordinadorIngenieria> getSigaaCatCoordinadorIngenieriasByIdCarrera() {
        return sigaaCatCoordinadorIngenieriasByIdCarrera;
    }

    public void setSigaaCatCoordinadorIngenieriasByIdCarrera(List<SigaaCatCoordinadorIngenieria> sigaaCatCoordinadorIngenieriasByIdCarrera) {
        this.sigaaCatCoordinadorIngenieriasByIdCarrera = sigaaCatCoordinadorIngenieriasByIdCarrera;
    }

    @OneToMany(mappedBy = "sigaaCatCarreraByIdCarrera")
    public List<SigaaCatGrupo> getSigaaCatGruposByIdCarrera() {
        return sigaaCatGruposByIdCarrera;
    }

    public void setSigaaCatGruposByIdCarrera(List<SigaaCatGrupo> sigaaCatGruposByIdCarrera) {
        this.sigaaCatGruposByIdCarrera = sigaaCatGruposByIdCarrera;
    }

    @OneToMany(mappedBy = "sigaaCatCarreraByIdCarrera")
    public List<SigaaCatGrupoCuatrimestreCero> getSigaaCatGrupoCuatrimestreCerosByIdCarrera() {
        return sigaaCatGrupoCuatrimestreCerosByIdCarrera;
    }

    public void setSigaaCatGrupoCuatrimestreCerosByIdCarrera(List<SigaaCatGrupoCuatrimestreCero> sigaaCatGrupoCuatrimestreCerosByIdCarrera) {
        this.sigaaCatGrupoCuatrimestreCerosByIdCarrera = sigaaCatGrupoCuatrimestreCerosByIdCarrera;
    }

    @OneToMany(mappedBy = "sigaaCatCarreraByIdCarrera")
    public List<SigaaCatPlanestudio> getSigaaCatPlanestudiosByIdCarrera() {
        return sigaaCatPlanestudiosByIdCarrera;
    }

    public void setSigaaCatPlanestudiosByIdCarrera(List<SigaaCatPlanestudio> sigaaCatPlanestudiosByIdCarrera) {
        this.sigaaCatPlanestudiosByIdCarrera = sigaaCatPlanestudiosByIdCarrera;
    }

    @OneToMany(mappedBy = "sigaaCatCarreraByIdCarrera")
    public List<SigaaCohorteGenerado> getSigaaCohorteGeneradosByIdCarrera() {
        return sigaaCohorteGeneradosByIdCarrera;
    }

    public void setSigaaCohorteGeneradosByIdCarrera(List<SigaaCohorteGenerado> sigaaCohorteGeneradosByIdCarrera) {
        this.sigaaCohorteGeneradosByIdCarrera = sigaaCohorteGeneradosByIdCarrera;
    }
}
