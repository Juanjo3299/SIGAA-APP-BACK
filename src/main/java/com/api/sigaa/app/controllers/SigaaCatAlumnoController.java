package com.api.sigaa.app.controllers;

import com.api.sigaa.app.controllers.sigaa.controlador.Fechas;
import com.api.sigaa.app.model.entity.SigaaCatAlumno;
import com.api.sigaa.app.model.entity.SigaaDetCalificaciones;
import com.api.sigaa.app.model.historial.HistorialCorte;
import com.api.sigaa.app.model.historial.HistorialCuatrimestre;
import com.api.sigaa.app.model.historial.HistorialModelo;
import com.api.sigaa.app.model.iservice.ISigaaCatAlumnoService;
import com.api.sigaa.app.model.iservice.ISigaaDetCalificacionesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/alumno")
public class SigaaCatAlumnoController {

    @Autowired
    private ISigaaCatAlumnoService alumnoService;

    @Autowired
    private ISigaaDetCalificacionesService iSigaaDetCalificacionesService;

    Double sumaPromedio = 0.0;
    Double promedio = 0.0;
    int numeroMaterias = 0;


    @GetMapping("/{matricula}")
    public ResponseEntity<?> alumno(@PathVariable Integer matricula) {
        SigaaCatAlumno alumno = alumnoService.findByMatricula(matricula);
        List<HistorialModelo> calificaciones = generarHistorialAcademico(alumno.getSigaaDetCalificacionesByMatricula());
        Map<String, Object> response = new HashMap<>();
        if (alumno == null) {
            response.put("mensaje", "La matricula".concat(matricula.toString().concat(" no está registrada")));
            return new ResponseEntity<Map<String, Object>>(response, HttpStatus.NOT_FOUND);
        }
        response.put("alumno", alumno);
        response.put("calificaciones", calificaciones);
        return new ResponseEntity<Map<String, Object>>(response, HttpStatus.OK);
    }


   /* public List<HistorialCuatrimestre> clasificarPorCuatrimestre(List<HistorialModelo> calificaciones) {
        int i = 0, j = 0;
        String cuatrimestre = calificaciones.get(0).getMateria();
        List<HistorialCuatrimestre> caliCuatri = new ArrayList<>();
        HistorialCuatrimestre cuatri = new HistorialCuatrimestre(cuatrimestre);
        List<HistorialCorte> historialCortes = new ArrayList<>();
        List<HistorialModelo> materias = new ArrayList<>();

        for (HistorialModelo h : calificaciones) {
            if (cuatrimestre.equals(calificaciones.get(j).getMateria()) && !h.getMateria().equals("")) {
                materias.add(h);
            } else {
                j = i;
                cuatrimestre = h.getMateria();
                cuatri.setMaterias(materias);
                caliCuatri.add(cuatri);
                cuatri = new HistorialCuatrimestre(1);
                materias = new ArrayList<>();
            }
            i++;
        }
        return caliCuatri;
    }
*/


    public List<HistorialModelo> generarHistorialAcademico(List<SigaaDetCalificaciones> calificaciones) {
        List<HistorialModelo> listaHistoria = new ArrayList<>();
        List<HistorialModelo> listaHistoria2 = new ArrayList<>();
        List<HistorialCuatrimestre> cuatrimestres = new ArrayList<>();
        HistorialCuatrimestre cuatrimestre = new HistorialCuatrimestre(0);
        List<HistorialCorte> cortes = new ArrayList<>();
        int i = 0;
        SigaaDetCalificaciones actual = calificaciones.get(0);
        cuatrimestre.setCuatrimestre(actual.getSigaaCatAsignaturaByIdAsignatura().getCuatrimestre());
        String anterior, promedioFinal;
        boolean flag = false;

        HistorialModelo h = new HistorialModelo("");
        listaHistoria.add(new HistorialModelo("Cuatrimestre " + calificaciones.get(0).getSigaaCatAsignaturaByIdAsignatura().getCuatrimestre()));
        HistorialModelo cuatri = listaHistoria.get(listaHistoria.size() - 1);

        for (SigaaDetCalificaciones c : calificaciones) {
            if ((actual.getSigaaCatAsignaturaByIdAsignatura().equals(c.getIdAsignatura()) && actual.getSigaaCatGrupoByIdGrupo().equals(c.getIdGrupo()))) {
                h = validacion(h, c);

            } else {
                anterior = h.getMateria();
                listaHistoria.add(h);
                listaHistoria2.add(h);


                if (!anterior.equals(c.getSigaaCatAsignaturaByIdAsignatura().getNombre())) {
                    promedioFinal = h.getPromedioFinal();

                    if (!promedioFinal.isEmpty()) {
                        int calif = Integer.valueOf(promedioFinal);
                        sumaPromedio = sumaPromedio + calif;
                        numeroMaterias++;
                    }
                }

                if (actual.getSigaaCatAsignaturaByIdAsignatura().getCuatrimestre().intValue() != c.getSigaaCatAsignaturaByIdAsignatura().getCuatrimestre().intValue()) {
                    System.out.println("cuatri: " + (c.getSigaaCatGrupoByIdGrupo().getCuatrimestre() - 1));
                    cuatrimestre.setMaterias(listaHistoria2);
                    cuatrimestre.setCuatrimestre(c.getSigaaCatGrupoByIdGrupo().getCuatrimestre() - 1);
                    cuatrimestres.add(cuatrimestre);
                    establecePromedio(cuatri);
                    reset();

                    listaHistoria.add(new HistorialModelo("Cuatrimestre " + c.getSigaaCatAsignaturaByIdAsignatura().getCuatrimestre()));
                    listaHistoria2 = new ArrayList<>();
                    cuatri = listaHistoria.get(listaHistoria.size() - 1);
                    cuatrimestre = new HistorialCuatrimestre(c.getSigaaCatAsignaturaByIdAsignatura().getCuatrimestre());
                    flag = true;
                }
                h = new HistorialModelo();
                h = validacion(h, c);
                actual = c;
            }
        }
        if (calificaciones.get(calificaciones.size() - 1).getSigaaCatAsignaturaByIdAsignatura().getNombre().equals("ESTADIA")) {
            sumaPromedio = calificaciones.get(calificaciones.size() - 1).getCalificacion();
            numeroMaterias = 1;
        }
        establecePromedio(cuatri);
        reset();
        System.out.println("Establece promedio de ultimo cuatrimestre");
        listaHistoria.add(h);

        return listaHistoria;
    }

    ;

    private HistorialModelo validacion(HistorialModelo h, SigaaDetCalificaciones c) {
        Double calificacion = c.getCalificacion();
        Integer cuatri = c.getSigaaCatAsignaturaByIdAsignatura().getCuatrimestre();
        h.setPeriodo(c.getSigaaCatGrupoByIdGrupo().getIdPeriodo());
        switch (c.getIdTipocalif()) {
            case 1:
                h.setCorte1(String.valueOf(calificacion.intValue()));
                h.setMateria(c.getSigaaCatAsignaturaByIdAsignatura().getNombre());
                h.setFaltas(h.getFaltas() + c.getFaltas());
                h.setCuatrimestre(cuatri);
                break;
            case 2:
                h.setCorte2(String.valueOf(calificacion.intValue()));
                h.setMateria(c.getSigaaCatAsignaturaByIdAsignatura().getNombre());
                h.setFaltas(h.getFaltas() + c.getFaltas());
                h.setCuatrimestre(cuatri);
                break;
            case 3:
                h.setCorte3(String.valueOf(calificacion.intValue()));
                h.setMateria(c.getSigaaCatAsignaturaByIdAsignatura().getNombre());
                h.setFaltas(h.getFaltas() + c.getFaltas());
                h.setCuatrimestre(cuatri);
                break;
            case 4:
                h.setRecuperacion1(String.valueOf(calificacion.intValue()));
                h.setMateria(c.getSigaaCatAsignaturaByIdAsignatura().getNombre());
                h.setCuatrimestre(cuatri);
                break;
            case 5:
                h.setRecuperacion2(String.valueOf(calificacion.intValue()));
                h.setMateria(c.getSigaaCatAsignaturaByIdAsignatura().getNombre());
                h.setCuatrimestre(cuatri);
                break;
            case 6:
                h.setRecuperacion3(String.valueOf(calificacion.intValue()));
                h.setMateria(c.getSigaaCatAsignaturaByIdAsignatura().getNombre());
                h.setCuatrimestre(cuatri);
                break;
            case 7:
                h.setExtra(calificacion);
                h.setMateria(c.getSigaaCatAsignaturaByIdAsignatura().getNombre());
                h.setCuatrimestre(cuatri);
                break;
            case 8:
                h.setPromedio(calificacion.intValue());
                h.setMateria(c.getSigaaCatAsignaturaByIdAsignatura().getNombre());
                h.setCuatrimestre(cuatri);
                break;
            default:
                System.out.println("entro al default");
                break;
        }

        /**
         * ENERO-ABRIL MAYO-AGOSTO SEPTIEMBRE-DICIEMBRE
         */

        switch (c.getSigaaCatGrupoByIdGrupo().getSigaaCatPeriodoByIdPeriodo().getPeriodo().trim()) {
            case "ENERO-ABRIL":
                h.setDescripcionPeriodo("EN-ABR " + Fechas.año2Digitos(c.getSigaaCatGrupoByIdGrupo().getSigaaCatPeriodoByIdPeriodo().getFechaFin()));
                break;
            case "MAYO-AGOSTO":
                h.setDescripcionPeriodo("MAY-AGT " + Fechas.año2Digitos(c.getSigaaCatGrupoByIdGrupo().getSigaaCatPeriodoByIdPeriodo().getFechaFin()));
                break;
            case "SEPTIEMBRE-DICIEMBRE":
                h.setDescripcionPeriodo("SEPT-DIC " + Fechas.año2Digitos(c.getSigaaCatGrupoByIdGrupo().getSigaaCatPeriodoByIdPeriodo().getFechaFin()));
                break;
            default:
                break;
        }

        return h;
    }

    private void establecePromedio(HistorialModelo cuatri) {
        System.out.println("Suma para promedio: " + sumaPromedio);
        System.out.println("Numero de materias: " + numeroMaterias);
        System.out.println("Promedio final cuatrimestral: " + (sumaPromedio / numeroMaterias));
        cuatri.setPromedioFinal(String.valueOf(Math.round((sumaPromedio / numeroMaterias))));
    }

    private void reset() {
        sumaPromedio = 0.0;
        numeroMaterias = 0;
    }
}
