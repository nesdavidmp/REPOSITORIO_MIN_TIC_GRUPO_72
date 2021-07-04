//EJERCICIOS UNIDAD 1
//EJERCICIO_4
//Desarrollado por Néstor David Mejía Pinilla - Grupo 72
//Solicitar un número al usuario y mostrar la tabla de multiplicar de ese número, desde el 0 hasta el 10.

import java.util.Scanner;

public class tabla_Multiplicacion {
    public static void main(String[] args) {
        int resultado, n;
        
        var sc = new Scanner(System.in);
        System.out.print("Por favor introduzca un número entero para conocer su tabla de multiplicación:\n");
        var numero_1 = sc.nextInt();//Captura el número entero

        System.out.print("\n\n***Tabla de multiplicar del " + numero_1 + "***\n");

        //Ciclo FOR que inicia en n = 1 hasta n = 10
        for(n = 1; n <= 10; n++){
            resultado = numero_1 * n;
            System.out.print(numero_1 + " X " + n + " = " + resultado + "\n");
        }
        sc.close();
    }
}
