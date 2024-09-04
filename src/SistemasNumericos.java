import javax.lang.model.element.NestingKind;
import javax.swing.*;

public class SistemasNumericos {
    public static void main(String[] args) {

        String numeroStr = JOptionPane.showInputDialog(null,"Ingrese numero entero: ");

        int numeroDecimal = 0;
        try{
         numeroDecimal = Integer.parseInt(numeroStr);
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Error debe ingresar un numero entero");
            main(args);
            System.exit(0);
        };

        System.out.println("numeroDecimal = " + numeroDecimal);

        String mensajeBinario = "numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        System.out.println(mensajeBinario);
        int numeroBinario = 0b11110;
        System.out.println("numeroBinario = " + numeroBinario);

        String mensajeOctal = "numero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
        System.out.println(mensajeOctal);
        int numeroOctal = 036;
        System.out.println("numeroOctal = " + numeroOctal);

        String mensajeHex = "numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);
        System.out.println(mensajeHex);
        int numeroHex = 0x1e;
        System.out.println("numeroHex = " + numeroHex);

        String mensaje = mensajeBinario;
        mensaje += "\n" + mensajeOctal;
        mensaje += "\n" + mensajeHex;

        JOptionPane.showMessageDialog(null,mensaje);
    }
}
