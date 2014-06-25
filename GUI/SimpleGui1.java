package GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;

public class SimpleGui1 implements ActionListener {

    JButton button;

    public static void main(String [] args){

        SimpleGui1 newHUI=new SimpleGui1();
        newHUI.go();

    }

    public void go(){

        //set frame
        JFrame frame=new JFrame();

        //set button
       button=new JButton("Click me");

        //adds the button to the pane, not the frame
        frame.getContentPane().add(button);

        button.addActionListener(this);

        //to ensure the close button exits the window
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //set size of frame
        frame.setSize(300,300);

        //make frame visible
        frame.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        button.setText("I have been clicked");
    }
}
