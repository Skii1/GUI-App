import javax.swing.JOptionPane;
import java.util.Random;
public class GuessNumber {
    public static void main() throws Exception { // Number guessing game method, used in App.java.
        
        // Random number generator
        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1;
        int guess = Integer.parseInt(JOptionPane.showInputDialog("Guess a number between 1 and 100."));

        //loop until number is guessed
        while (guess != numberToGuess) {
            if (guess > numberToGuess) {
                guess = Integer.parseInt(JOptionPane.showInputDialog("Not Quite. The number is less than " + guess + ".\nGuess again"));
            } else if (guess < numberToGuess) {
                guess = Integer.parseInt(JOptionPane.showInputDialog("Not Quite. The number is greater than " + guess + ".\nGuess again"));
            //skeleton error handling
            } else {
                JOptionPane.showMessageDialog(null, "An unknown error occured.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

        //success message
        Object[] options = { "Continue" };
        JOptionPane.showOptionDialog(null, "Congratulations! You guessed the right number, " + guess, "You Won!",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);

    }


}
