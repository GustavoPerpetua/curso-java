public class EjemploStringMetodos {
    public static void main(String[] args) {
        String nombre = "Andres";

        System.out.println("nombre.length() = " + nombre.length());
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
        System.out.println("nombre.equals(\"Andres\") = " + nombre.equals("Andres"));
        System.out.println("nombre.equals(\"andres\") = " + nombre.equals("andres"));
        System.out.println("nombre.equalsIgnoreCase(\"andres\" = " + nombre.equalsIgnoreCase("andres"));
        System.out.println("nombre.compareTo() = " + nombre.compareTo("Andres"));
        System.out.println("nombre.compareTo() = " + nombre.compareTo("Aaron"));
        System.out.println("nombre.charAt() = " + nombre.charAt(0));
        System.out.println("nombre.charAt() = " + nombre.charAt(1));
        System.out.println("nombre.charAt() = " + nombre.charAt(nombre.length()-1));
        System.out.println("nombre.substring() = " + nombre.substring(1));
        System.out.println("nombre.substring() = " + nombre.substring(1,4));


        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.replace() = " + trabalenguas.replace("a","."));
        System.out.println("trabalenguas.indexOf('a') = " + trabalenguas.indexOf('a'));
        System.out.println("trabalenguas.lastIndexOf(\"a\") = " + trabalenguas.lastIndexOf('a'));
        System.out.println("trabalenguas.lastIndexOf(\"z\") = " + trabalenguas.lastIndexOf("t"));
        System.out.println("trabalenguas.contains(\"t\") = " + trabalenguas.contains("t"));
        System.out.println("trabalenguas.startsWith(\"tr\") = " + trabalenguas.startsWith("tr"));
        System.out.println("trabalenguas.endsWith(\"as\") = " + trabalenguas.endsWith("as"));
        System.out.println("  trabalenguas  ");
        System.out.println("  trabalenguas  ".trim());

    }
}
