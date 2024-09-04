public class HolaMundo {
    public static void main(String[] args) {
        String saludar = "Hola mundo desde java";
        System.out.println(saludar);
        System.out.println("saludar.toUpperCase() = " + saludar.toUpperCase());
        int numero = 10;

        boolean valor = true;
        int numero2 = 5;
        if(valor){
            System.out.println("numero = " + numero);
            numero2 = 10;
        }
        String nombre;
        nombre = "Gustavo";

        if(numero2<10){
            nombre = "Pepito";
        }
    }
}
