package com.api.sigaa.app.model.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "SIGAA_CARGA_ACADEMICA_DOCENTE_CUATRI_CERO", schema = "dbo", catalog = "SIGAA")
public class SigaaCargaAcademicaDocenteCuatriCero {
    private int id;
    private int idDocente;
    private int idAsignatura;
    private int idGrupo;
    private SigaaCatDocente sigaaCatDocenteByIdDocente;
    private SigaaCatAsignaturaCuatricero sigaaCatAsignaturaCuatriceroByIdAsignatura;
    private SigaaCatGrupoCuatrimestreCero sigaaCatGrupoCuatrimestreCeroByIdGrupo;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "ID_DOCENTE")
    public int getIdDocente() {
        return idDocente;
    }

    public void setIdDocente(int idDocente) {
        this.idDocente = idDocente;
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
    @Column(name = "ID_GRUPO")
    public int getIdGrupo() {
        return idGrupo;
    }

    public void setIdGrupo(int idGrupo) {
        this.idGrupo = idGrupo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SigaaCargaAcademicaDocenteCuatriCero that = (SigaaCargaAcademicaDocenteCuatriCero) o;
        return id == that.id &&
                idDocente == that.idDocente &&
                idAsignatura == that.idAsignatura &&
                idGrupo == that.idGrupo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, idDocente, idAsignatura, idGrupo);
    }

    @ManyToOne
    @JoinColumn(name = "ID_DOCENTE", referencedColumnName = "ID_DOCENTE", nullable = false, insertable = false, updatable = false)
    public SigaaCatDocente getSigaaCatDocenteByIdDocente() {
        return sigaaCatDocenteByIdDocente;
    }

    public void setSigaaCatDocenteByIdDocente(SigaaCatDocente sigaaCatDocenteByIdDocente) {
        this.sigaaCatDocenteByIdDocente = sigaaCatDocenteByIdDocente;
    }

    @ManyToOne
    @JoinColumn(name = "ID_ASIGNATURA", referencedColumnName = "ID_ASIGNATURA", nullable = false, insertable = false, updatable = false)
    public SigaaCatAsignaturaCuatricero getSigaaCatAsignaturaCuatriceroByIdAsignatura() {
        return sigaaCatAsignaturaCuatriceroByIdAsignatura;
    }

    public void setSigaaCatAsignaturaCuatriceroByIdAsignatura(SigaaCatAsignaturaCuatricero sigaaCatAsignaturaCuatriceroByIdAsignatura) {
        this.sigaaCatAsignaturaCuatriceroByIdAsignatura = sigaaCatAsignaturaCuatriceroByIdAsignatura;
    }

    @ManyToOne
    @JoinColumn(name = "ID_GRUPO", referencedColumnName = "ID_GRUPO", nullable = false, insertable = false, updatable = false)
    public SigaaCatGrupoCuatrimestreCero getSigaaCatGrupoCuatrimestreCeroByIdGrupo() {
        return sigaaCatGrupoCuatrimestreCeroByIdGrupo;
    }

    public void setSigaaCatGrupoCuatrimestreCeroByIdGrupo(SigaaCatGrupoCuatrimestreCero sigaaCatGrupoCuatrimestreCeroByIdGrupo) {
        this.sigaaCatGrupoCuatrimestreCeroByIdGrupo = sigaaCatGrupoCuatrimestreCeroByIdGrupo;
    }
}
