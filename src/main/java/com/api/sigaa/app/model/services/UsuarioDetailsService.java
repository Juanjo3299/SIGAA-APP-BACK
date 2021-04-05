package com.api.sigaa.app.model.services;

import com.api.sigaa.app.model.entity.CatRoles;
import com.api.sigaa.app.model.entity.Usuario;
import com.api.sigaa.app.model.iservice.IUsuarioService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UsuarioDetailsService implements UserDetailsService {

    private Logger logger = LoggerFactory.getLogger(UsuarioDetailsService.class);

    @Autowired
    private IUsuarioService usuarioService;


    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Override
    @Transactional(readOnly = true)
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Usuario usuario = usuarioService.findByUsuario(username);

        if (usuario == null) {
            logger.error("Error en el login: no existe el usuario '" + username + "' en el sistema!");
            throw new UsernameNotFoundException("Error en el login: no existe el usuario '" + username + "' en el sistema!");
        }
        String password = usuario.getContraseña();
        usuario.setContraseña(passwordEncoder().encode(password));

        boolean estatus = false;
        List<CatRoles> roles = new ArrayList<>();
        roles.add(usuario.getCatRolesByIdRoles());

        List<GrantedAuthority> authorities = roles
                .stream()
                .map(role -> new SimpleGrantedAuthority(role.getRol()))
                .peek(authority -> logger.info("Role: " + authority.getAuthority()))
                .collect(Collectors.toList());
        if (usuario.getEstatus().equals("1")) {
            estatus = true;
        }
        return new User(usuario.getUsuario(), usuario.getContraseña(), estatus, true, true, true, authorities);
    }
}
