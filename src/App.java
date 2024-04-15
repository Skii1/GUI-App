import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        int age;
        String name;
        int ans = 1;

        name = JOptionPane.showInputDialog("Enter Your Name: ");
        age = Integer.parseInt(JOptionPane.showInputDialog("enter Your Age : "));
        JOptionPane.showMessageDialog(null, "Hello there " + name + ", you are " + age + " years old!");

        while(ans != 0){
            ans = JOptionPane.showConfirmDialog(null, "do you use arch?", "btw,", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

                if (ans == 1){
                    JOptionPane.showMessageDialog(null, "Why not, " + name + ". You should use Arch, y'know...", "What???", JOptionPane.WARNING_MESSAGE);
                }
            }
        JOptionPane.showMessageDialog(null, "Good... The only correct option!");
        
    }
}
