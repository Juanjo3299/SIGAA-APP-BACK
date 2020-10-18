package com.api.sigaa.app.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "SIGAA_CAT_ALUMNO", schema = "dbo", catalog = "SIGAA")
public class SigaaCatAlumno {
    private int matricula;
    private String nombre;
    private String apePat;
    private String apeMat;
    private Date fechaNac;
    private String curp;
    private String tipoSangre;
    private String genero;
    private String pais;
    private String edoNac;
    private String municipio;
    private String direccion;
    private String colonia;
    private String codPostal;
    private String telCasa;
    private String celular;
    private String email;
    private String nssImss;
    private String trabaja;
    private String ocupacion;
    private String estadoCivil;
    private int idEstatus;
    private int idGrupo;
    private int idHistorial;
    private Integer idUsuario;
    private String idioma;
    private int idCohorte;
    private String reingreso;
    private Integer idCatdiscapacidad;
    private String idiomaTipo;
    private Integer idComunidad;
    private String regular;
    private String folioF1;
    private String becaOpor;
    @JsonIgnore
    private List<SigaaAlumnoDetServicios> sigaaAlumnoDetServiciosByMatricula;
    @JsonIgnore
    private List<SigaaAlumnoEvento> sigaaAlumnoEventosByMatricula;
    @JsonIgnore
    private List<SigaaAlumnoPreguntas> sigaaAlumnoPreguntasByMatricula;
    @JsonIgnore
    private List<SigaaBajas> sigaaBajasByMatricula;
    @JsonIgnore
    private List<SigaaCargaAcademicaAlumno> sigaaCargaAcademicaAlumnosByMatricula;
    @JsonIgnore
    private List<SigaaCargaTemporal> sigaaCargaTemporalsByMatricula;
    @JsonIgnore
    private SigaaCatEstatus sigaaCatEstatusByIdEstatus;
    @JsonManagedReference
    private SigaaCatGrupo sigaaCatGrupoByIdGrupo;
    @JsonIgnore
    private SigaaHistoacademico sigaaHistoacademicoByIdHistorial;
    @JsonIgnore
    private Usuario usuarioByIdUsuario;
    @JsonIgnore
    private SigaaCohorteGenerado sigaaCohorteGeneradoByIdCohorte;
    @JsonIgnore
    private SigaaCatDiscapacidad sigaaCatDiscapacidadByIdCatdiscapacidad;
    @JsonIgnore
    private SigaaCatComunidad sigaaCatComunidadByIdComunidad;
    @JsonIgnore
    private List<SigaaCatPagosInternos> sigaaCatPagosInternosByMatricula;
    @JsonIgnore
    private List<SigaaCatTituloElectronico> sigaaCatTituloElectronicosByMatricula;
    @JsonIgnore
    private List<SigaaDatosEstancias> sigaaDatosEstanciasByMatricula;
    @JsonIgnore
    private List<SigaaDetAlumnoExento> sigaaDetAlumnoExentosByMatricula;
    @JsonIgnore
    private List<SigaaDetCalificaciones> sigaaDetCalificacionesByMatricula;
    @JsonIgnore
    private List<SigaaDetDatosfamiliares> sigaaDetDatosfamiliaresByMatricula;
    @JsonIgnore
    private List<SigaaDetPagosAlumno> sigaaDetPagosAlumnosByMatricula;
    @JsonIgnore
    private List<SigaaDocumentosTitulacion> sigaaDocumentosTitulacionsByMatricula;
    @JsonIgnore
    private List<SigaaTutorias> sigaaTutoriasByMatricula;

    @Id
    @Column(name = "MATRICULA")
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
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
    @Column(name = "FECHA_NAC")
    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
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
    @Column(name = "TIPO_SANGRE")
    public String getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
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
    @Column(name = "EDO_NAC")
    public String getEdoNac() {
        return edoNac;
    }

    public void setEdoNac(String edoNac) {
        this.edoNac = edoNac;
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
    @Column(name = "COD_POSTAL")
    public String getCodPostal() {
        return codPostal;
    }

    public void setCodPostal(String codPostal) {
        this.codPostal = codPostal;
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
    @Column(name = "EMAIL")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
    @Column(name = "TRABAJA")
    public String getTrabaja() {
        return trabaja;
    }

    public void setTrabaja(String trabaja) {
        this.trabaja = trabaja;
    }

    @Basic
    @Column(name = "OCUPACION")
    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
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
    @Column(name = "ID_ESTATUS")
    public int getIdEstatus() {
        return idEstatus;
    }

    public void setIdEstatus(int idEstatus) {
        this.idEstatus = idEstatus;
    }

    @Basic
    @Column(name = "ID_GRUPO")
    public int getIdGrupo() {
        return idGrupo;
    }

    public void setIdGrupo(int idGrupo) {
        this.idGrupo = idGrupo;
    }

    @Basic
    @Column(name = "ID_HISTORIAL")
    public int getIdHistorial() {
        return idHistorial;
    }

    public void setIdHistorial(int idHistorial) {
        this.idHistorial = idHistorial;
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
    @Column(name = "IDIOMA")
    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    @Basic
    @Column(name = "ID_COHORTE")
    public int getIdCohorte() {
        return idCohorte;
    }

    public void setIdCohorte(int idCohorte) {
        this.idCohorte = idCohorte;
    }

    @Basic
    @Column(name = "REINGRESO")
    public String getReingreso() {
        return reingreso;
    }

    public void setReingreso(String reingreso) {
        this.reingreso = reingreso;
    }

    @Basic
    @Column(name = "ID_CATDISCAPACIDAD")
    public Integer getIdCatdiscapacidad() {
        return idCatdiscapacidad;
    }

    public void setIdCatdiscapacidad(Integer idCatdiscapacidad) {
        this.idCatdiscapacidad = idCatdiscapacidad;
    }

    @Basic
    @Column(name = "IDIOMA_TIPO")
    public String getIdiomaTipo() {
        return idiomaTipo;
    }

    public void setIdiomaTipo(String idiomaTipo) {
        this.idiomaTipo = idiomaTipo;
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
    @Column(name = "REGULAR")
    public String getRegular() {
        return regular;
    }

    public void setRegular(String regular) {
        this.regular = regular;
    }

    @Basic
    @Column(name = "FOLIO_F1")
    public String getFolioF1() {
        return folioF1;
    }

    public void setFolioF1(String folioF1) {
        this.folioF1 = folioF1;
    }

    @Basic
    @Column(name = "BECA_OPOR")
    public String getBecaOpor() {
        return becaOpor;
    }

    public void setBecaOpor(String becaOpor) {
        this.becaOpor = becaOpor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SigaaCatAlumno that = (SigaaCatAlumno) o;
        return matricula == that.matricula &&
                idEstatus == that.idEstatus &&
                idGrupo == that.idGrupo &&
                idHistorial == that.idHistorial &&
                idCohorte == that.idCohorte &&
                Objects.equals(nombre, that.nombre) &&
                Objects.equals(apePat, that.apePat) &&
                Objects.equals(apeMat, that.apeMat) &&
                Objects.equals(fechaNac, that.fechaNac) &&
                Objects.equals(curp, that.curp) &&
                Objects.equals(tipoSangre, that.tipoSangre) &&
                Objects.equals(genero, that.genero) &&
                Objects.equals(pais, that.pais) &&
                Objects.equals(edoNac, that.edoNac) &&
                Objects.equals(municipio, that.municipio) &&
                Objects.equals(direccion, that.direccion) &&
                Objects.equals(colonia, that.colonia) &&
                Objects.equals(codPostal, that.codPostal) &&
                Objects.equals(telCasa, that.telCasa) &&
                Objects.equals(celular, that.celular) &&
                Objects.equals(email, that.email) &&
                Objects.equals(nssImss, that.nssImss) &&
                Objects.equals(trabaja, that.trabaja) &&
                Objects.equals(ocupacion, that.ocupacion) &&
                Objects.equals(estadoCivil, that.estadoCivil) &&
                Objects.equals(idUsuario, that.idUsuario) &&
                Objects.equals(idioma, that.idioma) &&
                Objects.equals(reingreso, that.reingreso) &&
                Objects.equals(idCatdiscapacidad, that.idCatdiscapacidad) &&
                Objects.equals(idiomaTipo, that.idiomaTipo) &&
                Objects.equals(idComunidad, that.idComunidad) &&
                Objects.equals(regular, that.regular) &&
                Objects.equals(folioF1, that.folioF1) &&
                Objects.equals(becaOpor, that.becaOpor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(matricula, nombre, apePat, apeMat, fechaNac, curp, tipoSangre, genero, pais, edoNac, municipio, direccion, colonia, codPostal, telCasa, celular, email, nssImss, trabaja, ocupacion, estadoCivil, idEstatus, idGrupo, idHistorial, idUsuario, idioma, idCohorte, reingreso, idCatdiscapacidad, idiomaTipo, idComunidad, regular, folioF1, becaOpor);
    }

    @OneToMany(mappedBy = "sigaaCatAlumnoByMatricula")
    public List<SigaaAlumnoDetServicios> getSigaaAlumnoDetServiciosByMatricula() {
        return sigaaAlumnoDetServiciosByMatricula;
    }

    public void setSigaaAlumnoDetServiciosByMatricula(List<SigaaAlumnoDetServicios> sigaaAlumnoDetServiciosByMatricula) {
        this.sigaaAlumnoDetServiciosByMatricula = sigaaAlumnoDetServiciosByMatricula;
    }

    @OneToMany(mappedBy = "sigaaCatAlumnoByMatricula")
    public List<SigaaAlumnoEvento> getSigaaAlumnoEventosByMatricula() {
        return sigaaAlumnoEventosByMatricula;
    }

    public void setSigaaAlumnoEventosByMatricula(List<SigaaAlumnoEvento> sigaaAlumnoEventosByMatricula) {
        this.sigaaAlumnoEventosByMatricula = sigaaAlumnoEventosByMatricula;
    }

    @OneToMany(mappedBy = "sigaaCatAlumnoByMatricula")
    public List<SigaaAlumnoPreguntas> getSigaaAlumnoPreguntasByMatricula() {
        return sigaaAlumnoPreguntasByMatricula;
    }

    public void setSigaaAlumnoPreguntasByMatricula(List<SigaaAlumnoPreguntas> sigaaAlumnoPreguntasByMatricula) {
        this.sigaaAlumnoPreguntasByMatricula = sigaaAlumnoPreguntasByMatricula;
    }

    @OneToMany(mappedBy = "sigaaCatAlumnoByMatricula")
    public List<SigaaBajas> getSigaaBajasByMatricula() {
        return sigaaBajasByMatricula;
    }

    public void setSigaaBajasByMatricula(List<SigaaBajas> sigaaBajasByMatricula) {
        this.sigaaBajasByMatricula = sigaaBajasByMatricula;
    }

    @OneToMany(mappedBy = "sigaaCatAlumnoByMatricula")
    public List<SigaaCargaAcademicaAlumno> getSigaaCargaAcademicaAlumnosByMatricula() {
        return sigaaCargaAcademicaAlumnosByMatricula;
    }

    public void setSigaaCargaAcademicaAlumnosByMatricula(List<SigaaCargaAcademicaAlumno> sigaaCargaAcademicaAlumnosByMatricula) {
        this.sigaaCargaAcademicaAlumnosByMatricula = sigaaCargaAcademicaAlumnosByMatricula;
    }

    @OneToMany(mappedBy = "sigaaCatAlumnoByMatricula")
    public List<SigaaCargaTemporal> getSigaaCargaTemporalsByMatricula() {
        return sigaaCargaTemporalsByMatricula;
    }

    public void setSigaaCargaTemporalsByMatricula(List<SigaaCargaTemporal> sigaaCargaTemporalsByMatricula) {
        this.sigaaCargaTemporalsByMatricula = sigaaCargaTemporalsByMatricula;
    }

    @ManyToOne
    @JoinColumn(name = "ID_ESTATUS", referencedColumnName = "ID_ESTATUS", nullable = false, insertable = false, updatable = false)
    public SigaaCatEstatus getSigaaCatEstatusByIdEstatus() {
        return sigaaCatEstatusByIdEstatus;
    }

    public void setSigaaCatEstatusByIdEstatus(SigaaCatEstatus sigaaCatEstatusByIdEstatus) {
        this.sigaaCatEstatusByIdEstatus = sigaaCatEstatusByIdEstatus;
    }

    @ManyToOne
    @JoinColumn(name = "ID_GRUPO", referencedColumnName = "ID_GRUPO", nullable = false, insertable = false, updatable = false)
    public SigaaCatGrupo getSigaaCatGrupoByIdGrupo() {
        return sigaaCatGrupoByIdGrupo;
    }

    public void setSigaaCatGrupoByIdGrupo(SigaaCatGrupo sigaaCatGrupoByIdGrupo) {
        this.sigaaCatGrupoByIdGrupo = sigaaCatGrupoByIdGrupo;
    }

    @ManyToOne
    @JoinColumn(name = "ID_HISTORIAL", referencedColumnName = "ID_HISTORIAL", nullable = false, insertable = false, updatable = false)
    public SigaaHistoacademico getSigaaHistoacademicoByIdHistorial() {
        return sigaaHistoacademicoByIdHistorial;
    }

    public void setSigaaHistoacademicoByIdHistorial(SigaaHistoacademico sigaaHistoacademicoByIdHistorial) {
        this.sigaaHistoacademicoByIdHistorial = sigaaHistoacademicoByIdHistorial;
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
    @JsonIgnore
    @JoinColumn(name = "ID_COHORTE", referencedColumnName = "ID_COHORTE", nullable = false, insertable = false, updatable = false)
    public SigaaCohorteGenerado getSigaaCohorteGeneradoByIdCohorte() {
        return sigaaCohorteGeneradoByIdCohorte;
    }

    public void setSigaaCohorteGeneradoByIdCohorte(SigaaCohorteGenerado sigaaCohorteGeneradoByIdCohorte) {
        this.sigaaCohorteGeneradoByIdCohorte = sigaaCohorteGeneradoByIdCohorte;
    }

    @ManyToOne
    @JoinColumn(name = "ID_CATDISCAPACIDAD", referencedColumnName = "ID_CATDISCAPACIDAD", insertable = false, updatable = false)
    public SigaaCatDiscapacidad getSigaaCatDiscapacidadByIdCatdiscapacidad() {
        return sigaaCatDiscapacidadByIdCatdiscapacidad;
    }

    public void setSigaaCatDiscapacidadByIdCatdiscapacidad(SigaaCatDiscapacidad sigaaCatDiscapacidadByIdCatdiscapacidad) {
        this.sigaaCatDiscapacidadByIdCatdiscapacidad = sigaaCatDiscapacidadByIdCatdiscapacidad;
    }

    @ManyToOne
    @JoinColumn(name = "ID_COMUNIDAD", referencedColumnName = "ID_COMUNIDAD", insertable = false, updatable = false)
    public SigaaCatComunidad getSigaaCatComunidadByIdComunidad() {
        return sigaaCatComunidadByIdComunidad;
    }

    public void setSigaaCatComunidadByIdComunidad(SigaaCatComunidad sigaaCatComunidadByIdComunidad) {
        this.sigaaCatComunidadByIdComunidad = sigaaCatComunidadByIdComunidad;
    }

    @OneToMany(mappedBy = "sigaaCatAlumnoByMatricula")
    public List<SigaaCatPagosInternos> getSigaaCatPagosInternosByMatricula() {
        return sigaaCatPagosInternosByMatricula;
    }

    public void setSigaaCatPagosInternosByMatricula(List<SigaaCatPagosInternos> sigaaCatPagosInternosByMatricula) {
        this.sigaaCatPagosInternosByMatricula = sigaaCatPagosInternosByMatricula;
    }

    @OneToMany(mappedBy = "sigaaCatAlumnoByMatricula")
    public List<SigaaCatTituloElectronico> getSigaaCatTituloElectronicosByMatricula() {
        return sigaaCatTituloElectronicosByMatricula;
    }

    public void setSigaaCatTituloElectronicosByMatricula(List<SigaaCatTituloElectronico> sigaaCatTituloElectronicosByMatricula) {
        this.sigaaCatTituloElectronicosByMatricula = sigaaCatTituloElectronicosByMatricula;
    }

    @OneToMany(mappedBy = "sigaaCatAlumnoByMatricula")
    public List<SigaaDatosEstancias> getSigaaDatosEstanciasByMatricula() {
        return sigaaDatosEstanciasByMatricula;
    }

    public void setSigaaDatosEstanciasByMatricula(List<SigaaDatosEstancias> sigaaDatosEstanciasByMatricula) {
        this.sigaaDatosEstanciasByMatricula = sigaaDatosEstanciasByMatricula;
    }

    @OneToMany(mappedBy = "sigaaCatAlumnoByMatricula")
    public List<SigaaDetAlumnoExento> getSigaaDetAlumnoExentosByMatricula() {
        return sigaaDetAlumnoExentosByMatricula;
    }

    public void setSigaaDetAlumnoExentosByMatricula(List<SigaaDetAlumnoExento> sigaaDetAlumnoExentosByMatricula) {
        this.sigaaDetAlumnoExentosByMatricula = sigaaDetAlumnoExentosByMatricula;
    }

    @OneToMany(mappedBy = "sigaaCatAlumnoByMatricula")
    public List<SigaaDetCalificaciones> getSigaaDetCalificacionesByMatricula() {
        return sigaaDetCalificacionesByMatricula;
    }

    public void setSigaaDetCalificacionesByMatricula(List<SigaaDetCalificaciones> sigaaDetCalificacionesByMatricula) {
        this.sigaaDetCalificacionesByMatricula = sigaaDetCalificacionesByMatricula;
    }

    @OneToMany(mappedBy = "sigaaCatAlumnoByMatricula")
    public List<SigaaDetDatosfamiliares> getSigaaDetDatosfamiliaresByMatricula() {
        return sigaaDetDatosfamiliaresByMatricula;
    }

    public void setSigaaDetDatosfamiliaresByMatricula(List<SigaaDetDatosfamiliares> sigaaDetDatosfamiliaresByMatricula) {
        this.sigaaDetDatosfamiliaresByMatricula = sigaaDetDatosfamiliaresByMatricula;
    }

    @OneToMany(mappedBy = "sigaaCatAlumnoByMatricula")
    public List<SigaaDetPagosAlumno> getSigaaDetPagosAlumnosByMatricula() {
        return sigaaDetPagosAlumnosByMatricula;
    }

    public void setSigaaDetPagosAlumnosByMatricula(List<SigaaDetPagosAlumno> sigaaDetPagosAlumnosByMatricula) {
        this.sigaaDetPagosAlumnosByMatricula = sigaaDetPagosAlumnosByMatricula;
    }

    @OneToMany(mappedBy = "sigaaCatAlumnoByMatricula")
    public List<SigaaDocumentosTitulacion> getSigaaDocumentosTitulacionsByMatricula() {
        return sigaaDocumentosTitulacionsByMatricula;
    }

    public void setSigaaDocumentosTitulacionsByMatricula(List<SigaaDocumentosTitulacion> sigaaDocumentosTitulacionsByMatricula) {
        this.sigaaDocumentosTitulacionsByMatricula = sigaaDocumentosTitulacionsByMatricula;
    }

    @OneToMany(mappedBy = "sigaaCatAlumnoByMatricula")
    public List<SigaaTutorias> getSigaaTutoriasByMatricula() {
        return sigaaTutoriasByMatricula;
    }

    public void setSigaaTutoriasByMatricula(List<SigaaTutorias> sigaaTutoriasByMatricula) {
        this.sigaaTutoriasByMatricula = sigaaTutoriasByMatricula;
    }
}
