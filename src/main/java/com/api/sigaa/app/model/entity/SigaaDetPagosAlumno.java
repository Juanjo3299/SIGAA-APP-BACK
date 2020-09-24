package com.api.sigaa.app.model.entity;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "SIGAA_DET_PAGOS_ALUMNO", schema = "dbo", catalog = "SIGAA")
public class SigaaDetPagosAlumno {
    private int cns;
    private int idPagosInternos;
    private int matricula;
    private String folio;
    private String estatus;
    private SigaaCatPagosInternos sigaaCatPagosInternosByIdPagosInternos;
    private SigaaCatAlumno sigaaCatAlumnoByMatricula;
    private List<SigaaExtraordinario> sigaaExtraordinariosByCns;

    @Id
    @Column(name = "CNS")
    public int getCns() {
        return cns;
    }

    public void setCns(int cns) {
        this.cns = cns;
    }

    @Basic
    @Column(name = "ID_PAGOS_INTERNOS")
    public int getIdPagosInternos() {
        return idPagosInternos;
    }

    public void setIdPagosInternos(int idPagosInternos) {
        this.idPagosInternos = idPagosInternos;
    }

    @Basic
    @Column(name = "MATRICULA")
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    @Basic
    @Column(name = "FOLIO")
    public String getFolio() {
        return folio;
    }

    public void setFolio(String folio) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SigaaDetPagosAlumno that = (SigaaDetPagosAlumno) o;
        return cns == that.cns &&
                idPagosInternos == that.idPagosInternos &&
                matricula == that.matricula &&
                Objects.equals(folio, that.folio) &&
                Objects.equals(estatus, that.estatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cns, idPagosInternos, matricula, folio, estatus);
    }

    @ManyToOne
    @JoinColumn(name = "ID_PAGOS_INTERNOS", referencedColumnName = "ID_PAGOS_INTERNOS", nullable = false, insertable = false, updatable = false)
    public SigaaCatPagosInternos getSigaaCatPagosInternosByIdPagosInternos() {
        return sigaaCatPagosInternosByIdPagosInternos;
    }

    public void setSigaaCatPagosInternosByIdPagosInternos(SigaaCatPagosInternos sigaaCatPagosInternosByIdPagosInternos) {
        this.sigaaCatPagosInternosByIdPagosInternos = sigaaCatPagosInternosByIdPagosInternos;
    }

    @ManyToOne
    @JoinColumn(name = "MATRICULA", referencedColumnName = "MATRICULA", nullable = false, insertable = false, updatable = false)
    public SigaaCatAlumno getSigaaCatAlumnoByMatricula() {
        return sigaaCatAlumnoByMatricula;
    }

    public void setSigaaCatAlumnoByMatricula(SigaaCatAlumno sigaaCatAlumnoByMatricula) {
        this.sigaaCatAlumnoByMatricula = sigaaCatAlumnoByMatricula;
    }

    @OneToMany(mappedBy = "sigaaDetPagosAlumnoByFolio")
    public List<SigaaExtraordinario> getSigaaExtraordinariosByCns() {
        return sigaaExtraordinariosByCns;
    }

    public void setSigaaExtraordinariosByCns(List<SigaaExtraordinario> sigaaExtraordinariosByCns) {
        this.sigaaExtraordinariosByCns = sigaaExtraordinariosByCns;
    }
}
