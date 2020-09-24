package com.api.sigaa.app.model.entity;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
public class Usuario {
    private int idUsuario;
    private String usuario;
    private String contraseña;
    private String estatus;
    private Integer idRoles;
    private List<DetUsuarios> detUsuariosByIdUsuario;
    private List<SigaaCatAlumno> sigaaCatAlumnosByIdUsuario;
    private List<SigaaCatAspirante> sigaaCatAspirantesByIdUsuario;
    private List<SigaaCatAspirantePosgrado> sigaaCatAspirantePosgradosByIdUsuario;
    private List<SigaaCatDocente> sigaaCatDocentesByIdUsuario;
    private List<SigaaCatTituloElectronico> sigaaCatTituloElectronicosByIdUsuario;
    private List<SigaaCatTituloElectronico> sigaaCatTituloElectronicosByIdUsuario_0;
    private List<SigaaCatTituloElectronico> sigaaCatTituloElectronicosByIdUsuario_1;
    private List<SigaaCatTrabajadores> sigaaCatTrabajadoresByIdUsuario;
    private CatRoles catRolesByIdRoles;

    @Id
    @Column(name = "ID_USUARIO")
    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    @Basic
    @Column(name = "USUARIO")
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    @Basic
    @Column(name = "CONTRASEÑA")
    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
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
    @Column(name = "ID_ROLES")
    public Integer getIdRoles() {
        return idRoles;
    }

    public void setIdRoles(Integer idRoles) {
        this.idRoles = idRoles;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario1 = (Usuario) o;
        return idUsuario == usuario1.idUsuario &&
                Objects.equals(usuario, usuario1.usuario) &&
                Objects.equals(contraseña, usuario1.contraseña) &&
                Objects.equals(estatus, usuario1.estatus) &&
                Objects.equals(idRoles, usuario1.idRoles);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idUsuario, usuario, contraseña, estatus, idRoles);
    }

    @OneToMany(mappedBy = "usuarioByIdUsuario")
    public List<DetUsuarios> getDetUsuariosByIdUsuario() {
        return detUsuariosByIdUsuario;
    }

    public void setDetUsuariosByIdUsuario(List<DetUsuarios> detUsuariosByIdUsuario) {
        this.detUsuariosByIdUsuario = detUsuariosByIdUsuario;
    }

    @OneToMany(mappedBy = "usuarioByIdUsuario")
    public List<SigaaCatAlumno> getSigaaCatAlumnosByIdUsuario() {
        return sigaaCatAlumnosByIdUsuario;
    }

    public void setSigaaCatAlumnosByIdUsuario(List<SigaaCatAlumno> sigaaCatAlumnosByIdUsuario) {
        this.sigaaCatAlumnosByIdUsuario = sigaaCatAlumnosByIdUsuario;
    }

    @OneToMany(mappedBy = "usuarioByIdUsuarioAspirante")
    public List<SigaaCatAspirante> getSigaaCatAspirantesByIdUsuario() {
        return sigaaCatAspirantesByIdUsuario;
    }

    public void setSigaaCatAspirantesByIdUsuario(List<SigaaCatAspirante> sigaaCatAspirantesByIdUsuario) {
        this.sigaaCatAspirantesByIdUsuario = sigaaCatAspirantesByIdUsuario;
    }

    @OneToMany(mappedBy = "usuarioByIdUsuario")
    public List<SigaaCatAspirantePosgrado> getSigaaCatAspirantePosgradosByIdUsuario() {
        return sigaaCatAspirantePosgradosByIdUsuario;
    }

    public void setSigaaCatAspirantePosgradosByIdUsuario(List<SigaaCatAspirantePosgrado> sigaaCatAspirantePosgradosByIdUsuario) {
        this.sigaaCatAspirantePosgradosByIdUsuario = sigaaCatAspirantePosgradosByIdUsuario;
    }

    @OneToMany(mappedBy = "usuarioByIdUsuario")
    public List<SigaaCatDocente> getSigaaCatDocentesByIdUsuario() {
        return sigaaCatDocentesByIdUsuario;
    }

    public void setSigaaCatDocentesByIdUsuario(List<SigaaCatDocente> sigaaCatDocentesByIdUsuario) {
        this.sigaaCatDocentesByIdUsuario = sigaaCatDocentesByIdUsuario;
    }

    @OneToMany(mappedBy = "usuarioByUsrFirmaServEsc")
    public List<SigaaCatTituloElectronico> getSigaaCatTituloElectronicosByIdUsuario() {
        return sigaaCatTituloElectronicosByIdUsuario;
    }

    public void setSigaaCatTituloElectronicosByIdUsuario(List<SigaaCatTituloElectronico> sigaaCatTituloElectronicosByIdUsuario) {
        this.sigaaCatTituloElectronicosByIdUsuario = sigaaCatTituloElectronicosByIdUsuario;
    }

    @OneToMany(mappedBy = "usuarioByUsrFirmaRector")
    public List<SigaaCatTituloElectronico> getSigaaCatTituloElectronicosByIdUsuario_0() {
        return sigaaCatTituloElectronicosByIdUsuario_0;
    }

    public void setSigaaCatTituloElectronicosByIdUsuario_0(List<SigaaCatTituloElectronico> sigaaCatTituloElectronicosByIdUsuario_0) {
        this.sigaaCatTituloElectronicosByIdUsuario_0 = sigaaCatTituloElectronicosByIdUsuario_0;
    }

    @OneToMany(mappedBy = "usuarioByUsrEnvia")
    public List<SigaaCatTituloElectronico> getSigaaCatTituloElectronicosByIdUsuario_1() {
        return sigaaCatTituloElectronicosByIdUsuario_1;
    }

    public void setSigaaCatTituloElectronicosByIdUsuario_1(List<SigaaCatTituloElectronico> sigaaCatTituloElectronicosByIdUsuario_1) {
        this.sigaaCatTituloElectronicosByIdUsuario_1 = sigaaCatTituloElectronicosByIdUsuario_1;
    }

    @OneToMany(mappedBy = "usuarioByIdUsuario")
    public List<SigaaCatTrabajadores> getSigaaCatTrabajadoresByIdUsuario() {
        return sigaaCatTrabajadoresByIdUsuario;
    }

    public void setSigaaCatTrabajadoresByIdUsuario(List<SigaaCatTrabajadores> sigaaCatTrabajadoresByIdUsuario) {
        this.sigaaCatTrabajadoresByIdUsuario = sigaaCatTrabajadoresByIdUsuario;
    }

    @ManyToOne
    @JoinColumn(name = "ID_ROLES", referencedColumnName = "ID_ROLES", insertable = false, updatable = false)
    public CatRoles getCatRolesByIdRoles() {
        return catRolesByIdRoles;
    }

    public void setCatRolesByIdRoles(CatRoles catRolesByIdRoles) {
        this.catRolesByIdRoles = catRolesByIdRoles;
    }
}
