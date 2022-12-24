
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Main")
public class Main extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public Main() {
	    super();
	}
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Test</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>");
		out.println("Hello World");
		out.println("</h1>");
		out.println("<p>");
		out.println("You can write some messages here!!");
		out.println("</p>");
		
		out.println("</body>");
		out.println("</html>");
		
		out.flush();
		out.close();
	}
	Keyword A1 = new Keyword("手機",1);
	Keyword A2 = new Keyword("筆電",1);
	Keyword A3 = new Keyword("桌上型電腦",1);
	Keyword A4 = new Keyword("智慧手錶",1);
	Keyword A5 = new Keyword("平板電腦",1);
	Keyword A6 = new Keyword("耳機",1);
	Keyword B1 = new Keyword("Apple",0.8);
	Keyword B2 = new Keyword("Asus",0.8);
	Keyword B3 = new Keyword("小米",0.8);
	Keyword B4 = new Keyword("Samsung",0.8);
	Keyword B5 = new Keyword("Acer",0.8);
	Keyword B6 = new Keyword("Oppo",0.8);
	Keyword B7 = new Keyword("Sony",0.8);
	Keyword C1 = new Keyword("Iphone",0.6);
	Keyword C2 = new Keyword("Macbook",0.6);
	Keyword C3 = new Keyword("iPad",0.6);
	Keyword C4 = new Keyword("Airpods",0.6);
	Keyword C5 = new Keyword("Zenphone",0.6);
	Keyword C6 = new Keyword("Zenbook",0.6);
	Keyword C7 = new Keyword("Vivobook",0.6);
	Keyword C8 = new Keyword("Note",0.6);
	Keyword C9 = new Keyword("Galaxy",0.6);
	Keyword C10 = new Keyword("Aspire",0.6);
	Keyword C11 = new Keyword("Swift",0.6);
	Keyword C12 = new Keyword("Reno",0.6);
	Keyword C13 = new Keyword("Xperia",0.6);
	Keyword D1 = new Keyword("使用說明書",0.4);
	Keyword D2 = new Keyword("型號",0.4);
	Keyword D3 = new Keyword("規格",0.4);
	Keyword D4 = new Keyword("尺寸",0.4);

	
	

}
