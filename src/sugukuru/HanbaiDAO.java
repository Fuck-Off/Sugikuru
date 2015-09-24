package sugukuru;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class HanbaiDAO {
	//コンストラクタ
	public HanbaiDAO(){
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");	
		}
		catch(ClassNotFoundException e){
			e.printStackTrace();
		}
	}
	
	/**
	 * コネクション作成メソッド
	 * @return 自分のオラクル情報
	 * @throws SQLException
	 */
	public Connection getConnection() throws SQLException{
		//�ڑ��N���X�̎擾
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@tstdsv03:1521:orcl3","ora133","ora133");
		return con;
	}
	
	public ArrayList<CorporateCustomer> selectCompanyInfo() {
		ArrayList<CorporateCustomer> arrayList = new ArrayList<CorporateCustomer>();
		try 
		(
			Connection con = getConnection();
			//idを自社のモノにセット
			PreparedStatement ps = con.prepareStatement("select * from CorporateCustomer where corporatecustomer_id = 1 order by corporatecustomer_id");
		){
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				String corporatecustomer_id = rs.getString("CorporateCustomer_id");
				String corporation_name = rs.getString("Corporation_name");
				String corporation_kana = rs.getString("Corporation_kana");
				String representative_name = rs.getString("Representative_name");
				String representative_kana = rs.getString("Representative_kana");
				String user_name = rs.getString("User_name");
				String user_kana = rs.getString("User_kana");
				String postal_code = rs.getString("Postal_code");
				String address = rs.getString("address");
				String tel_number = rs.getString("tel_number");
				String fax_number = rs.getString("fax_number");
				//arrayList上記の値をセット
				arrayList.add(new CorporateCustomer(corporatecustomer_id, corporation_name, corporation_kana, representative_name, representative_kana, user_name, user_kana, postal_code, address, tel_number, fax_number));
			}
		} 
		catch (Exception e) 
		{
			// TODO: handle exception
			e.printStackTrace();
		}
		return arrayList;
	}
	
	//法人顧客情報のインサート処理
	public String insertCorporateCustomer(CorporateCustomer cc)
	{
		String msg = "登録しました";
		try(
				//�ڑ��N���X�̎擾
				Connection con = getConnection();
				//SQL���s�N���X�̎擾
				PreparedStatement ps = con.prepareStatement("insert into CorporateCustomer values(?,?,?,?,?,?,?,?,?,?,?,?,?)");
			){
			ps.setString(1, cc.getCorporateCustomer_id());
			ps.setString(2, cc.getCorporation_name());
			ps.setString(3, cc.getCorporation_kana());
			ps.setString(4, cc.getRepresentative_name());
			ps.setString(5, cc.getRepresentative_kana());
			ps.setString(6, cc.getUser_name());
			ps.setString(7, cc.getUser_name());
			ps.setString(8, cc.getPostal_code());
			ps.setString(9, cc.getAddress());
			ps.setString(10, cc.getTel_number());
			ps.setString(11, cc.getFax_number());
			ps.setString(12, cc.getPassword());
			ps.setString(13, cc.getBank_account());
			//SQL処理
			ps.executeUpdate();
			return msg;
			}
		catch(SQLException e)
		{
			e.printStackTrace();
			msg="失敗しました";
			return msg ;
		}
	}
	
	
	public String insertBill(Bill b) {
		String msg = "登録しました";
		try(
			Connection con = getConnection();
			PreparedStatement ps = con.prepareStatement("insert into CorporateCustomer values(?,?,?,?,?,?,?)");
		)
		{
			ps.setString(1, b.getBill_number());
			ps.setString(2, b.getBill_customer());
			ps.setString(3, b.getCompany_info());
			ps.setString(4, b.getGoods());
			ps.setInt(5, b.getPrice());
			ps.setInt(6, b.getKosuu());
			ps.setString(7, b.getH_date());
			ps.executeUpdate();
			return msg;
		}
		catch(SQLException e)
		{
			e.printStackTrace();
			msg = "失敗しました";
			return msg;
		}
	}
}
