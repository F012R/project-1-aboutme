package aboutme;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TodayServlet
 */
@WebServlet("/today")
public class TodayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TodayServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html;charset=utf-8");
		
		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print("<head>");
		out.print("<title> Today </title>");
		out.print("</head>");
		out.print("<body>");
		
	    String contextPath = request.getContextPath();
	    out.print("<a href='" + contextPath + "/index.html'>메인 화면</a>");
	    out.print("<br>");
	    out.print("<br>");
	    out.print("<br>");
	    out.print("<br>");
	    out.print("<br>");
		
		String currentTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm"));
		
		
		out.print("<h1 style='text-align: center;'>현재 시간: " + currentTime + "</h1>");

		out.println("</body>");
		out.println("</html>");
	}

	

}
