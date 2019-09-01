import java.util.Scanner;

public class Opdract3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Wat is je naam? ");
        String naam = sc.nextLine();

        System.out.print("Wat is je leeftijd? ");
        int leeftijd = sc.nextInt();

        System.out.println("Hallo " + naam);
        System.out.println("Je leeftijd is " + leeftijd);
    }
}
