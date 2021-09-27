public class OperadoresLogicos {
    public static void main(String[] args) {

        var a = 10;
        var valorMinimo = 0;
        var valorMaximo = 10;

        var resultado = a >= 0 && a <= 10;

        if (resultado) {
            System.out.println("Dentro de rango ");
        } else {
            System.out.println("Fuerad de rango");

        }

        var b = 12;
        resultado = b >= 0 && b <= 10;

        if (resultado) {
            System.out.println("Dentro de rango ");
        } else {
            System.out.println("Fuera de rango");
        }

        var vacaciones = false;
        var diaDescanso = false;

        if (vacaciones || diaDescanso) {
            System.out.println("Tiempo libre  ");
        } else {
            System.out.println("Tiempo ocupado ");
        }

        if (!vacaciones || !diaDescanso) {
            System.out.println("Tiempo libre  ");
        } else {
            System.out.println("Tiempo ocupado ");
        }
    
    }
}
