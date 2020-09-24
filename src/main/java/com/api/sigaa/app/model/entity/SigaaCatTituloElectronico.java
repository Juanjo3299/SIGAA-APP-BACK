package com.api.sigaa.app.model.entity;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "SIGAA_CAT_TITULO_ELECTRONICO", schema = "dbo", catalog = "SIGAA")
public class SigaaCatTituloElectronico {
    private int idTituloElectronico;
    private int matricula;
    private String cerBase64Rector;
    private String firmaBase64Rector;
    private String cerBase64ServEsc;
    private String firmaBase64ServEsc;
    private Integer usrFirmaServEsc;
    private Integer usrFirmaRector;
    private Integer usrEnvia;
    private Timestamp fecha;
    private String rutaArchivo;
    private int idEstatusTitulo;
    private Date fechaExpedicion;
    private Date fechaExencion;
    private String cadenaServicios;
    private String cadenaRector;
    private String matriculaMd5;
    private SigaaCatAlumno sigaaCatAlumnoByMatricula;
    private Usuario usuarioByUsrFirmaServEsc;
    private Usuario usuarioByUsrFirmaRector;
    private Usuario usuarioByUsrEnvia;
    private SigaaCatEstatusTitulo sigaaCatEstatusTituloByIdEstatusTitulo;

    @Id
    @Column(name = "ID_TITULO_ELECTRONICO")
    public int getIdTituloElectronico() {
        return idTituloElectronico;
    }

    public void setIdTituloElectronico(int idTituloElectronico) {
        this.idTituloElectronico = idTituloElectronico;
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
    @Column(name = "CER_BASE64_RECTOR")
    public String getCerBase64Rector() {
        return cerBase64Rector;
    }

    public void setCerBase64Rector(String cerBase64Rector) {
        this.cerBase64Rector = cerBase64Rector;
    }

    @Basic
    @Column(name = "FIRMA_BASE64_RECTOR")
    public String getFirmaBase64Rector() {
        return firmaBase64Rector;
    }

    public void setFirmaBase64Rector(String firmaBase64Rector) {
        this.firmaBase64Rector = firmaBase64Rector;
    }

    @Basic
    @Column(name = "CER_BASE64_SERV_ESC")
    public String getCerBase64ServEsc() {
        return cerBase64ServEsc;
    }

    public void setCerBase64ServEsc(String cerBase64ServEsc) {
        this.cerBase64ServEsc = cerBase64ServEsc;
    }

    @Basic
    @Column(name = "FIRMA_BASE64_SERV_ESC")
    public String getFirmaBase64ServEsc() {
        return firmaBase64ServEsc;
    }

    public void setFirmaBase64ServEsc(String firmaBase64ServEsc) {
        this.firmaBase64ServEsc = firmaBase64ServEsc;
    }

    @Basic
    @Column(name = "USR_FIRMA_SERV_ESC")
    public Integer getUsrFirmaServEsc() {
        return usrFirmaServEsc;
    }

    public void setUsrFirmaServEsc(Integer usrFirmaServEsc) {
        this.usrFirmaServEsc = usrFirmaServEsc;
    }

    @Basic
    @Column(name = "USR_FIRMA_RECTOR")
    public Integer getUsrFirmaRector() {
        return usrFirmaRector;
    }

    public void setUsrFirmaRector(Integer usrFirmaRector) {
        this.usrFirmaRector = usrFirmaRector;
    }

    @Basic
    @Column(name = "USR_ENVIA")
    public Integer getUsrEnvia() {
        return usrEnvia;
    }

    public void setUsrEnvia(Integer usrEnvia) {
        this.usrEnvia = usrEnvia;
    }

    @Basic
    @Column(name = "FECHA")
    public Timestamp getFecha() {
        return fecha;
    }

    public void setFecha(Timestamp fecha) {
        this.fecha = fecha;
    }

    @Basic
    @Column(name = "RUTA_ARCHIVO")
    public String getRutaArchivo() {
        return rutaArchivo;
    }

    public void setRutaArchivo(String rutaArchivo) {
        this.rutaArchivo = rutaArchivo;
    }

    @Basic
    @Column(name = "ID_ESTATUS_TITULO")
    public int getIdEstatusTitulo() {
        return idEstatusTitulo;
    }

    public void setIdEstatusTitulo(int idEstatusTitulo) {
        this.idEstatusTitulo = idEstatusTitulo;
    }

    @Basic
    @Column(name = "FECHA_EXPEDICION")
    public Date getFechaExpedicion() {
        return fechaExpedicion;
    }

    public void setFechaExpedicion(Date fechaExpedicion) {
        this.fechaExpedicion = fechaExpedicion;
    }

    @Basic
    @Column(name = "FECHA_EXENCION")
    public Date getFechaExencion() {
        return fechaExencion;
    }

    public void setFechaExencion(Date fechaExencion) {
        this.fechaExencion = fechaExencion;
    }

    @Basic
    @Column(name = "CADENA_SERVICIOS")
    public String getCadenaServicios() {
        return cadenaServicios;
    }

    public void setCadenaServicios(String cadenaServicios) {
        this.cadenaServicios = cadenaServicios;
    }

    @Basic
    @Column(name = "CADENA_RECTOR")
    public String getCadenaRector() {
        return cadenaRector;
    }

    public void setCadenaRector(String cadenaRector) {
        this.cadenaRector = cadenaRector;
    }

    @Basic
    @Column(name = "MATRICULA_MD5")
    public String getMatriculaMd5() {
        return matriculaMd5;
    }

    public void setMatriculaMd5(String matriculaMd5) {
        this.matriculaMd5 = matriculaMd5;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SigaaCatTituloElectronico that = (SigaaCatTituloElectronico) o;
        return idTituloElectronico == that.idTituloElectronico &&
                matricula == that.matricula &&
                idEstatusTitulo == that.idEstatusTitulo &&
                Objects.equals(cerBase64Rector, that.cerBase64Rector) &&
                Objects.equals(firmaBase64Rector, that.firmaBase64Rector) &&
                Objects.equals(cerBase64ServEsc, that.cerBase64ServEsc) &&
                Objects.equals(firmaBase64ServEsc, that.firmaBase64ServEsc) &&
                Objects.equals(usrFirmaServEsc, that.usrFirmaServEsc) &&
                Objects.equals(usrFirmaRector, that.usrFirmaRector) &&
                Objects.equals(usrEnvia, that.usrEnvia) &&
                Objects.equals(fecha, that.fecha) &&
                Objects.equals(rutaArchivo, that.rutaArchivo) &&
                Objects.equals(fechaExpedicion, that.fechaExpedicion) &&
                Objects.equals(fechaExencion, that.fechaExencion) &&
                Objects.equals(cadenaServicios, that.cadenaServicios) &&
                Objects.equals(cadenaRector, that.cadenaRector) &&
                Objects.equals(matriculaMd5, that.matriculaMd5);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idTituloElectronico, matricula, cerBase64Rector, firmaBase64Rector, cerBase64ServEsc, firmaBase64ServEsc, usrFirmaServEsc, usrFirmaRector, usrEnvia, fecha, rutaArchivo, idEstatusTitulo, fechaExpedicion, fechaExencion, cadenaServicios, cadenaRector, matriculaMd5);
    }

    @ManyToOne
    @JoinColumn(name = "MATRICULA", referencedColumnName = "MATRICULA", nullable = false, insertable = false, updatable = false)
    public SigaaCatAlumno getSigaaCatAlumnoByMatricula() {
        return sigaaCatAlumnoByMatricula;
    }

    public void setSigaaCatAlumnoByMatricula(SigaaCatAlumno sigaaCatAlumnoByMatricula) {
        this.sigaaCatAlumnoByMatricula = sigaaCatAlumnoByMatricula;
    }

    @ManyToOne
    @JoinColumn(name = "USR_FIRMA_SERV_ESC", referencedColumnName = "ID_USUARIO", insertable = false, updatable = false)
    public Usuario getUsuarioByUsrFirmaServEsc() {
        return usuarioByUsrFirmaServEsc;
    }

    public void setUsuarioByUsrFirmaServEsc(Usuario usuarioByUsrFirmaServEsc) {
        this.usuarioByUsrFirmaServEsc = usuarioByUsrFirmaServEsc;
    }

    @ManyToOne
    @JoinColumn(name = "USR_FIRMA_RECTOR", referencedColumnName = "ID_USUARIO", insertable = false, updatable = false)
    public Usuario getUsuarioByUsrFirmaRector() {
        return usuarioByUsrFirmaRector;
    }

    public void setUsuarioByUsrFirmaRector(Usuario usuarioByUsrFirmaRector) {
        this.usuarioByUsrFirmaRector = usuarioByUsrFirmaRector;
    }

    @ManyToOne
    @JoinColumn(name = "USR_ENVIA", referencedColumnName = "ID_USUARIO", insertable = false, updatable = false)
    public Usuario getUsuarioByUsrEnvia() {
        return usuarioByUsrEnvia;
    }

    public void setUsuarioByUsrEnvia(Usuario usuarioByUsrEnvia) {
        this.usuarioByUsrEnvia = usuarioByUsrEnvia;
    }

    @ManyToOne
    @JoinColumn(name = "ID_ESTATUS_TITULO", referencedColumnName = "ID_ESTATUS_TITULO", nullable = false, insertable = false, updatable = false)
    public SigaaCatEstatusTitulo getSigaaCatEstatusTituloByIdEstatusTitulo() {
        return sigaaCatEstatusTituloByIdEstatusTitulo;
    }

    public void setSigaaCatEstatusTituloByIdEstatusTitulo(SigaaCatEstatusTitulo sigaaCatEstatusTituloByIdEstatusTitulo) {
        this.sigaaCatEstatusTituloByIdEstatusTitulo = sigaaCatEstatusTituloByIdEstatusTitulo;
    }
}
