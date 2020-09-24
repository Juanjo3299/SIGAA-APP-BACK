package com.api.sigaa.app.model.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "SIGAA_ALUMNO_CUATRI_CERO_FAMILIA", schema = "dbo", catalog = "SIGAA")
public class SigaaAlumnoCuatriCeroFamilia {
    private int idDetFamiliaAlumnoCuatriCero;
    private int idDetFamiliar;
    private int idAlumno;
    private SigaaDetFamAspirante sigaaDetFamAspiranteByIdDetFamiliar;
    private SigaaAlumnoCuatriCero sigaaAlumnoCuatriCeroByIdAlumno;

    @Id
    @Column(name = "ID_DET_FAMILIA_ALUMNO_CUATRI_CERO")
    public int getIdDetFamiliaAlumnoCuatriCero() {
        return idDetFamiliaAlumnoCuatriCero;
    }

    public void setIdDetFamiliaAlumnoCuatriCero(int idDetFamiliaAlumnoCuatriCero) {
        this.idDetFamiliaAlumnoCuatriCero = idDetFamiliaAlumnoCuatriCero;
    }

    @Basic
    @Column(name = "ID_DET_FAMILIAR")
    public int getIdDetFamiliar() {
        return idDetFamiliar;
    }

    public void setIdDetFamiliar(int idDetFamiliar) {
        this.idDetFamiliar = idDetFamiliar;
    }

    @Basic
    @Column(name = "ID_ALUMNO")
    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SigaaAlumnoCuatriCeroFamilia that = (SigaaAlumnoCuatriCeroFamilia) o;
        return idDetFamiliaAlumnoCuatriCero == that.idDetFamiliaAlumnoCuatriCero &&
                idDetFamiliar == that.idDetFamiliar &&
                idAlumno == that.idAlumno;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idDetFamiliaAlumnoCuatriCero, idDetFamiliar, idAlumno);
    }

    @ManyToOne
    @JoinColumn(name = "ID_DET_FAMILIAR", referencedColumnName = "CNS", nullable = false, insertable = false, updatable = false)
    public SigaaDetFamAspirante getSigaaDetFamAspiranteByIdDetFamiliar() {
        return sigaaDetFamAspiranteByIdDetFamiliar;
    }

    public void setSigaaDetFamAspiranteByIdDetFamiliar(SigaaDetFamAspirante sigaaDetFamAspiranteByIdDetFamiliar) {
        this.sigaaDetFamAspiranteByIdDetFamiliar = sigaaDetFamAspiranteByIdDetFamiliar;
    }

    @ManyToOne
    @JoinColumn(name = "ID_ALUMNO", referencedColumnName = "ID_ALUMNO_CUATRI_CERO", nullable = false, insertable = false, updatable = false)
    public SigaaAlumnoCuatriCero getSigaaAlumnoCuatriCeroByIdAlumno() {
        return sigaaAlumnoCuatriCeroByIdAlumno;
    }

    public void setSigaaAlumnoCuatriCeroByIdAlumno(SigaaAlumnoCuatriCero sigaaAlumnoCuatriCeroByIdAlumno) {
        this.sigaaAlumnoCuatriCeroByIdAlumno = sigaaAlumnoCuatriCeroByIdAlumno;
    }
}
