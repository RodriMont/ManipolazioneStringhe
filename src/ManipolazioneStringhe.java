import java.util.Scanner;

public class ManipolazioneStringhe {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci una stringa: ");
        String inputUtente = scanner.nextLine();

        System.out.println("Maiuscolo: " + maiuscolo(inputUtente));
        scanner.close();

        
    }

    public static String maiuscolo(String str){
        return str.toUpperCase();
    }
}
