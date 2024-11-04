public class App {
    public static void main(String[] args) throws Exception {
        //Recursividad rec = new Recursividad();
        //int resultado = rec.factorial(5);
        //System.out.println(resultado);

        //System.out.println(rec.sumaConsecutivos(5));

        //System.out.println(rec.potencia(5, 4));

        //System.out.println(rec.sumaDigitos(456));

        //System.out.println(rec.fibonacci(8));

        // Ruta donde se creará la estructura de directorios
        String pathBase = "src/directorios";
        GeneratorDirectorios generador = new GeneratorDirectorios();
        generador.crearEstructuraDirectorios(pathBase);

        //RenombrarDirectorios rd = new RenombrarDirectorios();
        //rd.renombrarDirectorios("src/directorios");

    }
}
