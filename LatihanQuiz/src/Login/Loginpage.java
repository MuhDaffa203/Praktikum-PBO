package Login;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Hitung.Hitungpackage;

public class Loginpage extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private final String USERNAME = "admin";
    private final String PASSWORD = "admin123";

    public Loginpage() {
        setTitle("Login");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 2));
        
        add(new JLabel("Username:"));
        usernameField = new JTextField();
        add(usernameField);
        
        add(new JLabel("Password:"));
        passwordField = new JPasswordField();
        add(passwordField);
        
        loginButton = new JButton("Masuk");
        add(loginButton);
        
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());
                
                if (username.equals(USERNAME) && password.equals(PASSWORD)) {
                    dispose(); // Tutup window login
                    new Hitungpackage();
                } else {
                    JOptionPane.showMessageDialog(null, "Username atau Password salah!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        
        setVisible(true);
    }
}