import java.util.Scanner;

public class EX16 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com uma frase: ");
        String frase = sc.nextLine();

        if (frase.equals(frase.toUpperCase()) ){
            System.out.println("Todas sao maisculas");
        }else{
            System.out.println("NÃ£o sao maiusculas!");
        }
    }
}
