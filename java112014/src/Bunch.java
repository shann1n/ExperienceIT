import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Bunch extends JFrame {
	public Bunch() {
		super("Bunch");
		setSize(260, 260);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLookAndFeel();
		JPanel pane = new JPanel();
		GridLayout family = new GridLayout(3, 3, 10, 10);
		pane.setLayout(family);
		JButton marc = new JButton ("marc");
		JButton mar = new JButton ("mar");
		JButton ma = new JButton ("ma");
		JButton m = new JButton ("m");
		JButton carol = new JButton ("carol");
		JButton caro = new JButton ("caro");
		JButton car = new JButton ("car");
		JButton ca = new JButton ("ca");
		JButton c = new JButton ("c");
		pane.add(marc);
		pane.add(mar);
		pane.add(ma);
		pane.add(m);
		pane.add(carol);
		pane.add(caro);
		pane.add(car);
		pane.add(ca);
		pane.add(c);
		add(pane);
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
		Bunch frame = new Bunch();
	}
}