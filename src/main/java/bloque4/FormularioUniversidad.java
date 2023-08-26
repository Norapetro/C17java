package bloque4;

import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FormularioUniversidad {
    private static final Logger logger = LogManager.getLogger(FormularioUniversidad.class);
    public static void main(String[] args) {
        Scanner datoEntrada = new Scanner(System.in);

        System.out.println("FORMULARIO DE INGRESO A LA UNIVERCIDAD, MUCHA SUERTE!");
        try {
            System.out.println("Ingrese su Nombre");
            String nombre = datoEntrada.nextLine();
            if (nombre == null || nombre.equals("")) {
                logger.atError().log("Falto ingresar el nombre");
                throw new Exception("Debe ingresar el nombre");
            }

            System.out.println("Ingrese su Apellido");
            String apellido = datoEntrada.nextLine();
            if (apellido == null || apellido.equals("")) {
                logger.atError().log("Falto ingresar el apellido");
                throw new Exception("Debe ingresar el apellido");
            }

            System.out.println("Ingrese su numero de Cedula");
            String cedula = datoEntrada.nextLine();
            if (cedula == null || cedula.equals("")) {
                logger.atError().log("Falto ingresar la cedula");
                throw new Exception("Debe ingresar el numero de cedula");
            }

            System.out.println("Ingrese su numero de Telefono");
            String telefono = datoEntrada.nextLine();
            if (telefono == null || telefono.equals("")) {
                logger.atError().log("Falto ingresar el telefono");
                throw new Exception("Debe ingresar el numero de telefono");
            }

            System.out.println("Ingrese la Carrera que Desea");
            String carrera = datoEntrada.nextLine();
            if (carrera == null || carrera.equals("")) {
                logger.atError().log("Falto Ingresar la carrera");
                throw new Exception("Debe ingresar la carrera que desea");
            }


            System.out.println("Ingrese su Promedio de Notas del Colegio");
            Integer promedioNotas = datoEntrada.nextInt();
            if (promedioNotas == null || promedioNotas.equals("")) {
                logger.atError().log("Falto ingresar el promedio de notas");
                throw  new Exception("Debe ingresar el promedio de notas");
            }
            if (promedioNotas < 3) {
                System.out.println("Lo sentimos No fuiste admitido en la univercidad.");
            } else {
                System.out.println("FELICIDADES!!! PASASTE...");
            }

            ObjEstudiante student = new ObjEstudiante(nombre, apellido, cedula, telefono, carrera, promedioNotas);//Instancia.
            student.mostrarInformacion();//Metodo.

        } catch (Exception e) {
            if (e.getMessage().equals("Debe ingresar el nombre")) {
                System.out.println("Ingrese nuevamente su Nombre");
                String nombre = datoEntrada.nextLine();
            }
            if (e.getMessage().equals("Debe ingresar el apellido")) {
                System.out.println("Ingrese nuevamente su Apellido");
                String apellido = datoEntrada.nextLine();
            }
            if (e.getMessage().equals("Debe ingresar el numero de cedula")) {
                System.out.println("Ingrese nuevamente su numero de Cedula");
                String cedula = datoEntrada.nextLine();
            }
            if (e.getMessage().equals("Debe ingresar el numero de telefono")) {
                System.out.println("Ingrese su numero de Telefono");
                String telefono = datoEntrada.nextLine();
            }
            if (e.getMessage().equals("Debe ingresar la carrera que desea")) {
                System.out.println("Ingrese la Carrera que Desea");
                String carrera = datoEntrada.nextLine();
            }
            if (e.getMessage().equals("Debe ingresar el promedio de notas")) {
                System.out.println("Ingrese su Promedio de Notas del Colegio");
                Integer promedioNotas = datoEntrada.nextInt();
            }
        }
    }

}

