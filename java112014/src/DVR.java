import javax.swing.*;

public class DVR extends JFrame {
	JButton play = new JButton("Play");
	JButton stop = new JButton("Stop/Eject");
	JButton rewind = new JButton("Rewind");
	JButton fastf = new JButton("Fast Foward");
	JButton pause = new JButton("Pause");
	
	public DVR() {
		super("DVR");
		setSize(440, 70);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel pane = new JPanel();
		pane.add(play);
		pane.add(stop);
		pane.add(rewind);
		pane.add(fastf);
		pane.add(pause);
		add(pane);
		setVisible(true);
	}
	
	private static void setLookAndFeel(){
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (Exception exc) {
			System.out.println(exc.getMessage());
		}
	}
	
	public static void main (String[] args) {
		DVR.setLookAndFeel();
		DVR dvv = new DVR();
		
		}
	}