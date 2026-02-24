package com.docencia.logica;

public class Ejercicio15 {
  /**
   * Ocurrencias de c
   * TODO: Implementar usando lógica tradicional (iterativo).
   */
  public static int contarCaracter(String texto, char c) {
    if(texto == null || texto.isBlank()){
      return 0;
    }

    int resultado = 0;
    for (int i = 0; i < texto.length(); i++) {
      if (texto.charAt(i) == c) {
          resultado++;
      }
    }

    return resultado;
  }
}
