package javaProject5;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

@SuppressWarnings("serial")
public class T01 extends JFrame { // JFrame이 현재 extends되어 있으므로 Adaptor는 상속 불가

	private JPanel contentPane;
	private JTextField txtMid, txtName, txtSosok;
	private JButton btnInput, btnReset, btnClose;
	private JPasswordField txtPwd;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			// invokeLater : 전달된 Runnable 객체가 event dispatch theread에서 실행되도록 큐에 넣고 곧바로 리턴(비동기적)
			public void run() {
				try {
					T01 frame = new T01();
					frame.setVisible(true); // 'b'에 의해 컴퍼넌트 표시 or 비표시 설정, 기본적으로 화면에 안보이게 설정했기 때문에 반드시 setVisible(true)값으로 설정해야 화면상에 보여짐
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public T01() {
		setTitle("스윙연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 사용자가 이 프레임의 오른쪽 상단의 x 버튼을 클릭하여 메인프레임을 닫을 때, 프로그램 또한 안정적으로 종료 (위 코드를 사용하지 않고 우측 상단에 x 클릭시 우리 눈에는 닫힌 것처럼 보이지만 실제로는 JVM 메모리에 남아 프로세스가 가동중인 상태, 메모리 과부하 방지) 
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel(); // ContentPane :   일반적인 컴포넌트(ex : button) 들을 가질 수 있는 패널
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5)); //setBorder : 사용자가 여백을 주고 싶을 때 사용하는 코드 , JLable이나 JButton등 판넬에도 사용 가능, 다만 JFrame에는 사용 불가능

		setContentPane(contentPane);
		contentPane.setLayout(null); // Layout : 컴포넌트들의 위치를 자동으로 지정 , setLayout(null) :// 배치관리자 설정 안함 - 절대 위치 사용
		
		JLabel lblNewLabel = new JLabel("회 원 가 입 창");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER); //setHorizontalAlignment :가운데로 정렬할 때 작성 , JLabel은 보통 왼쪽 정렬됨
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel.setBounds(77, 1, 591, 51);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("아 이 디");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("굴림", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(103, 137, 120, 40);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("비 밀 번 호 확 인");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("굴림", Font.PLAIN, 18));
		lblNewLabel_1_1.setBounds(103, 270, 150, 40);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("핸드폰 번호");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setFont(new Font("굴림", Font.PLAIN, 18));
		lblNewLabel_1_2.setBounds(103, 320, 120, 40);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("이메일");
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3.setFont(new Font("굴림", Font.PLAIN, 18));
		lblNewLabel_1_3.setBounds(103, 399, 120, 40);
		contentPane.add(lblNewLabel_1_3);
		
		txtMid = new JTextField();
		txtMid.setFont(new Font("굴림", Font.PLAIN, 18));
		txtMid.setBounds(277, 208, 313, 40);
		contentPane.add(txtMid); //add txtmid : txtmid 추가 
		txtMid.setColumns(10);
		
		txtName = new JTextField();
		txtName.setFont(new Font("굴림", Font.PLAIN, 18));
		txtName.setColumns(10);
		txtName.setBounds(277, 320, 313, 40);
		contentPane.add(txtName);
		
		txtSosok = new JTextField();
		txtSosok.setFont(new Font("굴림", Font.PLAIN, 18)); // Font : 글자 크기 지정 
		txtSosok.setColumns(10);
		txtSosok.setBounds(277, 399, 313, 40);	// Bounds : 컴포넌트(예 : 버튼 등) 를 배치할 때 사용되는 메소드 
		contentPane.add(txtSosok);
		
		// 회원가입버튼												
		btnInput = new JButton("회원가입"); // Action 타입의 Event e는 인터페이스인 ActionListener만 가짐, 컴포넌트 : Button, List, TextField, Menu, MenuItem, CheckboxMenuItem, PopupMenu , 컴포넌트에 행위 추가 , 컴포넌트에 이벤트 처리 객체를 등록
		btnInput.addActionListener(new ActionListener() { // Action : 마우스 클릭이나 키보드의 엔터 키를 누르거나 메뉴에서 아이템(List나 Choice 등과 같이 아이템을 가지는 객체의 선택된 아이템에 변화가 있을 때)을 선택했을 때 이벤트 수행 
		private JLabel txtPhonenumber;

		// ActionListener 인터페이스 : 액션 이벤트를 받기 위한 Listener 인터페이스
			
			public void actionPerformed(ActionEvent e) { // 추상 메소드 actionPerformed : Action이 발생하면 호출됨 // 대상_객체.addActionListener(Event_구현_객체)
				String str = "";
				str += "아이디 : " + txtMid.getText() + "\n";
				str += "비밀번호 : " + txtPwd.getText() + "\n";
				str += "성 명 : " + txtName.getText() + "\n";
				str += "핸드폰 번호 : " + txtPhonenumber.getText();
				
				
				JOptionPane.showMessageDialog(null, str);
			}
		});
		btnInput.setFont(new Font("굴림", Font.PLAIN, 18));
		btnInput.setBounds(103, 488, 150, 40);
		contentPane.add(btnInput);
		
		// 리셋버튼
		btnReset = new JButton("다시입력");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtMid.setText("");
				txtPwd.setText("");
				txtName.setText("");
				txtSosok.setText("");
			}
		});
		btnReset.setFont(new Font("굴림", Font.PLAIN, 18));
		btnReset.setBounds(336, 488, 150, 40);
		contentPane.add(btnReset);
		
		
		// 창닫기 버튼
		btnClose = new JButton("창닫기");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnClose.setFont(new Font("굴림", Font.PLAIN, 18));
		btnClose.setBounds(548, 488, 150, 40);
		contentPane.add(btnClose);
		
		txtPwd = new JPasswordField();
		txtPwd.setFont(new Font("굴림", Font.PLAIN, 18));
		txtPwd.setBounds(277, 270, 313, 40);
		contentPane.add(txtPwd);
		
		JLabel lblNewLabel_1_4 = new JLabel("성 명");
		lblNewLabel_1_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_4.setFont(new Font("굴림", Font.PLAIN, 18));
		lblNewLabel_1_4.setBounds(103, 62, 120, 40);
		contentPane.add(lblNewLabel_1_4);
		
		textField = new JTextField();
		textField.setFont(new Font("굴림", Font.PLAIN, 18));
		textField.setColumns(10);
		textField.setBounds(277, 62, 313, 40);
		contentPane.add(textField);
		
		JLabel lblNewLabel_1_5 = new JLabel("비 밀 번 호");
		lblNewLabel_1_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_5.setFont(new Font("굴림", Font.PLAIN, 18));
		lblNewLabel_1_5.setBounds(103, 208, 120, 40);
		contentPane.add(lblNewLabel_1_5);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("굴림", Font.PLAIN, 18));
		textField_1.setColumns(10);
		textField_1.setBounds(277, 137, 313, 40);
		contentPane.add(textField_1);
	}
}
