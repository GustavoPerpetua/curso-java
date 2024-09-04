import java.util.Scanner;

public class AssingmentN2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese nombre integrante 1: ");
        String nombre1 = procesarNombre(scanner.nextLine());

        System.out.println("Ingrese nombre integrante 2: ");
        String nombre2 = procesarNombre(scanner.nextLine());

        System.out.println("Ingrese nombre integrante 3: ");
        String nombre3 = procesarNombre(scanner.nextLine());

        String resultadoFinal = nombre1 + "_" + nombre2 + "_" + nombre3;
        System.out.println("Resultado final: " + resultadoFinal);

        scanner.close();
    }

    public static String procesarNombre(String nombre) {
        char segundoCaracter = Character.toUpperCase(nombre.charAt(1));
        String ultimosDosCaracteres = nombre.substring(nombre.length() - 2);
        return segundoCaracter + "." + ultimosDosCaracteres;
    }
}
