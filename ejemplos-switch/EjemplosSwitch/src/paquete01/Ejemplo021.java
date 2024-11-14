/*

 */
package paquete01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo021 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        System.out.println("Ingrese el dia de su nacimiento");
        int diaNacimiento = entrada.nextInt();
        System.out.println("Ingrese el mes de su nacimiento");
        int mesNacimiento = entrada.nextInt();
        System.out.println("Ingrese el año de su nacimiento");
        int yearNacimiento = entrada.nextInt();
        
        String mesCadena = "";
        
        switch (mesNacimiento){
            case 1:
                mesCadena = "Enero";
                break;
            case 2:
                mesCadena = "Febrero";
                break;
            case 3:
                mesCadena = "Marzo";
                break;
            case 4:
                mesCadena = "Abril";
                break;
            case 5:
                mesCadena = "Mayo";
                break;
            case 6:
                mesCadena = "Junio";
                break;
            case 7:
                mesCadena = "Julio";
                break;
            case 8:
                mesCadena = "Agosto";
                break;
            case 9:
                mesCadena = "Septiembre";
                break;
            case 10:
                mesCadena = "Octubre";
                break;
            case 11:
                mesCadena = "Noviembre";
                break;
            case 12:
                mesCadena = "Diciembre";
                break;    
                              
        }
        
        System.out.printf("Usted ha nacido el %d de %s de %d", 
                        diaNacimiento, mesCadena.toUpperCase(), yearNacimiento);
        
    }
}
