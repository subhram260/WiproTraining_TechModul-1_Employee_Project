//Write a program to print the sum of all the digits of a given number.
//
//        Example1)
//        I/P:1234
//        O/P:10
import java.util.Scanner;

public class Day2_Flowcontrol_14 {
    public static void main(String...args)
    {
    Scanner se=new Scanner(System.in);
    System.out.print("Enter a number : ");
    int sum=0,number=se.nextInt();
    while(number>0)
    {
        sum+=(number%10);
        number/=10;
    }
    System.out.println(sum);
    }
}
