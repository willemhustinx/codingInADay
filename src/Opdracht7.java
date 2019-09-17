import java.lang.Math;
import java.util.Scanner;

public class Opdracht7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("We gaan dobbelen!");
        System.out.print("Welk getal moet gegooid worden? ");
        int getal = sc.nextInt();

        if(getal <= 6) {
            int gegooid = 0;
            int aantalKeerGegooid = 0;

            int max = 6;
            int min = 1;
            int range = max - min + 1;

            while (gegooid != getal){
                gegooid = (int) ((Math.random() * range) + min);
                aantalKeerGegooid++;

                System.out.println(gegooid);
            }

            System.out.println(getal + " is in " + aantalKeerGegooid + " keer gegooid");

        } else {
            System.out.println("Getal staat niet op de dobbelsteen");
        }
    }
}

