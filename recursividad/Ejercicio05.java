package com.docencia.recursividad;

public class Ejercicio05 {
  /**
   * MCD por Euclides
   * TODO: Implementar usando recursividad.
   */
  public static int mcd(int a, int b) {
    if (b<0 || a<0) {
      throw  new IllegalArgumentException();
    }
    if (b == 0) {
      return a;
    }
    return mcd(b,a % b);
  }
}
