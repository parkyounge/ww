package servletdemo.part01;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//http://localhost:8090/webdemo/basic

//webdemo/servletdemo/part01.Basic
@WebServlet("/basic")
public class Basic extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String path="/servletview/part01/nameview.jsp";
		
		//path는 클라이언트에 응답할 페이지
		RequestDispatcher dis =req.getRequestDispatcher(path);
		
		//클라이언트에 응답하기 위한 메소드 호출
		dis.forward(req,resp);
		
		
		
	}//end doGet()
}//endClass
