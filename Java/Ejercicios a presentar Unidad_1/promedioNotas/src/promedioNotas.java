//EJERCICIOS UNIDAD 1
//EJERCICIO_2
//Desarrollado por Néstor David Mejía Pinilla - Grupo 72
//Realizar un programa que realice el promedio de las notas de un alumno, para ello el programa
//va a tener que solicitar el nombre del alumno y las notas de las 3 evaluaciones. Si el alumno
//tiene un promedio mayor o igual a 3.0 también debe imprimir “Aprobado”, si no alcanzó esa nota
//debe imprimir “Reprobado” . Requisitos: Las notas que se ingresan pueden tener decimales. 

import java.util.Scanner;

public class promedioNotas {
    public static void main(String[] args) {
        float promedioEst;
        float aprobado = 3;
        
        var sc = new Scanner(System.in);
        System.out.print("Por favor introduzca el nombre del estudiante:\n");
        var nombreEst = sc.nextLine();//Captura el nombre del estudiante

        System.out.print("\nPor favor ingrese la primera nota de " + nombreEst + ":\n");
        var nota_1 = sc.nextFloat();//Captura la primera nota

        System.out.print("\nPor favor ingrese la segunda nota de " + nombreEst + ":\n");
        var nota_2 = sc.nextFloat();//Captura la segunda nota

        System.out.print("\nPor favor ingrese la tercera nota de " + nombreEst + ":\n");
        var nota_3 = sc.nextFloat();//Captura la tercera nota

        promedioEst = (nota_1 + nota_2 + nota_3) / 3;//Operación para detetrminar el promedio de las 3 notas

        //Condicional IF
        if(promedioEst >= aprobado){
            System.out.print("El estudiante " + nombreEst + " Aprobo!\n");   
        }else{
            System.out.print("El estudiante " + nombreEst + " Reprobo!\n");   
        }

    sc.close();

    }
}