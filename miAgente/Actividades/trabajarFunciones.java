/*
 * Actividad: Trabajar con funciones
 * Módulo: Programación - 1º DAM
 * Unidad: UD03 (modularidad, excluyendo recursividad)
 *
 * Enunciado para el alumnado:
 * El siguiente programa funciona, pero todo su código está dentro de main().
 * Refactorízalo extrayendo 5 métodos (funciones y/o procedimientos) que
 * simplifiquen main(), de forma que main() solo lea los datos y delegue.
 *
 * Rúbrica (10 puntos, 2 puntos por método):
 *   1. factorial(int n) -> int                              : 2 puntos
 *   2. esPrimo(int n) -> boolean                            : 2 puntos
 *   3. celsiusAFahrenheit(double celsius) -> double          : 2 puntos
 *   4. contarPares(int[] numeros) -> int                    : 2 puntos
 *   5. sumarVector(int[] numeros, int cantidad) -> int       : 2 puntos
 *
 * Requisitos:
 *   - La clase debe llamarse igual que el archivo: trabajarFunciones.
 *   - Cada método debe tener Javadoc con @param y @return cuando aplique.
 *   - Ningún método debe leer del teclado: se lee en main y se pasa por parámetro.
 *   - El programa debe compilar sin errores ni avisos.
 */
import java.util.Scanner;

public class trabajarFunciones {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // ---------- Tarea 1: factorial ----------
        System.out.print("Introduce un número para calcular su factorial: ");
        int nFact = teclado.nextInt();
        int factorial = 1;
        for (int i = 2; i <= nFact; i++) {
            factorial = factorial * i;
        }
        System.out.println("Factorial de " + nFact + " = " + factorial);

        // ---------- Tarea 2: número primo ----------
        System.out.print("Introduce un número para comprobar si es primo: ");
        int nPrimo = teclado.nextInt();
        boolean esPrimo = nPrimo > 1;
        for (int i = 2; i <= nPrimo / 2 && esPrimo; i++) {
            if (nPrimo % i == 0) {
                esPrimo = false;
            }
        }
        if (esPrimo) {
            System.out.println(nPrimo + " es primo");
        } else {
            System.out.println(nPrimo + " no es primo");
        }

        // ---------- Tarea 3: conversión Celsius -> Fahrenheit ----------
        System.out.print("Introduce grados Celsius: ");
        double celsius = teclado.nextDouble();
        double fahrenheit = celsius * 1.8 + 32;
        System.out.println(celsius + " ºC = " + fahrenheit + " ºF");

        // ---------- Tarea 4: contar pares de un vector ----------
        System.out.print("Introduce el tamaño del vector: ");
        int tam4 = teclado.nextInt();
        int[] vectorPares = new int[tam4];
        for (int i = 0; i < tam4; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vectorPares[i] = teclado.nextInt();
        }
        int pares = 0;
        for (int i = 0; i < vectorPares.length; i++) {
            if (vectorPares[i] % 2 == 0) {
                pares++;
            }
        }
        System.out.println("Cantidad de números pares: " + pares);

        // ---------- Tarea 5: suma de los primeros elementos de un vector ----------
        System.out.print("Introduce el tamaño del vector: ");
        int tam = teclado.nextInt();
        int[] numeros = new int[tam];
        for (int i = 0; i < tam; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            numeros[i] = teclado.nextInt();
        }
        System.out.print("¿Cuántos elementos quieres sumar? ");
        int cantidad = teclado.nextInt();
        int suma = 0;
        for (int i = 0; i < cantidad && i < numeros.length; i++) {
            suma = suma + numeros[i];
        }
        System.out.println("La suma de los " + cantidad + " primeros elementos es: " + suma);

        teclado.close();
    }
}