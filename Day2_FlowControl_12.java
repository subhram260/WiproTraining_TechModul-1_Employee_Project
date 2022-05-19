//Write a program to check if a given number is prime or not.
import java.util.Scanner;

public class Day2_FlowControl_12 {
    public static void main(String...args){
    Scanner se=new Scanner(System.in);
    System.out.print("Enter a number : ");
    int number=se.nextInt();
    boolean prime=true;
    for(int i=2;i<=(number/2);i++)
    {
        if(number%i==0)
        {
            prime=false;
            break;
        }
    }
    if(prime)
    {
        System.out.println("The number "+number+" is prime number");
    }
    else
    {
        System.out.println("The number "+number+" is not prime number");
    }

    }
}
