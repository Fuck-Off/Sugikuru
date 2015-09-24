package sugukuru;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class BillInsertServlet
 */
@WebServlet("/BillInsertServlet")
public class BillInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//requestの文字コード設定
		request.setCharacterEncoding("utf-8");
		//フラグ用オブジェクト
		boolean err = false;
		//エラーメッセージ用オブジェクト
		String msg = "";
		
		//BillInsert.jspページからのパラメータを取得
		String bill_number = (String)request.getParameter("bill_number");
		String bill_customer = (String)request.getParameter("bill_customer");
		String goods = (String)request.getParameter("goods");
		int price = Integer.parseInt(request.getParameter("price"));
		int kosuu = Integer.parseInt(request.getParameter("kosuu"));
		
		//見積作成時の時刻取得
		Calendar c = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyymmdd");
		String h_date = sdf.format(c.getTime());
		
		//自社データを法人顧客テーブルから取得
		ArrayList<CorporateCustomer> array = new HanbaiDAO().selectCompanyInfo();
		StringBuilder stringBuilder = new StringBuilder();
		
		//ArrayListの中身をすべて結合する
		for(int i = 0; i < array.size(); i++){
			stringBuilder.append(array.get(i));
		}
		
		//結合したものをStringにキャストしてcampany_infoに代入
		String company_info = stringBuilder.toString();
		
		//数値のエラー判定
		if(request.getParameter("price") == "" 
				|| request.getParameter("price") == null){
			err = true;
			msg = "数値を入力してください";
		}
		
		//Beanオブジェクトのインスタンス化
		//引数11コ
		Bill b = new Bill(bill_number, bill_customer, company_info, goods, price, kosuu, h_date);
		
		HanbaiDAO dao = new HanbaiDAO();
		
		if(err == false){
			msg = dao.insertBill(b);
			//メッセージをリクエストにセット
			request.setAttribute("msg", msg);
			request.setAttribute("bill",b);
			//リクエストをBillInsert.jspページにフォワード
			request.getRequestDispatcher("BillInsert.jsp").forward(request, response);
		}
	}
}
