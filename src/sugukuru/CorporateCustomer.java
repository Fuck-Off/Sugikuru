package sugukuru;

public class CorporateCustomer {
	
	private String corporateCustomer_id;
	private String corporation_name;
	private String corporation_kana;
	private String representative_name;
	private String representative_kana;
	private String user_name;
	private String user_kana;
	private String postal_code;
	private String address;
	private String tel_number;
	private String fax_number;
	private String password;
	private String bank_account;
	
	public CorporateCustomer(
			String corporateCustomer_id,
			String corporation_name, 
			String corporation_kana,
			String representative_name, 
			String representative_kana,
			String user_name,
			String user_kana,
			String postal_code,
			String address,
			String tel_number,
			String fax_number,
			String password,
			String bank_account){
		super();
		this.corporateCustomer_id = corporateCustomer_id;
		this.corporation_name = corporation_name;
		this.corporation_kana = corporation_kana;
		this.representative_name = representative_name;
		this.representative_kana = representative_kana;
		this.user_name = user_name;
		this.user_kana = user_kana;
		this.postal_code = postal_code;
		this.address = address;
		this.tel_number = tel_number;
		this.fax_number = fax_number;
		this.password = password;
		this.bank_account = bank_account;
	}
	
	public CorporateCustomer(String corporateCustomer_id,
			String corporation_name, String corporation_kana,
			String representative_name, String representative_kana,
			String user_name, String user_kana, String postal_code,
			String address, String tel_number, String fax_number) {
		super();
		this.corporateCustomer_id = corporateCustomer_id;
		this.corporation_name = corporation_name;
		this.corporation_kana = corporation_kana;
		this.representative_name = representative_name;
		this.representative_kana = representative_kana;
		this.user_name = user_name;
		this.user_kana = user_kana;
		this.postal_code = postal_code;
		this.address = address;
		this.tel_number = tel_number;
		this.fax_number = fax_number;
	}




	public String getCorporateCustomer_id() {
		return corporateCustomer_id;
	}

	public void setCorporateCustomer_id(String corporateCustomer_id) {
		this.corporateCustomer_id = corporateCustomer_id;
	}

	public String getCorporation_name() {
		return corporation_name;
	}

	public void setCorporation_name(String corporation_name) {
		this.corporation_name = corporation_name;
	}

	public String getCorporation_kana() {
		return corporation_kana;
	}

	public void setCorporation_kana(String corporation_kana) {
		this.corporation_kana = corporation_kana;
	}

	public String getRepresentative_name() {
		return representative_name;
	}

	public void setRepresentative_name(String representative_name) {
		this.representative_name = representative_name;
	}

	public String getRepresentative_kana() {
		return representative_kana;
	}

	public void setRepresentative_kana(String representative_kana) {
		this.representative_kana = representative_kana;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getUser_kana() {
		return user_kana;
	}

	public void setUser_kana(String user_kana) {
		this.user_kana = user_kana;
	}

	public String getPostal_code() {
		return postal_code;
	}

	public void setPostal_code(String postal_code) {
		this.postal_code = postal_code;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTel_number() {
		return tel_number;
	}

	public void setTel_number(String tel_number) {
		this.tel_number = tel_number;
	}

	public String getFax_number() {
		return fax_number;
	}

	public void setFax_number(String fax_number) {
		this.fax_number = fax_number;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getBank_account() {
		return bank_account;
	}

	public void setBank_account(String bank_account) {
		this.bank_account = bank_account;
	}
	
}
