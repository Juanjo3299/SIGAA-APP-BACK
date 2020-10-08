package com.api.sigaa.app.model.serviceimpl;

import java.util.List;

import com.api.sigaa.app.model.dao.ISigaaDetCalificacionesDao;
import com.api.sigaa.app.model.entity.SigaaDetCalificaciones;
import com.api.sigaa.app.model.iservice.ISigaaDetCalificacionesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SigaaDetCalificacionesServiceImpl implements ISigaaDetCalificacionesService {

    @Autowired
    private ISigaaDetCalificacionesDao calificacionesDao;

    @Override
    public List<SigaaDetCalificaciones> findCalificaciones(Integer matricula) {
        return calificacionesDao.findCalificaciones(matricula);
    }

}
