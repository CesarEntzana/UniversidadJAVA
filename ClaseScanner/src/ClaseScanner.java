import java.util.Scanner;
public class ClaseScanner {
static public void main (String args []){
    Scanner dato = new Scanner(System.in);

    System.out.println("Ingrese tu nombre :");
    var nomUsuario = dato.nextLine();
    System.out.println("Usuario : "+nomUsuario);
    
    System.out.println("Escribe tu apellido :");
    var apellido = dato.nextLine();
    System.out.println("Apellido :"+apellido);

    System.out.println("Nombre completo :"+nomUsuario+" "+apellido);
    }
}
