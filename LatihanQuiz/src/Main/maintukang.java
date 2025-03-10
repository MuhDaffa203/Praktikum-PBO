package Main;

import Login.Loginpage;
import javax.swing.SwingUtilities;

public class maintukang {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Loginpage());
    }
}