import java.util.Scanner;

public class EX05 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);

        System.out.println("Informe o ano que estamos: ");
        int atualmente = leia.nextInt();

        System.out.println("Informe o ano que você nasceu: ");
        int nascimento =  leia.nextInt();

        int idade = atualmente - nascimento;

        System.out.println("A sua idade é: " + idade);

        if (idade >= 16){
            System.out.println("parabens, você pode votar esse ano!!");
        }
        else {
            System.out.println("Não pode votar esse ano");
        }



    }
}
