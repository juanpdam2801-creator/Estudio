package com.docencia.recursividad;

public class Ejercicio02 {
  /**
   * Calcula base^exponente (exponente >= 0)
   * TODO: Implementar usando recursividad.
   */
  public static long potencia(long base, int exponente) {
    if (base == 0) {
      return  0;
    }
    if (exponente == 0) {
      return  1;
    }
    return  base*potencia(base, exponente-1);

  }
}
