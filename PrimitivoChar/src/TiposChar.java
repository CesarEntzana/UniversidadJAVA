
public class TiposChar {
    public static void main(String[] args) throws Exception {
        /*
        Declaración variables de tipo char mediante la palabra reservada "char"
        */
        char caracter = 'a';
        System.out.println("Carácter : "+caracter);
        
        char charDecimal = 40;
        System.out.println("Carácter valor decimal : "+charDecimal);

        char charSigno = '@';
        System.out.println("Carácter simbolo representativo  : "+charSigno);

        /*
        Declaración de caracteres en JAVA mediante inferencia con var y realizando casting donde sea necesario 
        */
        var charValor = '\u0021';
        System.out.println("Carácter valor unicode : "+charValor);

        var charDecimal2Casting = (char)40;
        System.out.println("Carácter valor decimal con casting : "+charDecimal2Casting);

    }
}
