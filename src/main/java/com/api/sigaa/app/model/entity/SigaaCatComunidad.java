package com.api.sigaa.app.model.entity;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "SIGAA_CAT_COMUNIDAD", schema = "dbo", catalog = "SIGAA")
public class SigaaCatComunidad {
    private int idComunidad;
    private String nombreComunidad;
    private String estatus;
    private List<SigaaCatAlumno> sigaaCatAlumnosByIdComunidad;
    private List<SigaaCatAspirante> sigaaCatAspirantesByIdComunidad;
    private List<SigaaCatAspirantePosgrado> sigaaCatAspirantePosgradosByIdComunidad;
    private List<SigaaCatDocente> sigaaCatDocentesByIdComunidad;
    private List<SigaaCatTrabajadores> sigaaCatTrabajadoresByIdComunidad;

    @Id
    @Column(name = "ID_COMUNIDAD")
    public int getIdComunidad() {
        return idComunidad;
    }

    public void setIdComunidad(int idComunidad) {
        this.idComunidad = idComunidad;
    }

    @Basic
    @Column(name = "NOMBRE_COMUNIDAD")
    public String getNombreComunidad() {
        return nombreComunidad;
    }

    public void setNombreComunidad(String nombreComunidad) {
        this.nombreComunidad = nombreComunidad;
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
        SigaaCatComunidad that = (SigaaCatComunidad) o;
        return idComunidad == that.idComunidad &&
                Objects.equals(nombreComunidad, that.nombreComunidad) &&
                Objects.equals(estatus, that.estatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idComunidad, nombreComunidad, estatus);
    }

    @OneToMany(mappedBy = "sigaaCatComunidadByIdComunidad")
    public List<SigaaCatAlumno> getSigaaCatAlumnosByIdComunidad() {
        return sigaaCatAlumnosByIdComunidad;
    }

    public void setSigaaCatAlumnosByIdComunidad(List<SigaaCatAlumno> sigaaCatAlumnosByIdComunidad) {
        this.sigaaCatAlumnosByIdComunidad = sigaaCatAlumnosByIdComunidad;
    }

    @OneToMany(mappedBy = "sigaaCatComunidadByIdComunidadEtnica")
    public List<SigaaCatAspirante> getSigaaCatAspirantesByIdComunidad() {
        return sigaaCatAspirantesByIdComunidad;
    }

    public void setSigaaCatAspirantesByIdComunidad(List<SigaaCatAspirante> sigaaCatAspirantesByIdComunidad) {
        this.sigaaCatAspirantesByIdComunidad = sigaaCatAspirantesByIdComunidad;
    }

    @OneToMany(mappedBy = "sigaaCatComunidadByDetComunidad")
    public List<SigaaCatAspirantePosgrado> getSigaaCatAspirantePosgradosByIdComunidad() {
        return sigaaCatAspirantePosgradosByIdComunidad;
    }

    public void setSigaaCatAspirantePosgradosByIdComunidad(List<SigaaCatAspirantePosgrado> sigaaCatAspirantePosgradosByIdComunidad) {
        this.sigaaCatAspirantePosgradosByIdComunidad = sigaaCatAspirantePosgradosByIdComunidad;
    }

    @OneToMany(mappedBy = "sigaaCatComunidadByIdComunidad")
    public List<SigaaCatDocente> getSigaaCatDocentesByIdComunidad() {
        return sigaaCatDocentesByIdComunidad;
    }

    public void setSigaaCatDocentesByIdComunidad(List<SigaaCatDocente> sigaaCatDocentesByIdComunidad) {
        this.sigaaCatDocentesByIdComunidad = sigaaCatDocentesByIdComunidad;
    }

    @OneToMany(mappedBy = "sigaaCatComunidadByIdComunidad")
    public List<SigaaCatTrabajadores> getSigaaCatTrabajadoresByIdComunidad() {
        return sigaaCatTrabajadoresByIdComunidad;
    }

    public void setSigaaCatTrabajadoresByIdComunidad(List<SigaaCatTrabajadores> sigaaCatTrabajadoresByIdComunidad) {
        this.sigaaCatTrabajadoresByIdComunidad = sigaaCatTrabajadoresByIdComunidad;
    }
}
