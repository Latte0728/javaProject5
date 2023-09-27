package javaProject5;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;

public class Test extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Test frame = new Test();
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
	public Test() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblhoiwon = new JLabel("회원가입");
		lblhoiwon.setBounds(75, 10, 252, 54);
		contentPane.add(lblhoiwon);
		
		JButton btnNewButton = new JButton("회원가입");
		btnNewButton.setBounds(45, 175, 165, 59);
		contentPane.add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(130, 67, 197, 34);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(130, 114, 197, 34);
		contentPane.add(textField_1);
		
		JLabel lblNewLabel = new JLabel("id");
		lblNewLabel.setBounds(22, 74, 69, 21);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("password");
		lblNewLabel_1.setBounds(32, 114, 59, 34);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton_1 = new JButton("로그인");
		btnNewButton_1.setBounds(238, 175, 127, 54);
		contentPane.add(btnNewButton_1);
		
		/* ================================== */
		
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
	}
}
