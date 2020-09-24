package com.api.sigaa.app.model.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "DET_USUARIOS", schema = "dbo", catalog = "SIGAA")
public class DetUsuarios {
    private long cns;
    private int idUsuario;
    private Timestamp fecha;
    private String movimientos;
    private Usuario usuarioByIdUsuario;

    @Id
    @Column(name = "CNS")
    public long getCns() {
        return cns;
    }

    public void setCns(long cns) {
        this.cns = cns;
    }

    @Basic
    @Column(name = "ID_USUARIO")
    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
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
    @Column(name = "MOVIMIENTOS")
    public String getMovimientos() {
        return movimientos;
    }

    public void setMovimientos(String movimientos) {
        this.movimientos = movimientos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DetUsuarios that = (DetUsuarios) o;
        return cns == that.cns &&
                idUsuario == that.idUsuario &&
                Objects.equals(fecha, that.fecha) &&
                Objects.equals(movimientos, that.movimientos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cns, idUsuario, fecha, movimientos);
    }

    @ManyToOne
    @JoinColumn(name = "ID_USUARIO", referencedColumnName = "ID_USUARIO", nullable = false, insertable = false, updatable = false)
    public Usuario getUsuarioByIdUsuario() {
        return usuarioByIdUsuario;
    }

    public void setUsuarioByIdUsuario(Usuario usuarioByIdUsuario) {
        this.usuarioByIdUsuario = usuarioByIdUsuario;
    }
}
