import java.util.Scanner;

public class EjercicioLibro {
    public static void main(String[] args) throws Exception {
        Scanner dato = new Scanner (System.in);   
        
        System.out.println();
        System.out.print("Ingresa el autor del libro :");
        var autorLib = dato.nextLine();
        System.out.print("\nIngresa el titulo del libro :");
        var tituloLib = dato.nextLine();

        System.out.print("\n\t\tLibro \n");
        System.out.println("Titulo : "+tituloLib);
        System.out.println("Autor : "+autorLib);
    }
}
