import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio1Refact {
    public static void main(String[] args) throws IOException {
        // Con este código pedimos un número
        System.out.println("Ingrese un número: ");
        Integer numero1 = cargarNumero();

        System.out.println("Por favor ingrese un 2do número: ");
        Integer numero2 = cargarNumero();

        System.out.println("Ingrese un 3er número: ");
        Integer numero3 = cargarNumero();

        Integer sumatoria = numero1 + numero2 + numero3;
        Double numeroPromedio = Double.valueOf(sumatoria)/ 3;
        System.out.println(" El número promedio es: " + numeroPromedio);

    }
   /**
    *
    * @return
    */
    private static Integer cargarNumero() throws IOException {
        InputStreamReader capturarTeclado = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(capturarTeclado);
        String strnumero = buffer.readLine();
        Integer numero = Integer.parseInt(strnumero);
        return numero;
    }


}
