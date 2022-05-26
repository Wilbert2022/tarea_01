package ESTRUCTURAREPETITIVA;

import java.util.Scanner;

public class GraficaLetra {

    static Scanner leerT=new Scanner(System.in);

    public static void graficarA() {
       System.out.println("Ingese Altura de la Letra:"); 
       int cantF=leerT.nextInt();
       System.out.println("Ingrese num fila para Linea:");
       int numFilLinea=leerT.nextInt();
       int medio=cantF+1;
        for (int f = 1; f <= cantF; f++) {
            for (int c = 1; c <= 2*cantF+1; c++) {
                if (f==1 && medio==c) {
                    System.out.print("*");
                }else if(c==medio-f && f>1){
                    System.out.print("*");
                }else if(c==medio+f && f>1){
                    System.out.print("*");
                }else if(f==numFilLinea && c>medio-f && c<medio+f){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        graficarA();
    }

}