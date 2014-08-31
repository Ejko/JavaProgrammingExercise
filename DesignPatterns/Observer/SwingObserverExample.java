package DesignPatterns.Observer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

/**
 * Created by liliya on 25/08/2014.
 */
public class SwingObserverExample {

    JFrame frame;

    public static void main(String [] args){
        SwingObserverExample soe = new SwingObserverExample();
        soe.go();
    }

    public void go(){

        frame = new JFrame();

        JButton button = new JButton("Should I do it?");
        button.addActionListener(new AngelListener());
        button.addActionListener(new DevilListener());
        frame.getContentPane().add(BorderLayout.CENTER, button);
    }

    class AngelListener implements ActionListener{


        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Don't do it, you will regret it!");
        }

    }

    class DevilListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Come on, do it!");

        }
    }
}