<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<form action = "CorporateCustomerInsertServlet" method = "Post">
			法人顧客ID<input type = "text" name = "corporateCustomer_id"/><br/>
			法人会社名<input type = "text" name = "corporation_name"/><br/>
			法人会社名（カナ）<input type = "text" name = "corporation_kana"/><br/>
			代表者氏名<input type = "text" name = "representative_name"/><br/>
			代表者氏名（カナ）<input type = "text" name = "representative_kana"/><br/>
			申請者指名<input type = "text" name = "user_name"/><br/>
			申請者指名（カナ）<input type = "text" name = "user_kana"/><br/>
			郵便番号<input type = "text" name = "postal_code"/><br/>
			住所<input type = "text" name = "address"/><br/>
			電話番号<input type = "text" name = "tel_number"/><br/>
			FAX番号<input type = "text" name = "fax_number"/><br/>
			パスワード<input type = "text" name = "password"/><br/>
			郵便口座番号<input type = "text" name = "bank_account"/><br/>
			<input type = "submit" value = "登録"/> 
		</form>
		
		<br/>
		<% 
		String msg = "";
		if(request.getAttribute("msg") != null){
			msg = (String)request.getAttribute("msg");
			out.println("<p>" + msg + "</p>");
		}
		%>
	</body>
</html>