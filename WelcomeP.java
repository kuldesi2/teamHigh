import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.border.MatteBorder;
import java.awt.Color;

public class WelcomeP extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WelcomeP frame = new WelcomeP();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public WelcomeP() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1034, 463);
		contentPane = new JPanel();
		contentPane.setAutoscrolls(true);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblWelcomeToThe = new JLabel("Welcome to The High Five Library");
		lblWelcomeToThe.setFont(new Font("Segoe UI Black", Font.BOLD, 30));
		lblWelcomeToThe.setBounds(233, 13, 655, 53);
		contentPane.add(lblWelcomeToThe);
		
		JButton btnClickHereIf = new JButton("Click Here If You Are An Admin");
		btnClickHereIf.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnClickHereIf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				setVisible(false);
				AdminLogin admlgn = new AdminLogin();
				admlgn.setVisible(true);
				
			}
		});
		
		btnClickHereIf.setBounds(71, 207, 327, 62);
		contentPane.add(btnClickHereIf);
		
		JButton btnNewButton = new JButton("Click Here If You Are Librarian");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LibrarianLogin lblgn = new LibrarianLogin();
				lblgn.setVisible(true);
				
				
			}
		});
		btnNewButton.setBounds(628, 207, 309, 62);
		contentPane.add(btnNewButton);
	}

}
