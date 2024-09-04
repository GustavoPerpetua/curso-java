public class ConversionDeTipos {
    public static void main(String[] args) {
        String numeroStr = "50";

        int numeroInt = Integer.parseInt(numeroStr);
        System.out.println("numeroInt = " + numeroInt);

        String realString = "23456e-3";
        double numeroDouble = Double.parseDouble(realString);
        System.out.println("numeroDouble = " + numeroDouble);

        String booleansStr = "TrUe";
        boolean strBoolean = Boolean.parseBoolean(booleansStr);
        System.out.println("strBoolean = " + strBoolean);

        int otroNumeroInt = 100;
        System.out.println("otroNumeroInt = " + otroNumeroInt);

        String otroNumeroStr = Integer.toString(otroNumeroInt);
        System.out.println("otroNumeroStr = " + otroNumeroStr);

        otroNumeroStr = String.valueOf(otroNumeroInt);
        System.out.println("otroNumeroStr = " + otroNumeroStr);
    }
}
