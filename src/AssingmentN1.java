import java.util.Scanner;

public class AssingmentN1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese nombre de Factura: ");
        String nombreFactura = scanner.nextLine();

        System.out.println("Ingrese monto primer item: ");
        double primerItem = scanner.nextDouble();

        System.out.println("Ingrese monto segundo item: ");
        double segundoItem = scanner.nextDouble();

        double totalCompra = (primerItem + segundoItem);

        double impuesto = totalCompra * 0.19;

        double total = totalCompra + impuesto;

        System.out.println("La factura " + nombreFactura + " tiene un monto Total Bruto: " + totalCompra + " con un impuesto de: " + impuesto + " y el monto Total Neto es de : " + total);

        scanner.close();
    }
}
