import java.util.Scanner;
public class ConversionDatosPrimitivos {
    public static void main(String[] args) throws Exception {
       /*
       Conversion de datos primitivos mediante casting de tipo a tipo
        manejando el control de los diversos datos y su conversiones 
        entre ellos permitidos
       */
        // Conversion String to int con datos definidos  
        var edad = Integer.parseInt("30");

        System.out.println("Edad : "+edad);

        var variablePI = Double.parseDouble("3.1416");
        System.out.println("Valor pi : "+variablePI);

        // Conversion de datos mediante datos porporcionados 

        var datos = new Scanner (System.in);
        System.out.println("Ingresa un número");
        var numero  = Integer.parseInt(datos.nextLine());
System.out.println("Número : "+numero);


// Conversion de datos por medio de casting e identificación de índices 

// Conversion valor de una cadena a tipo int 
var edadtexto = String.valueOf(10);
System.out.println("Edad  text > int : "+edadtexto);

// Converison indice de una cadena a char 

var frase = "Es una cadena";
System.out.println("Frase índice [1] : "+(frase.charAt(1)));

// Conversion índice de una cadena introducida 
System.out.println("Ingresa una frase : ");
var frase2 = datos.nextLine();
System.out.println("Frase 2 índice [2] :"+(frase2.charAt(2)));



    }
}
