package com.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWin {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
//        frame.setBounds(0,0,400,300);
        frame.setSize(400,500);
        frame.setLocation(100,100);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JButton button = new JButton("ok");
//        匿名類別
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Hello world!!");
            }
        });
//        MyActionListener listener = new MyActionListener();
//        button.addActionListener(listener);
//        layput
        frame.setLayout(new FlowLayout());
        frame.add(new JButton("Hi"));
//        frame.add(new JButton("hi"));
        frame.add(button);
        frame.setVisible(true);
    }
}
