public class OperadorTernario {
    public static void main(String[] args) {

        var resultado = (3 > 2) ? "verdadero" : "Falso";

        System.out.println("Resultado :" + resultado);

        var num = 8;
        resultado = (num % 2 == 0) ? "Par " : "Impar ";

        System.out.println("Resultado : " + resultado);
    }
}
