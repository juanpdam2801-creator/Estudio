package com.docencia.logica;

public class Ejercicio07 {
  /**
   * Suma de dígitos
   * TODO: Implementar usando lógica tradicional (iterativo).
   */
  public static int sumaDigitos(int n) {
  n = Math.abs(n);
    int suma =0;

    while (n > 0){
      suma = suma + (n % 10);
      n = n / 10;
    }
    return suma;
  }
}
