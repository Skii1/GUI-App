import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        String name = JOptionPane.showInputDialog("Enter Your Name: ");
        int age = Integer.parseInt(JOptionPane.showInputDialog("enter Your Age : "));
        JOptionPane.showMessageDialog(null, "Hello there " + name + ", you are " + age + " years old!");
    }
}
