package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleGui3 {


    JFrame frame=new JFrame();
    JButton buttonSouth, buttonEast;

    public static void main(String [] args){
        SimpleGui3 newGUI= new SimpleGui3();
        newGUI.go();

    }

    public void go(){

        buttonSouth= new JButton("Repaint");
        buttonEast=new JButton("Change text");
        JLabel label=new JLabel("I am a label");
        MyDrawPanel panel=new MyDrawPanel();

        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(300,300);

        frame.getContentPane().add(BorderLayout.CENTER, panel);
        frame.getContentPane().add(BorderLayout.SOUTH, buttonSouth);
        frame.getContentPane().add(BorderLayout.EAST, buttonEast);
        frame.getContentPane().add(BorderLayout.WEST, label);
        buttonSouth.addActionListener(new ActionListenerRepaint());
        buttonEast.addActionListener(new ActionListenerText());


    }

    private class ActionListenerRepaint implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
                frame.repaint();

        }
    }

    private class ActionListenerText implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            buttonEast.setText("Ouch");

         }
    }

}

