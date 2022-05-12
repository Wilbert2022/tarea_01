package EstRepetitivas;

import java.util.Scanner;

/**
 * EjerciciosR
 */
public class EjerciciosR {
    
    public static void imprimirWhileN1_10() {
    int numInit=20;
    while (numInit<=20) {
        System.out.println(numInit);
        numInit=numInit+1;
        
    }        
    }
    public static void imprimirDowhileN1_20int () {
        int numInit=20;
        do {
            System.out.println(numInit);
            numInit++;
        } while (numInit<=20);
    }
    public static void imprimirForN1_20() {
        for (int numInit =1; numInit <=20; numInit++) {
            System.out.print(numInit);
        }
    }
    public static void nombrevertical() {
        Scanner lt=new Scanner(System.in);
        System.out.println("ingrese su nombre:");
        String nombre=lt.next();
        for (int i = nombre.length()-1; i >=0; i--) {
                System.out.println(nombre.charAt(i));
            
        }

        
    }
    
    
    
    public static void main(String[] args) {
        /*System.out.println("Imprime While:");  imprimirWhileN1_10();
        System.out.println("Imprime Do while:"); imprimirWhileN1_10(); 
        System.out.println("imprime for:"); imprimirForN1_20();*/

        nombrevertical();
    }
}