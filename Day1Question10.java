//Initialize a character variable with an alphabhet in a program.
//
//        If the character value is in lowercase, the output should be displayed in uppercase in the following format.
//
//        Example1)
//        i/p:a
//        o/p:a->A
//
//        If the character value is in uppercase, the output should be displayed in lowercase in the following format.
//
//        Example2)
//        i/p:A
//        o/p:A->a
import java.util.Scanner;

public class Day1Question10 {
    public static void main(String...args){
        Scanner se=new Scanner(System.in);
    System.out.print("Enter a character : ");
    char ch=se.next().charAt(0);
    if(Character.isUpperCase(ch))
    {
        System.out.println(Character.toLowerCase(ch));
    }
    else
    {
        System.out.println(Character.toUpperCase(ch));
    }
    }
}
