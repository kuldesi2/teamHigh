import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.awt.event.ActionEvent;
import javax.swing.border.BevelBorder;

public class LibrarianP extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LibrarianP frame = new LibrarianP();
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
	public LibrarianP() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1049, 679);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		DefaultListModel model = new DefaultListModel();
		JList list = new JList(model);
		list.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		list.setBounds(60, 115, 334, 435);
		contentPane.add(list);
		
		textField = new JTextField();
		textField.setBounds(703, 128, 251, 37);
		contentPane.add(textField);
		textField.setColumns(10);
		
		
		JLabel lblName = new JLabel("Name Of Librarian");
		lblName.setBounds(534, 124, 157, 44);
		contentPane.add(lblName);
		
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getActionCommand().equals("Add")) {
				String TextFieldValue =  textField.getText();	
				model.add(0,TextFieldValue);
					
				}
			
			
			}
		});
		btnAdd.setBounds(640, 273, 157, 37);
		contentPane.add(btnAdd);
		
		JButton btnNewButton = new JButton("Remove");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getActionCommand().equals("Remove")) {
				int index = list.getSelectedIndex();
				model.remove(index);
					
				}
			
			
			}
		});
		
		
		btnNewButton.setBounds(640, 358, 157, 37);
		contentPane.add(btnNewButton);
		
		JLabel lblAdmin = new JLabel("Admin's Home Page");
		lblAdmin.setFont(new Font("Segoe UI Black", Font.BOLD, 25));
		lblAdmin.setBounds(379, 13, 278, 61);
		contentPane.add(lblAdmin);
		
		JButton btnNewButton_1 = new JButton("Clear");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText("");
			}
		});
		btnNewButton_1.setBounds(640, 442, 157, 37);
		contentPane.add(btnNewButton_1);
		
		JButton btnLogOut = new JButton("Log Out");
		btnLogOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				setVisible(false);
				WelcomeP wl = new WelcomeP();
				wl.setVisible(true);
			}
		});
		btnLogOut.setBounds(857, 569, 137, 37);
		contentPane.add(btnLogOut);
		String[] myArray = new String[100];
		JButton btnDownload = new JButton("Download");
		btnDownload.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String ds = textField.getText();
				PrintWriter orderid = null;
				try {
				orderid = new PrintWriter("library.txt");
				} catch (FileNotFoundException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
				}
				for (int i = 0; i < list.getModel().getSize(); i++) {
					myArray[i] = String.valueOf(list.getModel().getElementAt(i));
					//String s = myArray[i];
				//	String[] s1 = s.split("@");
					//orderid.print(s1[0]);
					//int i1 = s1[0].length();
				//	int i2 = 34 - i1;
				//	for (int i3=2;i3<i2;i3++) {
					//orderid.print(" ");
				//	}
					orderid.println(myArray[i]);
					}
					orderid.println();
					orderid.close();	
			}
		});
		btnDownload.setBounds(173, 563, 110, 30);
		contentPane.add(btnDownload);
	}
}
