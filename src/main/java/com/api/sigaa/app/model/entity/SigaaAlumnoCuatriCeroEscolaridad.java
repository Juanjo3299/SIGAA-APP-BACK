package com.api.sigaa.app.model.entity;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "SIGAA_ALUMNO_CUATRI_CERO_ESCOLARIDAD", schema = "dbo", catalog = "SIGAA")
public class SigaaAlumnoCuatriCeroEscolaridad {
    private int idDetEscolaridadAlumnoCuatriCero;
    private int idDetEscolaridad;
    private List<SigaaAlumnoCuatriCero> sigaaAlumnoCuatriCerosByIdDetEscolaridadAlumnoCuatriCero;
    private SigaaDetEscolaridadAspirante sigaaDetEscolaridadAspiranteByIdDetEscolaridad;

    @Id
    @Column(name = "ID_DET_ESCOLARIDAD_ALUMNO_CUATRI_CERO")
    public int getIdDetEscolaridadAlumnoCuatriCero() {
        return idDetEscolaridadAlumnoCuatriCero;
    }

    public void setIdDetEscolaridadAlumnoCuatriCero(int idDetEscolaridadAlumnoCuatriCero) {
        this.idDetEscolaridadAlumnoCuatriCero = idDetEscolaridadAlumnoCuatriCero;
    }

    @Basic
    @Column(name = "ID_DET_ESCOLARIDAD")
    public int getIdDetEscolaridad() {
        return idDetEscolaridad;
    }

    public void setIdDetEscolaridad(int idDetEscolaridad) {
        this.idDetEscolaridad = idDetEscolaridad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SigaaAlumnoCuatriCeroEscolaridad that = (SigaaAlumnoCuatriCeroEscolaridad) o;
        return idDetEscolaridadAlumnoCuatriCero == that.idDetEscolaridadAlumnoCuatriCero &&
                idDetEscolaridad == that.idDetEscolaridad;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idDetEscolaridadAlumnoCuatriCero, idDetEscolaridad);
    }

    @OneToMany(mappedBy = "sigaaAlumnoCuatriCeroEscolaridadByIdHistorialAlumno")
    public List<SigaaAlumnoCuatriCero> getSigaaAlumnoCuatriCerosByIdDetEscolaridadAlumnoCuatriCero() {
        return sigaaAlumnoCuatriCerosByIdDetEscolaridadAlumnoCuatriCero;
    }

    public void setSigaaAlumnoCuatriCerosByIdDetEscolaridadAlumnoCuatriCero(List<SigaaAlumnoCuatriCero> sigaaAlumnoCuatriCerosByIdDetEscolaridadAlumnoCuatriCero) {
        this.sigaaAlumnoCuatriCerosByIdDetEscolaridadAlumnoCuatriCero = sigaaAlumnoCuatriCerosByIdDetEscolaridadAlumnoCuatriCero;
    }

    @ManyToOne
    @JoinColumn(name = "ID_DET_ESCOLARIDAD", referencedColumnName = "CNS", nullable = false, insertable = false, updatable = false)
    public SigaaDetEscolaridadAspirante getSigaaDetEscolaridadAspiranteByIdDetEscolaridad() {
        return sigaaDetEscolaridadAspiranteByIdDetEscolaridad;
    }

    public void setSigaaDetEscolaridadAspiranteByIdDetEscolaridad(SigaaDetEscolaridadAspirante sigaaDetEscolaridadAspiranteByIdDetEscolaridad) {
        this.sigaaDetEscolaridadAspiranteByIdDetEscolaridad = sigaaDetEscolaridadAspiranteByIdDetEscolaridad;
    }
}
