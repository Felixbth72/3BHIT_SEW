package fbatoha.view;

import javax.swing.*;
import java.awt.*;

public class GrafikPanel extends JPanel {

    private JLabel rergebniss = new JLabel("Tippe eine Zahl von 1 bis 9");
    private JLabel gergebniss = new JLabel("Gesamtpunkte: 30");
    private JTextField[] tf = new JTextField[2];
    private JButton btn;

    public GrafikPanel() {
        this.setLayout(new BorderLayout());

        JPanel hpanel = new JPanel(new GridLayout(3, 2, 4, 4));
        hpanel.add(new JLabel("Rundenergebnis:", JLabel.CENTER));
        hpanel.add(new JLabel("Gesamtpunkte:", JLabel.CENTER));
        hpanel.add(rergebniss);
        hpanel.add(gergebniss);
        hpanel.add(new JLabel("Deine Zahl:", JLabel.CENTER));
        hpanel.add(new JLabel("Computer:", JLabel.CENTER));

        rergebniss.setHorizontalAlignment(JLabel.CENTER);
        rergebniss.setOpaque(true);
        rergebniss.setBackground(Color.WHITE);
        rergebniss.setFont(new Font("SansSerif", Font.BOLD, 20));

        gergebniss.setHorizontalAlignment(JLabel.CENTER);
        gergebniss.setOpaque(true);
        gergebniss.setBackground(Color.WHITE);
        gergebniss.setFont(new Font("SansSerif", Font.BOLD, 20));

        JPanel cpanel = new JPanel(new GridLayout(1, 2));
        for (int i = 0; i < 2; i++) {
            tf[i] = new JTextField();
            tf[i].setHorizontalAlignment(JTextField.CENTER);
            tf[i].setFont(new Font("SansSerif", Font.BOLD, 30));
            tf[i].setPreferredSize(new Dimension(100, 40));
            cpanel.add(tf[i]);
        }
        tf[1].setEditable(false);

        JPanel fpanel = new JPanel();
        this.btn = new JButton("Noch einmal!");
        this.btn.setEnabled(false);
        fpanel.add(this.btn);

        this.add(hpanel, BorderLayout.NORTH);
        this.add(cpanel, BorderLayout.CENTER);
        this.add(fpanel, BorderLayout.SOUTH);
    }

    public String getRundenergebniss() {
        return rergebniss.getText();
    }

    public void setRundenergebniss(String rundenergebniss) {
        rergebniss.setText(rundenergebniss);
    }

    public String getGesamtpunkte() {
        return gergebniss.getText();
    }

    public void setGesamtpunkte(String gesamtpunkte) {
        gergebniss.setText(gesamtpunkte);
    }

    public JButton getBtn() {
        return btn;
    }

    public String getTF(int i){
        return tf[i].getText();
    }

    public void setTF(int i, String t){
        tf[i].setText(t);
    }

    public JTextField getTxtF(int i) {
        return tf[i];
    }

    public void setFarbe(Color farbe) {
        rergebniss.setBackground(farbe);
        gergebniss.setBackground(farbe);
    }
}