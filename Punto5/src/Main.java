import java.util.Scanner;

abstract class Figura {

  public abstract void calcularArea();
}


class Circulo extends Figura {

  @Override
  public void calcularArea() {
    Scanner sc = new Scanner(System.in);

    System.out.println("Ingrese el radio del circulo:");
    double radio = sc.nextDouble();
    
    double area = Math.PI * radio * radio;

    System.out.println("El area del circulo es: " + area );
  }
}

class Cuadrado extends Figura {

  @Override
  public void calcularArea() {
    Scanner sc = new Scanner(System.in);

    System.out.println("Ingrese el lado del cuadrado:");
    double lado = sc.nextDouble();
    
    double area = lado * lado;

    System.out.println("El area del cuadrado es: " + area );
  }
}


public class Main {

    public static void main(String[] args) {
        Circulo circulo = new Circulo();
        Cuadrado cuadrado = new Cuadrado();

        circulo.calcularArea();
        cuadrado.calcularArea();
    }
  
}