import java.util.Scanner;

public class EX09 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);

        double semana1 = leia.nextDouble();
        double semana2 = leia.nextDouble();
        double semana3 = leia.nextDouble();
        double semana4 = leia.nextDouble();

        double hora = 6.59;
        double salario = 1450.50;
        double extra;
        int mes = 1;



        switch (mes) {

            case 1:
                System.out.println("SEMANA 1: ");
                if (semana1 > 40) {
                    extra = salario * 1.50;
                    System.out.println("o seu salario com as horas extras são: " + extra);

                } else {
                    System.out.println("O seu salario sem as horas extras são: " + salario);
                }


            case 2:
                System.out.println("-------------------------------------------------------------");
                System.out.println("SEMANA 2: ");
                if (semana2 > 40) {
                    extra = salario * 1.50;
                    System.out.println("o seu salario com as horas extras são: " + extra);

                } else {
                    System.out.println("O seu salario sem as horas extras são: " + salario);
                }


            case 3:
                System.out.println("-------------------------------------------------------------");
                System.out.println("SEMANA 3: ");
                if (semana3 > 40) {
                    extra = salario * 1.50;
                    System.out.println("o seu salario com as horas extras são: " + extra);

                } else {
                    System.out.println("O seu salario sem as horas extras são: " + salario);
                }
            case 4:
                System.out.println("-------------------------------------------------------------");
                System.out.println("SEMANA 4: ");
                if (semana4 > 40) {
                    extra = salario * 1.50;
                    System.out.println("o seu salario com as horas extras são: " + extra);

                } else {
                    System.out.println("O seu salario sem as horas extras são: " + salario);
                }

        }

    }
}
