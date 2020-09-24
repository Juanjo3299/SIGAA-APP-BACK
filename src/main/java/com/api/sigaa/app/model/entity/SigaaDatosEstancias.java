package com.api.sigaa.app.model.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "SIGAA_DATOS_ESTANCIAS", schema = "dbo", catalog = "SIGAA")
public class SigaaDatosEstancias {
    private int idDatosEstancias;
    private Integer matricula;
    private String actividad;
    private String empresa;
    private String domicilioEmpresa;
    private String nombreEncargadoEmpresa;
    private String cargo;
    private String telefonoEmpresa;
    private String emailEmpresa;
    private String horaEntrada;
    private String horaSalida;
    private String area;
    private String observaciones;
    private String tutor;
    private String telefonoTutor;
    private String celularTutor;
    private String ciudad;
    private Date fechaReciboDoc;
    private String folio;
    private String documentosEntregados;
    private Integer asesorAcademico;
    private String modalidad;
    private Integer idCatDocumentosEstancias;
    private Integer idPeriodoEstancias;
    private SigaaCatAlumno sigaaCatAlumnoByMatricula;
    private SigaaCatDocente sigaaCatDocenteByAsesorAcademico;
    private SigaaCatDocumentosEstancias sigaaCatDocumentosEstanciasByIdCatDocumentosEstancias;
    private SigaaCatPeriodoEstancias sigaaCatPeriodoEstanciasByIdPeriodoEstancias;

    @Id
    @Column(name = "ID_DATOS_ESTANCIAS")
    public int getIdDatosEstancias() {
        return idDatosEstancias;
    }

    public void setIdDatosEstancias(int idDatosEstancias) {
        this.idDatosEstancias = idDatosEstancias;
    }

    @Basic
    @Column(name = "MATRICULA")
    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    @Basic
    @Column(name = "ACTIVIDAD")
    public String getActividad() {
        return actividad;
    }

    public void setActividad(String actividad) {
        this.actividad = actividad;
    }

    @Basic
    @Column(name = "EMPRESA")
    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    @Basic
    @Column(name = "DOMICILIO_EMPRESA")
    public String getDomicilioEmpresa() {
        return domicilioEmpresa;
    }

    public void setDomicilioEmpresa(String domicilioEmpresa) {
        this.domicilioEmpresa = domicilioEmpresa;
    }

    @Basic
    @Column(name = "NOMBRE_ENCARGADO_EMPRESA")
    public String getNombreEncargadoEmpresa() {
        return nombreEncargadoEmpresa;
    }

    public void setNombreEncargadoEmpresa(String nombreEncargadoEmpresa) {
        this.nombreEncargadoEmpresa = nombreEncargadoEmpresa;
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
    @Column(name = "TELEFONO_EMPRESA")
    public String getTelefonoEmpresa() {
        return telefonoEmpresa;
    }

    public void setTelefonoEmpresa(String telefonoEmpresa) {
        this.telefonoEmpresa = telefonoEmpresa;
    }

    @Basic
    @Column(name = "EMAIL_EMPRESA")
    public String getEmailEmpresa() {
        return emailEmpresa;
    }

    public void setEmailEmpresa(String emailEmpresa) {
        this.emailEmpresa = emailEmpresa;
    }

    @Basic
    @Column(name = "HORA_ENTRADA")
    public String getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(String horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    @Basic
    @Column(name = "HORA_SALIDA")
    public String getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(String horaSalida) {
        this.horaSalida = horaSalida;
    }

    @Basic
    @Column(name = "AREA")
    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Basic
    @Column(name = "OBSERVACIONES")
    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    @Basic
    @Column(name = "TUTOR")
    public String getTutor() {
        return tutor;
    }

    public void setTutor(String tutor) {
        this.tutor = tutor;
    }

    @Basic
    @Column(name = "TELEFONO_TUTOR")
    public String getTelefonoTutor() {
        return telefonoTutor;
    }

    public void setTelefonoTutor(String telefonoTutor) {
        this.telefonoTutor = telefonoTutor;
    }

    @Basic
    @Column(name = "CELULAR_TUTOR")
    public String getCelularTutor() {
        return celularTutor;
    }

    public void setCelularTutor(String celularTutor) {
        this.celularTutor = celularTutor;
    }

    @Basic
    @Column(name = "CIUDAD")
    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @Basic
    @Column(name = "FECHA_RECIBO_DOC")
    public Date getFechaReciboDoc() {
        return fechaReciboDoc;
    }

    public void setFechaReciboDoc(Date fechaReciboDoc) {
        this.fechaReciboDoc = fechaReciboDoc;
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
    @Column(name = "DOCUMENTOS_ENTREGADOS")
    public String getDocumentosEntregados() {
        return documentosEntregados;
    }

    public void setDocumentosEntregados(String documentosEntregados) {
        this.documentosEntregados = documentosEntregados;
    }

    @Basic
    @Column(name = "ASESOR_ACADEMICO")
    public Integer getAsesorAcademico() {
        return asesorAcademico;
    }

    public void setAsesorAcademico(Integer asesorAcademico) {
        this.asesorAcademico = asesorAcademico;
    }

    @Basic
    @Column(name = "MODALIDAD")
    public String getModalidad() {
        return modalidad;
    }

    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }

    @Basic
    @Column(name = "ID_CAT_DOCUMENTOS_ESTANCIAS")
    public Integer getIdCatDocumentosEstancias() {
        return idCatDocumentosEstancias;
    }

    public void setIdCatDocumentosEstancias(Integer idCatDocumentosEstancias) {
        this.idCatDocumentosEstancias = idCatDocumentosEstancias;
    }

    @Basic
    @Column(name = "ID_PERIODO_ESTANCIAS")
    public Integer getIdPeriodoEstancias() {
        return idPeriodoEstancias;
    }

    public void setIdPeriodoEstancias(Integer idPeriodoEstancias) {
        this.idPeriodoEstancias = idPeriodoEstancias;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SigaaDatosEstancias that = (SigaaDatosEstancias) o;
        return idDatosEstancias == that.idDatosEstancias &&
                Objects.equals(matricula, that.matricula) &&
                Objects.equals(actividad, that.actividad) &&
                Objects.equals(empresa, that.empresa) &&
                Objects.equals(domicilioEmpresa, that.domicilioEmpresa) &&
                Objects.equals(nombreEncargadoEmpresa, that.nombreEncargadoEmpresa) &&
                Objects.equals(cargo, that.cargo) &&
                Objects.equals(telefonoEmpresa, that.telefonoEmpresa) &&
                Objects.equals(emailEmpresa, that.emailEmpresa) &&
                Objects.equals(horaEntrada, that.horaEntrada) &&
                Objects.equals(horaSalida, that.horaSalida) &&
                Objects.equals(area, that.area) &&
                Objects.equals(observaciones, that.observaciones) &&
                Objects.equals(tutor, that.tutor) &&
                Objects.equals(telefonoTutor, that.telefonoTutor) &&
                Objects.equals(celularTutor, that.celularTutor) &&
                Objects.equals(ciudad, that.ciudad) &&
                Objects.equals(fechaReciboDoc, that.fechaReciboDoc) &&
                Objects.equals(folio, that.folio) &&
                Objects.equals(documentosEntregados, that.documentosEntregados) &&
                Objects.equals(asesorAcademico, that.asesorAcademico) &&
                Objects.equals(modalidad, that.modalidad) &&
                Objects.equals(idCatDocumentosEstancias, that.idCatDocumentosEstancias) &&
                Objects.equals(idPeriodoEstancias, that.idPeriodoEstancias);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idDatosEstancias, matricula, actividad, empresa, domicilioEmpresa, nombreEncargadoEmpresa, cargo, telefonoEmpresa, emailEmpresa, horaEntrada, horaSalida, area, observaciones, tutor, telefonoTutor, celularTutor, ciudad, fechaReciboDoc, folio, documentosEntregados, asesorAcademico, modalidad, idCatDocumentosEstancias, idPeriodoEstancias);
    }

    @ManyToOne
    @JoinColumn(name = "MATRICULA", referencedColumnName = "MATRICULA", insertable = false, updatable = false)
    public SigaaCatAlumno getSigaaCatAlumnoByMatricula() {
        return sigaaCatAlumnoByMatricula;
    }

    public void setSigaaCatAlumnoByMatricula(SigaaCatAlumno sigaaCatAlumnoByMatricula) {
        this.sigaaCatAlumnoByMatricula = sigaaCatAlumnoByMatricula;
    }

    @ManyToOne
    @JoinColumn(name = "ASESOR_ACADEMICO", referencedColumnName = "ID_DOCENTE", insertable = false, updatable = false)
    public SigaaCatDocente getSigaaCatDocenteByAsesorAcademico() {
        return sigaaCatDocenteByAsesorAcademico;
    }

    public void setSigaaCatDocenteByAsesorAcademico(SigaaCatDocente sigaaCatDocenteByAsesorAcademico) {
        this.sigaaCatDocenteByAsesorAcademico = sigaaCatDocenteByAsesorAcademico;
    }

    @ManyToOne
    @JoinColumn(name = "ID_CAT_DOCUMENTOS_ESTANCIAS", referencedColumnName = "ID_CAT_DOCUMENTOS_ESTANCIAS", insertable = false, updatable = false)
    public SigaaCatDocumentosEstancias getSigaaCatDocumentosEstanciasByIdCatDocumentosEstancias() {
        return sigaaCatDocumentosEstanciasByIdCatDocumentosEstancias;
    }

    public void setSigaaCatDocumentosEstanciasByIdCatDocumentosEstancias(SigaaCatDocumentosEstancias sigaaCatDocumentosEstanciasByIdCatDocumentosEstancias) {
        this.sigaaCatDocumentosEstanciasByIdCatDocumentosEstancias = sigaaCatDocumentosEstanciasByIdCatDocumentosEstancias;
    }

    @ManyToOne
    @JoinColumn(name = "ID_PERIODO_ESTANCIAS", referencedColumnName = "ID_PERIODO_ESTANCIAS", insertable = false, updatable = false)
    public SigaaCatPeriodoEstancias getSigaaCatPeriodoEstanciasByIdPeriodoEstancias() {
        return sigaaCatPeriodoEstanciasByIdPeriodoEstancias;
    }

    public void setSigaaCatPeriodoEstanciasByIdPeriodoEstancias(SigaaCatPeriodoEstancias sigaaCatPeriodoEstanciasByIdPeriodoEstancias) {
        this.sigaaCatPeriodoEstanciasByIdPeriodoEstancias = sigaaCatPeriodoEstanciasByIdPeriodoEstancias;
    }
}
