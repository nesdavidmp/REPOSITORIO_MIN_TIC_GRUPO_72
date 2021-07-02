//Desarrollado por Néstor David Mejía Pinilla - Grupo 72
//En este ejercicio se utilizan los métodos lenght(), charAt(), substring(), toUpperCase(), toLowerCase(), trim()
//Metodos de la clase 'String'

public class Ejercicio_Cadenas {
    public static void main(String[] args) {
        
        //Declaro una variable tipo String llamada 'cadena'. Esta cadena es la que voy a utilizar en los diferentes métodos de la clase 'String'

        System.out.print("*****Ejercicio de cadenas utilizando varios métodos*****\n\n");
        
        //defino variable 'metodo_1'
        String metodo_1 = new String ("***Método lenght***");
        //Utilizo el metodo 'lenght()'
        System.out.print("La cadena " + metodo_1 + " tiene >> " + metodo_1.length() + " caracteres\n\n");

        //defino variable 'metodo_2'
        String metodo_2 = new String ("***Método charAt***");
        //Utilizo el metodo 'charAt()'
        System.out.print("La cadena " + metodo_2 + " inicia con la letra >> " + metodo_2.charAt(3) + "\n\n");

        //defino variable 'metodo_3'
        String metodo_3 = new String ("***Método substring***");
        //Utilizo el metodo 'substring()'
        System.out.print("Para la expresión " + metodo_3 + " imprime la segunda palabra >> " + metodo_3.substring(10, 19) + "\n\n");

        //defino variable 'metodo_4'
        String metodo_4 = new String ("método touppercase");
        //Utilizo el metodo 'toUpperCase()'
        System.out.print("Minúscula >> " + metodo_4 + " / Mayúscula >> " + metodo_4.toUpperCase() + "\n\n");

        //defino variable 'metodo_5'
        String metodo_5 = new String ("MÉTODO TOLOWERCASE");
        //Utilizo el metodo 'toLowerCase()'
        System.out.print("Mayúscula >> " + metodo_5 + " / Minúscula >> " + metodo_5.toLowerCase() + "\n\n");

        //defino variable 'metodo_6'
        String metodo_6 = new String ("   Método TRIM   ");
        //Utilizo el metodo 'trim()'
        System.out.print("La expresión" + metodo_6 + " sin espacios al inicio y al final >> " + metodo_6.trim() + "\n\n");

    }
}
