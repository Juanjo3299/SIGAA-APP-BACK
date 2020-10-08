package com.api.sigaa.app.controllers;

import com.api.sigaa.app.model.entity.SigaaCatAlumno;
import com.api.sigaa.app.model.entity.SigaaDetCalificaciones;
import com.api.sigaa.app.model.iservice.ISigaaCatAlumnoService;
import com.api.sigaa.app.model.iservice.ISigaaDetCalificacionesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin("http://localhost:4200")
@RequestMapping("/api")
public class SigaaCatAlumnoController {

    @Autowired
    private ISigaaCatAlumnoService alumnoService;

    @Autowired
    private ISigaaDetCalificacionesService iSigaaDetCalificacionesService;


    @GetMapping("/alumno/{matricula}")
    public ResponseEntity<?> alumno(@PathVariable Integer matricula) {
        SigaaCatAlumno alumno = alumnoService.findByMatricula(matricula);
        List<SigaaDetCalificaciones> calificacionesOrdenadas = iSigaaDetCalificacionesService.findCalificaciones(matricula);
        alumno.setSigaaDetCalificacionesByMatricula(calificacionesOrdenadas);
        Map<String, Object> response = new HashMap<>();
        if (alumno == null) {
            response.put("mensaje", "La matricula".concat(matricula.toString().concat(" no está registrada")));
            return new ResponseEntity<Map<String, Object>>(response, HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<SigaaCatAlumno>(alumno, HttpStatus.OK);
    }

    ;

}
