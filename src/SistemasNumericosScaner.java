import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemasNumericosScaner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese numero entero: ");

        int numeroDecimal = 0;
        try{
         numeroDecimal = scanner.nextInt();
        }catch (InputMismatchException e){
            System.out.println("Error debe ingresar un numero entero");
            main(args);
            System.exit(0);
        };

        System.out.println("numeroDecimal = " + numeroDecimal);

        String mensajeBinario = "numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);

        String mensajeOctal = "numero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);

        String mensajeHex = "numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);

        String mensaje = mensajeBinario;
        mensaje += "\n" + mensajeOctal;
        mensaje += "\n" + mensajeHex;

        System.out.println(mensaje);
    }
}
