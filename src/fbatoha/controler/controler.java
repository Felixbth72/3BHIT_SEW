package fbatoha.controler;

import fbatoha.model.GewinnModel;
import fbatoha.view.GrafikFrame;

import java.awt.event.*;

public class controler implements ActionListener {
    private GrafikFrame frame;
    private GewinnModel gmodel = new GewinnModel();

    public controler() {
        this.frame = new GrafikFrame();
        this.frame.getGrafikPanel().getTxtF(0).setActionCommand("TxtF");
        this.frame.getGrafikPanel().getTxtF(0).addActionListener(this);
        this.frame.getGrafikPanel().getBtn().setActionCommand("eversuch");
        this.frame.getGrafikPanel().getBtn().addActionListener(this);
    }

    public static void main(String[] args) {
        new controler();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("TxtF")) {
            int eingabe = Integer.parseInt(this.frame.getGrafikPanel().getTF(0).trim());
            this.gmodel.berechneRunde(eingabe);
            this.frame.getGrafikPanel().setTF(1, "" + this.gmodel.getComputerZahl());
            this.frame.getGrafikPanel().setRundenergebniss("" + this.gmodel.getRundenErgebnis());
            this.frame.getGrafikPanel().setGesamtpunkte("" + this.gmodel.getGesamtPunkte());
            this.frame.getGrafikPanel().getTxtF(0).setEditable(false);
            this.frame.getGrafikPanel().getBtn().setEnabled(true);

            if (this.gmodel.hatVerloren()) {
                this.frame.getGrafikPanel().setRundenergebniss("Verloren!");
            } else if (this.gmodel.hatGewonnen()) {
                this.frame.getGrafikPanel().setRundenergebniss("Gewonnen!");
            }
        } else if (e.getActionCommand().equals("eversuch")) {
            if (this.gmodel.hatVerloren() || this.gmodel.hatGewonnen()) {
                this.gmodel = new GewinnModel();
                this.frame.getGrafikPanel().setGesamtpunkte("" + this.gmodel.getGesamtPunkte());
            }
            for (int i = 0; i < 2; i++) {
                this.frame.getGrafikPanel().setTF(i, "");
            }
            this.frame.getGrafikPanel().setRundenergebniss("Tippe eine Zahl von 1 bis 9");
            this.frame.getGrafikPanel().getTxtF(0).setEditable(true);
            this.frame.getGrafikPanel().getBtn().setEnabled(false);
        }
    }
}