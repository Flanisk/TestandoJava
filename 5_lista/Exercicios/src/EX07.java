import java.util.Scanner;

public class EX07 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);

        int a = leia.nextInt();
        int b = leia.nextInt();

        if (a > b){
            System.out.println("Aqui estão os resultados: ");
            System.out.println(a);
            System.out.println(b);
        }
        else if (a < b){
            System.out.println("Aqui estão os resultados: ");
            System.out.println(b);
            System.out.println(a);
        }
        else{
            System.out.println("ERRO ");
        }
    }
}
