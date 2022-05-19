// Write a program to check if a given integer number is odd or even.
import java.util.Scanner;
public class Day1Question5 {
    public static void main(String[] args)
    {
       Scanner se=new Scanner(System.in);
       System.out.print("Enter a number to check that the number is even or odd : ");
       int n=se.nextInt();
       System.out.println("The number is "+((n%2==0)?"even":"odd")+" number");

    }
}
