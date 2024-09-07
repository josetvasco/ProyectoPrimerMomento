public class Persona {
  String nombre;
  int edad;
  String profesion;

  public Persona(String nombre, int edad, String profesion) {
    this.nombre = nombre;
    this.edad = edad;
    this.profesion = profesion;
  }

  public void imprimirInformacion() {
    System.out.println("Nombre: " + nombre);
    System.out.println("Edad: " + edad);
    System.out.println("Profesion: " + profesion);
  }

  public void calcularJubilacion() {
    int jubilacion = 65 - edad;

    System.out.println("le faltan: " + jubilacion + " anios para la jubilacion" );
  }
}

