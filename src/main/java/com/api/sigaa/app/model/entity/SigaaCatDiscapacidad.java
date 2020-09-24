package com.api.sigaa.app.model.entity;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "SIGAA_CAT_DISCAPACIDAD", schema = "dbo", catalog = "SIGAA")
public class SigaaCatDiscapacidad {
    private int idCatdiscapacidad;
    private String nombre;
    private String estatus;
    private List<SigaaCatAlumno> sigaaCatAlumnosByIdCatdiscapacidad;
    private List<SigaaCatAspirante> sigaaCatAspirantesByIdCatdiscapacidad;
    private List<SigaaCatAspirantePosgrado> sigaaCatAspirantePosgradosByIdCatdiscapacidad;
    private List<SigaaCatDocente> sigaaCatDocentesByIdCatdiscapacidad;
    private List<SigaaCatTrabajadores> sigaaCatTrabajadoresByIdCatdiscapacidad;

    @Id
    @Column(name = "ID_CATDISCAPACIDAD")
    public int getIdCatdiscapacidad() {
        return idCatdiscapacidad;
    }

    public void setIdCatdiscapacidad(int idCatdiscapacidad) {
        this.idCatdiscapacidad = idCatdiscapacidad;
    }

    @Basic
    @Column(name = "NOMBRE")
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
        SigaaCatDiscapacidad that = (SigaaCatDiscapacidad) o;
        return idCatdiscapacidad == that.idCatdiscapacidad &&
                Objects.equals(nombre, that.nombre) &&
                Objects.equals(estatus, that.estatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCatdiscapacidad, nombre, estatus);
    }

    @OneToMany(mappedBy = "sigaaCatDiscapacidadByIdCatdiscapacidad")
    public List<SigaaCatAlumno> getSigaaCatAlumnosByIdCatdiscapacidad() {
        return sigaaCatAlumnosByIdCatdiscapacidad;
    }

    public void setSigaaCatAlumnosByIdCatdiscapacidad(List<SigaaCatAlumno> sigaaCatAlumnosByIdCatdiscapacidad) {
        this.sigaaCatAlumnosByIdCatdiscapacidad = sigaaCatAlumnosByIdCatdiscapacidad;
    }

    @OneToMany(mappedBy = "sigaaCatDiscapacidadByIdDiscapacidad")
    public List<SigaaCatAspirante> getSigaaCatAspirantesByIdCatdiscapacidad() {
        return sigaaCatAspirantesByIdCatdiscapacidad;
    }

    public void setSigaaCatAspirantesByIdCatdiscapacidad(List<SigaaCatAspirante> sigaaCatAspirantesByIdCatdiscapacidad) {
        this.sigaaCatAspirantesByIdCatdiscapacidad = sigaaCatAspirantesByIdCatdiscapacidad;
    }

    @OneToMany(mappedBy = "sigaaCatDiscapacidadByDetDiscapacidad")
    public List<SigaaCatAspirantePosgrado> getSigaaCatAspirantePosgradosByIdCatdiscapacidad() {
        return sigaaCatAspirantePosgradosByIdCatdiscapacidad;
    }

    public void setSigaaCatAspirantePosgradosByIdCatdiscapacidad(List<SigaaCatAspirantePosgrado> sigaaCatAspirantePosgradosByIdCatdiscapacidad) {
        this.sigaaCatAspirantePosgradosByIdCatdiscapacidad = sigaaCatAspirantePosgradosByIdCatdiscapacidad;
    }

    @OneToMany(mappedBy = "sigaaCatDiscapacidadByIdDiscapacidad")
    public List<SigaaCatDocente> getSigaaCatDocentesByIdCatdiscapacidad() {
        return sigaaCatDocentesByIdCatdiscapacidad;
    }

    public void setSigaaCatDocentesByIdCatdiscapacidad(List<SigaaCatDocente> sigaaCatDocentesByIdCatdiscapacidad) {
        this.sigaaCatDocentesByIdCatdiscapacidad = sigaaCatDocentesByIdCatdiscapacidad;
    }

    @OneToMany(mappedBy = "sigaaCatDiscapacidadByIdDiscapacidad")
    public List<SigaaCatTrabajadores> getSigaaCatTrabajadoresByIdCatdiscapacidad() {
        return sigaaCatTrabajadoresByIdCatdiscapacidad;
    }

    public void setSigaaCatTrabajadoresByIdCatdiscapacidad(List<SigaaCatTrabajadores> sigaaCatTrabajadoresByIdCatdiscapacidad) {
        this.sigaaCatTrabajadoresByIdCatdiscapacidad = sigaaCatTrabajadoresByIdCatdiscapacidad;
    }
}
