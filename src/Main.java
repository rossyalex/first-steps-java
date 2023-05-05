import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        // InputStreamReader es el tipo de la variable, para capturar desde el teclado
        InputStreamReader capturarTeclado = new InputStreamReader(System.in);
        // BufferedReader es como para cargar o leer lo almacenado
        BufferedReader buffer = new BufferedReader(capturarTeclado);
        System.out.println("Ingrese su nombre:");
        String name = buffer.readLine();
        System.out.println("Hola "+ name);

    }
}