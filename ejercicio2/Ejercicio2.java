package com.docencia.expresiones.ejercicio2;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class Ejercicio2 {

    private Ejercicio2() {}


    public static LocalTime extractFirstTime(String text) {
        if (text == null || text.isBlank()) {
            throw new IllegalArgumentException();
        }
        String pattern = "(0\\d|1\\d|2[0-3]):\\d{2}"; //se espera 9:50 o 11:30 | no se espera 25:12
        Pattern patron = Pattern.compile(pattern); //crea un patron nuevo 
        Matcher matcher = patron.matcher(text);//dame el conjunto que cumpla la expresion regular
        if (!matcher.find()) {
            throw new IllegalArgumentException();
        } 
        String fecha = matcher.group(0); //agrupa todas las coincidencias
        return LocalTime.parse(fecha); //transformar algo en localTime
    }
}
