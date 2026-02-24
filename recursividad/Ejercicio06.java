package com.docencia.recursividad;

import java.util.ArrayList;
import java.util.List;
public class Ejercicio06 {
  /**
   * Devuelve [n, n-1, ..., 0]
   * TODO: Implementar usando recursividad.
   */
  public static List<Integer> cuentaRegresiva(int n) {
    if(n<0){
      throw new IllegalArgumentException();
    }

    if (n == 0) {
      return new ArrayList<>(List.of(0));
    }

    List<Integer> lista = cuentaRegresiva(n - 1);
    lista.add(0, n);

    return lista;
  }
}
