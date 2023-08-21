package B2;
//Tres numeros por consola y encontrar el numero mayor.
import java.util.Scanner;

public class TrabajoBloq1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero1,numero2,numero3;
        System.out.println("Ingrese el primero numero");
        numero1= entrada.nextInt();
        System.out.println("Ingrese el segundo numero");
        numero2= entrada.nextInt();
        System.out.println("Ingrese el tercer numero");
        numero3= entrada.nextInt();
        if (numero1>=numero2 && numero1>=numero3) {
            System.out.println("El numero mayor es:"+numero1);
        } else if (numero2>=numero1 && numero2>=numero3) {
            System.out.println("El numero mayor es:"+numero2);
        }else {
            System.out.println("El numero mayor es:"+numero3);
        }
    }
}
