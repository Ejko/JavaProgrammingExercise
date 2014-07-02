package GUI;

import javax.swing.*;
import java.awt.*;

public class Panel1 {

    public static void main(String [] args){
        Panel1 p1=new Panel1();
        p1.go();

    }

    public void go(){

        JFrame frame=new JFrame();
        JPanel panel=new JPanel();
        JButton button1=new JButton("shock me");
        JButton button2=new JButton("bliss");
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        panel.setBackground(Color.green);
        frame.getContentPane().add(BorderLayout.EAST, panel);
        panel.add(button1);
        panel.add(button2);
        frame.setSize(200,200);
        frame.setVisible(true);

    }


}
