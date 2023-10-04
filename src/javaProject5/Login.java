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
public class Login extends JFrame {
	HoiwonDAO dao	=	new HoiwonDAO();	
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
					Login frame = new Login();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}	
		});	
	}


	/**
	 * Create the frame.
	 */
	public Login() {
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
		btnNewButton_1.setBounds(128, 162, 108, 23);
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_4 = new JButton("회 원 가 입");
		btnNewButton_4.setBounds(266, 162, 119, 23);
		panel_1.add(btnNewButton_4);
		
		/* ============================================== */
		
		
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// 아이디 비번 확인 테스트 코드
				String id	=	textMid.getText();
				String pw	=	textPwd.getText();
				
				// 아이디 찾기 비번 찾기  버튼을 눌렀을때 
				if(id.trim().equals("")) {
					JOptionPane.showMessageDialog(null, "아이디를 확인해주세요");
					txtMid.requestFocus();
				}
				
//				if(!Pattern.matches("^[0-9]*$", pw)) {
//					JOptionPane.showMessageDialog(null, "비밀번호 확인중?");
//					textPwd.requestFocus();
//				}
//				else {
//					//dao 아이디 비번 확인 하는 함수생성
//					//vo
//				}
				
					HoiwonVO vo = dao.getIdSearch(id);
					if(vo.getId() != null) {
						if(vo.getPw().equals(pw)) {
							dispose();
							String mId = vo.getId();
							new Main(mId);
						}
						else {
							JOptionPane.showMessageDialog(null, "비밀번호가 바르지 않습니다.");
						}
					}
					else JOptionPane.showMessageDialog(null, "존재하지 않는 아이디입니다"); 
					
//					if("DAO" == null) {
//						JOptionPane.showConfirmDialog(null, "회원 아이디 또는 비밀번호가 다릅니다.\r\n"
//								+ "다시 입력해주세요.\r\n"
//								+ "", "아이디 확인", JOptionPane.YES_NO_OPTION);
//					}
//					else {
//						//new 창 오픈 
//					}
				}
		});
		
		// 회원가입버튼클릭실행
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Membership();
			}
		});
	}
}
