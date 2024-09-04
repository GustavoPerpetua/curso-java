public class EjemploString {
    public static void main(String[] args) {
        String curso = "Programación java";

        String curso2 = new String ("Programación java");

        boolean esIgual = curso == curso2;
        System.out.println("esIgual = " + esIgual);

        esIgual = curso.equals(curso2);
        System.out.println("esIgual = " + esIgual);

        String curso3 = "Programación java";
        esIgual = curso == curso3;
        System.out.println("esIgual = " + esIgual);

    }
}
