package GUI;

import javax.sound.midi.*;
import javax.swing.*;
import java.awt.*;


public class MiniMiniMusicPlayer{

    static JFrame f=new JFrame("My first music video");
    static MyDrawPanel mdp;

    public static void main(String [] args){

        MiniMiniMusicPlayer player=new MiniMiniMusicPlayer();
        player.go();


    }

    public void setUpGUI(){

        mdp=new MyDrawPanel();
        f.setContentPane(mdp);
        f.setBounds(30,30,300, 300);
        f.setVisible(true);
    }

    public void go() {
        setUpGUI();

        try {
            Sequencer play = MidiSystem.getSequencer();
            play.open();
            play.addControllerEventListener(mdp, new int[]{127});

            Sequence seq = new Sequence(Sequence.PPQ, 4);
            Track track = seq.createTrack();

            int r = 0;
            for (int i = 0; i < 60; i += 4) {

                r = (int) (Math.random() * 50 + 1);
                track.add(makeEvent(144, 1, r, 100, i));
                track.add(makeEvent(176, 1, 127, 0, i));
                track.add(makeEvent(128, 1, r, 100, i + 2));
            }

            play.setSequence(seq);
            play.start();
            play.setTempoInBPM(120);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    public static MidiEvent makeEvent(int cmd, int ch, int one, int two, int tick) {
        MidiEvent event = null;
        try {
            ShortMessage msg = new ShortMessage();
            msg.setMessage(cmd, ch, one, two);
            event = new MidiEvent(msg, tick);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return event;
    }

    class MyDrawPanel extends JPanel implements ControllerEventListener{

        boolean msg=false;

        @Override
        public void controlChange(ShortMessage event) {

            msg=true;
            repaint();
        }

        public void paintComponent(Graphics g){

            if(msg){

                Graphics2D g2= (Graphics2D) g;


                int r=(int) (Math.random()*250);
                int gr=(int) (Math.random()*250);
                int b=(int) (Math.random()*250);

                g.setColor(new Color(r,gr,b));

                int ht=(int) (Math.random()*120+10);
                int wt=(int) (Math.random()*120+10);

                int x=(int) (Math.random()*40+10);
                int y=(int) (Math.random()*40+10);

                g.fillRect(x, y, ht, wt);
                msg=false;
                }
            }
        }
    }



