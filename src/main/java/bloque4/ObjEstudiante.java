package bloque4;

public class ObjEstudiante {
    String nombre;
    String apellido;
    String cedula;
    String telefono;
    String carrera;
    Integer promedioNotas;

    public ObjEstudiante(String nombre, String apellido, String cedula, String telefono, String carrera, Integer promedioNotas) {//Constructor
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.telefono = telefono;
        this.carrera = carrera;
        this.promedioNotas = promedioNotas;
    }

    public void mostrarInformacion() {//Metodo para mostrar informacion de la clase.
        System.out.println("Información del Estudiante:");
        System.out.println("Nombre completo: " + nombre + " " + apellido);
        System.out.println("Cedula "+cedula);
        System.out.println("Telefono "+telefono);
        System.out.println("Carrera que desea "+carrera);
        System.out.println("El promedio de notas del colegio es: "+promedioNotas);
    }
}
