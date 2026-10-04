//Urbano, Chrisitan James E. 
//BSIT-NS/1st Year/1-1
import javax.swing.JOptionPane;

public class TestDo 
{
    public static void main(String[] args) 
    {
        int data;
        int sum = 0;

        do 
        {
            String dataString = JOptionPane.showInputDialog(null,
                "Enter an int value, \nthe program exits if the value is 0",
                "TestDo", JOptionPane.QUESTION_MESSAGE);
            data = Integer.parseInt(dataString);
            sum += data;
        } while (data != 0);

        JOptionPane.showMessageDialog(null, "The sum is " + sum,
            "TestDo", JOptionPane.INFORMATION_MESSAGE);
    }
}
