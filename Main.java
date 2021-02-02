/*
Mini Project 1
Group #: Jeremiah Shaw, Michael Seitz, Hailey Wisniewski, Samuel Green
Date: 2/2/21
*/
import java.util.Scanner;
import java.util.Random;
class Main {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    Random r = new Random();
    int num;
    
    System.out.println("Welcome to the guessing game!");
    System.out.println("Please enter any positive whole number:");
    
    num = s.nextInt();
    int gnum = r.nextInt(num + 1);
    int i;
    int count;  
    System.out.println("A randm number to guess has been generated");
    System.out.println("Please guess a number between 0 and " + num);
    i = s.nextInt();

    for ( int count = 1 ; i > gnum; count++){
      if (i < gnum )
      {
      System.out.println("Guess higher!");
      count++;
      }
      else if (i > gnum )
      {
      System.out.println("Guess lower!");
      count++;
     }
      }
      if (i == gnum){
      System.out.println("Great, you win! It took you " + count + "tries");
      count++;
    }
    
    


    

  }
}