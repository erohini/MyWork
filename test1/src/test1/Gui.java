package test1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Gui extends JFrame
{
    JFrame frame = new JFrame();
    JButton button[] = new JButton[16];

    public Gui()
    {
        frame.setSize(300,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel( new GridLayout(4, 4) );
        frame.add(panel, BorderLayout.CENTER);

        //JLabel txt = new JLabel("Will you dare?", JLabel.CENTER);
//        txt.setLayout(new GridLayout(1, 1));
        //txt.setHorizontalTextPosition(JLabel.CENTER);
        //txt.setFont(new Font("Serif", Font.PLAIN, 21));
//        window.add(txt);
       // window.add(txt, BorderLayout.NORTH);

        ImageIcon icon;
        for(int i = 0; i < 16; i++)
        {
            button[i] = new JButton(new ImageIcon(getClass().getResource("/images/ganesha.jpg")));
            panel.add(button[i]);
        }

        frame.setVisible(true);

    }

    public static void main(String args[]) throws Exception
    {
        new Gui();
    }

}