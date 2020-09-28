package com.api.sigaa.app.model.iservice;

import com.api.sigaa.app.model.entity.Usuario;

public interface IUsuarioService {
    public Usuario findByUsuario(String username);
}
