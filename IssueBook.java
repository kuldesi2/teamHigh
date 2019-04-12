import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JList;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class IssueBook extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IssueBook frame = new IssueBook();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws FileNotFoundException 
	 */
	public IssueBook() throws FileNotFoundException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 995, 611);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setBounds(465, 110, 220, 45);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(697, 110, 220, 45);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblBookName = new JLabel("Book Name");
		lblBookName.setBounds(465, 201, 220, 45);
		contentPane.add(lblBookName);
		
		JLabel lblIssueDate = new JLabel("Issue Date");
		lblIssueDate.setBounds(465, 300, 220, 45);
		contentPane.add(lblIssueDate);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(697, 201, 220, 45);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(697, 300, 220, 45);
		contentPane.add(textField_2);
	
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(697, 393, 220, 45);
		contentPane.add(textField_3);
		
		JLabel lblReturnDate = new JLabel("Return Date");
		lblReturnDate.setBounds(465, 393, 220, 45);
		contentPane.add(lblReturnDate);
		
		JButton btnIssueBook = new JButton("Issue Book");
		btnIssueBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Book Successfully Issued" );
			}
		});
		btnIssueBook.setBounds(697, 492, 220, 45);
		contentPane.add(btnIssueBook);
		
		JLabel lblIssueBook = new JLabel("Issue Book");
		lblIssueBook.setFont(new Font("Segoe UI Black", Font.BOLD, 25));
		lblIssueBook.setHorizontalAlignment(SwingConstants.CENTER);
		lblIssueBook.setBounds(124, 13, 717, 60);
		contentPane.add(lblIssueBook);
		
		File file1 = new File("C://Kuldeep PC//Java//project//Library//BookNames.txt");
		Scanner inputFile1 = new Scanner(file1);
		String str1 = "";
		String arr11[] = new String[1000];
		int wi= 0;
		while (inputFile1.hasNext())
		{
			str1 = inputFile1.nextLine();
			arr11[wi] = str1;
			wi= wi+1;
		}
		//JList list1 = new JList(arr11);
		//list1.setBounds(102, 134, 267, 339);
		//contentPane.add(list1);
		JList list = new JList(arr11);
		list.setBounds(84, 90, 226, 354);
		contentPane.add(list);
		
		JButton button = new JButton("Home Page");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				LibrarianRoles lblr = new LibrarianRoles();
				lblr.setVisible(true);
			}
		});
		button.setBounds(53, 492, 223, 45);
		contentPane.add(button);
	}
}
