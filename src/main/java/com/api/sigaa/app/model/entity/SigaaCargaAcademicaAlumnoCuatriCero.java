package com.api.sigaa.app.model.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "SIGAA_CARGA_ACADEMICA_ALUMNO_CUATRI_CERO", schema = "dbo", catalog = "SIGAA")
public class SigaaCargaAcademicaAlumnoCuatriCero {
    private int id;
    private int folio;
    private int idAsignatura;
    private int idGrupo;
    private SigaaCatAspirante sigaaCatAspiranteByFolio;
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
    @Column(name = "FOLIO")
    public int getFolio() {
        return folio;
    }

    public void setFolio(int folio) {
        this.folio = folio;
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
        SigaaCargaAcademicaAlumnoCuatriCero that = (SigaaCargaAcademicaAlumnoCuatriCero) o;
        return id == that.id &&
                folio == that.folio &&
                idAsignatura == that.idAsignatura &&
                idGrupo == that.idGrupo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, folio, idAsignatura, idGrupo);
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
