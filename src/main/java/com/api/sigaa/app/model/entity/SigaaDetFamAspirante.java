package com.api.sigaa.app.model.entity;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "SIGAA_DET_FAM_ASPIRANTE", schema = "dbo", catalog = "SIGAA")
public class SigaaDetFamAspirante {
    private int cns;
    private String nomPadre;
    private String ocupacionPadre;
    private String telPadre;
    private String direccionPadre;
    private String nombreMadre;
    private String ocupacionMadre;
    private String telMadre;
    private String direccionMadre;
    private int folio;
    private List<SigaaAlumnoCuatriCeroFamilia> sigaaAlumnoCuatriCeroFamiliasByCns;
    private SigaaCatAspirante sigaaCatAspiranteByFolio;

    @Id
    @Column(name = "CNS")
    public int getCns() {
        return cns;
    }

    public void setCns(int cns) {
        this.cns = cns;
    }

    @Basic
    @Column(name = "NOM_PADRE")
    public String getNomPadre() {
        return nomPadre;
    }

    public void setNomPadre(String nomPadre) {
        this.nomPadre = nomPadre;
    }

    @Basic
    @Column(name = "OCUPACION_PADRE")
    public String getOcupacionPadre() {
        return ocupacionPadre;
    }

    public void setOcupacionPadre(String ocupacionPadre) {
        this.ocupacionPadre = ocupacionPadre;
    }

    @Basic
    @Column(name = "TEL_PADRE")
    public String getTelPadre() {
        return telPadre;
    }

    public void setTelPadre(String telPadre) {
        this.telPadre = telPadre;
    }

    @Basic
    @Column(name = "DIRECCION_PADRE")
    public String getDireccionPadre() {
        return direccionPadre;
    }

    public void setDireccionPadre(String direccionPadre) {
        this.direccionPadre = direccionPadre;
    }

    @Basic
    @Column(name = "NOMBRE_MADRE")
    public String getNombreMadre() {
        return nombreMadre;
    }

    public void setNombreMadre(String nombreMadre) {
        this.nombreMadre = nombreMadre;
    }

    @Basic
    @Column(name = "OCUPACION_MADRE")
    public String getOcupacionMadre() {
        return ocupacionMadre;
    }

    public void setOcupacionMadre(String ocupacionMadre) {
        this.ocupacionMadre = ocupacionMadre;
    }

    @Basic
    @Column(name = "TEL_MADRE")
    public String getTelMadre() {
        return telMadre;
    }

    public void setTelMadre(String telMadre) {
        this.telMadre = telMadre;
    }

    @Basic
    @Column(name = "DIRECCION_MADRE")
    public String getDireccionMadre() {
        return direccionMadre;
    }

    public void setDireccionMadre(String direccionMadre) {
        this.direccionMadre = direccionMadre;
    }

    @Basic
    @Column(name = "FOLIO")
    public int getFolio() {
        return folio;
    }

    public void setFolio(int folio) {
        this.folio = folio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SigaaDetFamAspirante that = (SigaaDetFamAspirante) o;
        return cns == that.cns &&
                folio == that.folio &&
                Objects.equals(nomPadre, that.nomPadre) &&
                Objects.equals(ocupacionPadre, that.ocupacionPadre) &&
                Objects.equals(telPadre, that.telPadre) &&
                Objects.equals(direccionPadre, that.direccionPadre) &&
                Objects.equals(nombreMadre, that.nombreMadre) &&
                Objects.equals(ocupacionMadre, that.ocupacionMadre) &&
                Objects.equals(telMadre, that.telMadre) &&
                Objects.equals(direccionMadre, that.direccionMadre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cns, nomPadre, ocupacionPadre, telPadre, direccionPadre, nombreMadre, ocupacionMadre, telMadre, direccionMadre, folio);
    }

    @OneToMany(mappedBy = "sigaaDetFamAspiranteByIdDetFamiliar")
    public List<SigaaAlumnoCuatriCeroFamilia> getSigaaAlumnoCuatriCeroFamiliasByCns() {
        return sigaaAlumnoCuatriCeroFamiliasByCns;
    }

    public void setSigaaAlumnoCuatriCeroFamiliasByCns(List<SigaaAlumnoCuatriCeroFamilia> sigaaAlumnoCuatriCeroFamiliasByCns) {
        this.sigaaAlumnoCuatriCeroFamiliasByCns = sigaaAlumnoCuatriCeroFamiliasByCns;
    }

    @ManyToOne
    @JoinColumn(name = "FOLIO", referencedColumnName = "FOLIO", nullable = false, insertable = false, updatable = false)
    public SigaaCatAspirante getSigaaCatAspiranteByFolio() {
        return sigaaCatAspiranteByFolio;
    }

    public void setSigaaCatAspiranteByFolio(SigaaCatAspirante sigaaCatAspiranteByFolio) {
        this.sigaaCatAspiranteByFolio = sigaaCatAspiranteByFolio;
    }
}
