public class EX02 {
    public static void main(String[] args) {

        String maiuscula= "";
        for(char i = 65; i < 90; i++){
            maiuscula += i;
            System.out.print((char)i + " ");
        }

        System.out.println(" " + maiuscula );

    }
}
