package com.api.sigaa.app.model.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "SIGAA_CAT_TIPO_PAGOS", schema = "dbo", catalog = "SIGAA")
public class SigaaCatTipoPagos {
    private int idTipoPagos;
    private String concepto;

    @Id
    @Column(name = "idTipoPagos")
    public int getIdTipoPagos() {
        return idTipoPagos;
    }

    public void setIdTipoPagos(int idTipoPagos) {
        this.idTipoPagos = idTipoPagos;
    }

    @Basic
    @Column(name = "concepto")
    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SigaaCatTipoPagos that = (SigaaCatTipoPagos) o;
        return idTipoPagos == that.idTipoPagos &&
                Objects.equals(concepto, that.concepto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idTipoPagos, concepto);
    }
}
