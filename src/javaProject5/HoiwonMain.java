package javaProject5;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;



@SuppressWarnings("serial")
public class HoiwonMain extends JFrame{
	public HoiwonMain() {
		getContentPane().setLayout(null);
	}

	private JPanel contentPane;
	private JButton btnInput, btnSearch, btnList, btnExit;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HoiwonMain frame	=	new HoiwonMain();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}	
			
	
	}

