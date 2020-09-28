package com.api.sigaa.app.model.serviceimpl;

import com.api.sigaa.app.model.dao.IUsuarioDao;
import com.api.sigaa.app.model.entity.Usuario;
import com.api.sigaa.app.model.iservice.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.stereotype.Service;

@EnableAuthorizationServer
@Service
public class UsuarioServiceImpl implements IUsuarioService {

    @Autowired
    IUsuarioDao usuarioDao;

    @Override
    public Usuario findByUsuario(String username) {
        return usuarioDao.findByUsuario(username);
    }

}
