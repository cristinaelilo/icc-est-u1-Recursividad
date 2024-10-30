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
    //Suma de los números consecutivos
    //n = 5 resultado 5+4+3+2+1 = 15
    public int sumaConsecutivos(int n) {
        //Caso base: 1
        if(n == 1){
            return 1;
        }
        return n + sumaConsecutivos(n-1);
    }

    //Calcula la potencia de un número
    public int potencia(int base, int exponente) {
        // Caso base: 0 
        if (exponente == 0) {
            return 1;
        }
        return base * potencia(base, exponente - 1);
    }

    //Crear un método que sume los dijitos de un número si mando 456 sea igual a 15
    //4+5+6 = 15
    //Pista se usa el %MOD
    public int sumaDigitos(int numero) {
        // Caso base: 
        if (numero < 10) {
            return numero;
        }     
        return (numero % 10) + sumaDigitos(numero / 10);
    }

    public int fibonacci(int n) {
        //Caso 0 caso base:
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    
}

