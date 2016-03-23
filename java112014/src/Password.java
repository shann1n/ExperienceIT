import javax.swing.*;

public class Password extends javax.swing.JFrame {
	JTextField username = new JTextField(15);
	JPasswordField password = new JPasswordField(15);
	
	public Password() {
		super("Username / Password");
		setSize(300, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel pane = new JPanel();
		JLabel usernameLabel = new JLabel("Username: ");
		JLabel passwordLabel = new JLabel("Password: ");
		
		pane.add(usernameLabel);
		pane.add(username);
		pane.add(passwordLabel);
		pane.add(password);
		
		add(pane);
		setVisible(true);
	}
	
	private static void setLookAndFeel() {
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (Exception exc) {
			System.out.println(exc.getMessage());
		}
	}
	
	public static void main (String[] args) {
		Password.setLookAndFeel();
		Password pass = new Password();
		
		}
	}
