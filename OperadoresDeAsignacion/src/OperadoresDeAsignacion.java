public class OperadoresDeAsignacion {
    public static void main(String[] args) {

        /*
        Operadores de asignación se utilizan mediante el uso de variables y en ellas se 
        asignan valores procedentes de la evaluación de los valores que s eencuentreen 
        en el lado derecho y una vez evaluados se asignan a la variable referida en la parte 
        izquierda mediante el operador de asignación (=)
        */
        int a = 3;
        int b = 2 ;
        int c =  a +5 -b ;

System.out.println(c);

// Operadores de asignación compuestos permite simplificar la sintaxis del mismo sin tener que definir tanto código

 a += 1;  // La variable se incrementa el valor en uno (a + 1)

 System.out.println("a = "+a);

 a += 3; // la variable se incrementa con un valor de ma stres (a + 3 )

 System.out.println("a = "+a);

 a -= 2 ; // La variable se decrementa en un valor de -2 

 System.out.println("a = "+a);
    }
}
