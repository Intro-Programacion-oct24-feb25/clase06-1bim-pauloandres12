/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejocadenas;

/**
 *
 * @author reroes
 */
public class EjemploCadenas {
    public static void main(String[] args) {
        String ciudad = "loJa";
        ciudad = ciudad.toUpperCase();
        // se le asigna el valor en mayusculas = LOJA
        System.out.printf("%s\n", ciudad.toLowerCase());
        // imprime loja en minusculas porque la variable se muestra en minuculas
        // System.out.printf("%s\n", ciudad.toUpperCase());
        System.out.printf("%s\n", ciudad);
        // imprime LOJA en mayusculas porque es el valor asignado  
        // toLowerCase es un método
        // toUpperCase es un método
        
    }
}
