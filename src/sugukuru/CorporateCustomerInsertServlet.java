package sugukuru;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CorporateCustomerInsertServlet
 */
@WebServlet("/CorporateCustomerInsertServlet")
public class CorporateCustomerInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		boolean err = false;
		String msg = "";
		
		String corporateCustomer_id = request.getParameter("corporateCustomer_id");
		String corporation_name = request.getParameter("corporation_name");
		String corporation_kana = request.getParameter("corporation_kana");
		String representative_name = request.getParameter("representative_name");
		String representative_kana = request.getParameter("representative_kana");
		String user_name = request.getParameter("user_name");
		String user_kana = request.getParameter("user_kana");
		String postal_code = request.getParameter("postal_code");
		String address =request.getParameter("address");
		String tel_number = request.getParameter("tel_number");
		String fax_number = request.getParameter("fax_number");
		String password = request.getParameter("password");
		String bank_account = request.getParameter("bank_account");

		if (
				request.getParameter("corporateCustomer_id") == ""
				|| request.getParameter("corporation_name") == ""
				|| request.getParameter("corporation_kana") == ""
				|| request.getParameter("representative_name") == ""
				|| request.getParameter("representative_kana") == ""
				|| request.getParameter("user_name") == ""
				|| request.getParameter("user_kana") == ""
				|| request.getParameter("postal_code") == ""
				|| request.getParameter("address") == ""
				|| request.getParameter("tel_number") == ""
				|| request.getParameter("fax_number") == ""
				|| request.getParameter("password") == ""
				|| request.getParameter("bank_account") == ""
				){
			err = true;
			msg = "項目はすべて入力してください";
		}
		
		CorporateCustomer cc = new CorporateCustomer(
				corporateCustomer_id,
				corporation_name,
				corporation_kana,
				representative_name,
				representative_kana,
				user_name,
				user_kana,
				postal_code,
				address,
				tel_number,
				fax_number,
				password,
				bank_account
				);
		
		//daoのインスタンス化
		HanbaiDAO dao = new HanbaiDAO();
		
		if(err == false){
			//insert処理
			msg = dao.insertCorporateCustomer(cc);
			request.setAttribute("msg", msg);
			RequestDispatcher disp = request.getRequestDispatcher("CorporateCustomerInsert.jsp");
			disp.forward(request,response);
		}
		else{
			request.setAttribute("msg", msg);
			RequestDispatcher disp = request.getRequestDispatcher("CorporateCustomerInsert.jsp");
			disp.forward(request,response);
		}
		
	}
}
