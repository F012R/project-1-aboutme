package org.f012r.miniproject01;

import javax.servlet.ServletException;
import javax.servlet.annotation.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@WebServlet(name = "todayServlet", value = "/today")
public class TodayServlet extends HttpServlet {

    public void init() {
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");

        LocalDateTime currentDateTime = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");

        String formattedDate = currentDateTime.format(formatter);

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<nav>" + "<a href=\"/aboutme/index.html\">" + "메인화면" + "</a>" + "</nav>");
        out.println("<h1 style=\"text-align:center;margin-top:100px;\">" + "현재시간 : " + formattedDate + "</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}
