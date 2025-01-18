package abouteunsun;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/today")
public class TodayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
    public TodayServlet() {
        super();
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8;");
		PrintWriter out = response.getWriter();
		out.println("<html><head><meta charset='UTF-8'><title>Clock</title><body style='text-align:center; margin-top:25px;'>");
		out.println("<a href='index.html' style='color:#727D73; text-decoration:underline;'>Home</a>");
		out.println("<h1>Current Time</h1>");
		out.println("<div style='background-color:#D0DDD0; width:300px; padding:20px; display:block; margin:0 auto; border-radius:20px; box-shadow:2px 2px 5px rgba(0, 0, 0, 0.3);'>" + new Date() + "</div>");
        out.println("</body></html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}