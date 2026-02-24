package com.docencia.logica;

public class Ejercicio11 {
  /**
   * Suma de elementos
   * TODO: Implementar usando lógica tradicional (iterativo).
   */
  public static long sumaArreglo(int[] arreglo) {
       if(arreglo == null){
      throw new IllegalArgumentException();
    }
    if(arreglo.length < 1){
      return 0;
    }
    
    long resultado =0l;
    for (int i : arreglo) {
      resultado += i;
    }

    return resultado;
  }
}
