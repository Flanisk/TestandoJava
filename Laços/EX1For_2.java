import java.util.Scanner;


public class EX1For_2 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int numero, contador, tabuada;
		
		System.out.println("Entre com um numero: ");
		numero = leia.nextInt();
		
		contador = 0;
		
		for ( ; ; ) {
			
			if(!(contador <= 10)){
				break;
				}
			tabuada = numero * contador;
			
			System.out.println(numero + "x" + contador + "=" + tabuada);
			
			contador++;
			
			} 
	}
}

