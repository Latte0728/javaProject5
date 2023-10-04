package javaProject5;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

@SuppressWarnings("serial")
public class Main extends JFrame {
	HoiwonVO voH;
	HoiwonDAO daoH;
	MedicineDAO daoM = new MedicineDAO();
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTable table;

	String mId;
	
	public Main(String mId) {
		this.mId = mId;
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 560);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(0, 128, 255));
		panel.setBounds(0, 0, 884, 54);
		contentPane.add(panel);
		
		JLabel lblNewLabel_2 = new JLabel("의약품 상세 검색");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("굴림", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(0, 0, 413, 54);
		panel.add(lblNewLabel_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 54, 884, 199);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("약물 정보 입력");
		lblNewLabel_1.setBounds(0, 10, 128, 36);
		lblNewLabel_1.setForeground(new Color(0, 0, 255));
		lblNewLabel_1.setFont(new Font("굴림", Font.PLAIN, 16));
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("제 품 명");
		lblNewLabel.setBounds(22, 60, 106, 43);
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 15));
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_3 = new JLabel("성 분 명");
		lblNewLabel_3.setBounds(22, 102, 106, 43);
		lblNewLabel_3.setFont(new Font("굴림", Font.PLAIN, 15));
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("회 사 명");
		lblNewLabel_4.setBounds(492, 60, 106, 43);
		lblNewLabel_4.setFont(new Font("굴림", Font.PLAIN, 15));
		panel_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("효능 및 효과");
		lblNewLabel_4_1.setBounds(492, 102, 106, 43);
		lblNewLabel_4_1.setFont(new Font("굴림", Font.PLAIN, 15));
		panel_1.add(lblNewLabel_4_1);
		
		textField = new JTextField();
		textField.setBounds(140, 71, 200, 21);
		panel_1.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(140, 113, 200, 21);
		textField_1.setColumns(10);
		panel_1.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(656, 71, 200, 21);
		textField_2.setColumns(10);
		panel_1.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setBounds(656, 113, 200, 21);
		textField_3.setColumns(10);
		panel_1.add(textField_3);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 255, 884, 214);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		/* 약품 목록 출력 */
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 884, 214);
		panel_2.add(scrollPane);
		
		Vector fieldName = new Vector<>();
		fieldName.add("제품명");
		fieldName.add("성분명");
		fieldName.add("회사명");
		fieldName.add("효과");
		
		Vector<Vector<Object>> cell = new Vector<Vector<Object>>();
		cell = daoM.getMedicine();
		DefaultTableModel dtm = new DefaultTableModel(cell, fieldName);
		
		table = new JTable(dtm);
		scrollPane.setViewportView(table);
		/* =========================================== */
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(0, 468, 884, 53);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JButton btnSearch = new JButton("검 색");
		btnSearch.setBounds(753, 6, 119, 31);
		panel_3.add(btnSearch);
		
		JButton btnNewButton = new JButton("회원정보수정");
		btnNewButton.setBounds(30, 5, 137, 33);
		panel_3.add(btnNewButton);
		
		
		/* ===================================================== */
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.out.println(mId);
				daoH = new HoiwonDAO();
				voH = daoH.getIdSearch(mId);
				System.out.println("vo = " + voH);
				new EditMembership(voH, mId);
				dispose();
			}
		});
		
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
	}
}
