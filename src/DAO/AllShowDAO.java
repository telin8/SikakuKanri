package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import DTO.SikakuDTO;

public class AllShowDAO {

	public static ArrayList<SikakuDTO> SikakuAllShow(){

		ArrayList<SikakuDTO> AList = new ArrayList<SikakuDTO>();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/sikaku?useSSL=false",
					"root",
					"pkp12345");

			String sql = "Select * from Sikaku;";

			pstmt = con.prepareStatement(sql);

			rs = pstmt.executeQuery();

			while(rs.next()){
				int sikakuId = rs.getInt("sikakuId");
				String sikakuName = rs.getString("sikakuName");
				String examDate = rs.getString("examDate");
				String sof = rs.getString("sof");
				SikakuDTO dis = new SikakuDTO(sikakuId, sikakuName, examDate, sof);
				AList.add(dis);
			}

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
				System.out.println("DB切断時にエラーが発生しました。");
				e.printStackTrace();
			}
		}
		return AList;
	}

}
