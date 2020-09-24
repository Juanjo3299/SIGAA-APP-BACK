package com.api.sigaa.app.model.entity;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "CAT_ROLES", schema = "dbo", catalog = "SIGAA")
public class CatRoles {
    private int idRoles;
    private String rol;
    private String descripcion;
    private Collection<Usuario> usuariosByIdRoles;

    @Id
    @Column(name = "ID_ROLES")
    public int getIdRoles() {
        return idRoles;
    }

    public void setIdRoles(int idRoles) {
        this.idRoles = idRoles;
    }

    @Basic
    @Column(name = "ROL")
    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    @Basic
    @Column(name = "DESCRIPCION")
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CatRoles catRoles = (CatRoles) o;
        return idRoles == catRoles.idRoles &&
                Objects.equals(rol, catRoles.rol) &&
                Objects.equals(descripcion, catRoles.descripcion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idRoles, rol, descripcion);
    }

    @OneToMany(mappedBy = "catRolesByIdRoles")
    public Collection<Usuario> getUsuariosByIdRoles() {
        return usuariosByIdRoles;
    }

    public void setUsuariosByIdRoles(Collection<Usuario> usuariosByIdRoles) {
        this.usuariosByIdRoles = usuariosByIdRoles;
    }
}
