/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compiladorespl1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author Martin
 */
public class AutomataFD {

    List<Character> alfabeto;
    List<Integer> estados;
    List<Integer> estadosFinales;
    int estadoInicial;

    HashMap<Integer, HashMap<Character, Integer>> matriz;

    public AutomataFD() {

        this.alfabeto = new ArrayList<>();
        this.estados = new ArrayList<>();
        this.estadosFinales = new ArrayList<>();
        this.matriz = new HashMap<>();

    }

    public void cargarAlfabeto() {

        alfabeto.add('w');
        alfabeto.add('x');
        alfabeto.add('y');
        alfabeto.add('z');

    }

    public void cargarEstados1() {

        for (int i = 0; i < 6; i++) {

            estados.add(i);

        }

    }

    public void cargarEstados2() {

        for (int i = 0; i < 7; i++) {

            estados.add(i);

        }
    }

    public void establecerEstadoInicial() {

        estadoInicial = estados.get(0);

    }

    public void establecerEstadosFinales1() {

        estadosFinales.add(4);

    }

    public void establecerEstadosFinales2() {

        estadosFinales.add(5);
        estadosFinales.add(6);

    }

    public void inicializarMatriz1() {

        for (int i = 0; i < estados.size(); i++) {
            matriz.put(i, new HashMap<>());
        }

    }

    public void inicializarMatriz2() {

        for (int i = 0; i < estados.size(); i++) {
            matriz.put(i, new HashMap<>());
        }

    }

    public void cargarMatriz1() {
        /* //Estado 0
        matriz.get(0).put('w', 1);
        //Estado 1
        matriz.get(1).put('x', 3);
        matriz.get(1).put('y', 2);
        //Estado 2
        matriz.get(2).put('x', 6);
        matriz.get(2).put('y', 5);
        matriz.get(2).put('z', 4);
        //Estado 3
        matriz.get(3).put('x', 6);
        matriz.get(3).put('y', 5);
        matriz.get(3).put('z', 4);
        //Estado 4
        matriz.get(4).put('w', 7);
        matriz.get(4).put('x', 10);
        matriz.get(4).put('y', 9);
        matriz.get(4).put('z', 8);

        //Estado 5
        matriz.get(5).put('x', 6);
        matriz.get(5).put('y', 5);
        matriz.get(5).put('z', 4);
        //Estado 6
        matriz.get(6).put('x', 6);
        matriz.get(6).put('y', 5);
        matriz.get(6).put('z', 4);
        //Estado 7
        //Estado 8
        //Estado 9
        matriz.get(9).put('w', 7);
        matriz.get(9).put('x', 10);
        matriz.get(9).put('y', 9);
        matriz.get(9).put('z', 8);

        //Estado 10
        matriz.get(10).put('w', 7);
        matriz.get(10).put('x', 10);
        matriz.get(10).put('y', 9);
        matriz.get(10).put('z', 8);
         */
        //Estado 0
        matriz.get(0).put('w', 1);

        //Estado 1
        matriz.get(1).put('x', 2);
        matriz.get(1).put('y', 2);

        //Estado 2
        matriz.get(2).put('x', 2);
        matriz.get(2).put('y', 2);
        matriz.get(2).put('z', 3);

        //Estado 3
        matriz.get(3).put('w', 4);
        matriz.get(3).put('x', 3);
        matriz.get(3).put('y', 3);
        matriz.get(3).put('z', 4);

    }

    public void cargarMatriz2() {

        //Estado 0
        matriz.get(0).put('x', 1);
        matriz.get(0).put('y', 1);

        //Estado 1
        matriz.get(1).put('w', 2);
        matriz.get(1).put('z', 2);

        //Estado 2
        matriz.get(2).put('w', 2);
        matriz.get(2).put('y', 3);
        matriz.get(2).put('z', 4);

        //Estado 3
        matriz.get(3).put('w', 3);
        matriz.get(3).put('x', 5);
        matriz.get(3).put('y', 5);

        //Estado 4
        matriz.get(4).put('w', 4);
        matriz.get(4).put('x', 5);
        matriz.get(4).put('y', 6);
        matriz.get(4).put('z', 4);

        //Estado 6
        matriz.get(6).put('w', 3);
        matriz.get(6).put('x', 5);
        matriz.get(6).put('y', 5);

    }

    public Integer getSiguienteEstado(Integer estado, Character caracter) {

        return matriz.get(estado).get(caracter);

    }

    public boolean isFinal(Integer estado) {

        return estadosFinales.contains(estado);

    }

    public Integer getEstadoInicial() {

        return estadoInicial;

    }

    public void configuracion1() {

        cargarAlfabeto();
        cargarEstados1();
        inicializarMatriz1();
        cargarMatriz1();
        establecerEstadoInicial();
        establecerEstadosFinales1();

    }

    public void configuracion2() {

        cargarAlfabeto();
        cargarEstados2();
        inicializarMatriz2();
        cargarMatriz2();
        establecerEstadoInicial();
        establecerEstadosFinales2();

    }

}
