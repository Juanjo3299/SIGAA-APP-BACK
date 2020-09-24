package com.api.sigaa.app.model.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "SIGAA_GRUPO_ASIGNATURA", schema = "dbo", catalog = "SIGAA")
public class SigaaGrupoAsignatura {
    private int idGrupoAsignatura;
    private Integer idGrupo;
    private Integer idAsignatura;
    private SigaaCatGrupo sigaaCatGrupoByIdGrupo;
    private SigaaCatAsignatura sigaaCatAsignaturaByIdAsignatura;

    @Id
    @Column(name = "ID_GRUPO_ASIGNATURA")
    public int getIdGrupoAsignatura() {
        return idGrupoAsignatura;
    }

    public void setIdGrupoAsignatura(int idGrupoAsignatura) {
        this.idGrupoAsignatura = idGrupoAsignatura;
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
    @Column(name = "ID_ASIGNATURA")
    public Integer getIdAsignatura() {
        return idAsignatura;
    }

    public void setIdAsignatura(Integer idAsignatura) {
        this.idAsignatura = idAsignatura;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SigaaGrupoAsignatura that = (SigaaGrupoAsignatura) o;
        return idGrupoAsignatura == that.idGrupoAsignatura &&
                Objects.equals(idGrupo, that.idGrupo) &&
                Objects.equals(idAsignatura, that.idAsignatura);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idGrupoAsignatura, idGrupo, idAsignatura);
    }

    @ManyToOne
    @JoinColumn(name = "ID_GRUPO", referencedColumnName = "ID_GRUPO", insertable = false, updatable = false)
    public SigaaCatGrupo getSigaaCatGrupoByIdGrupo() {
        return sigaaCatGrupoByIdGrupo;
    }

    public void setSigaaCatGrupoByIdGrupo(SigaaCatGrupo sigaaCatGrupoByIdGrupo) {
        this.sigaaCatGrupoByIdGrupo = sigaaCatGrupoByIdGrupo;
    }

    @ManyToOne
    @JoinColumn(name = "ID_ASIGNATURA", referencedColumnName = "ID_ASIGNATURA", insertable = false, updatable = false)
    public SigaaCatAsignatura getSigaaCatAsignaturaByIdAsignatura() {
        return sigaaCatAsignaturaByIdAsignatura;
    }

    public void setSigaaCatAsignaturaByIdAsignatura(SigaaCatAsignatura sigaaCatAsignaturaByIdAsignatura) {
        this.sigaaCatAsignaturaByIdAsignatura = sigaaCatAsignaturaByIdAsignatura;
    }
}
