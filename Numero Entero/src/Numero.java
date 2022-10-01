import java.io.IOException;
import java.util.Scanner;

public class Numero {
	public static void main(String[] args) throws IOException
	{
	Scanner sc = new Scanner(System.in);
	int numero, digitos;
	char respuesta;
	do
	{
	System.out.print("Escribe un número entero ");
	numero= sc.nextInt();
	digitos=0;
	while (numero!=0)
	{
	numero=numero/10;
	digitos++;
	}
	System.out.println("El número tiene " + digitos + " digitos");
	do
	{
	System.out.print("Desea continuar? S/N ");
	respuesta = (char)System.in.read();
	System.in.read();//omitir el enter que quedó en memoria
	}while (respuesta!='s' && respuesta!='S' && respuesta !='n' && respuesta!='N');

	}while (respuesta=='s' | respuesta=='S');
	}
}
