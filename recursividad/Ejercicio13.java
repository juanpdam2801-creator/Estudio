package com.docencia.recursividad;

public class Ejercicio13 {
  /**
   * Índice o -1
   * TODO: Implementar usando recursividad.
   */
  public static int buscarLineal(int[] arreglo, int objetivo) {
    return buscarNew(arreglo, objetivo, 0 );

  }
  public static int  buscarNew(int [] arreglo, int  objetivo, int  indice) {
      if (indice > arreglo.length) {
        return 0;
      }
      if (arreglo[indice]== objetivo) {
        return indice;
      }
      return  buscarNew(arreglo, objetivo, indice+1);
  }
}
