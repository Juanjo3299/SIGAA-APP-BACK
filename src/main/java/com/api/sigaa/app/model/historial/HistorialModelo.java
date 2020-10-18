package com.api.sigaa.app.model.historial;

public class HistorialModelo {
    private Integer cuatrimestre;
    private String corte1;
    private String corte2;
    private String corte3;
    private String recuperacion1;
    private String recuperacion2;
    private String recuperacion3;
    private int faltas;

    private double extra;

    private int promedio;

    private String promedioFinal;
    private String materia;

    private int periodo;
    private String descripcionPeriodo;

    public HistorialModelo() {
        this.cuatrimestre = 0;
        this.corte1 = "";
        this.corte2 = "";
        this.corte3 = "";
        this.recuperacion1 = "";
        this.recuperacion2 = "";
        this.recuperacion3 = "";
        this.faltas = 0;
        this.extra = 0;
        this.promedio = 0;
        this.promedioFinal = "";
        this.materia = "";
        this.periodo = 0;
        this.descripcionPeriodo = "";
    }

    public HistorialModelo(String materia) {
        this.materia = materia;
        this.cuatrimestre = 0;
        this.corte1 = "";
        this.corte2 = "";
        this.corte3 = "";
        this.recuperacion1 = "";
        this.recuperacion2 = "";
        this.recuperacion3 = "";
        this.faltas = 0;
        this.extra = 0;
        this.promedio = 0;
        this.promedioFinal = "";
        this.periodo = 0;
        this.descripcionPeriodo = "";
    }

    public Integer getCuatrimestre() {
        return cuatrimestre;
    }

    public void setCuatrimestre(Integer cuatrimestre) {
        this.cuatrimestre = cuatrimestre;
    }

    public String getCorte1() {
        return corte1;
    }

    public void setCorte1(String corte1) {
        this.corte1 = corte1;
    }

    public String getCorte2() {
        return corte2;
    }

    public void setCorte2(String corte2) {
        this.corte2 = corte2;
    }

    public String getCorte3() {
        return corte3;
    }

    public void setCorte3(String corte3) {
        this.corte3 = corte3;
    }

    public String getRecuperacion1() {
        return recuperacion1;
    }

    public void setRecuperacion1(String recuperacion1) {
        this.recuperacion1 = recuperacion1;
    }

    public String getRecuperacion2() {
        return recuperacion2;
    }

    public void setRecuperacion2(String recuperacion2) {
        this.recuperacion2 = recuperacion2;
    }

    public String getRecuperacion3() {
        return recuperacion3;
    }

    public void setRecuperacion3(String recuperacion3) {
        this.recuperacion3 = recuperacion3;
    }

    public int getFaltas() {
        return faltas;
    }

    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }

    public double getExtra() {
        return extra;
    }

    public void setExtra(double extra) {
        this.extra = extra;
    }

    public int getPromedio() {
        return promedio;
    }

    public void setPromedio(int promedio) {
        this.promedio = promedio;
    }

    public String getPromedioFinal() {
        return promedioFinal;
    }

    public void setPromedioFinal(String promedioFinal) {
        this.promedioFinal = promedioFinal;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    public String getDescripcionPeriodo() {
        return descripcionPeriodo;
    }

    public void setDescripcionPeriodo(String descripcionPeriodo) {
        this.descripcionPeriodo = descripcionPeriodo;
    }
}
