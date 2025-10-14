import java.util.Scanner;


public class EX12 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);

        System.out.println("digite o valor do produto: ");
        int preco = leia.nextInt();


        System.out.println("Agora escolha a rgião que deseja: \n Norte(1)\n Sul(2, 5, 9)\n Leste(3, 10, 11, 12, 13, 14, 15)\n Oeste(7, 20)\n Importado(qualquer outro numero) ");
        int codigo = leia.nextInt();
        double Norte = 10; double Sul = 3; double Leste = 1.2; double Oeste = 7.3; double Importado = 22.2;
        double resultado;

        switch (codigo){
            case 1:
                resultado = preco + (preco * (Norte/100));
                System.out.println("O valor + o frete fica: " + resultado);
                break;

            case 2, 5, 9:
                resultado = preco + (preco * (Sul/100));
                System.out.println("O valor + o frete fica: " + resultado);
                break;

            case 3, 10, 11, 12, 13, 14, 15:
                resultado = preco + (preco * (Leste/100));
                System.out.println("O valor + o frete fica: " + resultado);
                break;

            case 7, 20:
                resultado = preco + (preco * (Oeste/100));
                System.out.println("O valor + o frete fica: " + resultado);
                break;

            default:
                resultado = preco + (preco * (Importado/100));
                System.out.println("O valor + o frete fica: " + resultado);
                break;


        }

    }
}
