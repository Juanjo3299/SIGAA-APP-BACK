package com.api.sigaa.app.model.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "SIGAA_DET_DATOSFAMILIARES", schema = "dbo", catalog = "SIGAA")
public class SigaaDetDatosfamiliares {
    private int cns;
    private String nomPapa;
    private String nomMama;
    private String ocupPapa;
    private String ocupMama;
    private String telPapa;
    private String telMama;
    private String dirPapa;
    private String dirMama;
    private int matricula;
    private SigaaCatAlumno sigaaCatAlumnoByMatricula;

    @Id
    @Column(name = "CNS")
    public int getCns() {
        return cns;
    }

    public void setCns(int cns) {
        this.cns = cns;
    }

    @Basic
    @Column(name = "NOM_PAPA")
    public String getNomPapa() {
        return nomPapa;
    }

    public void setNomPapa(String nomPapa) {
        this.nomPapa = nomPapa;
    }

    @Basic
    @Column(name = "NOM_MAMA")
    public String getNomMama() {
        return nomMama;
    }

    public void setNomMama(String nomMama) {
        this.nomMama = nomMama;
    }

    @Basic
    @Column(name = "OCUP_PAPA")
    public String getOcupPapa() {
        return ocupPapa;
    }

    public void setOcupPapa(String ocupPapa) {
        this.ocupPapa = ocupPapa;
    }

    @Basic
    @Column(name = "OCUP_MAMA")
    public String getOcupMama() {
        return ocupMama;
    }

    public void setOcupMama(String ocupMama) {
        this.ocupMama = ocupMama;
    }

    @Basic
    @Column(name = "TEL_PAPA")
    public String getTelPapa() {
        return telPapa;
    }

    public void setTelPapa(String telPapa) {
        this.telPapa = telPapa;
    }

    @Basic
    @Column(name = "TEL_MAMA")
    public String getTelMama() {
        return telMama;
    }

    public void setTelMama(String telMama) {
        this.telMama = telMama;
    }

    @Basic
    @Column(name = "DIR_PAPA")
    public String getDirPapa() {
        return dirPapa;
    }

    public void setDirPapa(String dirPapa) {
        this.dirPapa = dirPapa;
    }

    @Basic
    @Column(name = "DIR_MAMA")
    public String getDirMama() {
        return dirMama;
    }

    public void setDirMama(String dirMama) {
        this.dirMama = dirMama;
    }

    @Basic
    @Column(name = "MATRICULA")
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SigaaDetDatosfamiliares that = (SigaaDetDatosfamiliares) o;
        return cns == that.cns &&
                matricula == that.matricula &&
                Objects.equals(nomPapa, that.nomPapa) &&
                Objects.equals(nomMama, that.nomMama) &&
                Objects.equals(ocupPapa, that.ocupPapa) &&
                Objects.equals(ocupMama, that.ocupMama) &&
                Objects.equals(telPapa, that.telPapa) &&
                Objects.equals(telMama, that.telMama) &&
                Objects.equals(dirPapa, that.dirPapa) &&
                Objects.equals(dirMama, that.dirMama);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cns, nomPapa, nomMama, ocupPapa, ocupMama, telPapa, telMama, dirPapa, dirMama, matricula);
    }

    @ManyToOne
    @JoinColumn(name = "MATRICULA", referencedColumnName = "MATRICULA", nullable = false, insertable = false, updatable = false)
    public SigaaCatAlumno getSigaaCatAlumnoByMatricula() {
        return sigaaCatAlumnoByMatricula;
    }

    public void setSigaaCatAlumnoByMatricula(SigaaCatAlumno sigaaCatAlumnoByMatricula) {
        this.sigaaCatAlumnoByMatricula = sigaaCatAlumnoByMatricula;
    }
}
