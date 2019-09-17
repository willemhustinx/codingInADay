import java.util.Scanner;

public class Opdracht6b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("We gaan verstoppertje spelen!");
        System.out.print("Tot hoeveel moet ik tellen? ");
        int getal = sc.nextInt();

        for(int i = 1; i <= getal; i++){
            System.out.println(i);
        }

        System.out.println("Wie niet weg is is gezien. IK KOM!");
    }
}

