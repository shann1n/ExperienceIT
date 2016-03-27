import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.plaf.ColorUIResource;
import java.applet.Applet;
import java.applet.AudioClip;
import java.net.URL;
import javax.swing.*;
import javax.sound.sampled.*;
import javax.sound.sampled.Clip;
import javax.sound.sampled.AudioSystem;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class DotCom extends JFrame   {
	
	private int missclicks = 0;
	private int hitclicks = 0;
	int check=0;
	AudioClip click;

	
	JTextField hits, miss, sum;
	JLabel tcli, tmiss, thits;

	public DotCom() {
		
		super("DOTCOM GAME");
		setSize(400, 310);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setBackground(Color.RED);
		setLookAndFeel();
		JPanel pane = new JPanel();
		pane.setBackground(Color.BLACK);
		GridLayout family = new GridLayout(7, 7, 5, 5);
		pane.setLayout(family);
		
	
		
		tcli = new JLabel("Clicks:");
		sum = new JTextField("0", 2);
		thits = new JLabel("Hits:");
		hits = new JTextField("0", 2);
		tmiss = new JLabel("Misses:");
		miss = new JTextField("0", 2);
		
		miss.setEditable(false);
		hits.setEditable(false);
		sum.setEditable(false);
		
		
		FlowLayout flow = new FlowLayout(FlowLayout.CENTER);
		setLayout(flow);
		
		
		add(thits);
		add(hits);
		add(tmiss);
		add(miss);
		add(tcli);
		add(sum);
		
		setVisible(true);
	
		JButton A1 = new JButton ("A1");
		JButton A2 = new JButton ("A2");
		JButton A3 = new JButton ("A3");
		final JButton A4 = new JButton ("A4");
		final JButton A5 = new JButton ("A5");
		final JButton A6 = new JButton ("A6");
		JButton A7 = new JButton ("A7");
		JButton B1 = new JButton ("B1");
		JButton B2 = new JButton ("B2");
		JButton B3 = new JButton ("B3");
		JButton B4 = new JButton ("B4");
		JButton B5 = new JButton ("B5");
		JButton B6 = new JButton ("B6");
		JButton B7 = new JButton ("B7");
		JButton C1 = new JButton ("C1");
		JButton C2 = new JButton ("C2");
		JButton C3 = new JButton ("C3");
		JButton C4 = new JButton ("C4");
		JButton C5 = new JButton ("C5");
		JButton C6 = new JButton ("C6");
		JButton C7 = new JButton ("C7");
		final JButton D1 = new JButton ("D1");
		final JButton D2 = new JButton ("D2");
		final JButton D3 = new JButton ("D3");
		JButton D4 = new JButton ("D4");
		JButton D5 = new JButton ("D5");
		JButton D6 = new JButton ("D6");
		JButton D7 = new JButton ("D7");
		JButton E1 = new JButton ("E1");
		JButton E2 = new JButton ("E2");
		JButton E3 = new JButton ("E3");
		JButton E4 = new JButton ("E4");
		JButton E5 = new JButton ("E5");
		JButton E6 = new JButton ("E6");
		JButton E7 = new JButton ("E7");
		JButton F1 = new JButton ("F1");
		JButton F2 = new JButton ("F2");
		JButton F3 = new JButton ("F3");
		JButton F4 = new JButton ("F4");
		JButton F5 = new JButton ("F5");
		JButton F6 = new JButton ("F6");
		JButton F7 = new JButton ("F7");
		JButton G1 = new JButton ("G1");
		JButton G2 = new JButton ("G2");
		JButton G3 = new JButton ("G3");
		JButton G4 = new JButton ("G4");
		final JButton G5 = new JButton ("G5");
		final JButton G6 = new JButton ("G6");
		final JButton G7 = new JButton ("G7");
		
		
		pane.add(A1);
		pane.add(A2);
		pane.add(A3);
		pane.add(A4);
		pane.add(A5);
		pane.add(A6);
		pane.add(A7);
		pane.add(B1);
		pane.add(B2);
		pane.add(B3);
		pane.add(B4);
		pane.add(B5);
		pane.add(B6);
		pane.add(B7);
		pane.add(C1);
		pane.add(C2);
		pane.add(C3);
		pane.add(C4);
		pane.add(C5);
		pane.add(C6);
		pane.add(C7);
		pane.add(D1);
		pane.add(D2);
		pane.add(D3);
		pane.add(D4);
		pane.add(D5);
		pane.add(D6);
		pane.add(D7);
		pane.add(E1);
		pane.add(E2);
		pane.add(E3);
		pane.add(E4);
		pane.add(E5);
		pane.add(E6);
		pane.add(E7);
		pane.add(F1);
		pane.add(F2);
		pane.add(F3);
		pane.add(F4);
		pane.add(F5);
		pane.add(F6);
		pane.add(F7);
		pane.add(G1);
		pane.add(G2);
		pane.add(G3);
		pane.add(G4);
		pane.add(G5);
		pane.add(G6);
		pane.add(G7);
		add(pane);
	BorderLayout border = new BorderLayout();
		
		JLabel message = new JLabel("Click the buttons to kill the 3 DotComs!");
		add(BorderLayout.SOUTH, message);
		setVisible(true);
		

		ActionListener youhit = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				final ImageIcon icon = new ImageIcon(this.getClass().getResource("/resources/explosion.gif"));
				final ImageIcon win = new ImageIcon(this.getClass().getResource("/resources/banana.gif"));
				final ImageIcon boom = new ImageIcon(this.getClass().getResource("/resources/boom.gif"));
				
				Object source = e.getSource();
				
				if (source == G7 || source == G6 || source == G5) {
					try {
						URL soundURL = DotCom.class.getResource("/resources/blast.wav");
						AudioInputStream audioStream = AudioSystem.getAudioInputStream(soundURL);
                       
                        Clip clip = AudioSystem.getClip();
                        clip.open(audioStream);
                        clip.start();
                        
                     
					}catch(Exception x) { x.printStackTrace(); }
					
					JOptionPane.showMessageDialog (null, "BOOM! YOU HIT YOUTUBE.COM!", "HIT", JOptionPane.INFORMATION_MESSAGE, icon);
					 
                
					hitclicks++;
					check++;
	                hits.setText("" +hitclicks);
	                int total=hitclicks+missclicks;
				    sum.setText(" "+total);
				    
				    ((Component) source).setBackground(Color.RED);
				    ((Component) source).setEnabled(false);
				    ((Component) source).setForeground(Color.RED);
				    
				  
				 if(!G5.isEnabled()&&!G6.isEnabled()&&!G7.isEnabled()){
					 
						try {
							URL soundURL = DotCom.class.getResource("/resources/bomb.wav");
							AudioInputStream audioStream = AudioSystem.getAudioInputStream(soundURL);
	                        
	                        Clip clip = AudioSystem.getClip();
	                        clip.open(audioStream);
	                        clip.start();
					 }catch(Exception x) { x.printStackTrace(); }
						
						
				    	JOptionPane.showMessageDialog (null, "YOU KILLED YOUTUBE.COM", "KILL", JOptionPane.INFORMATION_MESSAGE, boom );
					}
			

				    	
				    	if(check == 9 && total >= 9  && total <= 15) {
				    		try {
				    			URL soundURL = DotCom.class.getResource("/resources/winner.wav");
								AudioInputStream audioStream = AudioSystem.getAudioInputStream(soundURL);
		                       
		                        Clip clip = AudioSystem.getClip();
		                        clip.open(audioStream);
		                        clip.start();
		           }catch(Exception x) { x.printStackTrace(); }
				    		
					    	JOptionPane.showMessageDialog (null, "CONGRATS! YOU WON! \nRATING: 5/5 STARS!","GAME OVER", JOptionPane.INFORMATION_MESSAGE, win );
					    	System.exit(0);
					    	
					    	
					    
				    	}else if(check == 9 && total > 15 && total <= 25) {
				    		try {
				    			URL soundURL = DotCom.class.getResource("/resources/winner.wav");
								AudioInputStream audioStream = AudioSystem.getAudioInputStream(soundURL);
		                       
		                        Clip clip = AudioSystem.getClip();
		                        clip.open(audioStream);
		                        clip.start();
		          }catch(Exception x) { x.printStackTrace(); }
				    		
					    	JOptionPane.showMessageDialog (null, "CONGRATS! YOU WON! \nRATING: 4/5 STARS!","GAME OVER", JOptionPane.INFORMATION_MESSAGE, win );
					    	System.exit(0);
					    
				    	}else if(check == 9 && total > 25 && total <= 35) {
					    	JOptionPane.showMessageDialog (null, "CONGRATS! YOU WON! \nRATING: 3/5 STARS!","GAME OVER", JOptionPane.INFORMATION_MESSAGE, win );
					    	System.exit(0);
					    
				    	}else if(check == 9 && total > 35 && total <= 45 ) {
					    	JOptionPane.showMessageDialog (null, "CONGRATS! YOU WON! \nRATING: 2/5 STARS!","GAME OVER", JOptionPane.INFORMATION_MESSAGE, win );
					    	System.exit(0);
					    
				    	}else if(check == 9 && total > 45 ) {
					    	JOptionPane.showMessageDialog (null, "CONGRATS! YOU WON! \nRATING: 1/5 STARS! ","GAME OVER", JOptionPane.INFORMATION_MESSAGE, win );
					    	System.exit(0);
					    }
				
				}
			}
			
		};
		ActionListener yahoohit = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Object source = e.getSource();
				final ImageIcon icon = new ImageIcon(this.getClass().getResource("/resources/explosion.gif"));
				final ImageIcon win = new ImageIcon(this.getClass().getResource("/resources/banana.gif"));
				final ImageIcon boom = new ImageIcon(this.getClass().getResource("/resources/boom.gif"));
				
				if (source instanceof Component) {
					try {
						URL soundURL = DotCom.class.getResource("/resources/blast.wav");
						AudioInputStream audioStream = AudioSystem.getAudioInputStream(soundURL);
                       
                        Clip clip = AudioSystem.getClip();
                        clip.open(audioStream);
                        clip.start();
					}catch(Exception x) { x.printStackTrace(); }
					
					((Component) source).setForeground(Color.RED);
					 ((Component) source).setBackground(Color.RED);
					 ((Component) source).setEnabled(false);
					 
					    
					JOptionPane.showMessageDialog (null, "BOOM! YOU HIT YAHOO.COM!", "HIT", JOptionPane.INFORMATION_MESSAGE, icon );
					hitclicks++;
					check++;
	                hits.setText("" +hitclicks);
	                int total=hitclicks+missclicks;
				    sum.setText(" "+total);
				    
				    if(!A4.isEnabled()&&!A5.isEnabled()&&!A6.isEnabled()){
				    	try {
				    		URL soundURL = DotCom.class.getResource("/resources/bomb.wav");
							AudioInputStream audioStream = AudioSystem.getAudioInputStream(soundURL);
	                       
	                        Clip clip = AudioSystem.getClip();
	                        clip.open(audioStream);
	                        clip.start();
				    	}catch(Exception x) { x.printStackTrace(); }
				    	
				    	
				    	JOptionPane.showMessageDialog (null, "YOU KILLED YAHOO.COM", "KILL", JOptionPane.INFORMATION_MESSAGE, boom );
				    }

				    	
					if(check == 9 && total >= 9  && total <= 15) {
						try {
							URL soundURL = DotCom.class.getResource("/resources/winner.wav");
							AudioInputStream audioStream = AudioSystem.getAudioInputStream(soundURL);
	                        
	                        Clip clip = AudioSystem.getClip();
	                        clip.open(audioStream);
	                        clip.start();
						}catch(Exception x) { x.printStackTrace(); }
						
				    	JOptionPane.showMessageDialog (null, "CONGRATS! YOU WON! \nRATING: 5/5 STARS!","GAME OVER", JOptionPane.INFORMATION_MESSAGE, win );
				    	System.exit(0);
				    	
				    	
				    
			    	}else if(check == 9 && total > 15 && total <= 25) {
			    		try {
			    			URL soundURL = DotCom.class.getResource("/resources/winner.wav");
							AudioInputStream audioStream = AudioSystem.getAudioInputStream(soundURL);
	                        
	                        Clip clip = AudioSystem.getClip();
	                        clip.open(audioStream);
	                        clip.start();
			    		}catch(Exception x) { x.printStackTrace(); }
			    		
				    	JOptionPane.showMessageDialog (null, "CONGRATS! YOU WON! \nRATING: 4/5 STARS!","GAME OVER", JOptionPane.INFORMATION_MESSAGE, win );
				    	System.exit(0);
				    
			    	}else if(check == 9 && total > 25 && total <= 35) {
				    	JOptionPane.showMessageDialog (null, "CONGRATS! YOU WON! \nRATING: 3/5 STARS!","GAME OVER", JOptionPane.INFORMATION_MESSAGE, win );
				    	System.exit(0);
				    
			    	}else if(check == 9 && total > 35 && total <= 45 ) {
				    	JOptionPane.showMessageDialog (null, "CONGRATS! YOU WON! \nRATING: 2/5 STARS!","GAME OVER", JOptionPane.INFORMATION_MESSAGE, win );
				    	System.exit(0);
				    
			    	}else if(check == 9 && total > 45 ) {
				    	JOptionPane.showMessageDialog (null, "CONGRATS! YOU WON! \nRATING: 1/5 STARS! ","GAME OVER", JOptionPane.INFORMATION_MESSAGE, win );
				    	System.exit(0);
				    }
				
				}
			}
			
		};
		ActionListener googhit = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				final ImageIcon icon = new ImageIcon(this.getClass().getResource("/resources/explosion.gif"));
				final ImageIcon win = new ImageIcon(this.getClass().getResource("/resources/banana.gif"));
				final ImageIcon boom = new ImageIcon(this.getClass().getResource("/resources/boom.gif"));
				
				Object source = e.getSource();
				if (source instanceof Component) {
					try {
						URL soundURL = DotCom.class.getResource("/resources/blast.wav");
						AudioInputStream audioStream = AudioSystem.getAudioInputStream(soundURL);
                       
                        Clip clip = AudioSystem.getClip();
                        clip.open(audioStream);
                        clip.start();
					}catch(Exception x) { x.printStackTrace(); }
					
					((Component) source).setBackground(Color.RED);
					((Component) source).setEnabled(false);
					((Component) source).setForeground(Color.RED);
					    
					
					JOptionPane.showMessageDialog (null, "BOOM! YOU HIT GOOGLE.COM!", "HIT", JOptionPane.INFORMATION_MESSAGE, icon );
					hitclicks++;
					check++;
	                hits.setText("" +hitclicks);
	                int total=hitclicks+missclicks;
				    sum.setText(" "+total);
				    
				  
				    
				    
			    
				    
				    
				    if(!D1.isEnabled()&&!D2.isEnabled()&&!D3.isEnabled()){
				    	
				    	try {
				    		URL soundURL = DotCom.class.getResource("/resources/bomb.wav");
							AudioInputStream audioStream = AudioSystem.getAudioInputStream(soundURL);
	                       
	                        Clip clip = AudioSystem.getClip();
	                        clip.open(audioStream);
	                        clip.start();
				    	}catch(Exception x) { x.printStackTrace(); }
				    	
				    	
				    	JOptionPane.showMessageDialog (null, "YOU KILLED GOOGLE.COM", "KILL", JOptionPane.INFORMATION_MESSAGE, boom  );
				    }

					if(check == 9 && total >= 9  && total <= 15) {
						try {
							URL soundURL = DotCom.class.getResource("/resources/winner.wav");
							AudioInputStream audioStream = AudioSystem.getAudioInputStream(soundURL);
	                       
	                        Clip clip = AudioSystem.getClip();
	                        clip.open(audioStream);
	                        clip.start();
						}catch(Exception x) { x.printStackTrace(); }
						
				    	JOptionPane.showMessageDialog (null, "CONGRATS! YOU WON! \nRATING: 5/5 STARS!","GAME OVER", JOptionPane.INFORMATION_MESSAGE, win );
				    	System.exit(0);
				    	
				    	
				    
			    	}else if(check == 9 && total > 15 && total <= 25) {
			    		try {
			    			URL soundURL = DotCom.class.getResource("/resources/winner.wav");
							AudioInputStream audioStream = AudioSystem.getAudioInputStream(soundURL);
	                       
	                        Clip clip = AudioSystem.getClip();
	                        clip.open(audioStream);
	                        clip.start();
	                      
			    		}catch(Exception x) { x.printStackTrace(); }
			    		
				    	JOptionPane.showMessageDialog (null, "CONGRATS! YOU WON! \nRATING: 4/5 STARS!","GAME OVER", JOptionPane.INFORMATION_MESSAGE, win );
				    	System.exit(0);
				    
			    	}else if(check == 9 && total > 25 && total <= 35) {
				    	JOptionPane.showMessageDialog (null, "CONGRATS! YOU WON! \nRATING: 3/5 STARS!","GAME OVER", JOptionPane.INFORMATION_MESSAGE, win );
				    	System.exit(0);
				    
			    	}else if(check == 9 && total > 35 && total <= 45 ) {
				    	JOptionPane.showMessageDialog (null, "CONGRATS! YOU WON! \nRATING: 2/5 STARS!","GAME OVER", JOptionPane.INFORMATION_MESSAGE, win );
				    	System.exit(0);
				    
			    	}else if(check == 9 && total > 45 ) {
				    	JOptionPane.showMessageDialog (null, "CONGRATS! YOU WON! \nRATING: 1/5 STARS! ","GAME OVER", JOptionPane.INFORMATION_MESSAGE, win );
				    	System.exit(0);
				    }   	
				    	
				
				}
			}
			
		};
		
		
		ActionListener listener2 = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				Object source = e.getSource();
				if (source instanceof Component) {
					try {
						URL soundURL = DotCom.class.getResource("/resources/miss.wav");
						AudioInputStream audioStream = AudioSystem.getAudioInputStream(soundURL);
                        
                        Clip clip = AudioSystem.getClip();
                        clip.open(audioStream);
                        clip.start();
					}catch(Exception x) { x.printStackTrace(); }
					((Component) source).setBackground(Color.BLUE);
					((Component) source).setForeground(Color.WHITE);
					 missclicks++;
		                miss.setText("" +missclicks);

		                int total=hitclicks+missclicks;
					    sum.setText(" "+total);
		                
					
			
				}
			}
			
		};	
	
		
		//HIT LOCATION - RED BUTTONS
		G7.addActionListener(youhit);
		G6.addActionListener(youhit);
		G5.addActionListener(youhit);
		
		D1.addActionListener(googhit);
		D2.addActionListener(googhit);
		D3.addActionListener(googhit);
		
		
		A4.addActionListener(yahoohit);
		A5.addActionListener(yahoohit);
		A6.addActionListener(yahoohit);
		
		
		
		//MISS LOCATION - BLUE BUTTONS
		A1.addActionListener(listener2);
		A2.addActionListener(listener2);
		A3.addActionListener(listener2);
		A7.addActionListener(listener2);
		B1.addActionListener(listener2);
		B2.addActionListener(listener2);
		B3.addActionListener(listener2);
		B4.addActionListener(listener2);
		B5.addActionListener(listener2);
		B6.addActionListener(listener2);
		B7.addActionListener(listener2);
		C1.addActionListener(listener2);
		C2.addActionListener(listener2);
		C3.addActionListener(listener2);
		C4.addActionListener(listener2);
		C5.addActionListener(listener2);
		C6.addActionListener(listener2);
		C7.addActionListener(listener2);
		
		D4.addActionListener(listener2);
		D5.addActionListener(listener2);
		D6.addActionListener(listener2);
		D7.addActionListener(listener2);
		
		E1.addActionListener(listener2);
		E2.addActionListener(listener2);
		E3.addActionListener(listener2);
		E4.addActionListener(listener2);
		E5.addActionListener(listener2);
		E6.addActionListener(listener2);
		E7.addActionListener(listener2);
		
		F1.addActionListener(listener2);
		F2.addActionListener(listener2);
		F3.addActionListener(listener2);
		F4.addActionListener(listener2);
		F5.addActionListener(listener2);
		F6.addActionListener(listener2);
		F7.addActionListener(listener2);
		
		G1.addActionListener(listener2);
		G2.addActionListener(listener2);
		G3.addActionListener(listener2);
		G4.addActionListener(listener2);  
	            
	}
	


	private void setLookAndFeel() {
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		SwingUtilities.updateComponentTreeUI(this);
		
		} catch (Exception e) {
		
			 
			System.err.println("Couldn't use the system " + "look and feel " + e);
			
		}
	}
	
	
	
	
public static void main (String[] args) {
	DotCom frame = new DotCom();
	 frame.setLocationRelativeTo(null);
	
}
}
