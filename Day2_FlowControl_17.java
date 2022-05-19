//Write a Java program to find if the given number is palindrome or not
//
//        Example1)
//        C:\>java Sample 110011
//        O/P: 110011 is a palindrome
//
//        Example2)
//        C:\>java Sample 1234
//        O/P: 1234 is not a palindrome

public class Day2_FlowControl_17 {
public static void main(String...args)
{
    int i=0,mid=args[0].length()/2;
    boolean pelindrome=true;
    while(i<=mid){
        if(args[0].charAt(i)!=args[0].charAt(args[0].length()-i-1))
        {
            pelindrome=false;
            break;
        }
        i++;
    }
    if(pelindrome)
    {
        System.out.println(args[0]+" is a pelindrome");
    }
    else {
        System.out.println(args[0]+" is not a pelindrome");
    }
}
}
