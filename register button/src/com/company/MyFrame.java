package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame {
    MyFrame() {
        //İşlemler

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GridLayout gridLayout = new GridLayout(1, 1);
        this.setLayout(gridLayout);

        //Tanımlamalar
        final int[] counter = {0};
        JLabel label1 = new JLabel("Please enter the password and register");
        JPanel panel = new JPanel();
        JButton button1 = new JButton("Register");
        final JPasswordField pfPassword = new JPasswordField(20);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String password = new String(pfPassword.getPassword());
                String truepassword = new String();
                truepassword = "umut";
                if (password.equals(truepassword)) {
                    label1.setText("Succesfully registered");
                } else if (password != truepassword && counter[0] > 8) {
                    label1.setText("You can't click anymore :)");
                    button1.setVisible(false);
                    pfPassword.setVisible(false);
                } else if (password != truepassword && counter[0] <= 8) {
                    label1.setText("Wrong password");
                }

                counter[0]++;
            }

        });

        //Eklemeler
        this.add(panel);
        panel.add(button1);
        panel.add(pfPassword);
        this.add(label1);
        this.setSize(500, 500);
        this.setVisible(true);

    }
}
