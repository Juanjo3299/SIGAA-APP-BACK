package com.api.sigaa.app.model.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "SIGAA_CARRERA_ASIGNATURA_CUATRICERO", schema = "dbo", catalog = "SIGAA")
public class SigaaCarreraAsignaturaCuatricero {
    private int idCarreraAsignatura;
    private int idCarrera;
    private int idAsignatura;
    private SigaaCatCarrera sigaaCatCarreraByIdCarrera;
    private SigaaCatAsignaturaCuatricero sigaaCatAsignaturaCuatriceroByIdAsignatura;

    @Id
    @Column(name = "ID_CARRERA_ASIGNATURA")
    public int getIdCarreraAsignatura() {
        return idCarreraAsignatura;
    }

    public void setIdCarreraAsignatura(int idCarreraAsignatura) {
        this.idCarreraAsignatura = idCarreraAsignatura;
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
    @Column(name = "ID_ASIGNATURA")
    public int getIdAsignatura() {
        return idAsignatura;
    }

    public void setIdAsignatura(int idAsignatura) {
        this.idAsignatura = idAsignatura;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SigaaCarreraAsignaturaCuatricero that = (SigaaCarreraAsignaturaCuatricero) o;
        return idCarreraAsignatura == that.idCarreraAsignatura &&
                idCarrera == that.idCarrera &&
                idAsignatura == that.idAsignatura;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCarreraAsignatura, idCarrera, idAsignatura);
    }

    @ManyToOne
    @JoinColumn(name = "ID_CARRERA", referencedColumnName = "ID_CARRERA", nullable = false, insertable = false, updatable = false)
    public SigaaCatCarrera getSigaaCatCarreraByIdCarrera() {
        return sigaaCatCarreraByIdCarrera;
    }

    public void setSigaaCatCarreraByIdCarrera(SigaaCatCarrera sigaaCatCarreraByIdCarrera) {
        this.sigaaCatCarreraByIdCarrera = sigaaCatCarreraByIdCarrera;
    }

    @ManyToOne
    @JoinColumn(name = "ID_ASIGNATURA", referencedColumnName = "ID_ASIGNATURA", nullable = false, insertable = false, updatable = false)
    public SigaaCatAsignaturaCuatricero getSigaaCatAsignaturaCuatriceroByIdAsignatura() {
        return sigaaCatAsignaturaCuatriceroByIdAsignatura;
    }

    public void setSigaaCatAsignaturaCuatriceroByIdAsignatura(SigaaCatAsignaturaCuatricero sigaaCatAsignaturaCuatriceroByIdAsignatura) {
        this.sigaaCatAsignaturaCuatriceroByIdAsignatura = sigaaCatAsignaturaCuatriceroByIdAsignatura;
    }
}
