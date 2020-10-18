package com.api.sigaa.app.controllers.sigaa.controlador;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author UPTAP-Developer
 */
public class Fechas {

    private static final SimpleDateFormat FORMAT_ANIO_4 = new SimpleDateFormat("YYYY");
    private static final SimpleDateFormat FORMAT_ANIO_2 = new SimpleDateFormat("YY");
    private static final SimpleDateFormat FORMAT_DIA_MES_ANIO = new SimpleDateFormat("dd-MM-YYYY");
    private static final SimpleDateFormat FORMAT_MES_ANIO = new SimpleDateFormat("MM-YYYY");

    /**
     * FORMATO: dd-MM-YYYY
     *
     * @return FECHA ACTUAL DEL SISTEMA
     */
    public static String diaMesAño() {
        Calendar c = Calendar.getInstance();
        return FORMAT_DIA_MES_ANIO.format(c.getTime());
    }

    /**
     * FORMATO: dd-MM-YYYY
     *
     * @param c
     * @return FECHA ESPECIFICADA
     */
    public static String diaMesAño(Date c) {
        return FORMAT_DIA_MES_ANIO.format(c);
    }

    /**
     * FORMATO: MM-YYYY
     *
     * @return FECHA ACTUAL DEL SISTEMA
     */
    public static String mesAño() {
        Calendar c = Calendar.getInstance();
        return FORMAT_MES_ANIO.format(c.getTime());
    }

    /**
     * FORMATO: MM-YYYY
     *
     * @param c
     * @return FECHA ESPECIFICADA
     */
    public static String mesAño(Date c) {
        return FORMAT_MES_ANIO.format(c);
    }

    /**
     * FORMATO: YYYY
     *
     * @return FECHA ACTUAL DEL SISTEMA
     */
    public static String año4Digitos() {
        Calendar c = Calendar.getInstance();
        return FORMAT_ANIO_4.format(c.getTime());
    }

    /**
     * FORMATO: YYYY
     *
     * @param c
     * @return FECHA ESPECIFICADA
     */
    public static String año4Digitos(Date c) {
        return FORMAT_ANIO_4.format(c);
    }

    /**
     * FORMATO: YY
     *
     * @return FECHA ACTUAL DEL SISTEMA
     */
    public static String año2Digitos() {
        Calendar c = Calendar.getInstance();
        return FORMAT_ANIO_2.format(c.getTime());
    }

    /**
     * FORMATO: YY
     *
     * @param c
     * @return FECHA ESPECIFICADA
     */
    public static String año2Digitos(Date c) {
        return FORMAT_ANIO_2.format(c);
    }
}

