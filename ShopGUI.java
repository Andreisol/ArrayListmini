import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.*;
import javax.swing.JTextArea;

public class ShopGUI {

	private JFrame frame;
	private JTextField textField;
	String input = "";
	ArrayList<String> dList = new ArrayList<String>();
	int x = 0;
	List Shop = new List();
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ShopGUI window = new ShopGUI();
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
	public ShopGUI() {
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
		
		JLabel lblNewLabel = new JLabel("Shopping List");
		lblNewLabel.setBounds(186, 6, 86, 16);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input = textField.getText();
				System.out.println(input);
				
			}
		});
		textField.setBounds(6, 26, 438, 46);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(250, 89, 194, 167);
		frame.getContentPane().add(textArea);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dList = Shop.add(input);
				textArea.append(input + '\n');
				
			}
		});
		btnAdd.setBounds(6, 84, 117, 29);
		frame.getContentPane().add(btnAdd);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dList = Shop.delete(input);
				if(dList.size() == 0)
					x = -1;
				textArea.selectAll();
				textArea.replaceSelection("");
				for(x = 0; x < dList.size(); x++)
				{
					textArea.setText(dList.get(x) + "\n");
				}
			}
		});
		btnDelete.setBounds(6, 125, 117, 29);
		frame.getContentPane().add(btnDelete);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dList = Shop.clear();
				textArea.setText("");
				
			}
		});
		btnClear.setBounds(6, 170, 117, 29);
		frame.getContentPane().add(btnClear);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(1);
			}
		});
		btnExit.setBounds(6, 211, 117, 29);
		frame.getContentPane().add(btnExit);
		

		

	}
}
