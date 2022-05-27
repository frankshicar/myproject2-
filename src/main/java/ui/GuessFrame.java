package ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.Scanner;

public class GuessFrame extends JFrame {
    public GuessFrame(){
        super();
        setSize(500,500);
        setLocation(100,500);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        JButton button = new JButton("猜");
        JLabel label = new JLabel("猜1到100之間的數字");
        JTextField number = new JTextField(8);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int guessnum = Integer.parseInt(number.getText());
                Random random = new Random();
                int ans = random.nextInt(100) + 1;
                if(ans == guessnum){
                    label.setText("Bingo!");
                }else if( guessnum < ans){
                    label.setText("Bigger, answer is " + guessnum + " to 100");
                }else{
                    label.setText("smaller, answer is 1 to " + guessnum);
                }
            }
        });
        setLayout(new FlowLayout());
        add(number);
        add(button);
        add(label);
        setVisible(true);
    }

    public static void main(String[] args) {
        GuessFrame guessFrame = new GuessFrame();
    }
}
