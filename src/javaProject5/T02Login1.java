package javaProject5;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")	
public class T02Login1 extends JFrame {

	private JPanel contentPane;
	private JTextField textMid;
	private JTextField textPwd;
	private JLabel txtMid;
	private JLabel txtPwd;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					T02Login1 frame = new T02Login1();
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
	public T02Login1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 128, 255));
		panel.setBounds(0, 0, 434, 34);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("로그인");
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 14));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(12, 10, 206, 24);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 33, 434, 228);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("아 이 디");
		lblNewLabel_1.setBounds(77, 68, 54, 36);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("비 밀 번 호");
		lblNewLabel_1_1.setBounds(77, 116, 67, 36);
		panel_1.add(lblNewLabel_1_1);
		
		textMid = new JTextField();
		textMid.setBounds(186, 76, 199, 21);
		panel_1.add(textMid);
		textMid.setColumns(10);
		
		textPwd = new JTextField();
		textPwd.setColumns(10);
		textPwd.setBounds(186, 124, 199, 21);
		panel_1.add(textPwd);
		

		JButton btnNewButton_1 = new JButton("로그인");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 아이디 비번 확인 테스트 코드
				String id	=	txtMid.getText();
				String pw	=	txtPwd.getText();
				
				
				// 아이디 찾기 비번 찾기  버튼을 눌렀을때 
			
				
				//text1
				//text2
			
				if(id.trim().equals("")) {
					JOptionPane.showConfirmDialog(null, "아이디 비번을 확인해주세요\r\n", "아이디 확인", JOptionPane.YES_NO_OPTION);
					txtMid.requestFocus();
				}
				
				if(!Pattern.matches("^[0-9]*$", pw)) {
					JOptionPane.showMessageDialog(null, "비밀번호 확인중?");
					txtPwd.requestFocus();
				}
				else {
					//dao 아이디 비번 확인 하는 함수생성
					//vo
					
					if("vo" == null) {
						JOptionPane.showConfirmDialog(null, "회원 아이디 또는 비밀번호가 다릅니다.\r\n"
								+ "다시 입력해주세요.\r\n"
								+ "", "아이디 확인", JOptionPane.YES_NO_OPTION);
					}
					else {
						//new 창 오픈 
					}
					
				}
					

				
			}
		});
		btnNewButton_1.setBounds(128, 162, 108, 23);
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("아이디 찾기");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				
				//new 아이디 찾는 페이지 
			}
		});
		btnNewButton_2.setBounds(128, 195, 108, 23);
		panel_1.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("비밀번호 찾기");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				
				//new 비번 찾는 페이지 
			}
		});
		btnNewButton_3.setBounds(266, 195, 119, 23);
		panel_1.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("회 원 가 입");
		btnNewButton_4.setBounds(266, 162, 119, 23);
		panel_1.add(btnNewButton_4);
		
		/* ============================================================== */
		
		// 로그인 버튼을 눌렀을 때
		btnNewButton_1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				String id = "txtMid"; 
				String password = "txtPwd";
				
			}
		});
		
		// 회원가입버튼클릭실행
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new HoiwonInput();
			}
		});
	}
		
}
