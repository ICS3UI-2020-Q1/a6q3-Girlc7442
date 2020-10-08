import java.util.Scanner;

/**
 * Finds the largest integer within an array of integers
 * @author Cole Girling
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //scanner for user input
    Scanner input = new Scanner(System.in);

    //ask the user to enter 10 integers
    System.out.println("Please enter in 10 integers to put into the array");

    //store the 10 integers in an array
    int[] numbers = new int[10];

    //takes the users integers to put them in an array
    for(int i = 0; i < 10; i++){
      numbers[i] = input.nextInt();
    }

    //sets this variable as the first number in the array
    int n = numbers[0];
    
    //will check the whole array for a larger number than the first number in the array and replace it until it finds the largest number
    for(int i = 0; i < 10; i++){
      if(numbers[i] > n){
        n = numbers[i];
      }
    }
    
    //Tells the user the largest number
    System.out.println("The largest number is " + n);
    
  }
}