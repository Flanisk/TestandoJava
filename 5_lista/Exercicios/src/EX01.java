import java.util.Scanner;

public class EX01 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite um valor:");
        int a = leia.nextInt();

        if (a > 10){
            System.out.println("é maoir que 10!");
        }
        else{
            System.out.println("não é maior do que 10");
        }

    }
}
