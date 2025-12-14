import java.util.Random;

public class EX09 {
    public static void main(String[] args){
        Random aleatorio = new Random();

        int vetorG[];
        int contador = 0;

        vetorG = new int[10];

        int vetorH[];
        vetorH = new int[0];

        for (int i = 0; i < vetorG.length; i++){
            vetorG[i] = aleatorio.nextInt(10);

            System.out.println(vetorG[i]);


        }

        for (int i = 0; i < vetorG.length; i++){
            if (vetorG[i] % 2 == 0){
                vetorH[contador] = vetorG[i];
                contador++;

            }

        }


        System.out.println("\nVetor H (apenas valores pares de G):");
        for (int i = 0; i < contador; i++) {
            System.out.print(vetorH[i] + " ");
        }



    }
}
