package com.company;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GridLayout gridLayout = new GridLayout(1,1);
        this.setLayout(gridLayout);

        JLabel label1 = new JLabel("Hello World");

        this.add(label1);
        this.setSize(500, 500);
        this.setVisible(true);

    }
}
