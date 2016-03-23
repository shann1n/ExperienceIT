import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FeedBar extends JFrame {
	
	public FeedBar() {
		super("FeedBar");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLookAndFeel();
		
		ImageIcon loadIcon = new ImageIcon("/Users/Shannon/Desktop/greg@gslaidlaw.com - icons/load.gif");
		ImageIcon saveIcon = new ImageIcon("/Users/Shannon/Desktop/greg@gslaidlaw.com - icons/save.gif");
		ImageIcon subscribeIcon = new ImageIcon("/Users/Shannon/Desktop/greg@gslaidlaw.com - icons/subscribe.gif");
		ImageIcon unsubscribeIcon = new ImageIcon ("/Users/Shannon/Desktop/greg@gslaidlaw.com - icons/unsubscribe.gif");
		
		JButton load = new JButton("Load", loadIcon);
		JButton save = new JButton ("Save", saveIcon);
		JButton subscribe = new JButton ("Subscribe", subscribeIcon);
		JButton unsubscribe = new JButton ("Unsubscribe", unsubscribeIcon);
		
		JToolBar bar = new JToolBar();
		bar.add(load);
		bar.add(save);
		bar.add(subscribe);
		bar.add(unsubscribe);
		
		JTextArea edit = new JTextArea(8, 40);
		JScrollPane scroll = new JScrollPane(edit);
		BorderLayout bord = new BorderLayout();
		setLayout (bord);
		add("North", bar);
		add("Center", scroll);
		pack();
		setVisible(true);
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
		FeedBar frame = new FeedBar();
		}
		
		
		
	}
