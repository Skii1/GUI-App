import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import java.util.concurrent.TimeUnit;
public class App {
    public static void main(String[] args) throws Exception {
        int age;
        String name;
        int archAns = 1;
        int gameReady = 2;
        int closeTimer = 1;
        Object[] options = {"Ready", "Not yet", "Maybe Later"};

        name = JOptionPane.showInputDialog("Enter Your Name: ");
        age = Integer.parseInt(JOptionPane.showInputDialog("enter Your Age : "));
        JOptionPane.showMessageDialog(null, "Hello there " + name + ", you are " + age + " years old!");

        while(archAns != 0){
            archAns = JOptionPane.showConfirmDialog(null, "do you use arch?", "btw,", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

                if (archAns == 1){
                    JOptionPane.showMessageDialog(null, "Why not, " + name + ". You should use Arch, y'know...", "What???", JOptionPane.WARNING_MESSAGE);
                }
            }
        JOptionPane.showMessageDialog(null, "Good... The only correct option!");

        while(gameReady == 1){
            JOptionPane.showOptionDialog(null, "Let's play a number guessing game. Are you ready?", "Game", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);
            if(gameReady == 1){
                JOptionPane.showMessageDialog(null, "OK. Waiting for you.");
            }
        }
        if(gameReady == 2){
            JOptionPane.showMessageDialog(null, "Ok, see you later! App closing in : " + closeTimer);
            TimeUnit.SECONDS.sleep(2);
            System.exit(0);
        }

        if(gameReady ==  0){
            GuessingGame.main();
        }
    }
}
