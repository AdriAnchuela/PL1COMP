/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package compiladorespl1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Martin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        List<String> cadenasValidas = new ArrayList<>();

        AutomataFD AFD = new AutomataFD();
        //AFD.configuracion1();
        AFD.configuracion2();
        MaquinaEstados ME = new MaquinaEstados(AFD);

        //apartado 1.a
        System.out.println(ME.comprobarCadena("wxzz"));
        //apartado 1.b
        System.out.println(ME.comprobarCadena("xwzy"));

        //apartado 2
        Random random = new Random();
        int maxLength = 100;
        int validCount = 0;

        while (validCount < 100000) {
            String randomCadena = ME.generateRandomCadena(random, maxLength);
            //System.out.println(randomCadena);
            if (ME.comprobarCadena(randomCadena) && !cadenasValidas.contains(randomCadena)) {
                System.out.println("Cadena valida encontrada: " + randomCadena);
                validCount++;
                cadenasValidas.add(randomCadena);
                System.out.println(validCount);

            }
        }
        System.out.println(cadenasValidas);
    }

}
