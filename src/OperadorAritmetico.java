import javax.swing.*;

public class OperadorAritmetico {
    public static void main(String[] args) {
        
        int i = 5, j = 4, suma = i +j;

        System.out.println("suma = " + suma);
        System.out.println("(i + j) = " + (i + j));

        int resta = i - j;
        System.out.println("resta = " + resta);

        int multi = i * j ;
        System.out.println("multi = " + multi);

        int division = i / j;
        float div2 = (float)i / j;
        System.out.println("div2 = " + div2);
        System.out.println("division = " + division);

        int resto = i % j;
        System.out.println("resto = " + resto);

        int numero = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));
        if (numero % 2 == 0){
            System.out.println("numero par = " + numero);
        }else{
            System.out.println("numero es impar = " + numero);
        }

    }
}
