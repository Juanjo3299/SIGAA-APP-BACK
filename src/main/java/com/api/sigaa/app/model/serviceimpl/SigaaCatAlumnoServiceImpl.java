package com.api.sigaa.app.model.serviceimpl;

import com.api.sigaa.app.model.dao.ISigaaCatAlumnoDao;
import com.api.sigaa.app.model.entity.SigaaCatAlumno;
import com.api.sigaa.app.model.iservice.ISigaaCatAlumnoService;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SigaaCatAlumnoServiceImpl implements ISigaaCatAlumnoService {

    @Autowired
    ISigaaCatAlumnoDao alumnoDao;

    @Override
    public SigaaCatAlumno findByMatricula(int matricula) {
        SigaaCatAlumno alumno = alumnoDao.findSigaaCatAlumnosByMatricula(matricula);
        return alumno;
    }

}
