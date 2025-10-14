import java.util.Scanner;


public class EX02 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite um valor:");
        int numero = leia.nextInt();

        if (numero >= 0){
            System.out.println("o valor é positivo");

        }else if (numero < 0){
            System.out.println("o valor é negativo");
        }
    }
}
