package com.docencia.recursividad;

public class Ejercicio14 {
  /**
   * ¿Es palíndromo?
   * TODO: Implementar usando recursividad.
   */
  public static boolean esPalindromo(String texto) {
    if (texto == null) {
      throw new IllegalArgumentException();
    }
    if (texto.length() <=1) {
      return true;
    }
    if (texto.charAt(0) != texto.charAt(texto.length()-1)) {
      return false;
    }
    return esPalindromo(texto.substring(1, texto.length()-1));

  }
}
