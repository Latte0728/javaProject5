package javaProject5;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EditMembership extends JFrame {
	HoiwonVO voH;
	HoiwonDAO daoH = new HoiwonDAO();

	private JPanel contentPane;
	private JTextField textName;
	private JTextField textPassword;
	private JTextField textPhone;
	private JTextField textAddress;
	
	String mId;
	
	public EditMembership(HoiwonVO vo, String mId) {
		this.mId = mId;
		
		setTitle("회원정보수정");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setVisible(true);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(12, 10, 410, 46);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("회원 정보 수정");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(78, 10, 241, 26);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(12, 66, 410, 185);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		textName = new JTextField();
		textName.setBounds(87, 10, 116, 40);
		textName.setText(vo.getName());
		panel_1.add(textName);
		textName.setColumns(10);
		
		textPassword = new JTextField();
		textPassword.setColumns(10);
		textPassword.setBounds(87, 60, 116, 40);
		textPassword.setText(vo.getPw());
		panel_1.add(textPassword);
		
		textPhone = new JTextField();
		textPhone.setColumns(10);
		textPhone.setBounds(282, 10, 116, 40);
		textPhone.setText(vo.getPhonenumber());
		panel_1.add(textPhone);
		
		textAddress = new JTextField();
		textAddress.setColumns(10);
		textAddress.setBounds(282, 60, 116, 40);
		textAddress.setText(vo.getAddress());
		panel_1.add(textAddress);
		
		JLabel lblNewLabel_1 = new JLabel("이름");
		lblNewLabel_1.setBounds(23, 9, 63, 40);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("비밀번호");
		lblNewLabel_1_1.setBounds(23, 59, 63, 40);
		panel_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("전화번호");
		lblNewLabel_1_1_1.setBounds(215, 10, 63, 40);
		panel_1.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("주소");
		lblNewLabel_1_2.setBounds(215, 60, 63, 40);
		panel_1.add(lblNewLabel_1_2);
		
		JButton btnNewButton = new JButton("회원정보수정");
		btnNewButton.setBounds(23, 125, 116, 40);
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("회원탈퇴");
		btnNewButton_1.setBounds(154, 125, 116, 40);
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("취소하기");
		btnNewButton_1_1.setBounds(282, 125, 116, 40);
		panel_1.add(btnNewButton_1_1);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				voH = new HoiwonVO();
				voH.setName(textName.getText());
				voH.setPw(textPassword.getText());
				voH.setPhonenumber(textPhone.getText());
				voH.setAddress(textAddress.getText());
				voH.setId(mId);
				int res = daoH.setHoiwonUpdate(voH);
				if(res == 1) {
					JOptionPane.showMessageDialog(null, "정보변경 성공. ");
				} else {
					JOptionPane.showMessageDialog(null, "정보변경 실패. ");
				}
			}
		});
		
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int res = daoH.setHoiwonDelete(mId);
				if(res == 1) {
					JOptionPane.showMessageDialog(null, "회원삭제 성공. ");
				} else {
					JOptionPane.showMessageDialog(null, "회원삭제 실패. ");
				}
			}
		});
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
	}
});
	}
}
