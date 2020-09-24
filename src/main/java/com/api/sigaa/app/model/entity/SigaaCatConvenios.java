package com.api.sigaa.app.model.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "SIGAA_CAT_CONVENIOS", schema = "dbo", catalog = "SIGAA")
public class SigaaCatConvenios {
    private int idConvenio;
    private String organismo;
    private String titular;
    private String cargo;
    private String telefono;
    private String correoDeContacto;
    private Date vigencia;
    private String añoDeSuscripcion;

    @Id
    @Column(name = "ID_CONVENIO")
    public int getIdConvenio() {
        return idConvenio;
    }

    public void setIdConvenio(int idConvenio) {
        this.idConvenio = idConvenio;
    }

    @Basic
    @Column(name = "ORGANISMO")
    public String getOrganismo() {
        return organismo;
    }

    public void setOrganismo(String organismo) {
        this.organismo = organismo;
    }

    @Basic
    @Column(name = "TITULAR")
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    @Basic
    @Column(name = "CARGO")
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Basic
    @Column(name = "TELEFONO")
    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Basic
    @Column(name = "CORREO_DE_CONTACTO")
    public String getCorreoDeContacto() {
        return correoDeContacto;
    }

    public void setCorreoDeContacto(String correoDeContacto) {
        this.correoDeContacto = correoDeContacto;
    }

    @Basic
    @Column(name = "VIGENCIA")
    public Date getVigencia() {
        return vigencia;
    }

    public void setVigencia(Date vigencia) {
        this.vigencia = vigencia;
    }

    @Basic
    @Column(name = "AÑO_DE_SUSCRIPCION")
    public String getAñoDeSuscripcion() {
        return añoDeSuscripcion;
    }

    public void setAñoDeSuscripcion(String añoDeSuscripcion) {
        this.añoDeSuscripcion = añoDeSuscripcion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SigaaCatConvenios that = (SigaaCatConvenios) o;
        return idConvenio == that.idConvenio &&
                Objects.equals(organismo, that.organismo) &&
                Objects.equals(titular, that.titular) &&
                Objects.equals(cargo, that.cargo) &&
                Objects.equals(telefono, that.telefono) &&
                Objects.equals(correoDeContacto, that.correoDeContacto) &&
                Objects.equals(vigencia, that.vigencia) &&
                Objects.equals(añoDeSuscripcion, that.añoDeSuscripcion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idConvenio, organismo, titular, cargo, telefono, correoDeContacto, vigencia, añoDeSuscripcion);
    }
}
