import java.util.Random;

public class EX02 {
    public static void main(String[] args) {
        Random aleatorio = new Random();

        double numeroAleatorio =  aleatorio.nextDouble(101);

        System.out.println("Aleatorio: " + numeroAleatorio);

    }
}
