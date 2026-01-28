import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 * 雛形クラスです.<br>
 * これをコピーペーストして問題を解いて構いません。
 * 
 * @author igamasayuki
 */
public class Exam3{
	public static void main(String[] args) {
		// 接続情報
		String url = "jdbc:postgresql://localhost:5432/student";
		String user = "postgres";
		String password = "maki0123";

		Connection con = null; // 使用する変数の宣言
		PreparedStatement pstmt = null;
        ResultSet rs = null;
		String sql = null;

		try {
			// (1)データベースに接続
			con = DriverManager.getConnection(url, user, password);

			// (2)SQL文を作成
            //ON test_members.dep_id = test_deps.id
            sql = "SELECT id,name,age FROM test_members;";

			// (3)SQL実行準備
			pstmt = con.prepareStatement(sql);

			// (4)SQL実行
			// ※ここにSQL実行処理を書く
            rs = pstmt.executeQuery();

			// (5)結果の操作
			// ※ここに結果の操作処理を書く
            while(rs.next()){
                int id = rs.getInt("id");
				String name = rs.getString("name");
                int age = rs.getInt("age");
				System.out.println("id="+id+", name="+name+" age="+age);
			}

		} catch (SQLException ex) {
			System.err.println("SQL = " + sql);
			ex.printStackTrace();
		} finally {
			try {
				// (6) メモリの解放(切断)
				con.close();
			} catch (Exception ex) {}
		}
	}
}
