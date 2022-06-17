package com.ui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class GuessNumberTest {
    public GuessNumberTest(){
        JFrame frame = new JFrame();
        frame.setBounds(0,0,400,500);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JLabel label = new JLabel("輸入1到100的數字");
        label.setBounds(50,60,150,20);
        JTextField answer = new JTextField(8);
        answer.setBounds(200,60,150,20);
        JButton guess = new JButton("猜");
        guess.setBounds(80,100,80,20);
        JButton chick = new JButton("確定");
        chick.setBounds(200,100,80,20);
        JButton button =new JButton("Hi");
        button.setBounds(300,150,8,8);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int guessnum = Integer.parseInt(answer.getText());
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
        frame.add(label);
        frame.add(answer);
        frame.add(guess);
        frame.add(chick);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {

        GuessNumberTest guessNumberTest = new GuessNumberTest();
    }


}
