package ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuessFrame extends JFrame {
    public GuessFrame(){
        super();
        setSize(500,500);
        setLocation(100,500);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        JButton button = new JButton("Hi");
        JLabel label = new JLabel("zzz");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Hello!");
            }
        });
        setLayout(new FlowLayout());
        add(button);
        add(label);
        setVisible(true);
    }

    public static void main(String[] args) {
        GuessFrame guessFrame = new GuessFrame();
    }
}
