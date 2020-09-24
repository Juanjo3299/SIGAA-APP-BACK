package com.api.sigaa.app.model.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "SIGAA_CAT_ASPIRANTE", schema = "dbo", catalog = "SIGAA")
public class SigaaCatAspirante {
    private int folio;
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
    private String becaOportunidades;
    private String folioF1;
    private String informacion;
    private int op1;
    private int op2;
    private int idPeriodo;
    private String estatus;
    private String idioma;
    private Integer idDiscapacidad;
    private Integer idComunidadEtnica;
    private Integer idUsuarioAspirante;
    private Integer idPeriodoOrdinario;
    private List<SigaaAlumnoCuatriCero> sigaaAlumnoCuatriCerosByFolio;
    private List<SigaaAspirantesResultados> sigaaAspirantesResultadosByFolio;
    private List<SigaaCargaAcademicaAlumnoCuatriCero> sigaaCargaAcademicaAlumnoCuatriCerosByFolio;
    private SigaaCatCarrera sigaaCatCarreraByOp1;
    private SigaaCatCarrera sigaaCatCarreraByOp2;
    private SigaaCatPeriodo sigaaCatPeriodoByIdPeriodo;
    private SigaaCatDiscapacidad sigaaCatDiscapacidadByIdDiscapacidad;
    private SigaaCatComunidad sigaaCatComunidadByIdComunidadEtnica;
    private Usuario usuarioByIdUsuarioAspirante;
    private SigaaCatPeriodo sigaaCatPeriodoByIdPeriodoOrdinario;
    private List<SigaaCatPagosExternos> sigaaCatPagosExternosByFolio;
    private List<SigaaDetCalificacionesCuatriCero> sigaaDetCalificacionesCuatriCerosByFolio;
    private List<SigaaDetEscolaridadAspirante> sigaaDetEscolaridadAspirantesByFolio;
    private List<SigaaDetFamAspirante> sigaaDetFamAspirantesByFolio;
    private List<SigaaDetPagosAspirante> sigaaDetPagosAspirantesByFolio;

    @Id
    @Column(name = "FOLIO")
    public int getFolio() {
        return folio;
    }

    public void setFolio(int folio) {
        this.folio = folio;
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
    @Column(name = "BECA_OPORTUNIDADES")
    public String getBecaOportunidades() {
        return becaOportunidades;
    }

    public void setBecaOportunidades(String becaOportunidades) {
        this.becaOportunidades = becaOportunidades;
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
    @Column(name = "INFORMACION")
    public String getInformacion() {
        return informacion;
    }

    public void setInformacion(String informacion) {
        this.informacion = informacion;
    }

    @Basic
    @Column(name = "OP1")
    public int getOp1() {
        return op1;
    }

    public void setOp1(int op1) {
        this.op1 = op1;
    }

    @Basic
    @Column(name = "OP2")
    public int getOp2() {
        return op2;
    }

    public void setOp2(int op2) {
        this.op2 = op2;
    }

    @Basic
    @Column(name = "ID_PERIODO")
    public int getIdPeriodo() {
        return idPeriodo;
    }

    public void setIdPeriodo(int idPeriodo) {
        this.idPeriodo = idPeriodo;
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
    @Column(name = "IDIOMA")
    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
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
    @Column(name = "ID_COMUNIDAD_ETNICA")
    public Integer getIdComunidadEtnica() {
        return idComunidadEtnica;
    }

    public void setIdComunidadEtnica(Integer idComunidadEtnica) {
        this.idComunidadEtnica = idComunidadEtnica;
    }

    @Basic
    @Column(name = "ID_USUARIO_ASPIRANTE")
    public Integer getIdUsuarioAspirante() {
        return idUsuarioAspirante;
    }

    public void setIdUsuarioAspirante(Integer idUsuarioAspirante) {
        this.idUsuarioAspirante = idUsuarioAspirante;
    }

    @Basic
    @Column(name = "ID_PERIODO_ORDINARIO")
    public Integer getIdPeriodoOrdinario() {
        return idPeriodoOrdinario;
    }

    public void setIdPeriodoOrdinario(Integer idPeriodoOrdinario) {
        this.idPeriodoOrdinario = idPeriodoOrdinario;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SigaaCatAspirante that = (SigaaCatAspirante) o;
        return folio == that.folio &&
                matricula == that.matricula &&
                op1 == that.op1 &&
                op2 == that.op2 &&
                idPeriodo == that.idPeriodo &&
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
                Objects.equals(becaOportunidades, that.becaOportunidades) &&
                Objects.equals(folioF1, that.folioF1) &&
                Objects.equals(informacion, that.informacion) &&
                Objects.equals(estatus, that.estatus) &&
                Objects.equals(idioma, that.idioma) &&
                Objects.equals(idDiscapacidad, that.idDiscapacidad) &&
                Objects.equals(idComunidadEtnica, that.idComunidadEtnica) &&
                Objects.equals(idUsuarioAspirante, that.idUsuarioAspirante) &&
                Objects.equals(idPeriodoOrdinario, that.idPeriodoOrdinario);
    }

    @Override
    public int hashCode() {
        return Objects.hash(folio, matricula, nombre, apePat, apeMat, fechaNac, curp, tipoSangre, genero, pais, edoNac, municipio, direccion, colonia, codPostal, telCasa, celular, email, nssImss, trabaja, ocupacion, estadoCivil, becaOportunidades, folioF1, informacion, op1, op2, idPeriodo, estatus, idioma, idDiscapacidad, idComunidadEtnica, idUsuarioAspirante, idPeriodoOrdinario);
    }

    @OneToMany(mappedBy = "sigaaCatAspiranteByFolio")
    public List<SigaaAlumnoCuatriCero> getSigaaAlumnoCuatriCerosByFolio() {
        return sigaaAlumnoCuatriCerosByFolio;
    }

    public void setSigaaAlumnoCuatriCerosByFolio(List<SigaaAlumnoCuatriCero> sigaaAlumnoCuatriCerosByFolio) {
        this.sigaaAlumnoCuatriCerosByFolio = sigaaAlumnoCuatriCerosByFolio;
    }

    @OneToMany(mappedBy = "sigaaCatAspiranteByFolio")
    public List<SigaaAspirantesResultados> getSigaaAspirantesResultadosByFolio() {
        return sigaaAspirantesResultadosByFolio;
    }

    public void setSigaaAspirantesResultadosByFolio(List<SigaaAspirantesResultados> sigaaAspirantesResultadosByFolio) {
        this.sigaaAspirantesResultadosByFolio = sigaaAspirantesResultadosByFolio;
    }

    @OneToMany(mappedBy = "sigaaCatAspiranteByFolio")
    public List<SigaaCargaAcademicaAlumnoCuatriCero> getSigaaCargaAcademicaAlumnoCuatriCerosByFolio() {
        return sigaaCargaAcademicaAlumnoCuatriCerosByFolio;
    }

    public void setSigaaCargaAcademicaAlumnoCuatriCerosByFolio(List<SigaaCargaAcademicaAlumnoCuatriCero> sigaaCargaAcademicaAlumnoCuatriCerosByFolio) {
        this.sigaaCargaAcademicaAlumnoCuatriCerosByFolio = sigaaCargaAcademicaAlumnoCuatriCerosByFolio;
    }

    @ManyToOne
    @JoinColumn(name = "OP1", referencedColumnName = "ID_CARRERA", nullable = false, insertable = false, updatable = false)
    public SigaaCatCarrera getSigaaCatCarreraByOp1() {
        return sigaaCatCarreraByOp1;
    }

    public void setSigaaCatCarreraByOp1(SigaaCatCarrera sigaaCatCarreraByOp1) {
        this.sigaaCatCarreraByOp1 = sigaaCatCarreraByOp1;
    }

    @ManyToOne
    @JoinColumn(name = "OP2", referencedColumnName = "ID_CARRERA", nullable = false, insertable = false, updatable = false)
    public SigaaCatCarrera getSigaaCatCarreraByOp2() {
        return sigaaCatCarreraByOp2;
    }

    public void setSigaaCatCarreraByOp2(SigaaCatCarrera sigaaCatCarreraByOp2) {
        this.sigaaCatCarreraByOp2 = sigaaCatCarreraByOp2;
    }

    @ManyToOne
    @JoinColumn(name = "ID_PERIODO", referencedColumnName = "ID_PERIODO", nullable = false, insertable = false, updatable = false)
    public SigaaCatPeriodo getSigaaCatPeriodoByIdPeriodo() {
        return sigaaCatPeriodoByIdPeriodo;
    }

    public void setSigaaCatPeriodoByIdPeriodo(SigaaCatPeriodo sigaaCatPeriodoByIdPeriodo) {
        this.sigaaCatPeriodoByIdPeriodo = sigaaCatPeriodoByIdPeriodo;
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
    @JoinColumn(name = "ID_COMUNIDAD_ETNICA", referencedColumnName = "ID_COMUNIDAD", insertable = false, updatable = false)
    public SigaaCatComunidad getSigaaCatComunidadByIdComunidadEtnica() {
        return sigaaCatComunidadByIdComunidadEtnica;
    }

    public void setSigaaCatComunidadByIdComunidadEtnica(SigaaCatComunidad sigaaCatComunidadByIdComunidadEtnica) {
        this.sigaaCatComunidadByIdComunidadEtnica = sigaaCatComunidadByIdComunidadEtnica;
    }

    @ManyToOne
    @JoinColumn(name = "ID_USUARIO_ASPIRANTE", referencedColumnName = "ID_USUARIO", insertable = false, updatable = false)
    public Usuario getUsuarioByIdUsuarioAspirante() {
        return usuarioByIdUsuarioAspirante;
    }

    public void setUsuarioByIdUsuarioAspirante(Usuario usuarioByIdUsuarioAspirante) {
        this.usuarioByIdUsuarioAspirante = usuarioByIdUsuarioAspirante;
    }

    @ManyToOne
    @JoinColumn(name = "ID_PERIODO_ORDINARIO", referencedColumnName = "ID_PERIODO", insertable = false, updatable = false)
    public SigaaCatPeriodo getSigaaCatPeriodoByIdPeriodoOrdinario() {
        return sigaaCatPeriodoByIdPeriodoOrdinario;
    }

    public void setSigaaCatPeriodoByIdPeriodoOrdinario(SigaaCatPeriodo sigaaCatPeriodoByIdPeriodoOrdinario) {
        this.sigaaCatPeriodoByIdPeriodoOrdinario = sigaaCatPeriodoByIdPeriodoOrdinario;
    }

    @OneToMany(mappedBy = "sigaaCatAspiranteByFolio")
    public List<SigaaCatPagosExternos> getSigaaCatPagosExternosByFolio() {
        return sigaaCatPagosExternosByFolio;
    }

    public void setSigaaCatPagosExternosByFolio(List<SigaaCatPagosExternos> sigaaCatPagosExternosByFolio) {
        this.sigaaCatPagosExternosByFolio = sigaaCatPagosExternosByFolio;
    }

    @OneToMany(mappedBy = "sigaaCatAspiranteByFolio")
    public List<SigaaDetCalificacionesCuatriCero> getSigaaDetCalificacionesCuatriCerosByFolio() {
        return sigaaDetCalificacionesCuatriCerosByFolio;
    }

    public void setSigaaDetCalificacionesCuatriCerosByFolio(List<SigaaDetCalificacionesCuatriCero> sigaaDetCalificacionesCuatriCerosByFolio) {
        this.sigaaDetCalificacionesCuatriCerosByFolio = sigaaDetCalificacionesCuatriCerosByFolio;
    }

    @OneToMany(mappedBy = "sigaaCatAspiranteByFolio")
    public List<SigaaDetEscolaridadAspirante> getSigaaDetEscolaridadAspirantesByFolio() {
        return sigaaDetEscolaridadAspirantesByFolio;
    }

    public void setSigaaDetEscolaridadAspirantesByFolio(List<SigaaDetEscolaridadAspirante> sigaaDetEscolaridadAspirantesByFolio) {
        this.sigaaDetEscolaridadAspirantesByFolio = sigaaDetEscolaridadAspirantesByFolio;
    }

    @OneToMany(mappedBy = "sigaaCatAspiranteByFolio")
    public List<SigaaDetFamAspirante> getSigaaDetFamAspirantesByFolio() {
        return sigaaDetFamAspirantesByFolio;
    }

    public void setSigaaDetFamAspirantesByFolio(List<SigaaDetFamAspirante> sigaaDetFamAspirantesByFolio) {
        this.sigaaDetFamAspirantesByFolio = sigaaDetFamAspirantesByFolio;
    }

    @OneToMany(mappedBy = "sigaaCatAspiranteByFolio")
    public List<SigaaDetPagosAspirante> getSigaaDetPagosAspirantesByFolio() {
        return sigaaDetPagosAspirantesByFolio;
    }

    public void setSigaaDetPagosAspirantesByFolio(List<SigaaDetPagosAspirante> sigaaDetPagosAspirantesByFolio) {
        this.sigaaDetPagosAspirantesByFolio = sigaaDetPagosAspirantesByFolio;
    }
}
