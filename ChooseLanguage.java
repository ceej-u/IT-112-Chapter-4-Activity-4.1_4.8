//Urbano, Chrisitan James E. 
//BSIT-NS/1st Year/1-1
import javax.swing.JOptionPane;

public class ChooseLanguage 
{
    public static void main(String[] args) 
    {
        String optionString, chosenLang;
        int optionType;

        optionString = JOptionPane.showInputDialog(null,
            "Which programming language do you prefer? Enter 1 for Java or 2 for C++",
            "Example While Loop", JOptionPane.QUESTION_MESSAGE);
        optionType = Integer.parseInt(optionString);

        while (optionType != 1 && optionType != 2) 
        {
            optionString = JOptionPane.showInputDialog(null,
                "Invalid entry. You must choose 1 or 2.\nEnter 1 for Java or 2 for C++",
                "Example While Loop", JOptionPane.QUESTION_MESSAGE);
            optionType = Integer.parseInt(optionString);
        }

        if (optionType == 1)
            chosenLang = "Java";
        else
            chosenLang = "C++";

        JOptionPane.showMessageDialog(null,
            "Programming language chosen is " + chosenLang,
            "Example While Loop", JOptionPane.INFORMATION_MESSAGE);
    }
}
