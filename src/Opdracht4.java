import java.util.Scanner;

public class Opdracht4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Wat is je voornaam? ");
        String voornaam = sc.nextLine();

        System.out.print("Wat is je achternaam? ");
        String achternaam = sc.nextLine();

        System.out.print("Wat is je leeftijd (in jaren)? ");
        int leeftijdInJaren = sc.nextInt();
        int leeftijdInMaanden = leeftijdInJaren * 12;
        int leeftijdInDagen = leeftijdInJaren * 356;

        System.out.println("Hallo " + voornaam + " " + achternaam);
        System.out.println("Je leeftijd in jaren is " + leeftijdInJaren);
        System.out.println("Je bent minimaal " + leeftijdInMaanden + " maanden oud");
        System.out.println("Je bent minimaal " + leeftijdInDagen + " dagen oud");
    }
}
