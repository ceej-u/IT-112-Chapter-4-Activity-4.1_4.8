//Urbano, Chrisitan James E. 
//BSIT-NS/1st Year/1-1
public class TestContinue 
{
    public static void main(String[] args) 
    {
        int sum = 0, number = 0;

        while (number < 20) 
        {
            number++;
            if (number == 10 || number == 11)
                continue;
            sum += number;
        }

        System.out.println("The sum is " + sum);
    }
}
