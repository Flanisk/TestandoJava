import java.util.Random;


public class EX01 {
    public static void main(String[] args){
        Random aleatorio = new Random();

        int vetorA [];
        int tamanho = 15;
        vetorA = new int[tamanho];


        for (int i = 0; i < vetorA.length; i ++){
            vetorA[i] = aleatorio.nextInt(100);
        }

        System.out.println("Os elementos imprimidos do vetor A são:");
        for (int valor : vetorA){
            System.out.print(valor + " ");

        }

    }
}
