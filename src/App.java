import javax.swing.JOptionPane;
public class App {
    public static void main(String[] args) throws Exception {
        int age;
        String name;
        int question = 1; //answer to question for 1 as true and 0 as false, acts as boolean
        int gameReady = 1; //result from buttons to get ready state for number guessing game

        //name and age prompt
        name = JOptionPane.showInputDialog("Enter Your Name: ");
        age = Integer.parseInt(JOptionPane.showInputDialog("enter Your Age : "));
        JOptionPane.showMessageDialog(null, "Hello there " + name + ", you are " + age + " years old!");

        //true or false question
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

        //defining button options for gameReady
        Object[] gameOptions = { "Ready", "Not yet", "Maybe Later" }; // gameReady button options object

        while (gameReady == 1) {
            // get user choice for game, repeat if user chooses wait option. Can be implemented as do while
            gameReady = JOptionPane.showOptionDialog(null, "Let's play a number guessing game. Are you ready?", "Game",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, gameOptions, gameOptions[0]);
            if (gameReady == 1) {
                JOptionPane.showMessageDialog(null, "OK. Waiting for you.");
            }
        }
        //close app
        if (gameReady == 2) {
            JOptionPane.showMessageDialog(null, "Ok, see you later!");
            System.exit(0);
        }
        //run number guessing class
        else if (gameReady == 0) {
            // Run number guessing method
            GuessNumber.main();
        } else {
            // Skeletion error handling
            JOptionPane.showMessageDialog(null, "An unknown error occurred.", "Error", JOptionPane.WARNING_MESSAGE);
        }
    }
}
