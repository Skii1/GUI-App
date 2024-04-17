import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        int age;
        String name;
        int question = 1;
        int gameReady = 1;
        Object[] gameOptions = { "Ready", "Not yet", "Maybe Later" }; // gameReady button options object

        name = JOptionPane.showInputDialog("Enter Your Name: ");
        age = Integer.parseInt(JOptionPane.showInputDialog("enter Your Age : "));
        JOptionPane.showMessageDialog(null, "Hello there " + name + ", you are " + age + " years old!");

        while (question != 0) {
            question = JOptionPane.showConfirmDialog(null, "Will UNIX Time ever end?", "True or False?",
                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

            if (question == 1) {
                JOptionPane.showMessageDialog(null, "UNIX time will end on January 19th, 2038", "Wrong Answer",
                        JOptionPane.WARNING_MESSAGE);
            }
        }
        JOptionPane.showMessageDialog(null,
                "That's Right! Unix time will end on January 19th, 2038. This is called the Y2k38 problem.");

        while (gameReady == 1) {
            //get user choice for game, repeat if user chooses wait option. Can be implemented as do while
            gameReady = JOptionPane.showOptionDialog(null, "Let's play a number guessing game. Are you ready?", "Game",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, gameOptions, gameOptions[0]);
            if (gameReady == 1) {
                JOptionPane.showMessageDialog(null, "OK. Waiting for you.");
            }
        }
        if (gameReady == 2) {
            JOptionPane.showMessageDialog(null, "Ok, see you later!");
            System.exit(0);
        }

        else if (gameReady == 0) {
            // Run number guessing method
            GuessNumber.main();
        } else {
            // Skeletion error handling 
            JOptionPane.showMessageDialog(null, "An unknown error occurred.", "Error", JOptionPane.WARNING_MESSAGE);
        }
    }
}
