package javaProject5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

public class HoiwonDAO {
	Connection conn	=	null;	
	PreparedStatement pstmt	=	null;
	ResultSet rs	=	null;
	
	String sql	=	"";	
	HoiwonVO vo	=	null;
	
 public  HoiwonDAO() {
	 String url = "jdbc:mysql://localhost:3306/javaProject5";
		String user = "root";
		String password = "1234";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, user, password);
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
 		} catch(SQLException e) {}
 	}

 // pstmtClose()
 public void pstmtClose() {
	 try {
		 if(pstmt != null) pstmt.close();
	 } catch (Exception e) {}
	 pstmtClose();
 }
 
 // rsClose()
 public void rsClose() {
	 try {
		 if(rs != null) rs.close();
	 } catch (Exception e) {}
	 pstmtClose();
 }
 
 // 회원명 검색(회원 중복 처리)
 public HoiwonVO getNameSearch(String name) {
	 vo	=	new HoiwonVO();
	 try {
		 sql	=	"select * from hoiwon where name = ?";
		 pstmt	=	conn.prepareStatement(sql);
		 pstmt.setString(1, name);
		 rs	=	pstmt.executeQuery();
	 	 
		 if(rs.next()) {	
			 vo.setIdx(rs.getInt("idx"));
			 vo.setId("id");
			 vo.setPw("pw");
			 vo.setPhonenumber(rs.getInt("phonenumber"));
			 vo.setAddress("address");
		 }
	 }	 catch (SQLException e) {
		 	 System.out.println("SQL 오류 : " + e.getMessage());
		 	 // e. printStackTrace();
 }		 finally {
	 		 rsClose();
 			}
	 		return vo;	
 		}

 			// 회원 가입 처리 
 			public int setHoiwonInput(HoiwonVO vo) {
 				int res = 0;
 				try {
 					sql	=	"insert into hoiwon values (default,?,?,?,?)";
 					pstmt	=	conn.prepareStatement(sql);
 					pstmt.setString(1, vo.getId());
 					pstmt.setString(2, vo.getPw());
 					pstmt.setInt(3, vo.getPhonenumber());
 					pstmt.setString(4, vo.getAddress());
 					res	=	pstmt.executeUpdate();
 				} catch (SQLException e) {
 					System.out.println("SQL 오류 : " + e.getMessage());
 				} finally {
 					pstmtClose();
 				}
 				return res;
 			}
			
 			// 회원 정보 수정 처리 
 			public int setHoiwonUpdate(HoiwonVO vo) {
 				int res = 0;
 				try {
 					sql	=	"update hoiwon set pw=?, phonenumber=?, address=? where id	= ";
 					pstmt.setString(1, vo.getId());
 					pstmt.setString(2, vo.getPw());
 					pstmt.setInt(3, vo.getPhonenumber());
 					pstmt.setString(4, vo.getAddress());
 					res	=	pstmt.executeUpdate();
 				} catch (SQLException e) {
 					System.out.println("SQL 오류 : " + e.getMessage());
 				} finally {
 					pstmtClose();
 				}
 				return res;
 			}

 			// 회원 삭제 처리
 			public int setHoiwonDelete(String id) {
 				int res = 0;
 				try {
					sql	=	"delete from Hoiwon where id = ?";
					pstmt	=	conn.prepareStatement(sql);
					pstmt.setString(1, id);
					res	=	pstmt.executeUpdate();
				} catch (SQLException e) {
					System.out.println("SQL 오류 : " + e.getMessage());
				} finally {
					
				}
				return res;
 			}


 			// 전체 리스트 가져오기 
 			@SuppressWarnings("rawtypes")
			public Vector getHoiwonList() {
 				Vector vData	=	new Vector<>();
 				try {
					sql	=	"select * from hoiwon order by idx desc";
					pstmt	=	conn.prepareStatement(sql);
					rs	=	pstmt.executeQuery();
					
					while(rs.next()) {
						Vector<Object> vo	=	new Vector<>();
						vo.add(rs.getInt("idx"));
						vo.add(rs.getString("id"));
						vo.add(rs.getString("pw"));
						vo.add(rs.getInt("phonenumber"));
						vo.add(rs.getInt("address"));
						
						vData.add(vo);
					}
				} catch (Exception e) {
					// TODO: handle exception
				}
 				
 				return vData;
 			}




}

