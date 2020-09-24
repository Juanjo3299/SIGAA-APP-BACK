package com.api.sigaa.app.model.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "SIGAA_DET_CALIFICACIONES_CUATRI_CERO", schema = "dbo", catalog = "SIGAA")
public class SigaaDetCalificacionesCuatriCero {
    private int cns;
    private int folio;
    private int idAsignatura;
    private int idGrupo;
    private int idTipoCalificacion;
    private double calificacion;
    private Date fecha;
    private String estatus;
    private SigaaCatAspirante sigaaCatAspiranteByFolio;
    private SigaaCatAsignaturaCuatricero sigaaCatAsignaturaCuatriceroByIdAsignatura;
    private SigaaCatGrupoCuatrimestreCero sigaaCatGrupoCuatrimestreCeroByIdGrupo;
    private SigaaCatTipoCalificacionesCuatriCero sigaaCatTipoCalificacionesCuatriCeroByIdTipoCalificacion;

    @Id
    @Column(name = "CNS")
    public int getCns() {
        return cns;
    }

    public void setCns(int cns) {
        this.cns = cns;
    }

    @Basic
    @Column(name = "FOLIO")
    public int getFolio() {
        return folio;
    }

    public void setFolio(int folio) {
        this.folio = folio;
    }

    @Basic
    @Column(name = "ID_ASIGNATURA")
    public int getIdAsignatura() {
        return idAsignatura;
    }

    public void setIdAsignatura(int idAsignatura) {
        this.idAsignatura = idAsignatura;
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
    @Column(name = "ID_TIPO_CALIFICACION")
    public int getIdTipoCalificacion() {
        return idTipoCalificacion;
    }

    public void setIdTipoCalificacion(int idTipoCalificacion) {
        this.idTipoCalificacion = idTipoCalificacion;
    }

    @Basic
    @Column(name = "CALIFICACION")
    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    @Basic
    @Column(name = "FECHA")
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Basic
    @Column(name = "ESTATUS")
    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SigaaDetCalificacionesCuatriCero that = (SigaaDetCalificacionesCuatriCero) o;
        return cns == that.cns &&
                folio == that.folio &&
                idAsignatura == that.idAsignatura &&
                idGrupo == that.idGrupo &&
                idTipoCalificacion == that.idTipoCalificacion &&
                Double.compare(that.calificacion, calificacion) == 0 &&
                Objects.equals(fecha, that.fecha) &&
                Objects.equals(estatus, that.estatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cns, folio, idAsignatura, idGrupo, idTipoCalificacion, calificacion, fecha, estatus);
    }

    @ManyToOne
    @JoinColumn(name = "FOLIO", referencedColumnName = "FOLIO", nullable = false, insertable = false, updatable = false)
    public SigaaCatAspirante getSigaaCatAspiranteByFolio() {
        return sigaaCatAspiranteByFolio;
    }

    public void setSigaaCatAspiranteByFolio(SigaaCatAspirante sigaaCatAspiranteByFolio) {
        this.sigaaCatAspiranteByFolio = sigaaCatAspiranteByFolio;
    }

    @ManyToOne
    @JoinColumn(name = "ID_ASIGNATURA", referencedColumnName = "ID_ASIGNATURA", nullable = false, insertable = false, updatable = false)
    public SigaaCatAsignaturaCuatricero getSigaaCatAsignaturaCuatriceroByIdAsignatura() {
        return sigaaCatAsignaturaCuatriceroByIdAsignatura;
    }

    public void setSigaaCatAsignaturaCuatriceroByIdAsignatura(SigaaCatAsignaturaCuatricero sigaaCatAsignaturaCuatriceroByIdAsignatura) {
        this.sigaaCatAsignaturaCuatriceroByIdAsignatura = sigaaCatAsignaturaCuatriceroByIdAsignatura;
    }

    @ManyToOne
    @JoinColumn(name = "ID_GRUPO", referencedColumnName = "ID_GRUPO", nullable = false, insertable = false, updatable = false)
    public SigaaCatGrupoCuatrimestreCero getSigaaCatGrupoCuatrimestreCeroByIdGrupo() {
        return sigaaCatGrupoCuatrimestreCeroByIdGrupo;
    }

    public void setSigaaCatGrupoCuatrimestreCeroByIdGrupo(SigaaCatGrupoCuatrimestreCero sigaaCatGrupoCuatrimestreCeroByIdGrupo) {
        this.sigaaCatGrupoCuatrimestreCeroByIdGrupo = sigaaCatGrupoCuatrimestreCeroByIdGrupo;
    }

    @ManyToOne
    @JoinColumn(name = "ID_TIPO_CALIFICACION", referencedColumnName = "ID_TIPO_CALIFICACION", nullable = false, insertable = false, updatable = false)
    public SigaaCatTipoCalificacionesCuatriCero getSigaaCatTipoCalificacionesCuatriCeroByIdTipoCalificacion() {
        return sigaaCatTipoCalificacionesCuatriCeroByIdTipoCalificacion;
    }

    public void setSigaaCatTipoCalificacionesCuatriCeroByIdTipoCalificacion(SigaaCatTipoCalificacionesCuatriCero sigaaCatTipoCalificacionesCuatriCeroByIdTipoCalificacion) {
        this.sigaaCatTipoCalificacionesCuatriCeroByIdTipoCalificacion = sigaaCatTipoCalificacionesCuatriCeroByIdTipoCalificacion;
    }
}
