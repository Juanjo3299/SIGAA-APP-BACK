package com.api.sigaa.app.model.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "SIGAA_ASPIRANTES_POSGRADO_RESULTADOS", schema = "dbo", catalog = "SIGAA")
public class SigaaAspirantesPosgradoResultados {
    private int idResultado;
    private int folio;
    private String estatus;
    private int puntaje;
    private String estatusBeca;
    private SigaaCatAspirantePosgrado sigaaCatAspirantePosgradoByFolio;

    @Id
    @Column(name = "ID_RESULTADO")
    public int getIdResultado() {
        return idResultado;
    }

    public void setIdResultado(int idResultado) {
        this.idResultado = idResultado;
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
    @Column(name = "ESTATUS")
    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    @Basic
    @Column(name = "PUNTAJE")
    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    @Basic
    @Column(name = "ESTATUS_BECA")
    public String getEstatusBeca() {
        return estatusBeca;
    }

    public void setEstatusBeca(String estatusBeca) {
        this.estatusBeca = estatusBeca;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SigaaAspirantesPosgradoResultados that = (SigaaAspirantesPosgradoResultados) o;
        return idResultado == that.idResultado &&
                folio == that.folio &&
                puntaje == that.puntaje &&
                Objects.equals(estatus, that.estatus) &&
                Objects.equals(estatusBeca, that.estatusBeca);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idResultado, folio, estatus, puntaje, estatusBeca);
    }

    @ManyToOne
    @JoinColumn(name = "FOLIO", referencedColumnName = "FOLIO", nullable = false, insertable = false, updatable = false)
    public SigaaCatAspirantePosgrado getSigaaCatAspirantePosgradoByFolio() {
        return sigaaCatAspirantePosgradoByFolio;
    }

    public void setSigaaCatAspirantePosgradoByFolio(SigaaCatAspirantePosgrado sigaaCatAspirantePosgradoByFolio) {
        this.sigaaCatAspirantePosgradoByFolio = sigaaCatAspirantePosgradoByFolio;
    }
}
