package com.api.sigaa.app.model.entity;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "SIGAA_CAT_TIPOGRUPO", schema = "dbo", catalog = "SIGAA")
public class SigaaCatTipogrupo {
    private int idTipogrupo;
    private String descripcion;
    private String estatus;
    private List<SigaaCatGrupo> sigaaCatGruposByIdTipogrupo;
    private List<SigaaCatGrupoCuatrimestreCero> sigaaCatGrupoCuatrimestreCerosByIdTipogrupo;

    @Id
    @Column(name = "ID_TIPOGRUPO")
    public int getIdTipogrupo() {
        return idTipogrupo;
    }

    public void setIdTipogrupo(int idTipogrupo) {
        this.idTipogrupo = idTipogrupo;
    }

    @Basic
    @Column(name = "DESCRIPCION")
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Basic
    @Column(name = "ESTATUS")
    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SigaaCatTipogrupo that = (SigaaCatTipogrupo) o;
        return idTipogrupo == that.idTipogrupo &&
                Objects.equals(descripcion, that.descripcion) &&
                Objects.equals(estatus, that.estatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idTipogrupo, descripcion, estatus);
    }

    @OneToMany(mappedBy = "sigaaCatTipogrupoByIdTipogrupo")
    public List<SigaaCatGrupo> getSigaaCatGruposByIdTipogrupo() {
        return sigaaCatGruposByIdTipogrupo;
    }

    public void setSigaaCatGruposByIdTipogrupo(List<SigaaCatGrupo> sigaaCatGruposByIdTipogrupo) {
        this.sigaaCatGruposByIdTipogrupo = sigaaCatGruposByIdTipogrupo;
    }

    @OneToMany(mappedBy = "sigaaCatTipogrupoByIdTipogrupo")
    public List<SigaaCatGrupoCuatrimestreCero> getSigaaCatGrupoCuatrimestreCerosByIdTipogrupo() {
        return sigaaCatGrupoCuatrimestreCerosByIdTipogrupo;
    }

    public void setSigaaCatGrupoCuatrimestreCerosByIdTipogrupo(List<SigaaCatGrupoCuatrimestreCero> sigaaCatGrupoCuatrimestreCerosByIdTipogrupo) {
        this.sigaaCatGrupoCuatrimestreCerosByIdTipogrupo = sigaaCatGrupoCuatrimestreCerosByIdTipogrupo;
    }
}
