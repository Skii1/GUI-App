import javax.swing.JOptionPane;
import javax.swing.JDesktopPane;

import java.util.Random;
import java.util.random.*;

public class GuessNumber {
    public static void main(String[] Args) throws Exception{

        int guess;
        Random random = new Random();

        int numberToGuess = random.nextInt(100) + 1;

        guess = Integer.parseInt(JOptionPane.showInputDialog("Pick a number between 1 and 100."));

        while(guess != numberToGuess){

            if(guess > numberToGuess){
            guess = Integer.parseInt(JOptionPane.showInputDialog("Not Quite. The number is less than " + guess));
            }
            else if(guess < numberToGuess){
                guess = Integer.parseInt(JOptionPane.showInputDialog("Not Quite. The number is greater than " + guess));
            }
            else{
                JOptionPane.showMessageDialog(null, "An unknown error occured.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

        JOptionPane.showMessageDialog(null, "Congratulations! You guess the right number, " + guess, "You Win!");



    }


}
