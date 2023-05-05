import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioNumParImp {
    public static void main(String[] args) throws IOException {
        System.out.println("Ingrese un número: ");
        Integer numero = cargarNumero();

        Boolean esPar = (numero % 2) == 0;

        if (esPar) {
            System.out.println(numero + " es par");
        } else {
            System.out.println(numero + " es impar");
        }
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
