//Write a program to print prime numbers between 10 and 99.

import java.lang.Math;

public class Day2_Flowcontrol_13 {
    public static void main(String...args)
    {
        int start=10;
        int end=99;
    for(int i=start;i<=end;i++)
    {
        if(isprime(i))
        {
            System.out.print(i+",");
        }
    }
    }

    private static boolean isprime(int i) {
        for(int j=2;j<=Math.round(Math.sqrt(i));j++)
        {
            if(i%j==0)
            {
                return false;
            }
        }
        return true;
    }
}
