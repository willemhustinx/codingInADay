import java.util.Scanner;

public class Opdracht6a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("We gaan verstoppertje spelen!");
        System.out.print("Tot hoeveel moet ik tellen? ");
        int getal = sc.nextInt();

        int i = 1;
        while(i <= getal){
            System.out.println(i);
            i++;
        }

        System.out.println("Wie niet weg is is gezien. IK KOM!");
    }
}

