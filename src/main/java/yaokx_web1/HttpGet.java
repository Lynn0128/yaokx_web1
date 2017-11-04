package yaokx_web1;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HttpGet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		/*System.out.println(req.getParameter("login"));//接收的东西怎么拿
		resp.getWriter().write("get success");*/
		System.out.println(req.getParameter("login"));
		resp.getWriter().write("get success");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
		System.out.println(req.getParameter("login"));
		resp.getWriter().write("post success");
	}
	
}
