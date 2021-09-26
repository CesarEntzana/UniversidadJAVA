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


        // Preincrmeento 

        var e = 3 ;
        var f = ++e; // s eincrmenta la variable y enseguida se utiliza su valor 

        System.out.println("e = "+e);
        System.out.println("f = "+f);

    }
}
