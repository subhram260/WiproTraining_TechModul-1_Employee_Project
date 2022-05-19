//Initialize a character variable in a program and
//
//        print 'Alphabhet' if the initialized value is an alphabhet,
//
//        print 'Digit' if the initialized value is a number, and
//
//        print 'Special Character', if the initialized value is anything else.

import java.util.Scanner;
public class Day1Question8 {
    public static void main(String...args)
    {
        Scanner se=new Scanner(System.in);
        System.out.print("Enter any character to check the type : ");
        char ch=se.next().charAt(0);
        if(Character.isAlphabetic(ch))
        {
            System.out.println("The character "+ch+" is an alphabhat");
        }
        else if(Character.isDigit(ch))
        {
            System.out.println("The character "+ch+" is a Digit");
        }
        else {
            System.out.println("The character is a Special Character.");
        }
    }
}
