package com.docencia.recursividad;

public class Ejercicio07 {
  /**
   * Suma de dígitos
   * TODO: Implementar usando recursividad.
   */
  public static int sumaDigitos(int n) {
    if (n<0) {
      throw new IllegalArgumentException();
    }
    if (n<10) {
      return n;
    }
    return n % 10 +sumaDigitos(n/10);
  }
}
