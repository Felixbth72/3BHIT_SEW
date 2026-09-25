package fbatoha.view;

import javax.swing.*;

public class GrafikFrame extends JFrame {
    private GrafikPanel gpanel =  new GrafikPanel();

    public GrafikFrame() {
        this.setTitle("Zahlen-Gewinnspiel");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600,300);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.add(gpanel);
    }

    public GrafikPanel getGrafikPanel() {
        return gpanel;
    }
}
