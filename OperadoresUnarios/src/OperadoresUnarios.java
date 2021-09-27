public class OperadoresUnarios {
    public static void main(String[] args) {
        /*
         * Operadores unarios de un solo operador capaces de incrementar y decrementar
         * de una unidad o en defecto de ser booleano invierte el valor
         */

        // Operador de cambio de signo
        var a = 3;
        var b = -a;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Operador negación en variables de tipo boolean

        var c = true;
        var d = !c;

        System.out.println("c = " + c);
        System.out.println("d = " + d);

        // Preincrmeento con operador antes de la variable

        var e = 3;
        var f = ++e; // s eincrmenta la variable y enseguida se utiliza su valor

        System.out.println("e = " + e);
        System.out.println("f = " + f);
        var g = 5;
        var h = g++; // Es asiganado el valor por defecto de la variable y en seguida se incrmenta

        System.out.println("g = " + g); // Contiene el valor inicial de la variable sin incremento
        System.out.println("h = " + h); // Contiene el valor de la variable g con un incremento en una unidad

        // Decremento

        var i = 2;
        var j = --i; // La variable tiene un decremento en una unidad y el valor se asigna a la
                     // variable

        System.out.println("i = " + i);
        System.out.println("j = " + j);

        // Posdecremento

        var k = 4;
        var l = k--; // En primer lugar se asigna el valor a la variable declarada "l" seguido del
                     // decrmento en una unidad

        System.out.println("k = " + k);
        System.out.println("l = " + l);

    }
}
