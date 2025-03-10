package Hitung;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Hitungpackage extends JFrame {
    private JTextField alasField, tinggiField;
    private JLabel hasilLabel;
    private JButton hitungButton;
    
    public Hitungpackage() {
        setTitle("Hitung Sisi Miring Segitiga");
        setSize(350, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2));
        
        add(new JLabel("Alas:"));
        alasField = new JTextField();
        add(alasField);
        
        add(new JLabel("Tinggi:"));
        tinggiField = new JTextField();
        add(tinggiField);
        
        hitungButton = new JButton("Hitung");
        add(hitungButton);
        
        hasilLabel = new JLabel("Sisi miring: ");
        add(hasilLabel);
        
        hitungButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double alas = Double.parseDouble(alasField.getText());
                    double tinggi = Double.parseDouble(tinggiField.getText());
                    double miring = Math.sqrt(Math.pow(alas, 2) + Math.pow(tinggi, 2));
                    hasilLabel.setText("Sisi miring: " + String.format("%.2f", miring));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Masukkan angka yang valid!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        
        setVisible(true);
    }
}