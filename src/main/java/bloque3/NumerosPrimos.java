package bloque3;

public class NumerosPrimos {
    public static void main(String[] args) {
        int[] numeros = new int[1000];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i]=i+1;
        }

        for (int i = 0; i < numeros.length ; i++) {
            int num = numeros[i];
            int contadorResiduoCero = 0;
            for (int j = 1; j <= num ; j++) {
                if (num % j==0) {
                 contadorResiduoCero++;
                }
            }
            if (contadorResiduoCero==2){
                System.out.println(num);
            }
        }
    }
    }


