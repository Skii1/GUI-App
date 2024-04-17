import javax.swing.JOptionPane;
import java.util.Random;
import java.util.random.*;

public class GuessNumber {
    public static void main() throws Exception {

        // random number generator
        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1;
        int guess = Integer.parseInt(JOptionPane.showInputDialog("Pick a number between 1 and 100."));

        while (guess != numberToGuess) {
            if (guess > numberToGuess) {
                guess = Integer.parseInt(JOptionPane.showInputDialog("Not Quite. The number is less than " + guess + ".\nGuess again"));
            } else if (guess < numberToGuess) {
                guess = Integer.parseInt(JOptionPane.showInputDialog("Not Quite. The number is greater than " + guess + ".\nGuess again"));
            } else {
                JOptionPane.showMessageDialog(null, "An unknown error occured.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

        Object[] options = { "Continue" };
        JOptionPane.showOptionDialog(null, "Congratulations! You guessed the right number, " + guess, "You Won!",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);

    }

}
