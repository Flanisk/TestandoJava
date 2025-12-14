import java.util.Scanner;
import java.util.Random;


public class EX07_Saudacao {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        Random aleatorio = new Random();

        System.out.println("O que você deseja?");
        System.out.println("1: informar o horário");
        System.out.println("2: gerar o horário aleatóriamente");

        int opcao =  entrada.nextInt();

        int hora;

        if (opcao == 1){
            System.out.println("digite a hora");

            hora = entrada.nextInt();

            if (hora >= 0 && hora <= 6 ){
                System.out.println("zzzzzzzzzzzzz");
            }
            else if (hora >= 7 && hora <= 11){
                System.out.println("Bom dia");
            }
            else if (hora >= 12 && hora <= 17) {
                System.out.println("Boa tarde");
            }
            else if (hora >= 18 && hora <= 23){
                System.out.println("Boa noite ");
            }


        } else if (opcao == 2) {
            System.out.println("a hora vai ser: ");
            hora = aleatorio.nextInt(24);

            System.out.println(hora);

            if (hora >= 0 && hora <= 6 ){
                System.out.println("zzzzzzzzzzzzz");
            }
            else if (hora >= 7 && hora <= 11){
                System.out.println("Bom dia");
            }
            else if (hora >= 12 && hora <= 17) {
                System.out.println("Boa tarde");
            }
            else if (hora >= 18 && hora <= 23){
                System.out.println("Boa noite ");
            }

        }


    }
}
