import java.util.Scanner;  

public class AddNumber{
  public static void main(String[] args) {
    int x, y, sum;
    Scanner myObj = new Scanner(System.in); 

    System.out.println("First number:");
    x = myObj.nextInt(); 

    System.out.println("Second number:");
    y = myObj.nextInt(); 

    sum = x + y;
    System.out.println("Sum is: " + sum); 
  }
} 