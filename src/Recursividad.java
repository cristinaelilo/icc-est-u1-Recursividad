public class Recursividad {
    public int factorial(int n) {
        System.out.println("Calculando el factorial de: " + n);
        //Caso base: n sea 0! y 1! son iguales a 1
        if(n == 0 || n == 1) {
            System.out.println("Caso base alcanzado el factorial de "+n+" es 1");
            return 1;
        }
        int resultado = n * factorial(n-1);
        System.out.println("Resultado parcial para "+n+ " * factorial("+(n-1)+") = "+ resultado);
        return resultado;
    }
}
