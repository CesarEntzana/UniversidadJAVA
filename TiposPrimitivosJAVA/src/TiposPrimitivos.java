
public class TiposPrimitivos {
    public static void main(String[] args)  {
/*
Tipos primitivos enteros { byte, short, int, long }
*/

// Primitivo byte 8 bits con signo
int  numByte = 127; //  -127 <  > 127 

System.out.println("Valor minimo de byte :"+Byte.MIN_VALUE);
System.out.println("Valor maximo de byte :"+Byte.MAX_VALUE);

// Primitivo short 16 bits con signo 

short numShort = 32750; // -32768 < > 32767

System.out.println("Valor minimo de short :"+Short.MIN_VALUE);
System.out.println("Valor maximo de short :"+Short.MAX_VALUE);


// Primitivo int  32 bits con signo 

int numInt = 99999999; // -2^31 < > (-2^31) -1 

System.out.println("Valor minimo de int : "+Integer.MIN_VALUE);
System.out.println("Valor maximo de int : "+Integer.MAX_VALUE);


// Primitivo long 64   bits con signo 

long numLong = 999999999999999L; // -2^63 < > (-2^63) -1 

System.out.println("Valor minimo de long : "+Long.MIN_VALUE);
System.out.println("Valor maximo de long : "+Long.MAX_VALUE);


/*
Tipos primitivos de tipo flotante {float , double}
*/


// Primitivo float 32 bits 
float numFloat = 10.00f; // -1.4E-45 < > 3.40E38
System.out.println("Valor minimo de float : "+Float.MIN_VALUE);
System.out.println("Valor maximo de float : "+Float.MAX_VALUE);

// Primitivo doubñe 64 bits 
double numDouble = 155454653.909040; // -4.9E-324 < > 1.79E308
System.out.println("Valor minimo de float : "+Double.MIN_VALUE);
System.out.println("Valor maximo de float : "+Double.MAX_VALUE);


}
}