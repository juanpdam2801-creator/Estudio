package com.docencia.logica;

public class Ejercicio08 {
  /**
   * Cuenta dígitos (0 tiene 1 dígito)
   * TODO: Implementar usando lógica tradicional (iterativo).
   */
  public static int contarDigitos(int n) {
     n = Math.abs(n);

    if(n == 0){
      return 1;
    }
    int resultado = 0;

    while(n>0){
      resultado++;
      n = n/10;
    }
    return resultado;
  }
}
