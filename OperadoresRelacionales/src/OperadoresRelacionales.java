public class OperadoresRelacionales {
    public static void main(String[] args) {
        var a = 3;
        var b = 4;

        var c = a > b; // Operador involucrado (mayor que > ) compara el valor a > b
        System.out.println(" c = " + c);

        if (a % 2 == 2) { // Operador implicado de igualdad ( == ) compara dos valores y devuelve un
                          // boolean
            System.out.println("El número es par ...");
        } else {
            System.out.println("El número es inpar ...");
        }

        var edad = 30;
        var adulto = 18;

        if (edad >= adulto) { // Operador implicado (mayor o igual que >= ) compara el valor mayor o de
                              // igualdad de dos números
            System.out.println("Es un adulto ");
        } else {
            System.out.println("No es adulto ");
        }

        var edad2 = 10;

        if (edad2 >= adulto) {
            System.out.println("Es adulto ");
        } else {
            System.out.println("No es adulto ");
        }

    }
}
