public class Concatenacion {
    public static void main(String[] args) throws Exception {
       var uno = 3;
       var dos = 4;
     var usuario = "GitHub";

       System.out.println(uno + dos ); // Suma de números 
       System.out.println(usuario + uno+dos ); // Evaluación de izquierda a derecha realiza la suma
       System.out.println(usuario +(uno+dos)); // Contexto cadena , todo es una cadena 
    }
}
