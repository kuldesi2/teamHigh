import java.awt.BorderLayout;
import java.awt.Desktop;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class LibrarianRoles extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LibrarianRoles frame = new LibrarianRoles();
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
	public LibrarianRoles() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1047, 750);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLibrariansHomePage = new JLabel("Librarian's Home Page");
		lblLibrariansHomePage.setFont(new Font("Segoe UI Black", Font.BOLD, 25));
		lblLibrariansHomePage.setBounds(351, 13, 320, 60);
		contentPane.add(lblLibrariansHomePage);
		
		JButton btnNewButton = new JButton("Add Book");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AddBook adb = new AddBook();
				adb.setVisible(true);
			}
		});
		btnNewButton.setBounds(410, 138, 196, 44);
		contentPane.add(btnNewButton);
		
		JButton btnRemoveBook = new JButton("Remove Book");
		btnRemoveBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				RBook rbk;
				try {
					rbk = new RBook();
					rbk.setVisible(true);
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			
			}
		});
		btnRemoveBook.setBounds(410, 229, 196, 44);
		contentPane.add(btnRemoveBook);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				WelcomeP wlp = new WelcomeP();
				wlp.setVisible(true);
			}
		});
		btnLogout.setBounds(803, 618, 196, 44);
		contentPane.add(btnLogout);
		
		JButton btnNewButton_1 = new JButton("View List of Books");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Desktop.getDesktop().open(new java.io.File("C://Kuldeep PC//Java//project//Library//AddBook.txt"));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		
		btnNewButton_1.setBounds(410, 319, 196, 44);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Issue Book");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				IssueBook isb;
				try {
					isb = new IssueBook();
					isb.setVisible(true);
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			
			}
		});
		btnNewButton_2.setBounds(410, 409, 196, 44);
		contentPane.add(btnNewButton_2);
	}
}
