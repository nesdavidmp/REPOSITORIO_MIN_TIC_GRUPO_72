//EJERCICIOS UNIDAD 1
//EJERCICIO_6
//Desarrollado por Néstor David Mejía Pinilla - Grupo 72
//Realizar un programa que solicite el sexo (H/M) y la altura (cm) al usuario y que calcule el peso ideal.
//peso ideal mujeres = altura - 120
//peso ideal hombres = altura - 110

import java.util.Scanner;

public class pesoIdeal {
    public static void main(String[] args) {

        int peso;

        var sc = new Scanner(System.in);
        System.out.print("Por favor seleccione su género\n>> 1 << para Hombre\n>> 2 << para Mujer\n");
        var genero = sc.nextInt();
        

        System.out.print("\nPor favor indique su altura en cms:\n");
        var altura = sc.nextInt();//Captura la altura

        
            switch(genero)
            {  //Menú que muestra los tipos de género
                case 1:
                {
                    System.out.print("");
                    break;
                }
                case 2:
                {
                    System.out.print("");
                    break;
                }
            }

            //Si es hombre haga lo siguiente.....
            if (genero == 1)
            {
                peso = altura - 110;
                System.out.print("Su peso ideal es de >> " + peso + "kg\n");
            }  

            //Si es mujer haga lo siguiente.....
            if (genero == 2)
            {
                peso = altura - 120;
                System.out.print("Su peso ideal es de >> " + peso + "kg\n");
            }
    }
}