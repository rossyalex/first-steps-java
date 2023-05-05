import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio1 {
    public static void main(String[] args) throws IOException {

        InputStreamReader capturarTeclado = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(capturarTeclado);

        System.out.println("Ingrese un número: ");
        String strnumero1 = buffer.readLine();
        Integer numero1 = Integer.parseInt(strnumero1);

        System.out.println("Por favor ingrese un 2do número: ");
        String strnumero2 = buffer.readLine();
        Integer numero2 = Integer.parseInt(strnumero2);

        System.out.println("Ingrese un 3er número: ");
        String strnumero3 = buffer.readLine();
        Integer numero3 = Integer.parseInt(strnumero3);

        Integer mayor = numero1;
        Integer menor = numero1;

        if (numero2 > mayor) {
            mayor = numero2;
        }
        if (numero3 > mayor) {
            mayor = numero3;
        }
        if (numero2 < menor) {
            menor = numero2;
        }
        if (numero3 < menor) {
            menor = numero3;
        }

        System.out.println("El número mayor es: " + mayor);
        System.out.println("El número menor es: " + menor);

    }
}
