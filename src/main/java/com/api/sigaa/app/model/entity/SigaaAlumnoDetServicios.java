package com.api.sigaa.app.model.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "SIGAA_ALUMNO_DET_SERVICIOS", schema = "dbo", catalog = "SIGAA")
public class SigaaAlumnoDetServicios {
    private int idSigaaAlumnoDetServicios;
    private Integer matricula;
    private Integer cnsDetServicios;
    private SigaaCatAlumno sigaaCatAlumnoByMatricula;
    private SigaaDetServicios sigaaDetServiciosByCnsDetServicios;

    @Id
    @Column(name = "ID_SIGAA_ALUMNO_DET_SERVICIOS")
    public int getIdSigaaAlumnoDetServicios() {
        return idSigaaAlumnoDetServicios;
    }

    public void setIdSigaaAlumnoDetServicios(int idSigaaAlumnoDetServicios) {
        this.idSigaaAlumnoDetServicios = idSigaaAlumnoDetServicios;
    }

    @Basic
    @Column(name = "MATRICULA")
    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    @Basic
    @Column(name = "CNS_DET_SERVICIOS")
    public Integer getCnsDetServicios() {
        return cnsDetServicios;
    }

    public void setCnsDetServicios(Integer cnsDetServicios) {
        this.cnsDetServicios = cnsDetServicios;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SigaaAlumnoDetServicios that = (SigaaAlumnoDetServicios) o;
        return idSigaaAlumnoDetServicios == that.idSigaaAlumnoDetServicios &&
                Objects.equals(matricula, that.matricula) &&
                Objects.equals(cnsDetServicios, that.cnsDetServicios);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idSigaaAlumnoDetServicios, matricula, cnsDetServicios);
    }

    @ManyToOne
    @JoinColumn(name = "MATRICULA", referencedColumnName = "MATRICULA", insertable = false, updatable = false)
    public SigaaCatAlumno getSigaaCatAlumnoByMatricula() {
        return sigaaCatAlumnoByMatricula;
    }

    public void setSigaaCatAlumnoByMatricula(SigaaCatAlumno sigaaCatAlumnoByMatricula) {
        this.sigaaCatAlumnoByMatricula = sigaaCatAlumnoByMatricula;
    }

    @ManyToOne
    @JoinColumn(name = "CNS_DET_SERVICIOS", referencedColumnName = "CNS", insertable = false, updatable = false)
    public SigaaDetServicios getSigaaDetServiciosByCnsDetServicios() {
        return sigaaDetServiciosByCnsDetServicios;
    }

    public void setSigaaDetServiciosByCnsDetServicios(SigaaDetServicios sigaaDetServiciosByCnsDetServicios) {
        this.sigaaDetServiciosByCnsDetServicios = sigaaDetServiciosByCnsDetServicios;
    }
}
