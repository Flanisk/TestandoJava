import java.util.Scanner;


public class EX04 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);

        int primeira = leia.nextInt();
        int segunda = leia.nextInt();
        int total;

        System.out.println("A primeira nota foi: " + primeira);

        System.out.println("A segunda nota foi: " + segunda);

        double soma = (double)(primeira + segunda) / 2;

        System.out.println("A média final foi: " + soma);

        if (soma >= 6){
            System.out.println("Aprovado");
        }
        else {
            System.out.println("Reprovado");
        }





    }
}
