package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame {
    MyFrame(){
        //işlemler
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GridLayout gridLayout = new GridLayout(1,1);
        this.setLayout(gridLayout);

        //tanımlamalar
        JPanel panel1 = new JPanel();
        JLabel label1 = new JLabel();
        JRadioButton radioButton1 = new JRadioButton("Apple");
        JRadioButton radioButton2 = new JRadioButton("Avocado");
        JRadioButton radioButton3 = new JRadioButton("Pineapple");
        JRadioButton radioButton4 = new JRadioButton("Mango");


        ButtonGroup group = new ButtonGroup();
        group.add(radioButton1);
        group.add(radioButton2);
        group.add(radioButton3);
        group.add(radioButton4);
        //eklemeler

        panel1.add(radioButton1);
        panel1.add(radioButton2);
        panel1.add(radioButton3);
        panel1.add(radioButton4);
        this.add(label1);
        this.add(panel1);

        //kapanış
        this.setSize(500, 500);
        this.setVisible(true);

    }
}
//        JComboBox comboBox1 = new JComboBox();
//        comboBox1.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                label1.setText("Selected item:"+ comboBox1.getSelectedItem());
//            }
//        });



//        comboBox1.addItem(" Potato");
//        comboBox1.addItem(" Tomato");
//        comboBox1.addItem(" Grape");
//        comboBox1.addItem(" Apple");
//        comboBox1.addItem(" Peach");
//        comboBox1.addItem(" Banana");
//        panel1.add(comboBox1);