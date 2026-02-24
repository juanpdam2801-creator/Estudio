package com.docencia.recursividad;

public class Ejercicio10 {
  /**
   * Invierte cadena
   * TODO: Implementar usando recursividad.
   */
  public static String invertirCadena(String texto) {
   if (texto == null) {
    throw  new IllegalArgumentException();
   }
   if (texto.length() <= 1) {
    return  texto;
   }
  return  invertirCadena(texto.substring(1)) + texto.charAt(0);
  }
}
