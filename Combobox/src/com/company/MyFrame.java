package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLOutput;

public class MyFrame extends JFrame {
    MyFrame(){
        //işlemler
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GridLayout gridLayout = new GridLayout(1,1);
        this.setLayout(gridLayout);

        //tanımlamalar
        JPanel panel1 = new JPanel();
        JLabel label1 = new JLabel();
        JComboBox comboBox1 = new JComboBox();
        comboBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label1.setText("Selected item:"+ comboBox1.getSelectedItem());
            }
        });


        //eklemeler
        comboBox1.addItem(" Potato");
        comboBox1.addItem(" Tomato");
        comboBox1.addItem(" Grape");
        comboBox1.addItem(" Apple");
        comboBox1.addItem(" Peach");
        comboBox1.addItem(" Banana");
        this.add(label1);
        this.add(panel1);
        panel1.add(comboBox1);

        //kapanış
        this.setSize(500, 500);
        this.setVisible(true);

    }
}
