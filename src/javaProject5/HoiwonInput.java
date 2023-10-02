package javaProject5;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class HoiwonInput extends JFrame {
	private JPanel contentPane;
//	private JTextField txtName;
//	private JTextField txtAge;
//	private ButtonGroup buttonGroup = new ButtonGroup();
	private JButton btnInput;
	
	HoiwonDAO dao	=	new HoiwonDAO();
	HoiwonVO vo = null;
	
	int res = 0;
	private JTextField txtName;
	private JTextField txtId;
	private JTextField txtPwd;
	private JTextField txtpwd1;
	private JTextField txtphone;
	private JTextField txtemail;
	
	public HoiwonInput() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(6, 6, 6, 6));
		setLocationRelativeTo(null);
		
		setVisible(true);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 784, 61);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("회 원 가 입");
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 24));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 0, 784, 61);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 500, 784, 61);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		btnInput = new JButton("회 원 가 입");
		btnInput.setFont(new Font("굴림", Font.PLAIN, 18));
		btnInput.setBounds(216, 10, 389, 41);
		panel_1.add(btnInput);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 62, 784, 441);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("회원 정보 입력");
		lblNewLabel_1.setFont(new Font("굴림", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(12, 10, 784, 37);
		panel_2.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("성 명");
		lblNewLabel_2.setFont(new Font("굴림", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(221, 30, 70, 40);
		panel_2.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("아이디");
		lblNewLabel_3.setFont(new Font("굴림", Font.PLAIN, 18));
		lblNewLabel_3.setBounds(221, 79, 250, 40);
		panel_2.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("비 밀 번 호");
		lblNewLabel_3_1.setFont(new Font("굴림", Font.PLAIN, 18));
		lblNewLabel_3_1.setBounds(221, 142, 153, 36);
		panel_2.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("비 밀 번 호 확 인");
		lblNewLabel_3_1_1.setFont(new Font("굴림", Font.PLAIN, 18));
		lblNewLabel_3_1_1.setBounds(221, 206, 153, 36);
		panel_2.add(lblNewLabel_3_1_1);
		
		JLabel lblNewLabel_4 = new JLabel("휴 대 폰 번 호");
		lblNewLabel_4.setFont(new Font("굴림", Font.PLAIN, 18));
		lblNewLabel_4.setBounds(221, 272, 187, 36);
		panel_2.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("이 메 일");
		lblNewLabel_5.setFont(new Font("굴림", Font.PLAIN, 18));
		lblNewLabel_5.setBounds(221, 348, 154, 41);
		panel_2.add(lblNewLabel_5);
		
		txtName = new JTextField();
		txtName.setBounds(442, 41, 173, 21);
		panel_2.add(txtName);
		txtName.setColumns(10);
		
		txtId = new JTextField();
		txtId.setColumns(10);
		txtId.setBounds(442, 90, 173, 21);
		panel_2.add(txtId);
		
		txtPwd = new JTextField();
		txtPwd.setColumns(10);
		txtPwd.setBounds(442, 151, 173, 21);
		panel_2.add(txtPwd);
		
		txtpwd1 = new JTextField();
		txtpwd1.setColumns(10);
		txtpwd1.setBounds(442, 215, 173, 21);
		panel_2.add(txtpwd1);
		
		txtphone = new JTextField();
		txtphone.setColumns(10);
		txtphone.setBounds(442, 281, 173, 21);
		panel_2.add(txtphone);
		
		txtemail = new JTextField();
		txtemail.setColumns(10);
		txtemail.setBounds(442, 359, 173, 21);
		panel_2.add(txtemail);

		/*------------------------------------------------------------------*/
		
		// 회원가입
		btnInput.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = txtName.getText();
				String id = txtId.getText();
				String pwd = txtPwd.getText();
				String pwd1	=	txtpwd1.getText();
				String phone	=	txtphone.getText();
				String email	=	txtemail.getText();
				
				
				
				
			}
		});
	}
}