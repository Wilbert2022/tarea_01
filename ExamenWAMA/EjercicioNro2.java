package ExamenWAMA;

/**
 * EjercicioNro2.java
 */
public class EjercicioNro2 {
    Scanner lector = new Scanner(System.in);

double compra;

System.out.println("Ingrese el monto de la compra");
compra = lector.nextDouble();

if (compra >= 800 && compra <= 1500) {
}


else if (compra > 1500 && compra <= 5000) {
compra -= (compra*0.15);
}

else if (compra > 5000) {
compra -= (compra*0.2);
}

else{
    compra = compra
}

System.out.println("El monto a pagar despue de haber aplicado descuento es: "+compra);

}


