package bloque2;

public class Clase2 {
    public static void main(String[] args) {
        Estudiante2 estudiante = new Estudiante2();

        estudiante.setNombre("Nora");
        System.out.println("el nombre es: "+estudiante.getNombre());

        estudiante.setCiudad("Itagui");
        System.out.println("la ciudad es: "+estudiante.getCiudad());

        estudiante.setCarrera("Desarrollo de Software");
        System.out.println("La carrera es: "+estudiante.getCarrera());
    }
}
