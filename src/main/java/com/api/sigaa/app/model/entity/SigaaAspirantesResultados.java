package com.api.sigaa.app.model.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "SIGAA_ASPIRANTES_RESULTADOS", schema = "dbo", catalog = "SIGAA")
public class SigaaAspirantesResultados {
    private int idResultado;
    private int folio;
    private String estatus;
    private Integer puntaje;
    private String cuatrimestre;
    private int matricula;
    private SigaaCatAspirante sigaaCatAspiranteByFolio;

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
    public Integer getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(Integer puntaje) {
        this.puntaje = puntaje;
    }

    @Basic
    @Column(name = "CUATRIMESTRE")
    public String getCuatrimestre() {
        return cuatrimestre;
    }

    public void setCuatrimestre(String cuatrimestre) {
        this.cuatrimestre = cuatrimestre;
    }

    @Basic
    @Column(name = "MATRICULA")
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SigaaAspirantesResultados that = (SigaaAspirantesResultados) o;
        return idResultado == that.idResultado &&
                folio == that.folio &&
                matricula == that.matricula &&
                Objects.equals(estatus, that.estatus) &&
                Objects.equals(puntaje, that.puntaje) &&
                Objects.equals(cuatrimestre, that.cuatrimestre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idResultado, folio, estatus, puntaje, cuatrimestre, matricula);
    }

    @ManyToOne
    @JoinColumn(name = "FOLIO", referencedColumnName = "FOLIO", nullable = false, insertable = false, updatable = false)
    public SigaaCatAspirante getSigaaCatAspiranteByFolio() {
        return sigaaCatAspiranteByFolio;
    }

    public void setSigaaCatAspiranteByFolio(SigaaCatAspirante sigaaCatAspiranteByFolio) {
        this.sigaaCatAspiranteByFolio = sigaaCatAspiranteByFolio;
    }
}
