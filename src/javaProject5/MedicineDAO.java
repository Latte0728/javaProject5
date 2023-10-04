package javaProject5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

public class MedicineDAO {
	Connection conn	=	null;
	PreparedStatement pstmt	=	null;
	ResultSet rs	=	null;
	String sql = null;
	
	public MedicineDAO() {
		String url = "jdbc:mysql://localhost:3306/javaProject5";
		String user	=	"root";
		String pw	=	"1234";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url	, user, pw);
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버검색 실패~~~");
		} catch (SQLException e) {
			System.out.println("데이터베이스 연결 실패~~");
			e.printStackTrace();
		
		}
	}
	// connClose()
	public void connClose() {
		try {
			conn.close();
		} catch (SQLException e) {}
	}
	
	// pstmtClose()
	public void pstmtClose() {
		try {
			if(pstmt != null) pstmt.close();
		} catch (Exception e) {}
	}
	
	// rsClose()
	public void rsClose() {
		try {
			if(rs != null) rs.close();
			pstmtClose();
		} catch (Exception e) {}
	}
	
	public Vector<Vector<Object>> getMedicine() {
		System.out.println(0);
		Vector<Vector<Object>> vos = new Vector<Vector<Object>>();
		
		System.out.println(1);
		try {
			sql = "select * from medicine";
			pstmt	=	conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			System.out.println(2);
			
			while(rs.next()) {
				System.out.println(3);
				Vector vo = new Vector();
				vo.add(rs.getString("name"));
				vo.add(rs.getString("element"));
				vo.add(rs.getString("company"));
				vo.add(rs.getString("effect"));
				vos.add(vo);
			}
		} catch (SQLException e) {
			System.out.println("SQL 구문 오류 " + e.getMessage());
		} finally {
			rsClose();
		}
		return vos;
	}
}
