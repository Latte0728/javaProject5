package javaProject5;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollBar;
import java.awt.Font;

public class T04_Interaction extends JFrame {

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
					T04_Interaction frame = new T04_Interaction();
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
	public T04_Interaction() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 560);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel1 = new JPanel();
		panel1.setBounds(35, 67, 327, 52);
		panel1.setBackground(new Color(0, 128, 255));
		contentPane.add(panel1);
		panel1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("제품명/성분명");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(12, 10, 103, 32);
		panel1.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(96, 16, 116, 21);
		panel1.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("검 색");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			
			}
		});
		btnNewButton.setBounds(224, 15, 97, 23);
		panel1.add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(35, 117, 327, 267);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		JPanel panel1_1 = new JPanel();
		panel1_1.setLayout(null);
		panel1_1.setBackground(new Color(0, 128, 255));
		panel1_1.setBounds(521, 67, 327, 52);
		contentPane.add(panel1_1);
		
		JLabel lblNewLabel_1 = new JLabel("선택 목록(총 1건)");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(12, 10, 103, 32);
		panel1_1.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(132, 16, 80, 21);
		panel1_1.add(textField_1);
		
		JButton btnX = new JButton("전체 삭제 x");
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			
			}
		});
		btnX.setBounds(224, 15, 97, 23);
		panel1_1.add(btnX);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(521, 117, 327, 267);
		contentPane.add(scrollPane_1);
		
		JTextArea textArea_1 = new JTextArea();
		scrollPane_1.setViewportView(textArea_1);
		
		JButton btnSearch = new JButton("검 색");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			
			}
		});
		btnSearch.setBounds(396, 429, 97, 23);
		contentPane.add(btnSearch);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(0, 128, 255));
		panel.setBounds(-169, 0, 1053, 54);
		contentPane.add(panel);
		
		JLabel lblNewLabel_2 = new JLabel("의약품- 음식 상호 작용");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("굴림", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(168, 0, 413, 54);
		panel.add(lblNewLabel_2);
	}
}
