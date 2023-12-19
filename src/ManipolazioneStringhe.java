import java.util.Scanner;

public class ManipolazioneStringhe {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci una stringa: ");
        String inputUtente = scanner.nextLine();

        System.out.println("Maiuscolo : " + maiuscolo(inputUtente));
        System.out.println("Minuscolo : " + minuscolo(inputUtente));
        System.out.println("Primo carattere : " + primoCarattere(inputUtente));
        System.out.println("Ultimi due carattere : " + ultimiDueCarattere(inputUtente));
        scanner.close();

        
    }

    public static String maiuscolo(String str){
        return str.toUpperCase();
    }
    public static String minuscolo(String str){
        return str.toLowerCase();
    }

    public static char primoCarattere(String str){
        return str.charAt(0);
    }

    public static String ultimiDueCarattere(String str){
        return str.substring(str.length() - 2);
    }
}
