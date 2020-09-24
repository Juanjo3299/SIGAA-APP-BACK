package com.api.sigaa.app.model.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "SIGAA_CARRERA_ASIGNATURA", schema = "dbo", catalog = "SIGAA")
public class SigaaCarreraAsignatura {
    private int idCarreraAsignatura;
    private Integer idCarrera;
    private Integer idAsignatura;
    private SigaaCatCarrera sigaaCatCarreraByIdCarrera;
    private SigaaCatAsignatura sigaaCatAsignaturaByIdAsignatura;

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
    public Integer getIdCarrera() {
        return idCarrera;
    }

    public void setIdCarrera(Integer idCarrera) {
        this.idCarrera = idCarrera;
    }

    @Basic
    @Column(name = "ID_ASIGNATURA")
    public Integer getIdAsignatura() {
        return idAsignatura;
    }

    public void setIdAsignatura(Integer idAsignatura) {
        this.idAsignatura = idAsignatura;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SigaaCarreraAsignatura that = (SigaaCarreraAsignatura) o;
        return idCarreraAsignatura == that.idCarreraAsignatura &&
                Objects.equals(idCarrera, that.idCarrera) &&
                Objects.equals(idAsignatura, that.idAsignatura);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCarreraAsignatura, idCarrera, idAsignatura);
    }

    @ManyToOne
    @JoinColumn(name = "ID_CARRERA", referencedColumnName = "ID_CARRERA", insertable = false, updatable = false)
    public SigaaCatCarrera getSigaaCatCarreraByIdCarrera() {
        return sigaaCatCarreraByIdCarrera;
    }

    public void setSigaaCatCarreraByIdCarrera(SigaaCatCarrera sigaaCatCarreraByIdCarrera) {
        this.sigaaCatCarreraByIdCarrera = sigaaCatCarreraByIdCarrera;
    }

    @ManyToOne
    @JoinColumn(name = "ID_ASIGNATURA", referencedColumnName = "ID_ASIGNATURA", insertable = false, updatable = false)
    public SigaaCatAsignatura getSigaaCatAsignaturaByIdAsignatura() {
        return sigaaCatAsignaturaByIdAsignatura;
    }

    public void setSigaaCatAsignaturaByIdAsignatura(SigaaCatAsignatura sigaaCatAsignaturaByIdAsignatura) {
        this.sigaaCatAsignaturaByIdAsignatura = sigaaCatAsignaturaByIdAsignatura;
    }
}
