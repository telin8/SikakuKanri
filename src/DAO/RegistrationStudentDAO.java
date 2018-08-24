package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import DTO.SikakuDTO;

public class RegistrationStudentDAO {

	public static SikakuDTO RegistrationStudent(int studentId, String studentName, int studentAge, String studentGender){

		SikakuDTO result = null;

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/sikaku?useSSL=false",
					"root",
					"pkp12345");

			String sql = "insert into students values(?, ?, ?, ?);";

			pstmt = con.prepareStatement(sql);

			pstmt.setInt(1, studentId);
			pstmt.setString(2, studentName);
			pstmt.setInt(3, studentAge);
			pstmt.setString(4, studentGender);

			pstmt.executeUpdate();

		} catch (SQLException e){
			System.out.println("DBアクセスに失敗しました。");
			e.printStackTrace();
		} catch (Exception e){
			System.out.println("数字を指定してください。");
		} finally {
			try {
				if( rs != null){
					rs.close();
				}
			} catch(SQLException e){
				System.out.println("DB切断時にエラーが発生しました。");
				e.printStackTrace();
			}
			try {
				if( pstmt != null){
					pstmt.close();
				}
			} catch(SQLException e){
				System.out.println("DB切断時にエラーが発生しました。");
				e.printStackTrace();
			}

			try {
				if( con != null){
					con.close();
				}
			} catch (SQLException e){
				System.out.println("DB切断時にエラーが発生しました。。");
				e.printStackTrace();
			}
		}
		return result;
	}

}
