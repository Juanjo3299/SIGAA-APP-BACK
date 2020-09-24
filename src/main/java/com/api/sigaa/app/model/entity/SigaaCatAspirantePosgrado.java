package com.api.sigaa.app.model.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "SIGAA_CAT_ASPIRANTE_POSGRADO", schema = "dbo", catalog = "SIGAA")
public class SigaaCatAspirantePosgrado {
    private String apeMat;
    private String apePat;
    private String celular;
    private String codPostal;
    private String colonia;
    private String comunidadEtnica;
    private Integer creditosToefl;
    private String curp;
    private String detIdioma;
    private String direccion;
    private String discapacidad;
    private String edoNac;
    private String email;
    private String estadoCivil;
    private String estatus;
    private Timestamp fechaNac;
    private String genero;
    private String idioma;
    private String informacion;
    private String matricula;
    private String municipio;
    private String nombre;
    private String nssImss;
    private String ocupacion;
    private String pais;
    private String telCasa;
    private String tipoSangre;
    private String toefl;
    private String trabaja;
    private Integer detComunidad;
    private Integer detDiscapacidad;
    private Integer idDetEscolaridad;
    private Integer idModalidad;
    private Integer idPeriodo;
    private Integer idUsuario;
    private Integer op1;
    private Integer op2;
    private int folio;
    private List<SigaaAspirantesPosgradoResultados> sigaaAspirantesPosgradoResultadosByFolio;
    private SigaaCatComunidad sigaaCatComunidadByDetComunidad;
    private SigaaCatDiscapacidad sigaaCatDiscapacidadByDetDiscapacidad;
    private SigaaDetEscolaridadAspirantePosgrado sigaaDetEscolaridadAspirantePosgradoByIdDetEscolaridad;
    private SigaaCatModalidad sigaaCatModalidadByIdModalidad;
    private SigaaCatPeriodoConvocatoriaposgrado sigaaCatPeriodoConvocatoriaposgradoByIdPeriodo;
    private Usuario usuarioByIdUsuario;
    private SigaaCatCarrera sigaaCatCarreraByOp1;
    private SigaaCatCarrera sigaaCatCarreraByOp2;
    private List<SigaaCatPagosExternos> sigaaCatPagosExternosByFolio;
    private List<SigaaDetPagosAspirantePosgrado> sigaaDetPagosAspirantePosgradosByFolio;

    @Basic
    @Column(name = "APE_MAT")
    public String getApeMat() {
        return apeMat;
    }

    public void setApeMat(String apeMat) {
        this.apeMat = apeMat;
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
    @Column(name = "CELULAR")
    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
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
    @Column(name = "COLONIA")
    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    @Basic
    @Column(name = "COMUNIDAD_ETNICA")
    public String getComunidadEtnica() {
        return comunidadEtnica;
    }

    public void setComunidadEtnica(String comunidadEtnica) {
        this.comunidadEtnica = comunidadEtnica;
    }

    @Basic
    @Column(name = "CREDITOS_TOEFL")
    public Integer getCreditosToefl() {
        return creditosToefl;
    }

    public void setCreditosToefl(Integer creditosToefl) {
        this.creditosToefl = creditosToefl;
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
    @Column(name = "DET_IDIOMA")
    public String getDetIdioma() {
        return detIdioma;
    }

    public void setDetIdioma(String detIdioma) {
        this.detIdioma = detIdioma;
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
    @Column(name = "DISCAPACIDAD")
    public String getDiscapacidad() {
        return discapacidad;
    }

    public void setDiscapacidad(String discapacidad) {
        this.discapacidad = discapacidad;
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
    @Column(name = "EMAIL")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
    @Column(name = "ESTATUS")
    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    @Basic
    @Column(name = "FECHA_NAC")
    public Timestamp getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Timestamp fechaNac) {
        this.fechaNac = fechaNac;
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
    @Column(name = "IDIOMA")
    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
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
    @Column(name = "MATRICULA")
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
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
    @Column(name = "NOMBRE")
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
    @Column(name = "OCUPACION")
    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
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
    @Column(name = "TEL_CASA")
    public String getTelCasa() {
        return telCasa;
    }

    public void setTelCasa(String telCasa) {
        this.telCasa = telCasa;
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
    @Column(name = "TOEFL")
    public String getToefl() {
        return toefl;
    }

    public void setToefl(String toefl) {
        this.toefl = toefl;
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
    @Column(name = "DET_COMUNIDAD")
    public Integer getDetComunidad() {
        return detComunidad;
    }

    public void setDetComunidad(Integer detComunidad) {
        this.detComunidad = detComunidad;
    }

    @Basic
    @Column(name = "DET_DISCAPACIDAD")
    public Integer getDetDiscapacidad() {
        return detDiscapacidad;
    }

    public void setDetDiscapacidad(Integer detDiscapacidad) {
        this.detDiscapacidad = detDiscapacidad;
    }

    @Basic
    @Column(name = "ID_DET_ESCOLARIDAD")
    public Integer getIdDetEscolaridad() {
        return idDetEscolaridad;
    }

    public void setIdDetEscolaridad(Integer idDetEscolaridad) {
        this.idDetEscolaridad = idDetEscolaridad;
    }

    @Basic
    @Column(name = "ID_MODALIDAD")
    public Integer getIdModalidad() {
        return idModalidad;
    }

    public void setIdModalidad(Integer idModalidad) {
        this.idModalidad = idModalidad;
    }

    @Basic
    @Column(name = "ID_PERIODO")
    public Integer getIdPeriodo() {
        return idPeriodo;
    }

    public void setIdPeriodo(Integer idPeriodo) {
        this.idPeriodo = idPeriodo;
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
    @Column(name = "OP1")
    public Integer getOp1() {
        return op1;
    }

    public void setOp1(Integer op1) {
        this.op1 = op1;
    }

    @Basic
    @Column(name = "OP2")
    public Integer getOp2() {
        return op2;
    }

    public void setOp2(Integer op2) {
        this.op2 = op2;
    }

    @Id
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
        SigaaCatAspirantePosgrado that = (SigaaCatAspirantePosgrado) o;
        return folio == that.folio &&
                Objects.equals(apeMat, that.apeMat) &&
                Objects.equals(apePat, that.apePat) &&
                Objects.equals(celular, that.celular) &&
                Objects.equals(codPostal, that.codPostal) &&
                Objects.equals(colonia, that.colonia) &&
                Objects.equals(comunidadEtnica, that.comunidadEtnica) &&
                Objects.equals(creditosToefl, that.creditosToefl) &&
                Objects.equals(curp, that.curp) &&
                Objects.equals(detIdioma, that.detIdioma) &&
                Objects.equals(direccion, that.direccion) &&
                Objects.equals(discapacidad, that.discapacidad) &&
                Objects.equals(edoNac, that.edoNac) &&
                Objects.equals(email, that.email) &&
                Objects.equals(estadoCivil, that.estadoCivil) &&
                Objects.equals(estatus, that.estatus) &&
                Objects.equals(fechaNac, that.fechaNac) &&
                Objects.equals(genero, that.genero) &&
                Objects.equals(idioma, that.idioma) &&
                Objects.equals(informacion, that.informacion) &&
                Objects.equals(matricula, that.matricula) &&
                Objects.equals(municipio, that.municipio) &&
                Objects.equals(nombre, that.nombre) &&
                Objects.equals(nssImss, that.nssImss) &&
                Objects.equals(ocupacion, that.ocupacion) &&
                Objects.equals(pais, that.pais) &&
                Objects.equals(telCasa, that.telCasa) &&
                Objects.equals(tipoSangre, that.tipoSangre) &&
                Objects.equals(toefl, that.toefl) &&
                Objects.equals(trabaja, that.trabaja) &&
                Objects.equals(detComunidad, that.detComunidad) &&
                Objects.equals(detDiscapacidad, that.detDiscapacidad) &&
                Objects.equals(idDetEscolaridad, that.idDetEscolaridad) &&
                Objects.equals(idModalidad, that.idModalidad) &&
                Objects.equals(idPeriodo, that.idPeriodo) &&
                Objects.equals(idUsuario, that.idUsuario) &&
                Objects.equals(op1, that.op1) &&
                Objects.equals(op2, that.op2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(apeMat, apePat, celular, codPostal, colonia, comunidadEtnica, creditosToefl, curp, detIdioma, direccion, discapacidad, edoNac, email, estadoCivil, estatus, fechaNac, genero, idioma, informacion, matricula, municipio, nombre, nssImss, ocupacion, pais, telCasa, tipoSangre, toefl, trabaja, detComunidad, detDiscapacidad, idDetEscolaridad, idModalidad, idPeriodo, idUsuario, op1, op2, folio);
    }

    @OneToMany(mappedBy = "sigaaCatAspirantePosgradoByFolio")
    public List<SigaaAspirantesPosgradoResultados> getSigaaAspirantesPosgradoResultadosByFolio() {
        return sigaaAspirantesPosgradoResultadosByFolio;
    }

    public void setSigaaAspirantesPosgradoResultadosByFolio(List<SigaaAspirantesPosgradoResultados> sigaaAspirantesPosgradoResultadosByFolio) {
        this.sigaaAspirantesPosgradoResultadosByFolio = sigaaAspirantesPosgradoResultadosByFolio;
    }

    @ManyToOne
    @JoinColumn(name = "DET_COMUNIDAD", referencedColumnName = "ID_COMUNIDAD", insertable = false, updatable = false)
    public SigaaCatComunidad getSigaaCatComunidadByDetComunidad() {
        return sigaaCatComunidadByDetComunidad;
    }

    public void setSigaaCatComunidadByDetComunidad(SigaaCatComunidad sigaaCatComunidadByDetComunidad) {
        this.sigaaCatComunidadByDetComunidad = sigaaCatComunidadByDetComunidad;
    }

    @ManyToOne
    @JoinColumn(name = "DET_DISCAPACIDAD", referencedColumnName = "ID_CATDISCAPACIDAD", insertable = false, updatable = false)
    public SigaaCatDiscapacidad getSigaaCatDiscapacidadByDetDiscapacidad() {
        return sigaaCatDiscapacidadByDetDiscapacidad;
    }

    public void setSigaaCatDiscapacidadByDetDiscapacidad(SigaaCatDiscapacidad sigaaCatDiscapacidadByDetDiscapacidad) {
        this.sigaaCatDiscapacidadByDetDiscapacidad = sigaaCatDiscapacidadByDetDiscapacidad;
    }

    @ManyToOne
    @JoinColumn(name = "ID_DET_ESCOLARIDAD", referencedColumnName = "ID_DET_ESCOLARIDAD", insertable = false, updatable = false)
    public SigaaDetEscolaridadAspirantePosgrado getSigaaDetEscolaridadAspirantePosgradoByIdDetEscolaridad() {
        return sigaaDetEscolaridadAspirantePosgradoByIdDetEscolaridad;
    }

    public void setSigaaDetEscolaridadAspirantePosgradoByIdDetEscolaridad(SigaaDetEscolaridadAspirantePosgrado sigaaDetEscolaridadAspirantePosgradoByIdDetEscolaridad) {
        this.sigaaDetEscolaridadAspirantePosgradoByIdDetEscolaridad = sigaaDetEscolaridadAspirantePosgradoByIdDetEscolaridad;
    }

    @ManyToOne
    @JoinColumn(name = "ID_MODALIDAD", referencedColumnName = "ID_MODALIDAD", insertable = false, updatable = false)
    public SigaaCatModalidad getSigaaCatModalidadByIdModalidad() {
        return sigaaCatModalidadByIdModalidad;
    }

    public void setSigaaCatModalidadByIdModalidad(SigaaCatModalidad sigaaCatModalidadByIdModalidad) {
        this.sigaaCatModalidadByIdModalidad = sigaaCatModalidadByIdModalidad;
    }

    @ManyToOne
    @JoinColumn(name = "ID_PERIODO", referencedColumnName = "ID_PERIODO", insertable = false, updatable = false)
    public SigaaCatPeriodoConvocatoriaposgrado getSigaaCatPeriodoConvocatoriaposgradoByIdPeriodo() {
        return sigaaCatPeriodoConvocatoriaposgradoByIdPeriodo;
    }

    public void setSigaaCatPeriodoConvocatoriaposgradoByIdPeriodo(SigaaCatPeriodoConvocatoriaposgrado sigaaCatPeriodoConvocatoriaposgradoByIdPeriodo) {
        this.sigaaCatPeriodoConvocatoriaposgradoByIdPeriodo = sigaaCatPeriodoConvocatoriaposgradoByIdPeriodo;
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
    @JoinColumn(name = "OP1", referencedColumnName = "ID_CARRERA", insertable = false, updatable = false)
    public SigaaCatCarrera getSigaaCatCarreraByOp1() {
        return sigaaCatCarreraByOp1;
    }

    public void setSigaaCatCarreraByOp1(SigaaCatCarrera sigaaCatCarreraByOp1) {
        this.sigaaCatCarreraByOp1 = sigaaCatCarreraByOp1;
    }

    @ManyToOne
    @JoinColumn(name = "OP2", referencedColumnName = "ID_CARRERA", insertable = false, updatable = false)
    public SigaaCatCarrera getSigaaCatCarreraByOp2() {
        return sigaaCatCarreraByOp2;
    }

    public void setSigaaCatCarreraByOp2(SigaaCatCarrera sigaaCatCarreraByOp2) {
        this.sigaaCatCarreraByOp2 = sigaaCatCarreraByOp2;
    }

    @OneToMany(mappedBy = "sigaaCatAspirantePosgradoByFolioPosgrado")
    public List<SigaaCatPagosExternos> getSigaaCatPagosExternosByFolio() {
        return sigaaCatPagosExternosByFolio;
    }

    public void setSigaaCatPagosExternosByFolio(List<SigaaCatPagosExternos> sigaaCatPagosExternosByFolio) {
        this.sigaaCatPagosExternosByFolio = sigaaCatPagosExternosByFolio;
    }

    @OneToMany(mappedBy = "sigaaCatAspirantePosgradoByFolio")
    public List<SigaaDetPagosAspirantePosgrado> getSigaaDetPagosAspirantePosgradosByFolio() {
        return sigaaDetPagosAspirantePosgradosByFolio;
    }

    public void setSigaaDetPagosAspirantePosgradosByFolio(List<SigaaDetPagosAspirantePosgrado> sigaaDetPagosAspirantePosgradosByFolio) {
        this.sigaaDetPagosAspirantePosgradosByFolio = sigaaDetPagosAspirantePosgradosByFolio;
    }
}
