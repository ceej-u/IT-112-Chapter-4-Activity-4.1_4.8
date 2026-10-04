//Urbano, Chrisitan James E. 
//BSIT-NS/1st Year/1-1
public class DivideEvenly 
{
    public static void main(String[] args) 
    {
        final int NUMBER = 100;
        int val;

        System.out.print(NUMBER + " is evenly divisible by ");
        for (val = 1; val <= NUMBER; ++val) 
        {
            if (NUMBER % val == 0)
                System.out.print(val + "  ");
        }
        System.out.println();
    }
}
