//EJERCICIOS UNIDAD 1
//EJERCICIO_1
//Desarrollado por Néstor David Mejía Pinilla - Grupo 72
//Realizar la suma, la resta, la división y la multiplicación de dos números leídos por teclado
//y mostrar en pantalla “La <operación> de <número 1> y <número 2> es igual a <resultado> ”.

import java.util.Scanner;

public class operacionesAritmeticas {
    public static void main(String[] args) {
             
        var sc = new Scanner(System.in);
        System.out.print("Por favor introduzca un número entero:\n");
        var numero_1 = sc.nextInt();//Captura el número 1 

        System.out.print("\nPor favor introduzca otro número entero:\n");
        var numero_2 = sc.nextInt();//Captura el número 2 

        System.out.print("\n********OPERACIONES ARITMÉTICAS********\n");

        int suma = numero_1 + numero_2;//Operación de suma
        System.out.print("\nLa suma de " + numero_1 + " y " + numero_2 + " es igual a " + suma + "\n");

        int resta = numero_1 - numero_2;//Operación de resta
        System.out.print("\nLa resta de " + numero_1 + " y " + numero_2 + " es igual a " + resta + "\n");

        int division = numero_1 / numero_2;//Operación de división
        System.out.print("\nLa division de " + numero_1 + " y " + numero_2 + " es igual a " + division + "\n");

        int multiplicacion = numero_1 * numero_2;//Operación de multiplicación
        System.out.print("\nLa multiplicacion de " + numero_1 + " y " + numero_2 + " es igual a " + multiplicacion + "\n");
      
    }
}