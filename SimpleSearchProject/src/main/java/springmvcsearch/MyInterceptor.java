package springmvcsearch;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;

public class MyInterceptor implements HandlerInterceptor {

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
		System.out.println("this is pre hander");
		String name=request.getParameter("name");
		if(name==null || name.startsWith("d")) {
			response.setContentType("text/html");
			response.getWriter().print("invaid");
			return;
		}
		System.out.println("welcome");
		
	}
	
}
