package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JPanel;
import javax.swing.JEditorPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class project1 {

	private JFrame frame;
	private JTextField t1;
	private JTextField t2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					project1 window = new project1();
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
	public project1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setTitle(" ");
		frame.setBounds(0, -25, 786, 609);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Imprint MT Shadow", Font.BOLD, 20));
		lblName.setBounds(30, 355, 113, 30);
		frame.getContentPane().add(lblName);
		
		t1 = new JTextField();
		t1.setBounds(178, 355, 140, 33);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		JLabel lblNumber = new JLabel("Number");
		lblNumber.setFont(new Font("Imprint MT Shadow", Font.BOLD, 20));
		lblNumber.setBounds(30, 436, 113, 30);
		frame.getContentPane().add(lblNumber);
		
		t2 = new JTextField();
		t2.setColumns(10);
		t2.setBounds(178, 436, 140, 33);
		frame.getContentPane().add(t2);
		
		JTextArea ta = new JTextArea();
		ta.setBounds(374, 355, 386, 111);
		frame.getContentPane().add(ta);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\contact.jpg"));
		lblNewLabel.setBounds(30, 11, 342, 321);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String name=t1.getText();
				String num=t2.getText();
				ta.setText(t1.getText()+"\n"+t2.getText());
				
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Untitled.jpg"));
		btnNewButton.setBounds(303, 498, 106, 62);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Untitled1.jpg"));
		lblNewLabel_1.setBounds(706, 11, 54, 62);
		frame.getContentPane().add(lblNewLabel_1);
	}
}
