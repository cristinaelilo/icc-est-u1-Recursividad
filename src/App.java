public class App {
    public static void main(String[] args) throws Exception {
        Recursividad rec = new Recursividad();
        int resultado = rec.factorial(5);
        System.out.println(resultado);

        System.out.println(rec.sumaConsecutivos(5));

        System.out.println(rec.potencia(5, 4));

        System.out.println(rec.sumaDigitos(456));
    }
}
