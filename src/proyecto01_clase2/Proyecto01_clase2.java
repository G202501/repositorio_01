package proyecto01_clase2;

import java.util.Scanner;

public class Proyecto01_clase2 {
    public static void main(String[] args) {
        int n1, n2, suma;
        Scanner lectura = new Scanner(System.in);

        // Entrada
        System.out.print("Ingresar número 1: ");
        n1 = lectura.nextInt();

        System.out.print("Ingresar número 2: ");
        n2 = lectura.nextInt();
        System.out.print("Ingresar número 3: ");
        n3 = lectura.nextInt();

        // Proceso
        suma = n1 + n2;

        // Salida
        System.out.println("La suma es: " + suma);
    }
}
