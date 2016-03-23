import java.awt.*;
import javax.swing.*;

import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class SurveyFrame extends JFrame {
	public SurveyFrame() {
		super("Survey");
		setSize(290, 140);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLookAndFeel();
		SurveyWizard wiz = new SurveyWizard();
		add(wiz);
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
		SurveyFrame surv = new SurveyFrame();
	}
}