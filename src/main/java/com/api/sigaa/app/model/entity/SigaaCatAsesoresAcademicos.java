package com.api.sigaa.app.model.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "SIGAA_CAT_ASESORES_ACADEMICOS", schema = "dbo", catalog = "SIGAA")
public class SigaaCatAsesoresAcademicos {
    private int idAsesor;
    private int idDocente;
    private int idPeriodoEstancias;
    private int idCarrera;
    private int estatus;
    private SigaaCatDocente sigaaCatDocenteByIdDocente;
    private SigaaCatPeriodoEstancias sigaaCatPeriodoEstanciasByIdPeriodoEstancias;
    private SigaaCatCarrera sigaaCatCarreraByIdCarrera;

    @Id
    @Column(name = "ID_ASESOR")
    public int getIdAsesor() {
        return idAsesor;
    }

    public void setIdAsesor(int idAsesor) {
        this.idAsesor = idAsesor;
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
    @Column(name = "ID_PERIODO_ESTANCIAS")
    public int getIdPeriodoEstancias() {
        return idPeriodoEstancias;
    }

    public void setIdPeriodoEstancias(int idPeriodoEstancias) {
        this.idPeriodoEstancias = idPeriodoEstancias;
    }

    @Basic
    @Column(name = "ID_CARRERA")
    public int getIdCarrera() {
        return idCarrera;
    }

    public void setIdCarrera(int idCarrera) {
        this.idCarrera = idCarrera;
    }

    @Basic
    @Column(name = "ESTATUS")
    public int getEstatus() {
        return estatus;
    }

    public void setEstatus(int estatus) {
        this.estatus = estatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SigaaCatAsesoresAcademicos that = (SigaaCatAsesoresAcademicos) o;
        return idAsesor == that.idAsesor &&
                idDocente == that.idDocente &&
                idPeriodoEstancias == that.idPeriodoEstancias &&
                idCarrera == that.idCarrera &&
                estatus == that.estatus;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idAsesor, idDocente, idPeriodoEstancias, idCarrera, estatus);
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
    @JoinColumn(name = "ID_PERIODO_ESTANCIAS", referencedColumnName = "ID_PERIODO_ESTANCIAS", nullable = false, insertable = false, updatable = false)
    public SigaaCatPeriodoEstancias getSigaaCatPeriodoEstanciasByIdPeriodoEstancias() {
        return sigaaCatPeriodoEstanciasByIdPeriodoEstancias;
    }

    public void setSigaaCatPeriodoEstanciasByIdPeriodoEstancias(SigaaCatPeriodoEstancias sigaaCatPeriodoEstanciasByIdPeriodoEstancias) {
        this.sigaaCatPeriodoEstanciasByIdPeriodoEstancias = sigaaCatPeriodoEstanciasByIdPeriodoEstancias;
    }

    @ManyToOne
    @JoinColumn(name = "ID_CARRERA", referencedColumnName = "ID_CARRERA", nullable = false, insertable = false, updatable = false)
    public SigaaCatCarrera getSigaaCatCarreraByIdCarrera() {
        return sigaaCatCarreraByIdCarrera;
    }

    public void setSigaaCatCarreraByIdCarrera(SigaaCatCarrera sigaaCatCarreraByIdCarrera) {
        this.sigaaCatCarreraByIdCarrera = sigaaCatCarreraByIdCarrera;
    }
}
