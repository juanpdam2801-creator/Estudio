package com.docencia.logica;

public class Ejercicio03 {
  /**
   * Suma 1..n
   * TODO: Implementar usando lógica tradicional (iterativo).
   */
  public static long sumaHastaN(int n) {
       if(n < 0){
      throw new IllegalArgumentException();
    }
    if(n == 1){
      return 1;
    }

    long resultado = 0;
    for (int i = 0; i <= n; i++) {
      resultado += i;
    }
    return resultado;
  }

}
