package ESTRUCTURAREPETITIVA;

import java.util.Scanner;

public class ejercicio418 {
   
    static Scanner lt=new Scanner (System.in);

    public static void impuestoVehiculo418() {
        //definir variables
        String cateV="";
        int cantidad=0;
        double costV=0, impUnit=0, impTotal=0, totalimpV=0;
        //Datos de Entrada y Proceso y Salida
        for (int i = 0; i < 3; i++) {
            System.out.println("ingrese Cantidad de Vehiculos de Categoria "+(i+1)+": ");
            cantidad=lt.nextInt();
            System.out.println("ingrese el precio de la categoria"+(i+1)+"; ");
            costV=lt.nextDouble();
            if(i==0){
                impUnit=costV*0.10;
                impTotal=impUnit*cantidad;
            }else if (i==1){
                impUnit=costV*0.07;
            }else{
                impUnit=costV*0.05;
            }
            impTotal=impUnit*cantidad;
            System.out.println("Impuesto de Categoria "+(i+1)+" es:"+impUnit);
            System.out.println("Impuesto Total de Categoria "+(i+1)+" es:"+impTotal);
            totalimpV=totalimpV+totalimpV;  
        }
        System.out.println("Impuesto Total de Vehiculos es :"+totalimpV);



        
    }
    public static void main(String[] args) {
        impuestoVehiculo418();

    }
}
