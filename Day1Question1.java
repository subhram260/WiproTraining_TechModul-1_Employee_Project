public class Day1Question1 {
    public static void main(String[] args)
    {
        try {
            System.out.println(args[0] + " Technologies " + args[1]);
        }
        catch(Exception e)
        {
            System.out.println("It is mandatory to pass two arguments in command line");
        }
    }
}
