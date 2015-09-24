package sugukuru;

public class Bill {
	//メンバ変数
	private String bill_number;
	private String bill_customer;
	private String company_info;
	private String goods;
	private int price;
	private int kosuu;
	private String h_date;
	//コンストラクタ
	public Bill(String bill_number, String bill_customer, String company_info,
			String goods, int price, int kosuu, String h_date) {
		super();
		this.bill_number = bill_number;
		this.bill_customer = bill_customer;
		this.company_info = company_info;
		this.goods = goods;
		this.price = price;
		this.kosuu = kosuu;
		this.h_date = h_date;
	}
	//ゲッター＆セッター
	public String getBill_number() {
		return bill_number;
	}
	public void setBill_number(String bill_number) {
		this.bill_number = bill_number;
	}
	public String getBill_customer() {
		return bill_customer;
	}
	public void setBill_customer(String bill_customer) {
		this.bill_customer = bill_customer;
	}
	public String getCompany_info() {
		return company_info;
	}
	public void setCompany_info(String company_info) {
		this.company_info = company_info;
	}
	public String getGoods() {
		return goods;
	}
	public void setGoods(String goods) {
		this.goods = goods;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getKosuu() {
		return kosuu;
	}
	public void setKosuu(int kosuu) {
		this.kosuu = kosuu;
	}
	public String getH_date() {
		return h_date;
	}
	public void setH_date(String h_date) {
		this.h_date = h_date;
	}
	
	
	
}
