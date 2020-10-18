package com.api.sigaa.app.model.historial;

import java.util.List;

public class HistorialCuatrimestre {
    private Integer cuatrimestre;

    private List<HistorialModelo> materias;

    public HistorialCuatrimestre(Integer cuatrimestre) {
        this.cuatrimestre = cuatrimestre;
    }

    public Integer getCuatrimestre() {
        return cuatrimestre;
    }

    public void setCuatrimestre(Integer cuatrimestre) {
        this.cuatrimestre = cuatrimestre;
    }

    public List<HistorialModelo> getMaterias() {
        return materias;
    }

    public void setMaterias(List<HistorialModelo> materias) {
        this.materias = materias;
    }
}
