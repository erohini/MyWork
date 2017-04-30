package cardgame;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Layout {
	JFrame frame=new JFrame();
	JPanel panel;
	JLabel[] label;
	
	public void Grid(){
		frame.setTitle("Card Game");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 450);
		
		panel = new JPanel();
		final JButton start = new JButton("<html><font color=\"red\">Start");
		final JButton relax = new JButton("<html><font color=\"red\">Relax");
		final JButton magic = new JButton("<html><font color=\"red\">Magic");
				
		panel.add(start);
		panel.add(relax);
		panel.add(magic);
	
		frame.add(panel, BorderLayout.SOUTH);
		
		relax.setEnabled(false);
		magic.setEnabled(false);
		
		start.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				start.setEnabled(false);
				relax.setEnabled(true);
				magic.setEnabled(false);
			
		panel = new JPanel( new GridLayout(4,4) );
        frame.add(panel, BorderLayout.CENTER);
				label=new JLabel[16];

        ImageIcon icon=new ImageIcon();
        
            label[0] = new JLabel(new ImageIcon(getClass().getResource("/images/blue.jpg")));
            panel.add(label[0]);
        
        	label[1] = new JLabel(new ImageIcon(getClass().getResource("/images/red.jpg")));
            panel.add(label[1]);
            
            label[2] = new JLabel(new ImageIcon(getClass().getResource("/images/blue.jpg")));
            panel.add(label[2]);
        
        	label[3] = new JLabel(new ImageIcon(getClass().getResource("/images/red.jpg")));
            panel.add(label[3]);
        
        	label[4] = new JLabel(new ImageIcon(getClass().getResource("/images/red.jpg")));
            panel.add(label[4]);
        
        	label[5] = new JLabel(new ImageIcon(getClass().getResource("/images/clubs_8.jpg")));
            panel.add(label[5]);
       
        	label[6] = new JLabel(new ImageIcon(getClass().getResource("/images/diamond_9.jpg")));
            panel.add(label[6]);
       
        	label[7] = new JLabel(new ImageIcon(getClass().getResource("/images/blue.jpg")));
            panel.add(label[7]);
            
            label[8] = new JLabel(new ImageIcon(getClass().getResource("/images/blue.jpg")));
            panel.add(label[8]);
  
        	label[9] = new JLabel(new ImageIcon(getClass().getResource("/images/heart_8.jpg")));
            panel.add(label[9]);
        
        	label[10] = new JLabel(new ImageIcon(getClass().getResource("/images/spade_9.jpg")));
            panel.add(label[10]);
      
        	label[11] = new JLabel(new ImageIcon(getClass().getResource("/images/red.jpg")));
            panel.add(label[11]);
      
        	label[12] = new JLabel(new ImageIcon(getClass().getResource("/images/red.jpg")));
            panel.add(label[12]);
        
        	label[13] = new JLabel(new ImageIcon(getClass().getResource("/images/blue.jpg")));
            panel.add(label[13]);
            
            label[14] = new JLabel(new ImageIcon(getClass().getResource("/images/red.jpg")));
            panel.add(label[14]);
        
        	label[15] = new JLabel(new ImageIcon(getClass().getResource("/images/blue.jpg")));
            panel.add(label[15]);
                             
            
            JScrollBar vbar=new JScrollBar(Scrollbar.VERTICAL,0,100,0,200);           
            frame.add(vbar,BorderLayout.EAST);
            
        frame.setVisible(true);
			}
		});
		
		
		
		relax.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				start.setEnabled(false);
				relax.setEnabled(false);
				magic.setEnabled(true);
				
				panel = new JPanel( new GridLayout(4, 4) );
		        frame.add(panel, BorderLayout.CENTER);

				label=new JLabel[16];
		        ImageIcon icon=new ImageIcon();
		            label[0] = new JLabel(new ImageIcon(getClass().getResource("/images/blue.jpg")));
		            panel.add(label[0]);
		        
		        	label[1] = new JLabel(new ImageIcon(getClass().getResource("/images/red.jpg")));
		            panel.add(label[1]);
		            
		            label[2] = new JLabel(new ImageIcon(getClass().getResource("/images/blue.jpg")));
		            panel.add(label[2]);
		        
		        	label[3] = new JLabel(new ImageIcon(getClass().getResource("/images/red.jpg")));
		            panel.add(label[3]);
		        
		        	label[4] = new JLabel(new ImageIcon(getClass().getResource("/images/red.jpg")));
		            panel.add(label[4]);
		        
		        	label[5] = new JLabel(new ImageIcon(getClass().getResource("/images/jack_diamonds.jpg")));
		            panel.add(label[5]);
		       
		        	label[6] = new JLabel(new ImageIcon(getClass().getResource("/images/queen_hearts.jpg")));
		            panel.add(label[6]);
		       
		        	label[7] = new JLabel(new ImageIcon(getClass().getResource("/images/blue.jpg")));
		            panel.add(label[7]);
		            
		            label[8] = new JLabel(new ImageIcon(getClass().getResource("/images/blue.jpg")));
		            panel.add(label[8]);
		  
		        	label[9] = new JLabel(new ImageIcon(getClass().getResource("/images/king_clubs.jpg")));
		            panel.add(label[9]);
		        
		        	label[10] = new JLabel(new ImageIcon(getClass().getResource("/images/ace_of_spades.jpg")));
		            panel.add(label[10]);
		      
		        	label[11] = new JLabel(new ImageIcon(getClass().getResource("/images/red.jpg")));
		            panel.add(label[11]);
		      
		        	label[12] = new JLabel(new ImageIcon(getClass().getResource("/images/red.jpg")));
		            panel.add(label[12]);
		        
		        	label[13] = new JLabel(new ImageIcon(getClass().getResource("/images/blue.jpg")));
		            panel.add(label[13]);
		            
		            label[14] = new JLabel(new ImageIcon(getClass().getResource("/images/red.jpg")));
		            panel.add(label[14]);
		        
		        	label[15] = new JLabel(new ImageIcon(getClass().getResource("/images/blue.jpg")));
		            panel.add(label[15]);
		            
		            JScrollBar vbar=new JScrollBar(Scrollbar.VERTICAL, 100,100,0,200);            
		            frame.add(vbar,BorderLayout.EAST);
		        
		        frame.setVisible(true);
				
			}
		});
		
		magic.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				start.setEnabled(false);
				relax.setEnabled(false);
				magic.setEnabled(false);

				
				panel = new JPanel( new GridLayout(4, 4) );
		        frame.add(panel, BorderLayout.CENTER);

				label=new JLabel[16];
		        ImageIcon icon=new ImageIcon();
		            label[0] = new JLabel(new ImageIcon(getClass().getResource("/images/blue.jpg")));
		            panel.add(label[0]);
		        
		        	label[1] = new JLabel(new ImageIcon(getClass().getResource("/images/red.jpg")));
		            panel.add(label[1]);
		            
		            label[2] = new JLabel(new ImageIcon(getClass().getResource("/images/blue.jpg")));
		            panel.add(label[2]);
		        
		        	label[3] = new JLabel(new ImageIcon(getClass().getResource("/images/red.jpg")));
		            panel.add(label[3]);
		        
		        	label[4] = new JLabel(new ImageIcon(getClass().getResource("/images/red.jpg")));
		            panel.add(label[4]);
		        
		        	label[5] = new JLabel(new ImageIcon(getClass().getResource("/images/8 of Spades.png")));
		            panel.add(label[5]);
		       
		        	label[6] = new JLabel(new ImageIcon(getClass().getResource("/images/9 of Clubs.png")));
		            panel.add(label[6]);
		       
		        	label[7] = new JLabel(new ImageIcon(getClass().getResource("/images/blue.jpg")));
		            panel.add(label[7]);
		            
		            label[8] = new JLabel(new ImageIcon(getClass().getResource("/images/blue.jpg")));
		            panel.add(label[8]);
		  
		        	label[9] = new JLabel(new ImageIcon(getClass().getResource("/images/9 of Hearts.png")));
		            panel.add(label[9]);
		            
		        	label[10] = new JLabel(new ImageIcon(getClass().getResource("/images/red.jpg")));
		            panel.add(label[10]);
		      
		        	label[11] = new JLabel(new ImageIcon(getClass().getResource("/images/red.jpg")));
		            panel.add(label[11]);
		      
		        	label[12] = new JLabel(new ImageIcon(getClass().getResource("/images/red.jpg")));
		            panel.add(label[12]);
		        
		        	label[13] = new JLabel(new ImageIcon(getClass().getResource("/images/blue.jpg")));
		            panel.add(label[13]);
		            
		            label[14] = new JLabel(new ImageIcon(getClass().getResource("/images/red.jpg")));
		            panel.add(label[14]);
		        
		        	label[15] = new JLabel(new ImageIcon(getClass().getResource("/images/blue.jpg")));
		            panel.add(label[15]);
		            
		            JScrollBar vbar=new JScrollBar(Scrollbar.VERTICAL, 100,100,0,200);            
		            frame.add(vbar,BorderLayout.EAST);
		        
		        frame.setVisible(true);
			}
		});
		
		frame.setVisible(true);
		
	}
	
	
}
