package Escondicional;

import java.util.Scanner;

/**
 * EjercicioCondMult
 */
public class EjercicioCondMult {

    public void profesor() {
        System.out.println("enseñar");
    }

    public static void estudiante() {
        System.out.println("estudiar");
    }

    public static void maquinaPC() {
        System.out.println("procesa informacion");
    }

    public void proyector() {
        System.out.println("proyecta imagenes");
    }

    public static void main(String[] args) {
        EjercicioCondMult obj=new EjercicioCondMult();
        Scanner lt=new Scanner(System.in);
        System.out.println("ingrese el numero de algoritmo:\n1=profesor\n2=estudiante"+
        "\n3=maquinaPC\n4=proyector");
        int opcionMet=lt.nextInt();

        switch (opcionMet) {
            case 1: obj.
            profesor(); break;
            case 2: estudiante(); break;
            case 3: maquinaPC(); break;
            case 4: obj.proyector(); break; 
            default: System.err.println("esta opcion no existe"); break;

        }

    }
}
            