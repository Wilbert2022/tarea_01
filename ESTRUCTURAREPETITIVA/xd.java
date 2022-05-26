package ESTRUCTURAREPETITIVA;

/**
 * xd
 */
public class xd {

    
}
// Clase Punto
// (c) 2008 IT

public class Punto{
    private double x;
    private double y;
  
    // Constructor
    public Punto(double x, double y) {
      this.x = x;
      this.y = y;
    }
  
    // toString: devuelve una cadena con la representacion del objeto
    public String toString() {
      // el signo + para cadenas no significa "suma matematica" sino concatenacion
      return "(" + x + ", " + y + ")";
    }
  
    // devuelve la distancia al origen
    public double distanciaAlOrigen() {
      // NOTA: se podria haber hecho con la distancia a (0,0):
      // return calcularDistancia(new Punto(0,0));
      return Math.sqrt(x * x + y * y);
    }
  
    // metodos de acceso
    public double getX() {
      return x;
    }
  
    public double getY() {
      return y;
    }
  
    // devuelve la distancia a otro punto
    public double calcularDistancia(Punto otroPunto) {
      double x1 = x - otroPunto.getX();
      double y1 = y - otroPunto.getY();
      return Math.sqrt(x1 * x1 + y1 * y1);
    }
  
    // devuelve el cuadrante
    public int calcularCuadrante() {
      if (x > 0.0 && y > 0.0) {
        return 1;
      } else if (x < 0.0 && y > 0.0) {
        return 2;
      } else if (x < 0.0 && y < 0.0) {
        return 3;
      } else if (x > 0.0 && y < 0.0) {
        return 4;
      } else {
        // (x==0.0 || y==0.0)
        return 0;
      }
    }
  
    // calcula el punto mas cercano del array
    public Punto calcularMasCercano(Punto[] otrosPuntos) {
      Punto puntoMasCercano = null;
  
      if (otrosPuntos != null && otrosPuntos.length > 0) {
        // me guardo el primero como mas cercano
        double distanciaMinima = calcularDistancia(otrosPuntos[0]);
        puntoMasCercano = otrosPuntos[0];
  
        for (int i = 1; i < otrosPuntos.length; i++) {
          // si encuentro otro mas cercano, lo sustituyo
          double distancia = calcularDistancia(otrosPuntos[i]);
          if (distancia < distanciaMinima) {
            distancia = distanciaMinima;
            puntoMasCercano = otrosPuntos[i];
          }
        }
      }
      // devuelve el punto encontrado si el array contiene puntos, null en caso
      // contrario
      return puntoMasCercano;
    }
  }
  
        
  // Clase de prueba de Punto
  // (c) 2007 IT
  public class Prueba{
  
    public static void main(String args[]) {
  
      // Comprobar el numero de argumentos (el nombre de programa mas las dos
      // coordenadas)
      if (args.length != 2) {
        System.out.println("Uso:");
        System.out.println("  java Prueba x y");
        System.out
            .println("donde x e y son las cooordenadas de un punto en el espacio.");
        return;
      }
  
      // Manejador de excepciones
      try {
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);
  
        Punto p = new Punto(x, y);
        System.out.println("El punto es " + p.toString());
        System.out.println("Su distancia al origen es " + p.distanciaAlOrigen());
        System.out.println("Su coordenada x es " + p.getX()
            + " y su coordenada y es " + p.getY());
  
        System.out.println("Esta ubicado en el cuadrante "
            + p.calcularCuadrante());
  
        Punto[] arrayPuntos = new Punto[5];
        arrayPuntos[0] = new Punto(1, 1);
        arrayPuntos[1] = new Punto(5, 3);
        arrayPuntos[2] = new Punto(10, 10);
        arrayPuntos[3] = new Punto(-3, 2);
        arrayPuntos[4] = new Punto(-4, -5);
  
        for (int i = 0; i < arrayPuntos.length; i++) {
          System.out.println("Su distancia al punto " + arrayPuntos[i].toString()
              + " es " + p.calcularDistancia(arrayPuntos[i]));
        }
        System.out.println("El punto mas cercano es "
            + p.calcularMasCercano(arrayPuntos));
      } catch (NumberFormatException e) {
        System.out.println("Error en los argumentos de la linea de comandos.");
      }
    }
  }
        
  // Clase de prueba de Triangulo
  // (c) 2007 IT
  public class PruebaTriangulo {
  
    public static void main(String args[]) {
  
      // Comprobar el numero de argumentos (el nombre de programa mas las dos
      // coordenadas)
      if (args.length != 6) {
        System.out.println("Uso:");
        System.out.println("  java PruebaTriangulo x1 y1 x2 y2 x3 y3");
        System.out
            .println("donde (xi,yi) son las cooordenadas de cada vertice del triangulo.");
        return;
      }
  
      // Manejador de excepciones
      try {
        double x1 = Double.parseDouble(args[0]);
        double y1 = Double.parseDouble(args[1]);
        double x2 = Double.parseDouble(args[2]);
        double y2 = Double.parseDouble(args[3]);
        double x3 = Double.parseDouble(args[4]);
        double y3 = Double.parseDouble(args[5]);
  
        // Se crean los tres vertices y el triangulo
        Punto v1 = new Punto(x1, y1);
        Punto v2 = new Punto(x2, y2);
        Punto v3 = new Punto(x3, y3);
        Triangulo t = new Triangulo(v1, v2, v3);
  
        // Presentacion de la informacion
        System.out.println("El triangulo tiene como vertices " + v1.toString()
            + ", " + v2.toString() + ", " + v3.toString());
  
        double[] longitudLados = t.calcularLongitudLados();
        System.out.println("Sus lados miden " + longitudLados[0] + ", "
            + longitudLados[1] + ", " + longitudLados[2]);
      } catch (Exception e) {
        System.out.println("Error en los argumentos de la linea de comandos.");
        return;
      }
  
    }
  }
        
  // Clase Triangulo
  // (c) 2007 IT
  public class Triangulo {
  
    private Punto vertice1;
    private Punto vertice2;
    private Punto vertice3;
  
    public Triangulo(Punto vertice1, Punto vertice2, Punto vertice3) {
      this.vertice1 = vertice1;
      this.vertice2 = vertice2;
      this.vertice3 = vertice3;
    }
  
    public double[] calcularLongitudLados() {
      double longitudLados[] = new double[3];
  
      // longitud 1->2
      longitudLados[0] = vertice1.calcularDistancia(vertice2);
      // longitud 2->3
      longitudLados[1] = vertice2.calcularDistancia(vertice3);
      // longitud 3->1
      longitudLados[2] = vertice3.calcularDistancia(vertice1);
  
      return longitudLados;
    }
  }
  