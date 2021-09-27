public class OperadoresDeIgualdad {
    public static void main(String[] args) {
        var a = 2;
        var b = 3;
        var c = (a == b);

        System.out.println("c = " + c);

        var d = a != b;
        System.out.println("d = " + d);

        var cadena = "Hola";
        var cadena2 = "Adios";

        var e = cadena == cadena2; // Compara la referencia del objeto y no el contenido

        System.out.println(" e = " + e);

        var f = cadena.equals(cadena2); // Compara el contenido de las cadenas
        System.out.println("f = " + f);

        var g = cadena.equals("Hola"); // Compara el contenido de la cadena con una simetrica 
        System.out.println("g = "+g);

    }
}
