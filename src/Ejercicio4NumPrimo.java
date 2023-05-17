import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio4NumPrimo {
    public static void main(String[] args) throws IOException {
        String resultado =" ";

        int contador = 0;
        int numero = 1;
        while (contador < 100) {
            if (esPrimo(numero)) {
                resultado += numero + ", ";
                contador++;
            }
            numero++;
        }
        System.out.println("Los primeros 100 números son: " + resultado);



    }

    private static Boolean esPrimo(Integer numero){

        Boolean esUnNumeroPrimo = true;

        for ( int i = 2; i < numero; i++ ){

            if (numero % i == 0) {
                esUnNumeroPrimo = false;
            }

        }
        return esUnNumeroPrimo;
    }

}
