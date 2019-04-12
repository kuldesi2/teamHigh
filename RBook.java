import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class RBook extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
	
		
		
		
		
	}
	
	

	/**
	 * Create the frame.
	 * @throws FileNotFoundException 
	 */
	public RBook() throws FileNotFoundException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 928, 617);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		
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
		DefaultListModel model = new DefaultListModel();
		JList list1 = new JList(model);
		for(int i=0;i<wi;i++)
		{
			model.add(0,arr11[i]);
		}
	//	JList list1 = new JList(arr11);
		list1.setBounds(102, 134, 267, 339);
		contentPane.add(list1);
		
		JButton btnRemove = new JButton("Remove");
		btnRemove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(e.getActionCommand().equals("Remove")) {
					int index = list1.getSelectedIndex();
				model.remove(index);
						
					}
				
				
				}
			
		});
		btnRemove.setBounds(542, 229, 239, 46);
		contentPane.add(btnRemove);
		
		JLabel lblRemoveABook = new JLabel("Remove A Book");
		lblRemoveABook.setHorizontalAlignment(SwingConstants.CENTER);
		lblRemoveABook.setFont(new Font("Segoe UI Black", Font.BOLD, 25));
		lblRemoveABook.setBounds(66, 29, 760, 64);
		contentPane.add(lblRemoveABook);
		
		JButton button = new JButton("Home Page");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				LibrarianRoles lblr = new LibrarianRoles();
				lblr.setVisible(true);
			}
		});
		button.setBounds(663, 512, 223, 45);
		contentPane.add(button);
		
		
	
	}

}
