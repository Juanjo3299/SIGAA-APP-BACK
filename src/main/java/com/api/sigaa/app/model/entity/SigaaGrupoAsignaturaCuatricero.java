package com.api.sigaa.app.model.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "SIGAA_GRUPO_ASIGNATURA_CUATRICERO", schema = "dbo", catalog = "SIGAA")
public class SigaaGrupoAsignaturaCuatricero {
    private int idGrupoAsignatura;
    private Integer idGrupoCuatricero;
    private Integer idAsignaturaCuatricero;
    private SigaaCatGrupoCuatrimestreCero sigaaCatGrupoCuatrimestreCeroByIdGrupoCuatricero;
    private SigaaCatAsignaturaCuatricero sigaaCatAsignaturaCuatriceroByIdAsignaturaCuatricero;

    @Id
    @Column(name = "ID_GRUPO_ASIGNATURA")
    public int getIdGrupoAsignatura() {
        return idGrupoAsignatura;
    }

    public void setIdGrupoAsignatura(int idGrupoAsignatura) {
        this.idGrupoAsignatura = idGrupoAsignatura;
    }

    @Basic
    @Column(name = "ID_GRUPO_CUATRICERO")
    public Integer getIdGrupoCuatricero() {
        return idGrupoCuatricero;
    }

    public void setIdGrupoCuatricero(Integer idGrupoCuatricero) {
        this.idGrupoCuatricero = idGrupoCuatricero;
    }

    @Basic
    @Column(name = "ID_ASIGNATURA_CUATRICERO")
    public Integer getIdAsignaturaCuatricero() {
        return idAsignaturaCuatricero;
    }

    public void setIdAsignaturaCuatricero(Integer idAsignaturaCuatricero) {
        this.idAsignaturaCuatricero = idAsignaturaCuatricero;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SigaaGrupoAsignaturaCuatricero that = (SigaaGrupoAsignaturaCuatricero) o;
        return idGrupoAsignatura == that.idGrupoAsignatura &&
                Objects.equals(idGrupoCuatricero, that.idGrupoCuatricero) &&
                Objects.equals(idAsignaturaCuatricero, that.idAsignaturaCuatricero);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idGrupoAsignatura, idGrupoCuatricero, idAsignaturaCuatricero);
    }

    @ManyToOne
    @JoinColumn(name = "ID_GRUPO_CUATRICERO", referencedColumnName = "ID_GRUPO", insertable = false, updatable = false)
    public SigaaCatGrupoCuatrimestreCero getSigaaCatGrupoCuatrimestreCeroByIdGrupoCuatricero() {
        return sigaaCatGrupoCuatrimestreCeroByIdGrupoCuatricero;
    }

    public void setSigaaCatGrupoCuatrimestreCeroByIdGrupoCuatricero(SigaaCatGrupoCuatrimestreCero sigaaCatGrupoCuatrimestreCeroByIdGrupoCuatricero) {
        this.sigaaCatGrupoCuatrimestreCeroByIdGrupoCuatricero = sigaaCatGrupoCuatrimestreCeroByIdGrupoCuatricero;
    }

    @ManyToOne
    @JoinColumn(name = "ID_ASIGNATURA_CUATRICERO", referencedColumnName = "ID_ASIGNATURA", insertable = false, updatable = false)
    public SigaaCatAsignaturaCuatricero getSigaaCatAsignaturaCuatriceroByIdAsignaturaCuatricero() {
        return sigaaCatAsignaturaCuatriceroByIdAsignaturaCuatricero;
    }

    public void setSigaaCatAsignaturaCuatriceroByIdAsignaturaCuatricero(SigaaCatAsignaturaCuatricero sigaaCatAsignaturaCuatriceroByIdAsignaturaCuatricero) {
        this.sigaaCatAsignaturaCuatriceroByIdAsignaturaCuatricero = sigaaCatAsignaturaCuatriceroByIdAsignaturaCuatricero;
    }
}
