package GUI;

/**
 * Created by liliya on 01/07/14.
 */
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class InnerButton {

    JFrame frame;
    JButton button;

    public static void main(String [] args){
        InnerButton innerButton=new InnerButton();
        innerButton.go();

    }

    public void go(){

        frame=new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(200,100);

        button=new JButton("A");

        button.addActionListener(new BListener());

        frame.getContentPane().add(BorderLayout.SOUTH, button);

    }

    class BListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {

            if(button.getText().equals("A")){
                button.setText("B");
            }
            else{
                button.setText("A");
            }
        }
    }
}
