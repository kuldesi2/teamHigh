import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.awt.event.ActionEvent;

public class AddBook extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddBook frame = new AddBook();
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
	public AddBook() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 993, 680);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnAddBook = new JButton("Add Book");
		btnAddBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					FileWriter fw1 = null;
					try {
						fw1 = new FileWriter("BookNames.txt",true);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					FileWriter outfile11 = null;
					try {
						outfile11 = new FileWriter("AddBook.txt",true);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				
				PrintWriter fw = new PrintWriter(fw1);
				PrintWriter outfile1 = new PrintWriter(outfile11);
				
				
				
				
				outfile1.println("Book Name : "+textField.getText());
				outfile1.println("Book Number : "+textField_1.getText());
				outfile1.println("Author : "+textField_2.getText());
				outfile1.println("Publisher : "+textField_3.getText());
				outfile1.println("Quantity : "+textField_4.getText());
				outfile1.println();
				outfile1.println("------------------------------------------------------------------------------");
				outfile1.println();
				outfile1.close();
				fw.println(textField.getText());
				fw.close();
			}
		});
		btnAddBook.setBounds(735, 571, 228, 49);
		contentPane.add(btnAddBook);
		
		textField = new JTextField();
		textField.setBounds(490, 119, 245, 41);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Book Name");
		lblNewLabel.setBounds(206, 117, 245, 44);
		contentPane.add(lblNewLabel);
		
		JLabel lblBookNumber = new JLabel("Book Number");
		lblBookNumber.setBounds(206, 203, 175, 49);
		contentPane.add(lblBookNumber);
		
		JLabel lblAuthor = new JLabel("Author");
		lblAuthor.setBounds(206, 282, 175, 49);
		contentPane.add(lblAuthor);
		
		JLabel lblPublisher = new JLabel("Publisher");
		lblPublisher.setBounds(206, 370, 175, 41);
		contentPane.add(lblPublisher);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(490, 207, 245, 41);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(490, 286, 245, 41);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(490, 370, 245, 41);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(490, 468, 245, 41);
		contentPane.add(textField_4);
		
		JLabel lblQuantity = new JLabel("Quantity");
		lblQuantity.setBounds(206, 474, 128, 29);
		contentPane.add(lblQuantity);
		
		JLabel lblAddBookDetails = new JLabel("Add Book Details");
		lblAddBookDetails.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddBookDetails.setFont(new Font("Segoe UI Black", Font.BOLD, 25));
		lblAddBookDetails.setBounds(0, 13, 975, 49);
		contentPane.add(lblAddBookDetails);
		
		JButton btnHomePage = new JButton("Home Page");
		btnHomePage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			setVisible(false);
			LibrarianRoles lblr = new LibrarianRoles();
			lblr.setVisible(true);
			}
		});
		btnHomePage.setBounds(23, 575, 223, 45);
		contentPane.add(btnHomePage);
	}
}
