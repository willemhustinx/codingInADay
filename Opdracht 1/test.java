import java.util.Scanner;

class Main {
  public static void main(String[] args) {
  
	Scanner sc = new Scanner(System.in);  
	
    System.out.print("Wat is je naam? ");
	
	// String input 
    String name = sc.nextLine(); 
	
	System.out.print("Welkom " + name);
	
  }
}