package com.api.sigaa.app.model.iservice;

import com.api.sigaa.app.model.entity.SigaaCatAlumno;
import org.apache.commons.codec.digest.DigestUtils;

public interface ISigaaCatAlumnoService {

    public SigaaCatAlumno findByMatricula(int matricula);
}
