package bloque3;

public class Fibonacci {
    public static void main(String[] args) {
        int numInicio = 0,numSiguiente = 1,suma = 0;
        for (int i = 0; i <20 ; i++) {
            if (i < 19) {
                System.out.print(numInicio +",");
                suma=numInicio+numSiguiente;
                numInicio=numSiguiente;
                numSiguiente=suma;
            }else {
                System.out.println(numInicio);
            }
        }

        }
    }
