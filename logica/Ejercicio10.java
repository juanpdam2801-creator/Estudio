package com.docencia.logica;

public class Ejercicio10 {
  /**
   * Invierte cadena
   * TODO: Implementar usando lógica tradicional (iterativo).
   */
  public static String invertirCadena(String texto) {
   if (texto == null || texto.isBlank()) {
      return "";
    }

    if(texto.length() == 1){
      return texto;
    }

    String otxet = "";

    for (int i = texto.length()-1; i >= 0 ; i--) {
      char letra = texto.charAt(i);
      otxet += String.valueOf(letra);
    }

    return otxet;
  }
}
