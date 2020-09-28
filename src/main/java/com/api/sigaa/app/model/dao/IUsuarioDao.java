package com.api.sigaa.app.model.dao;

import com.api.sigaa.app.model.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUsuarioDao extends JpaRepository<Usuario, Integer> {

    public Usuario findByUsuario(String username);
}
