import java.util.Scanner;

public class EX06 {
    public static void main(String [] args){
        Scanner leia = new Scanner(System.in);

        int a = leia.nextInt();
        int b = leia.nextInt();

        if (a > b){
            System.out.println(a);
        }
        else if (b > a){
            System.out.println(b);
        }
        else{
            System.out.println("ERRO");
        }
    }
}
