package person;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//아이디 중복체크 같은거 할 수 있는 거
@WebServlet("/api/idcheck")
public class IDCheckServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		
		String json;
		if(id.length()>5) {
			json ="{\"duplicate\":true}";
		}else {
			json ="{\"duplicate\":false}";
		}
		resp.setContentType("application/json; charset=utf-8");//setHeader로도 설정 가능
		PrintWriter pw = resp.getWriter();
		pw.println(json);
		pw.flush();

	}
	
}
