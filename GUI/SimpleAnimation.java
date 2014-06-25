package GUI;

import javax.swing.*;
import java.awt.*;

public class SimpleAnimation {

    int x=70;   //x coordinate
    int y=70;  //y coordinate

    MyPanel newPanel = new MyPanel();
    JFrame frame=new JFrame();


    public static void main(String [] args){

        SimpleAnimation newAnime=new SimpleAnimation();
        newAnime.go();
    }

    void go() {

        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(300, 300);

        frame.getContentPane().add(newPanel);


        for(int i=0; i<130; i++){
            x++;
            y++;

            newPanel.repaint();
            try{
            Thread.sleep(50);
            } catch(InterruptedException ex){
                //nothing to do, just sleep less
            }
        }
    }

    class MyPanel extends JPanel {

        @Override
        public void paintComponent(Graphics g) {

            Graphics2D g2d = (Graphics2D) g;
            g.setColor(Color.white);    //repaint the item in the current position back to white
            g.fillOval(0, 0, this.getWidth(), this.getHeight());
            g.setColor(Color.green);
            g.fillOval(x, y, 40, 40);
        }

    }
}
