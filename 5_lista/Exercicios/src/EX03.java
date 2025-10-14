import java.util.Scanner;


public class EX03 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);

        double macas = leia.nextInt();

        double preco;
        double total;

        if (macas < 12){
            preco = 1.30;
        }
        else {
            preco = 1.00;
        }

        total = macas * preco;

        System.out.println("o valor total é: " + total);


    }
}
