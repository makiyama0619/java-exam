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
            sql = "SELECT a.id, a.neme, a.age, b.name AS dep_name FROM test_members AS a INNER JOIN test_departmet AS b ON a.dep_id = b.id";
			//構文・SELECT カラム名 FROM テーブルA　INNER JOIN テーブルB ON テーブルA.結合するカラム名　= テーブルB.結合するカラム名
			//SELECT ~ FROM test_members AS a INNER JOIN test_departmet AS b ON a.dep_id = b.id
			//SELECT a.id a.neme a.age b.name AS dep_name(別名をつけて、get×××メソッドで別名を指定できるようにする)FROM test_members AS a INNER JOIN test_departmet AS b ON a.dep_id = b.id
			//※ONは二つのテーブルの結合部にあたるカラムを指定する
			//二つのカラムの値が同じレコード同士が結合される 

			// (3)SQL実行準備
			pstmt = con.prepareStatement(sql);

			// (4)SQL実行
			// ※ここにSQL実行処理を書く
            rs = pstmt.executeQuery();

			// (5)結果の操作
			// ※ここに結果の操作処理を書く
            while(rs.next()){
				//int id = rs.getInt("id");a.id=test_members.id;
				//String name = rs.getString("name");a.name = test_members.name;
                //int age = rs.getInt("age");a.age = test_members.age;
				//dep_name = rs.getString("dep_name"); dep_name = b.name = test_department.name;
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
