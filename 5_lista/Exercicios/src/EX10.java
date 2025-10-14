import java.util.Scanner;


public class EX10 {
    public static void main(String [] args){
        Scanner leia = new Scanner(System.in);
        double salario = leia.nextDouble();
        double comissao = 3;
        double amais = 3;
        double salariofinal;

        double resultado = salario + (salario * (comissao / 100));

        System.out.println(resultado);

        if (resultado > 1500.00){
            salariofinal = resultado + (resultado * (amais / 100));
            System.out.println("O seu salario final é: " + salariofinal);
            return;

        } else {
            salariofinal = resultado;
            System.out.println("O seu salario final é: " + salariofinal);
            return;
        }



        }


















    }
