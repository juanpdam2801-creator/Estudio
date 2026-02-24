package com.docencia.recursividad;

import java.util.Arrays;

public class Ejercicio11 {
  /**
   * Suma de elementos
   * TODO: Implementar usando recursividad.
   */
  public static long sumaArreglo(int[] arreglo) {
      if(arreglo == null){
      throw new IllegalArgumentException();
    }
    if(arreglo.length < 1){
      return 0;
    }
    if(arreglo.length == 1){
      return arreglo[0];
    }

    long resultado = arreglo[arreglo.length-1];
    int[] arregloNuevo = Arrays.copyOf(arreglo, arreglo.length-1);
    return resultado + sumaArreglo(arregloNuevo);
  }
}
