package com.docencia.logica;

public class Ejercicio14 {
  /**
   * ¿Es palíndromo?
   * TODO: Implementar usando lógica tradicional (iterativo).
   */
  public static boolean esPalindromo(String texto) {
    for (int i = 0; i < texto.length()/2; i++) {
      char letra1 = texto.charAt(i);
      char letra2 = texto.charAt(texto.length()-1-i);

      if(letra1 != letra2){
        return false;
      }
    }
    return true;
  }
}
