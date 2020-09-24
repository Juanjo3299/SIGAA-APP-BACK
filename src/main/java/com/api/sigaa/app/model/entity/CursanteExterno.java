package com.api.sigaa.app.model.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "CURSANTE_EXTERNO", schema = "dbo", catalog = "SIGAA")
public class CursanteExterno {
    private int idCursanteExterno;
    private String nombre;
    private String apePat;
    private String apeMat;
    private String curp;
    private String genero;
    private String telCelular;
    private String telCasa;
    private String direccion;
    private String email;

    @Id
    @Column(name = "ID_CURSANTE_EXTERNO")
    public int getIdCursanteExterno() {
        return idCursanteExterno;
    }

    public void setIdCursanteExterno(int idCursanteExterno) {
        this.idCursanteExterno = idCursanteExterno;
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
    @Column(name = "APE_PAT")
    public String getApePat() {
        return apePat;
    }

    public void setApePat(String apePat) {
        this.apePat = apePat;
    }

    @Basic
    @Column(name = "APE_MAT")
    public String getApeMat() {
        return apeMat;
    }

    public void setApeMat(String apeMat) {
        this.apeMat = apeMat;
    }

    @Basic
    @Column(name = "CURP")
    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    @Basic
    @Column(name = "GENERO")
    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Basic
    @Column(name = "TEL_CELULAR")
    public String getTelCelular() {
        return telCelular;
    }

    public void setTelCelular(String telCelular) {
        this.telCelular = telCelular;
    }

    @Basic
    @Column(name = "TEL_CASA")
    public String getTelCasa() {
        return telCasa;
    }

    public void setTelCasa(String telCasa) {
        this.telCasa = telCasa;
    }

    @Basic
    @Column(name = "DIRECCION")
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Basic
    @Column(name = "EMAIL")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CursanteExterno that = (CursanteExterno) o;
        return idCursanteExterno == that.idCursanteExterno &&
                Objects.equals(nombre, that.nombre) &&
                Objects.equals(apePat, that.apePat) &&
                Objects.equals(apeMat, that.apeMat) &&
                Objects.equals(curp, that.curp) &&
                Objects.equals(genero, that.genero) &&
                Objects.equals(telCelular, that.telCelular) &&
                Objects.equals(telCasa, that.telCasa) &&
                Objects.equals(direccion, that.direccion) &&
                Objects.equals(email, that.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCursanteExterno, nombre, apePat, apeMat, curp, genero, telCelular, telCasa, direccion, email);
    }
}
