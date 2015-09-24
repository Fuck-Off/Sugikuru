<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<form action = "BillInsertServlet" method = "post">
			請求書ID<input type = "text" name = "bill_number"/><br/>
			請求先顧客名<input type = "text" name = "bill_customer"/><br/>
			商品名<input type = "text" name = "goods"/><br/>
			単価<input type = "text" name = "price"/><br/>
			個数<input type = "text" name = "kosuu"/><br/>
			<input type = "submit" value = "登録"/>
		</form>
	</body>
</html>