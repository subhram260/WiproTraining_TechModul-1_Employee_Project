//Write a program to reverse a given number and print
//
//        Example1)
//        I/P: 1234
//        O/P:4321
//
//        Example2)
//        I/P:1004
//        O/P:4001
import java.util.Scanner;

public class Day2_FlowControl_16 {
public static void main(String...args)
{
    Scanner se=new Scanner(System.in);
    int num=se.nextInt();

    while(num>0)
    {
        System.out.print(num%10);
        num/=10;
    }
}
}
