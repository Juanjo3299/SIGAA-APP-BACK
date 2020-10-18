package com.api.sigaa.app.model.historial;

import com.api.sigaa.app.model.entity.SigaaCatAsignatura;

import java.util.List;

public class HistorialCorte {

    private List<HistorialModelo> materias;

    public HistorialCorte() {
        this.materias = null;
    }


    public List<HistorialModelo> getMaterias() {
        return materias;
    }

    public void setMaterias(List<HistorialModelo> materias) {
        this.materias = materias;
    }
}
