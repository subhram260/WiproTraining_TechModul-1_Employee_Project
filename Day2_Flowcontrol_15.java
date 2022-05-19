//Write a program to print * in Floyds format (using for and while loop)
//        *
//        *  *
//        *  *   *
//
//        Example1)
//        C:\>java Sample
//        O/P: Please enter an integer number
//
//        Example2)
//        C:\>java Sample 3
//        O/P :
//        *
//        *  *
//        *  *  *

public class Day2_Flowcontrol_15 {
    public static void main(String...args)
    {
        if(args.length==0)
        {
            System.out.println("Please enter an integer number");
        }
        else
        {
            for(int row=1;row<=Integer.parseInt(args[0]);row++)
            {
                for(int column=1;column<=row;column++)
                {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}
