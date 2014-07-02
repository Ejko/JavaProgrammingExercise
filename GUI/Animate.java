package GUI;

import javax.swing.*;
import java.awt.*;

public class Animate {

    int x=1;
    int y=1;

    public static void main(String [] args){
        Animate ani=new Animate();
        ani.go();

    }

    public void go(){

        JFrame frame=new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        MyDrawP drawP=new MyDrawP();
        frame.setVisible(true);
        frame.setSize(500, 270);
        frame.getContentPane().add(drawP);
            for (int i = 0; i < 124; i++) {
                drawP.repaint();
                y++;
                x++;

                try {
                    Thread.sleep(50);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
    }

    class MyDrawP extends JPanel{

        public void paintComponent(Graphics g){
            g.setColor(Color.white);
            g.fillRect(0,0, 500,250);
            g.setColor(Color.blue);
            g.fillRect(x,y,500-x*2, 250-y*2);

        }
    }

}
