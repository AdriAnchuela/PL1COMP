/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compiladorespl1;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Martin
 */
public class MaquinaEstados {

    int estadoActual;
    AutomataFD AFD;

    public MaquinaEstados(AutomataFD AFD) {
        this.AFD = AFD;
    }

    public void inicializar() {

        estadoActual = AFD.getEstadoInicial();

    }

    public void acepta(Character caracter) throws Exception {

        Integer estadoTemp = AFD.getSiguienteEstado(estadoActual, caracter);

        if (estadoTemp != null) {

            estadoActual = estadoTemp;

        } else {

            throw new Exception("Err");

        }

    }

    public boolean isFinal() {

        return AFD.isFinal(estadoActual);

    }

    public boolean comprobarCadena(String cadena) {
        inicializar();
        boolean correcto = false;
        int contador = 0;
        try {
            for (int i = 0; i < cadena.length(); i++) {
                Character caracter = cadena.charAt(i);

                acepta(caracter);
                contador++;
                if (isFinal() && cadena.length() == contador) {

                    correcto = true;

                }
            }
        } catch (Exception ex) {
            // System.out.println("La cadena no es valida");

        }
        return correcto;

    }

    public String generateRandomCadena(Random random, int maxLength) {
        String alphabet = "wxyz"; // Alfabeto de la expresión regular
        int cadenaLength = random.nextInt(maxLength + 1); // Longitud aleatoria hasta el máximo
        StringBuilder sb = new StringBuilder(cadenaLength);

        for (int i = 0; i < cadenaLength; i++) {
            int randomIndex = random.nextInt(alphabet.length());
            char randomChar = alphabet.charAt(randomIndex);
            sb.append(randomChar);
        }

        return sb.toString();
    }
}
