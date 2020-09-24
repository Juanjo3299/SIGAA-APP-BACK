package com.api.sigaa.app.model.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "SIGAA_EXTRAORDINARIO", schema = "dbo", catalog = "SIGAA")
@IdClass(SigaaExtraordinarioPK.class)
public class SigaaExtraordinario {
    private int folio;
    private int idGrupo;
    private SigaaDetPagosAlumno sigaaDetPagosAlumnoByFolio;
    private SigaaCatGrupo sigaaCatGrupoByIdGrupo;

    @Id
    @Column(name = "FOLIO")
    public int getFolio() {
        return folio;
    }

    public void setFolio(int folio) {
        this.folio = folio;
    }

    @Id
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
        SigaaExtraordinario that = (SigaaExtraordinario) o;
        return folio == that.folio &&
                idGrupo == that.idGrupo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(folio, idGrupo);
    }

    @ManyToOne
    @JoinColumn(name = "FOLIO", referencedColumnName = "CNS", nullable = false, insertable = false, updatable = false)
    public SigaaDetPagosAlumno getSigaaDetPagosAlumnoByFolio() {
        return sigaaDetPagosAlumnoByFolio;
    }

    public void setSigaaDetPagosAlumnoByFolio(SigaaDetPagosAlumno sigaaDetPagosAlumnoByFolio) {
        this.sigaaDetPagosAlumnoByFolio = sigaaDetPagosAlumnoByFolio;
    }

    @ManyToOne
    @JoinColumn(name = "ID_GRUPO", referencedColumnName = "ID_GRUPO", nullable = false, insertable = false, updatable = false)
    public SigaaCatGrupo getSigaaCatGrupoByIdGrupo() {
        return sigaaCatGrupoByIdGrupo;
    }

    public void setSigaaCatGrupoByIdGrupo(SigaaCatGrupo sigaaCatGrupoByIdGrupo) {
        this.sigaaCatGrupoByIdGrupo = sigaaCatGrupoByIdGrupo;
    }
}
