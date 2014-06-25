package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.image.ImageObserver;
import java.text.AttributedCharacterIterator;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 23/06/14
 * Time: 20:09
 * To change this template use File | Settings | File Templates.
 */
public class MyDrawPanel extends JPanel{



    @Override
    public void paintComponent(Graphics g){

       Graphics2D graph=(Graphics2D) g;

       int red=(int) (Math.random()*256);
       int green=(int) (Math.random()*256);
       int blue=(int) (Math.random()*256);

       Color startColor=new Color(red, green, blue);

        red=(int) (Math.random()*256);
        green=(int) (Math.random()*256);
        blue=(int) (Math.random()*256);
        Color endColor= new Color(red, green, blue);

        GradientPaint gradientPaint=new GradientPaint(70,70, startColor, 150,150, endColor);
        graph.setPaint(gradientPaint);
        graph.fillOval(70,70,100,100);


    }


}
