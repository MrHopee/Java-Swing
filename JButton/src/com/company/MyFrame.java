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
        JLabel label1 = new JLabel();
        JPanel panel = new JPanel();
        JButton button1 = new JButton("Click me");
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (counter[0] <= 10) {
                    button1.setText("MOREEEEEEEEEEEEEEEEEEEEEEE"+ counter[0]);
                } else if (counter[0] > 10) {
                    button1.setText("Enough for today :P");
                }
                counter[0]++;
            }
        });

        //Eklemeler
        this.add(panel);
        panel.add(button1);
        this.add(label1);
        this.setSize(500, 500);
        this.setVisible(true);

    }
}
