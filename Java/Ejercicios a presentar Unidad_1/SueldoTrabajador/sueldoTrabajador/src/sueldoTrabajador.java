//EJERCICIOS UNIDAD 1
//EJERCICIO_3
//Desarrollado por Néstor David Mejía Pinilla - Grupo 72
//Realizar un programa que calcule el sueldo de un trabajador, el programa solicita
//el número de horas que ha trabajado en un mes, las horas se pagan a $30.000

import java.util.Scanner;

public class sueldoTrabajador {
    public static void main(String[] args) {
        float sueldoTrab;
        float valorHora = 30000;
        
        var sc = new Scanner(System.in);
        System.out.print("Por favor introduzca el nombre del trabajador:\n");
        var nombreTrab = sc.nextLine();//Captura el nombre del trabajador

        System.out.print("\nPor favor ingrese el número de horas trabajadas en un mes por " + nombreTrab + "\n");
        int horasTrab = sc.nextInt();//Captura las horas trabajadas

        sueldoTrab = horasTrab * valorHora;//Operación para conocer el sueldo

        System.out.print("\n" + nombreTrab + " por trabajar " + horasTrab + " horas, tiene un sueldo total de " + sueldoTrab + " pesos\n");

    sc.close();

    }
}