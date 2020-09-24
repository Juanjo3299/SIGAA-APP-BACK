package com.api.sigaa.app.model.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "SIGAA_CAT_TRABAJADORES", schema = "dbo", catalog = "SIGAA")
public class SigaaCatTrabajadores {
    private int idTrabajadores;
    private String nombre;
    private String apePat;
    private String apeMat;
    private String genero;
    private String pais;
    private String curp;
    private String rfc;
    private String grado;
    private String gradoSiglas;
    private String numCedula;
    private String estatus;
    private Integer idUsuario;
    private Date fechaNac;
    private String email;
    private String direccion;
    private String colonia;
    private String codPost;
    private String telCasa;
    private String celular;
    private String municipio;
    private String nssImss;
    private String estadoCivil;
    private String tipoSangre;
    private Integer idDiscapacidad;
    private Integer idComunidad;
    private String idioma;
    private String edoNac;
    private Usuario usuarioByIdUsuario;
    private SigaaCatDiscapacidad sigaaCatDiscapacidadByIdDiscapacidad;
    private SigaaCatComunidad sigaaCatComunidadByIdComunidad;

    @Id
    @Column(name = "ID_TRABAJADORES")
    public int getIdTrabajadores() {
        return idTrabajadores;
    }

    public void setIdTrabajadores(int idTrabajadores) {
        this.idTrabajadores = idTrabajadores;
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
    @Column(name = "GENERO")
    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Basic
    @Column(name = "PAIS")
    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
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
    @Column(name = "RFC")
    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    @Basic
    @Column(name = "GRADO")
    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    @Basic
    @Column(name = "GRADO_SIGLAS")
    public String getGradoSiglas() {
        return gradoSiglas;
    }

    public void setGradoSiglas(String gradoSiglas) {
        this.gradoSiglas = gradoSiglas;
    }

    @Basic
    @Column(name = "NUM_CEDULA")
    public String getNumCedula() {
        return numCedula;
    }

    public void setNumCedula(String numCedula) {
        this.numCedula = numCedula;
    }

    @Basic
    @Column(name = "ESTATUS")
    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    @Basic
    @Column(name = "ID_USUARIO")
    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    @Basic
    @Column(name = "FECHA_NAC")
    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    @Basic
    @Column(name = "EMAIL")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
    @Column(name = "COLONIA")
    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    @Basic
    @Column(name = "COD_POST")
    public String getCodPost() {
        return codPost;
    }

    public void setCodPost(String codPost) {
        this.codPost = codPost;
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
    @Column(name = "CELULAR")
    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    @Basic
    @Column(name = "MUNICIPIO")
    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    @Basic
    @Column(name = "NSS_IMSS")
    public String getNssImss() {
        return nssImss;
    }

    public void setNssImss(String nssImss) {
        this.nssImss = nssImss;
    }

    @Basic
    @Column(name = "ESTADO_CIVIL")
    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    @Basic
    @Column(name = "TIPO_SANGRE")
    public String getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    @Basic
    @Column(name = "ID_DISCAPACIDAD")
    public Integer getIdDiscapacidad() {
        return idDiscapacidad;
    }

    public void setIdDiscapacidad(Integer idDiscapacidad) {
        this.idDiscapacidad = idDiscapacidad;
    }

    @Basic
    @Column(name = "ID_COMUNIDAD")
    public Integer getIdComunidad() {
        return idComunidad;
    }

    public void setIdComunidad(Integer idComunidad) {
        this.idComunidad = idComunidad;
    }

    @Basic
    @Column(name = "IDIOMA")
    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    @Basic
    @Column(name = "EDO_NAC")
    public String getEdoNac() {
        return edoNac;
    }

    public void setEdoNac(String edoNac) {
        this.edoNac = edoNac;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SigaaCatTrabajadores that = (SigaaCatTrabajadores) o;
        return idTrabajadores == that.idTrabajadores &&
                Objects.equals(nombre, that.nombre) &&
                Objects.equals(apePat, that.apePat) &&
                Objects.equals(apeMat, that.apeMat) &&
                Objects.equals(genero, that.genero) &&
                Objects.equals(pais, that.pais) &&
                Objects.equals(curp, that.curp) &&
                Objects.equals(rfc, that.rfc) &&
                Objects.equals(grado, that.grado) &&
                Objects.equals(gradoSiglas, that.gradoSiglas) &&
                Objects.equals(numCedula, that.numCedula) &&
                Objects.equals(estatus, that.estatus) &&
                Objects.equals(idUsuario, that.idUsuario) &&
                Objects.equals(fechaNac, that.fechaNac) &&
                Objects.equals(email, that.email) &&
                Objects.equals(direccion, that.direccion) &&
                Objects.equals(colonia, that.colonia) &&
                Objects.equals(codPost, that.codPost) &&
                Objects.equals(telCasa, that.telCasa) &&
                Objects.equals(celular, that.celular) &&
                Objects.equals(municipio, that.municipio) &&
                Objects.equals(nssImss, that.nssImss) &&
                Objects.equals(estadoCivil, that.estadoCivil) &&
                Objects.equals(tipoSangre, that.tipoSangre) &&
                Objects.equals(idDiscapacidad, that.idDiscapacidad) &&
                Objects.equals(idComunidad, that.idComunidad) &&
                Objects.equals(idioma, that.idioma) &&
                Objects.equals(edoNac, that.edoNac);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idTrabajadores, nombre, apePat, apeMat, genero, pais, curp, rfc, grado, gradoSiglas, numCedula, estatus, idUsuario, fechaNac, email, direccion, colonia, codPost, telCasa, celular, municipio, nssImss, estadoCivil, tipoSangre, idDiscapacidad, idComunidad, idioma, edoNac);
    }

    @ManyToOne
    @JoinColumn(name = "ID_USUARIO", referencedColumnName = "ID_USUARIO", insertable = false, updatable = false)
    public Usuario getUsuarioByIdUsuario() {
        return usuarioByIdUsuario;
    }

    public void setUsuarioByIdUsuario(Usuario usuarioByIdUsuario) {
        this.usuarioByIdUsuario = usuarioByIdUsuario;
    }

    @ManyToOne
    @JoinColumn(name = "ID_DISCAPACIDAD", referencedColumnName = "ID_CATDISCAPACIDAD", insertable = false, updatable = false)
    public SigaaCatDiscapacidad getSigaaCatDiscapacidadByIdDiscapacidad() {
        return sigaaCatDiscapacidadByIdDiscapacidad;
    }

    public void setSigaaCatDiscapacidadByIdDiscapacidad(SigaaCatDiscapacidad sigaaCatDiscapacidadByIdDiscapacidad) {
        this.sigaaCatDiscapacidadByIdDiscapacidad = sigaaCatDiscapacidadByIdDiscapacidad;
    }

    @ManyToOne
    @JoinColumn(name = "ID_COMUNIDAD", referencedColumnName = "ID_COMUNIDAD", insertable = false, updatable = false)
    public SigaaCatComunidad getSigaaCatComunidadByIdComunidad() {
        return sigaaCatComunidadByIdComunidad;
    }

    public void setSigaaCatComunidadByIdComunidad(SigaaCatComunidad sigaaCatComunidadByIdComunidad) {
        this.sigaaCatComunidadByIdComunidad = sigaaCatComunidadByIdComunidad;
    }
}
