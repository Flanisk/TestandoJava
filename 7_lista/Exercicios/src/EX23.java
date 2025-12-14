import java.util.Scanner;

public class EX23 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);

        String nome = "", sobrenome = "";

        System.out.print("Entre com um nome: ");
        nome = leia.nextLine();

        String [] palavras = nome.split(" ");

        System.out.print("\nSobrenome: " + palavras [ palavras.length - 1]);



    }
}
