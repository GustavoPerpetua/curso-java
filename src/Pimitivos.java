public class Pimitivos {
    public static void main(String[] args) {

        byte numeroByte = 7;
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("tipo byte corresponde en bite a " + Byte.BYTES);
        System.out.println("tipo byte corresponde en bite a " + Byte.SIZE);
        System.out.println("valor maximo de un byte es: " + Byte.MAX_VALUE);
        System.out.println("valor maximo de un byte es: " + Byte.MIN_VALUE);

        short numeroShort = 32767;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("tipo short corresponde en bite a " + Short.BYTES);
        System.out.println("tipo short corresponde en bite a " + Short.SIZE);
        System.out.println("valor maximo de un short es: " + Short.MAX_VALUE);
        System.out.println("valor maximo de un short es: " + Short.MIN_VALUE);

        int numeroInt = 2147483647;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("tipo int corresponde en bite a " + Integer.BYTES);
        System.out.println("tipo int corresponde en bite a " + Integer.SIZE);
        System.out.println("valor maximo de un int es: " + Integer.MAX_VALUE);
        System.out.println("valor maximo de un int es: " + Integer.MIN_VALUE);

        long numeroLong = 9223372036854775807L;
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("tipo long corresponde en bite a " + Long.BYTES);
        System.out.println("tipo long corresponde en bite a " + Long.SIZE);
        System.out.println("valor maximo de un long es: " + Long.MAX_VALUE);
        System.out.println("valor maximo de un long es: " + Long.MIN_VALUE);

        float numeroFloat = 2.22e4f;
        System.out.println("numeroFloat = " + numeroFloat);
        System.out.println("tipo float corresponde en bite a " + Float.BYTES);
        System.out.println("tipo float corresponde en bite a " + Float.SIZE);
        System.out.println("valor maximo de un float es: " + Float.MAX_VALUE);
        System.out.println("valor maximo de un float es: " + Float.MIN_VALUE);

        double numeroDouble = 3.4028236E38;
        System.out.println("numeroDouble = " + numeroDouble);
        System.out.println("tipo double corresponde en bite a " + Double.BYTES);
        System.out.println("tipo double corresponde en bite a " + Double.SIZE);
        System.out.println("valor maximo de un double es: " + Double.MAX_VALUE);
        System.out.println("valor maximo de un double es: " + Double.MIN_VALUE);

    }
}
