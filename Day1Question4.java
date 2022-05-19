//
//A) Write a program to check if a given integer number is Positive, Negative, or Zero.
//
//        B) Given two non-negative int values, print true if they have the same last digit, such as with 27 and 57.
//
//        lastDigit(7, 17) → true
//        lastDigit(6, 17) → false
//        lastDigit(3, 113) → true
import java.util.Scanner;
class LastD{
    public Boolean lastDigit(int a, int b){
    if(a%10==b%10)
    {
        return true;
    }
    else {
        return false;
    }
    }
}
public class Day1Question4 {

    public static void main(String[] args)
    {
        Scanner se = new Scanner(System.in);
        LastD obj1=new LastD();
        System.out.print("Enter value of first element : ");
        int a=se.nextInt();
        System.out.print("Enter value of second element : ");
        int b=se.nextInt();
        if(obj1.lastDigit(a,b)){
            System.out.println("true");
        }
        else
        {
            System.out.println("false");}
        }

    }
