package com.api.sigaa.app.model.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "SIGAA_CAT_ALUMNO_MODIFICASO", schema = "dbo", catalog = "SIGAA")
public class SigaaCatAlumnoModificaso {
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
    private int idGeneracion;
    private int idCarrera;
    private int idGrupo;
    private int idHistorial;
    private String column1;
    private String column2;
    private String column3;
    private String column4;
    private String column5;
    private String column6;
    private String column7;
    private String column8;
    private String column9;
    private String column10;
    private String column11;
    private String column12;
    private String column13;
    private String column14;
    private String column15;
    private String column16;
    private String column17;
    private String column18;
    private String column19;
    private String column20;
    private String column21;
    private String column22;
    private String column23;
    private String column24;
    private String column25;
    private String column26;
    private String column27;
    private String column28;
    private String column29;
    private String column30;
    private String column31;
    private String column32;
    private String column33;
    private String column34;
    private String column35;
    private String column36;
    private String column37;
    private String column38;
    private String column39;
    private String column40;
    private String column41;
    private String column42;
    private String column43;
    private String column44;
    private String column45;
    private SigaaCatEstatus sigaaCatEstatusByIdEstatus;
    private SigaaCatGeneracion sigaaCatGeneracionByIdGeneracion;
    private SigaaCatCarrera sigaaCatCarreraByIdCarrera;
    private SigaaCatGrupo sigaaCatGrupoByIdGrupo;
    private SigaaHistoacademico sigaaHistoacademicoByIdHistorial;

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
    @Column(name = "ID_GENERACION")
    public int getIdGeneracion() {
        return idGeneracion;
    }

    public void setIdGeneracion(int idGeneracion) {
        this.idGeneracion = idGeneracion;
    }

    @Basic
    @Column(name = "ID_CARRERA")
    public int getIdCarrera() {
        return idCarrera;
    }

    public void setIdCarrera(int idCarrera) {
        this.idCarrera = idCarrera;
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
    @Column(name = "COLUMN1")
    public String getColumn1() {
        return column1;
    }

    public void setColumn1(String column1) {
        this.column1 = column1;
    }

    @Basic
    @Column(name = "COLUMN2")
    public String getColumn2() {
        return column2;
    }

    public void setColumn2(String column2) {
        this.column2 = column2;
    }

    @Basic
    @Column(name = "COLUMN3")
    public String getColumn3() {
        return column3;
    }

    public void setColumn3(String column3) {
        this.column3 = column3;
    }

    @Basic
    @Column(name = "COLUMN4")
    public String getColumn4() {
        return column4;
    }

    public void setColumn4(String column4) {
        this.column4 = column4;
    }

    @Basic
    @Column(name = "COLUMN5")
    public String getColumn5() {
        return column5;
    }

    public void setColumn5(String column5) {
        this.column5 = column5;
    }

    @Basic
    @Column(name = "COLUMN6")
    public String getColumn6() {
        return column6;
    }

    public void setColumn6(String column6) {
        this.column6 = column6;
    }

    @Basic
    @Column(name = "COLUMN7")
    public String getColumn7() {
        return column7;
    }

    public void setColumn7(String column7) {
        this.column7 = column7;
    }

    @Basic
    @Column(name = "COLUMN8")
    public String getColumn8() {
        return column8;
    }

    public void setColumn8(String column8) {
        this.column8 = column8;
    }

    @Basic
    @Column(name = "COLUMN9")
    public String getColumn9() {
        return column9;
    }

    public void setColumn9(String column9) {
        this.column9 = column9;
    }

    @Basic
    @Column(name = "COLUMN10")
    public String getColumn10() {
        return column10;
    }

    public void setColumn10(String column10) {
        this.column10 = column10;
    }

    @Basic
    @Column(name = "COLUMN11")
    public String getColumn11() {
        return column11;
    }

    public void setColumn11(String column11) {
        this.column11 = column11;
    }

    @Basic
    @Column(name = "COLUMN12")
    public String getColumn12() {
        return column12;
    }

    public void setColumn12(String column12) {
        this.column12 = column12;
    }

    @Basic
    @Column(name = "COLUMN13")
    public String getColumn13() {
        return column13;
    }

    public void setColumn13(String column13) {
        this.column13 = column13;
    }

    @Basic
    @Column(name = "COLUMN14")
    public String getColumn14() {
        return column14;
    }

    public void setColumn14(String column14) {
        this.column14 = column14;
    }

    @Basic
    @Column(name = "COLUMN15")
    public String getColumn15() {
        return column15;
    }

    public void setColumn15(String column15) {
        this.column15 = column15;
    }

    @Basic
    @Column(name = "COLUMN16")
    public String getColumn16() {
        return column16;
    }

    public void setColumn16(String column16) {
        this.column16 = column16;
    }

    @Basic
    @Column(name = "COLUMN17")
    public String getColumn17() {
        return column17;
    }

    public void setColumn17(String column17) {
        this.column17 = column17;
    }

    @Basic
    @Column(name = "COLUMN18")
    public String getColumn18() {
        return column18;
    }

    public void setColumn18(String column18) {
        this.column18 = column18;
    }

    @Basic
    @Column(name = "COLUMN19")
    public String getColumn19() {
        return column19;
    }

    public void setColumn19(String column19) {
        this.column19 = column19;
    }

    @Basic
    @Column(name = "COLUMN20")
    public String getColumn20() {
        return column20;
    }

    public void setColumn20(String column20) {
        this.column20 = column20;
    }

    @Basic
    @Column(name = "COLUMN21")
    public String getColumn21() {
        return column21;
    }

    public void setColumn21(String column21) {
        this.column21 = column21;
    }

    @Basic
    @Column(name = "COLUMN22")
    public String getColumn22() {
        return column22;
    }

    public void setColumn22(String column22) {
        this.column22 = column22;
    }

    @Basic
    @Column(name = "COLUMN23")
    public String getColumn23() {
        return column23;
    }

    public void setColumn23(String column23) {
        this.column23 = column23;
    }

    @Basic
    @Column(name = "COLUMN24")
    public String getColumn24() {
        return column24;
    }

    public void setColumn24(String column24) {
        this.column24 = column24;
    }

    @Basic
    @Column(name = "COLUMN25")
    public String getColumn25() {
        return column25;
    }

    public void setColumn25(String column25) {
        this.column25 = column25;
    }

    @Basic
    @Column(name = "COLUMN26")
    public String getColumn26() {
        return column26;
    }

    public void setColumn26(String column26) {
        this.column26 = column26;
    }

    @Basic
    @Column(name = "COLUMN27")
    public String getColumn27() {
        return column27;
    }

    public void setColumn27(String column27) {
        this.column27 = column27;
    }

    @Basic
    @Column(name = "COLUMN28")
    public String getColumn28() {
        return column28;
    }

    public void setColumn28(String column28) {
        this.column28 = column28;
    }

    @Basic
    @Column(name = "COLUMN29")
    public String getColumn29() {
        return column29;
    }

    public void setColumn29(String column29) {
        this.column29 = column29;
    }

    @Basic
    @Column(name = "COLUMN30")
    public String getColumn30() {
        return column30;
    }

    public void setColumn30(String column30) {
        this.column30 = column30;
    }

    @Basic
    @Column(name = "COLUMN31")
    public String getColumn31() {
        return column31;
    }

    public void setColumn31(String column31) {
        this.column31 = column31;
    }

    @Basic
    @Column(name = "COLUMN32")
    public String getColumn32() {
        return column32;
    }

    public void setColumn32(String column32) {
        this.column32 = column32;
    }

    @Basic
    @Column(name = "COLUMN33")
    public String getColumn33() {
        return column33;
    }

    public void setColumn33(String column33) {
        this.column33 = column33;
    }

    @Basic
    @Column(name = "COLUMN34")
    public String getColumn34() {
        return column34;
    }

    public void setColumn34(String column34) {
        this.column34 = column34;
    }

    @Basic
    @Column(name = "COLUMN35")
    public String getColumn35() {
        return column35;
    }

    public void setColumn35(String column35) {
        this.column35 = column35;
    }

    @Basic
    @Column(name = "COLUMN36")
    public String getColumn36() {
        return column36;
    }

    public void setColumn36(String column36) {
        this.column36 = column36;
    }

    @Basic
    @Column(name = "COLUMN37")
    public String getColumn37() {
        return column37;
    }

    public void setColumn37(String column37) {
        this.column37 = column37;
    }

    @Basic
    @Column(name = "COLUMN38")
    public String getColumn38() {
        return column38;
    }

    public void setColumn38(String column38) {
        this.column38 = column38;
    }

    @Basic
    @Column(name = "COLUMN39")
    public String getColumn39() {
        return column39;
    }

    public void setColumn39(String column39) {
        this.column39 = column39;
    }

    @Basic
    @Column(name = "COLUMN40")
    public String getColumn40() {
        return column40;
    }

    public void setColumn40(String column40) {
        this.column40 = column40;
    }

    @Basic
    @Column(name = "COLUMN41")
    public String getColumn41() {
        return column41;
    }

    public void setColumn41(String column41) {
        this.column41 = column41;
    }

    @Basic
    @Column(name = "COLUMN42")
    public String getColumn42() {
        return column42;
    }

    public void setColumn42(String column42) {
        this.column42 = column42;
    }

    @Basic
    @Column(name = "COLUMN43")
    public String getColumn43() {
        return column43;
    }

    public void setColumn43(String column43) {
        this.column43 = column43;
    }

    @Basic
    @Column(name = "COLUMN44")
    public String getColumn44() {
        return column44;
    }

    public void setColumn44(String column44) {
        this.column44 = column44;
    }

    @Basic
    @Column(name = "COLUMN45")
    public String getColumn45() {
        return column45;
    }

    public void setColumn45(String column45) {
        this.column45 = column45;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SigaaCatAlumnoModificaso that = (SigaaCatAlumnoModificaso) o;
        return matricula == that.matricula &&
                idEstatus == that.idEstatus &&
                idGeneracion == that.idGeneracion &&
                idCarrera == that.idCarrera &&
                idGrupo == that.idGrupo &&
                idHistorial == that.idHistorial &&
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
                Objects.equals(column1, that.column1) &&
                Objects.equals(column2, that.column2) &&
                Objects.equals(column3, that.column3) &&
                Objects.equals(column4, that.column4) &&
                Objects.equals(column5, that.column5) &&
                Objects.equals(column6, that.column6) &&
                Objects.equals(column7, that.column7) &&
                Objects.equals(column8, that.column8) &&
                Objects.equals(column9, that.column9) &&
                Objects.equals(column10, that.column10) &&
                Objects.equals(column11, that.column11) &&
                Objects.equals(column12, that.column12) &&
                Objects.equals(column13, that.column13) &&
                Objects.equals(column14, that.column14) &&
                Objects.equals(column15, that.column15) &&
                Objects.equals(column16, that.column16) &&
                Objects.equals(column17, that.column17) &&
                Objects.equals(column18, that.column18) &&
                Objects.equals(column19, that.column19) &&
                Objects.equals(column20, that.column20) &&
                Objects.equals(column21, that.column21) &&
                Objects.equals(column22, that.column22) &&
                Objects.equals(column23, that.column23) &&
                Objects.equals(column24, that.column24) &&
                Objects.equals(column25, that.column25) &&
                Objects.equals(column26, that.column26) &&
                Objects.equals(column27, that.column27) &&
                Objects.equals(column28, that.column28) &&
                Objects.equals(column29, that.column29) &&
                Objects.equals(column30, that.column30) &&
                Objects.equals(column31, that.column31) &&
                Objects.equals(column32, that.column32) &&
                Objects.equals(column33, that.column33) &&
                Objects.equals(column34, that.column34) &&
                Objects.equals(column35, that.column35) &&
                Objects.equals(column36, that.column36) &&
                Objects.equals(column37, that.column37) &&
                Objects.equals(column38, that.column38) &&
                Objects.equals(column39, that.column39) &&
                Objects.equals(column40, that.column40) &&
                Objects.equals(column41, that.column41) &&
                Objects.equals(column42, that.column42) &&
                Objects.equals(column43, that.column43) &&
                Objects.equals(column44, that.column44) &&
                Objects.equals(column45, that.column45);
    }

    @Override
    public int hashCode() {
        return Objects.hash(matricula, nombre, apePat, apeMat, fechaNac, curp, tipoSangre, genero, pais, edoNac, municipio, direccion, colonia, codPostal, telCasa, celular, email, nssImss, trabaja, ocupacion, estadoCivil, idEstatus, idGeneracion, idCarrera, idGrupo, idHistorial, column1, column2, column3, column4, column5, column6, column7, column8, column9, column10, column11, column12, column13, column14, column15, column16, column17, column18, column19, column20, column21, column22, column23, column24, column25, column26, column27, column28, column29, column30, column31, column32, column33, column34, column35, column36, column37, column38, column39, column40, column41, column42, column43, column44, column45);
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
    @JoinColumn(name = "ID_GENERACION", referencedColumnName = "ID_GENERACION", nullable = false, insertable = false, updatable = false)
    public SigaaCatGeneracion getSigaaCatGeneracionByIdGeneracion() {
        return sigaaCatGeneracionByIdGeneracion;
    }

    public void setSigaaCatGeneracionByIdGeneracion(SigaaCatGeneracion sigaaCatGeneracionByIdGeneracion) {
        this.sigaaCatGeneracionByIdGeneracion = sigaaCatGeneracionByIdGeneracion;
    }

    @ManyToOne
    @JoinColumn(name = "ID_CARRERA", referencedColumnName = "ID_CARRERA", nullable = false, insertable = false, updatable = false)
    public SigaaCatCarrera getSigaaCatCarreraByIdCarrera() {
        return sigaaCatCarreraByIdCarrera;
    }

    public void setSigaaCatCarreraByIdCarrera(SigaaCatCarrera sigaaCatCarreraByIdCarrera) {
        this.sigaaCatCarreraByIdCarrera = sigaaCatCarreraByIdCarrera;
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
}
