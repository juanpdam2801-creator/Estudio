package com.docencia.recursividad;

public class Ejercicio08 {
  /**
   * Cuenta dígitos (0 tiene 1 dígito)
   * TODO: Implementar usando recursividad.
   */
  public static int contarDigitos(int n) {
    if (n <0) {
      throw new IllegalArgumentException();
    }
    if (n<10) {
      return 1;
    }
    return 1 + contarDigitos(n/10);
  }
}
