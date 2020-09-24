package com.api.sigaa.app.model.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "SIGAA_DET_PAGOS_ASPIRANTE_POSGRADO", schema = "dbo", catalog = "SIGAA")
public class SigaaDetPagosAspirantePosgrado {
    private int cns;
    private int idPagosExternos;
    private int folio;
    private String folioCon;
    private String estatus;
    private SigaaCatPagosExternos sigaaCatPagosExternosByIdPagosExternos;
    private SigaaCatAspirantePosgrado sigaaCatAspirantePosgradoByFolio;

    @Id
    @Column(name = "CNS")
    public int getCns() {
        return cns;
    }

    public void setCns(int cns) {
        this.cns = cns;
    }

    @Basic
    @Column(name = "ID_PAGOS_EXTERNOS")
    public int getIdPagosExternos() {
        return idPagosExternos;
    }

    public void setIdPagosExternos(int idPagosExternos) {
        this.idPagosExternos = idPagosExternos;
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
    @Column(name = "FOLIO_CON")
    public String getFolioCon() {
        return folioCon;
    }

    public void setFolioCon(String folioCon) {
        this.folioCon = folioCon;
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
        SigaaDetPagosAspirantePosgrado that = (SigaaDetPagosAspirantePosgrado) o;
        return cns == that.cns &&
                idPagosExternos == that.idPagosExternos &&
                folio == that.folio &&
                Objects.equals(folioCon, that.folioCon) &&
                Objects.equals(estatus, that.estatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cns, idPagosExternos, folio, folioCon, estatus);
    }

    @ManyToOne
    @JoinColumn(name = "ID_PAGOS_EXTERNOS", referencedColumnName = "ID_PAGOS_EXTERNOS", nullable = false, insertable = false, updatable = false)
    public SigaaCatPagosExternos getSigaaCatPagosExternosByIdPagosExternos() {
        return sigaaCatPagosExternosByIdPagosExternos;
    }

    public void setSigaaCatPagosExternosByIdPagosExternos(SigaaCatPagosExternos sigaaCatPagosExternosByIdPagosExternos) {
        this.sigaaCatPagosExternosByIdPagosExternos = sigaaCatPagosExternosByIdPagosExternos;
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
