package jas16;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class JAS16JOptionPanel {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JAS16JOptionPanel window = new JAS16JOptionPanel();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public JAS16JOptionPanel() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.getContentPane().setLayout(null);
		
		JLabel LblImie = new JLabel("");
		LblImie.setHorizontalAlignment(SwingConstants.CENTER);
		LblImie.setFont(new Font("Calibri", Font.BOLD, 25));
		LblImie.setBounds(118, 83, 210, 92);
		frame.getContentPane().add(LblImie);
		
		JOptionPane jop= new JOptionPane();
		String imie=jop.showInputDialog(frame, "Podaj imie");
		LblImie.setText("Witaj "+imie+" !!!");
		
	}
}
