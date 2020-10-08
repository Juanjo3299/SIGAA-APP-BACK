package com.api.sigaa.app.model.iservice;

import com.api.sigaa.app.model.entity.SigaaDetCalificaciones;

import java.util.List;


public interface ISigaaDetCalificacionesService {
    public List<SigaaDetCalificaciones> findCalificaciones(Integer matricula);
}
