/*
 * ★CreateTableクラス今回使ってません★*
 * CreateTable.java

 * 【注意】
 * このProgramを実行する場合は、 database という名前のデータベースが事前に
 * 存在する必要がある。
 * また、その database に既に Table が存在すると Exception が発生するので
 * 全ての Table を DROP して消しておく必要がある。
 *
 * 【プログラムの追加】
 * ○ 毎回自分でテーブルを DROP しなくても良い方法があるので、その処理を 追加
 * ○ 新しいデータの追加

 * @author a-force
 */
package jp.co.aforce.database;

import jp.co.aforce.util.DBUtil;

public class CreateTable {

	// 商品マスタテーブル
	private static final String CSQL_login =
			"CREATE TABLE IF NOT EXISTS `login (" +
			"`username` varchar(10) NOT NULL" +
			"`password` varchar(10) NOT NULL" +
			") ENGINE=InnoDB DEFAULT CHARSET=utf8";

	// 商品マスタテーブルに登録するデータ
	private static final String ISQL_login =
	"INSERT INTO `login` (`username`, `password`) VALUES" +
			"('username', 'password')";



	public static void main(String[] args) {
		try {
			System.out.println("Connected Database");
			System.out.println("==================================================");
			DBUtil.makeConnection();
			DBUtil.makeStatement();

			// TODO Table を DROPする処理を追加

			// 商品マスタテーブルの作成
			System.out.println(CSQL_login);
			DBUtil.execute(CSQL_login);
			System.out.println(ISQL_login);
			DBUtil.execute(ISQL_login);


		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.closeConnection();
			System.out.println("==================================================");
			System.out.println("Closed Database");
		}
	}
}

