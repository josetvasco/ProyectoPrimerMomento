public class Coche {
  String marca;
  String modelo;
  int anio;

  public Coche(String marca, String modelo, int anio) {
    this.marca = marca;
    this.modelo = modelo;
    this.anio = anio;
  }

  public void mostrarInformacion() {
    encender();
    System.out.println("Marca: " + marca);
    System.out.println("Modelo: " + modelo);
    System.out.println("Anio: " + anio);
    apagar();
  }

  public static void encender() {
    System.out.println("El auto se esta encendiendo...");
  }

  public static void apagar() {
    System.out.println("El auto se esta apagando...");
  }

  public static void main(String[] args) {
      Coche coche1 = new Coche("Chevrolet", "Camaro", 2019);
      Coche coche2 = new Coche("Nissan", "Versa", 2022);

      coche1.mostrarInformacion();
      System.out.println("---------------------");
      coche2.mostrarInformacion();
  }

}
