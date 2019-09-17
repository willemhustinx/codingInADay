import java.util.Scanner;

public class Opdracht5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Mag ik een getal? ");
        int getal = sc.nextInt();

        if(getal >  0){
            System.out.println("Dit getal is positief");
        } else {
            if(getal == 0){
                System.out.println("Het getal is 0");
            } else {
                System.out.println("Dit getal is negatief");
            }
        }
    }
}

