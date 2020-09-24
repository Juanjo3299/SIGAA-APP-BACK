package com.api.sigaa.app.model.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class SigaaExtraordinarioPK implements Serializable {
    private int folio;
    private int idGrupo;

    @Column(name = "FOLIO")
    @Id
    public int getFolio() {
        return folio;
    }

    public void setFolio(int folio) {
        this.folio = folio;
    }

    @Column(name = "ID_GRUPO")
    @Id
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
        SigaaExtraordinarioPK that = (SigaaExtraordinarioPK) o;
        return folio == that.folio &&
                idGrupo == that.idGrupo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(folio, idGrupo);
    }
}
