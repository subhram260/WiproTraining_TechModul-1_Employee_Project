//Write a program to receive a color code from the user (an Alphabhet).
//
//        The program should then print the color name, based on the color code given.
//
//        The following are the color codes and their corresponding color names.
//        R->Red, B->Blue, G->Green, O->Orange, Y->Yellow, W->White.
//
//        If color code provided by the user is not valid then print "Invalid Code".
import java.util.Scanner;

public class Day1Question11 {
public static void main(String...args)
{
    Scanner se=new Scanner(System.in);
    System.out.print("Enter the color code character : ");
    char ch=se.next().charAt(0);
    switch(ch){
        case 'R':
            System.out.println("The color code is Red");
            break;
        case 'B':
            System.out.println("The color code is Blue");
            break;
        case 'G':
            System.out.println("The color code is Green");
            break;
        case 'O':
            System.out.println("The color code is Orange");
            break;
        case 'Y':
            System.out.println("The color code is Yellow");
            break;
        case 'W':
            System.out.println("The color code is White");
            break;
        default:
            System.out.println("Invalid Code");
    }
}
}
