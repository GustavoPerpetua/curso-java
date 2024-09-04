public class PrimitivosCaracteres {
    public static void main(String[] args) {
        char caracter = '\u0040';
        char decimal = 64;
        char simbolo = '@';
        System.out.println("caracter = " + caracter);
        System.out.println("decimal = " + decimal);
        System.out.println("simbolo = " + simbolo);
        System.out.println("caracter == decimal: " + (decimal == caracter));
        System.out.println("caracter == simbolo: " + (simbolo == caracter));

        
        System.out.println("tipo char corresponde en bite a " + Character.BYTES);
        System.out.println("tipo char corresponde en bite a " + Character.SIZE);
        System.out.println("valor maximo de un char es: " + Character.MAX_VALUE);
        System.out.println("valor maximo de un char es: " + Character.MIN_VALUE);

    }
}
