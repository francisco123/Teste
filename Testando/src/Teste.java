import static java.lang.System.out;
import java.util.Scanner;
public class Teste {

	public static void main(String[] args){
		Scanner entrada=new Scanner(System.in);
		out.println("Digite seu nome: ");
		int nome=entrada.nextInt();
		out.println("Hello, "+ nome);
	}
}
