package com.docencia.logica;

import java.util.concurrent.locks.ReentrantLock;

public class Ejercicio02 {
  /**
   * Calcula base^exponente (exponente >= 0)
   * TODO: Implementar usando lógica tradicional (iterativo).
   */
  public static long potencia(long base, int exponente) {
    if (base == 0) {
    return  0;
    }
    if (exponente == 0) {
      return  1;
    }

    long resultado = 1;
    for (int i = 1; i <= exponente; i++) {
      resultado = base*(exponente*i);
    }
return resultado;
  }
}
