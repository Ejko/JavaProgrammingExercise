package GUI;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class TextArea1 implements ActionListener {

    JTextArea textArea;
    JCheckBox checkBox;
    JList<String> list;

    public static void main(String [] args){

        TextArea1 text=new TextArea1();
        text.go();
    }

    public void go(){

        JFrame frame=new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel panel=new JPanel();
        JButton button=new JButton("Just click it");
        button.addActionListener(this);

        checkBox= new JCheckBox("Goes to 11");
        checkBox.addItemListener(new CheckBoxListener());

        textArea=new JTextArea(10,20);
        textArea.setLineWrap(true);

        JScrollPane scroller=new JScrollPane(textArea);
        scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);

        String [] listEntries={"alpha", "beta", "gamma", "delta", "epsilon", "zeta", "eta", "theta"};
        list=new JList<String>(listEntries);
        list.addListSelectionListener(new ListListener());
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        list.setVisibleRowCount(4);

        JScrollPane scroller2=new JScrollPane(list);
        scroller2.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
        scroller2.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        panel.add(scroller);
        panel.add(checkBox);
        panel.add(scroller2);

        frame.getContentPane().add(BorderLayout.CENTER, panel);
        frame.getContentPane().add(BorderLayout.SOUTH, button);


        frame.setSize(300,350);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        textArea.append("Button clicked");
    }

    class CheckBoxListener implements ItemListener{

        @Override
        public void itemStateChanged(ItemEvent e) {
            String onOff="off";
            if(checkBox.isSelected()){
                onOff="on";
            }
            textArea.append("Checkbox is "+ onOff);
        }
    }

    class ListListener implements javax.swing.event.ListSelectionListener{

        @Override
        public void valueChanged(ListSelectionEvent e) {
            if(!e.getValueIsAdjusting()){
                String selection= (String) list.getSelectedValue();
                System.out.println(selection);
            }
        }
    }
}
