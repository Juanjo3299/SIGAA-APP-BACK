package com.api.sigaa.app.model.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "CONVOCATORIA_CARRERA_POSGRADO", schema = "dbo", catalog = "SIGAA")
public class ConvocatoriaCarreraPosgrado {
    private int idConvocatoriaCarrera;
    private int idPeriodo;
    private int idCarrera;
    private SigaaCatPeriodoConvocatoriaposgrado sigaaCatPeriodoConvocatoriaposgradoByIdPeriodo;
    private SigaaCatPeriodoConvocatoriaposgrado sigaaCatPeriodoConvocatoriaposgradoByIdPeriodo_0;

    @Id
    @Column(name = "ID_CONVOCATORIA_CARRERA")
    public int getIdConvocatoriaCarrera() {
        return idConvocatoriaCarrera;
    }

    public void setIdConvocatoriaCarrera(int idConvocatoriaCarrera) {
        this.idConvocatoriaCarrera = idConvocatoriaCarrera;
    }

    @Basic
    @Column(name = "ID_PERIODO")
    public int getIdPeriodo() {
        return idPeriodo;
    }

    public void setIdPeriodo(int idPeriodo) {
        this.idPeriodo = idPeriodo;
    }

    @Basic
    @Column(name = "ID_CARRERA")
    public int getIdCarrera() {
        return idCarrera;
    }

    public void setIdCarrera(int idCarrera) {
        this.idCarrera = idCarrera;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ConvocatoriaCarreraPosgrado that = (ConvocatoriaCarreraPosgrado) o;
        return idConvocatoriaCarrera == that.idConvocatoriaCarrera &&
                idPeriodo == that.idPeriodo &&
                idCarrera == that.idCarrera;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idConvocatoriaCarrera, idPeriodo, idCarrera);
    }

    @ManyToOne
    @JoinColumn(name = "ID_PERIODO", referencedColumnName = "ID_PERIODO", nullable = false, insertable = false, updatable = false)
    public SigaaCatPeriodoConvocatoriaposgrado getSigaaCatPeriodoConvocatoriaposgradoByIdPeriodo() {
        return sigaaCatPeriodoConvocatoriaposgradoByIdPeriodo;
    }

    public void setSigaaCatPeriodoConvocatoriaposgradoByIdPeriodo(SigaaCatPeriodoConvocatoriaposgrado sigaaCatPeriodoConvocatoriaposgradoByIdPeriodo) {
        this.sigaaCatPeriodoConvocatoriaposgradoByIdPeriodo = sigaaCatPeriodoConvocatoriaposgradoByIdPeriodo;
    }

    @ManyToOne
    @JoinColumn(name = "ID_PERIODO", referencedColumnName = "ID_PERIODO", nullable = false, insertable = false, updatable = false)
    public SigaaCatPeriodoConvocatoriaposgrado getSigaaCatPeriodoConvocatoriaposgradoByIdPeriodo_0() {
        return sigaaCatPeriodoConvocatoriaposgradoByIdPeriodo_0;
    }

    public void setSigaaCatPeriodoConvocatoriaposgradoByIdPeriodo_0(SigaaCatPeriodoConvocatoriaposgrado sigaaCatPeriodoConvocatoriaposgradoByIdPeriodo_0) {
        this.sigaaCatPeriodoConvocatoriaposgradoByIdPeriodo_0 = sigaaCatPeriodoConvocatoriaposgradoByIdPeriodo_0;
    }
}
