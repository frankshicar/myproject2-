package ui;

import javax.swing.*;
import java.awt.*;

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
