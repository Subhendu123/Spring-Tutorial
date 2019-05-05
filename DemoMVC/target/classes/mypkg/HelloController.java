package mypkg;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class HelloController implements Controller {

	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		ModelAndView m = new ModelAndView();
		System.out.println("hiiiii thos is model and view controller,...... check me!!!!!!!");
		Map<String, String> map = new HashMap<String,String>();
		map.put("name", "Subhendu");
		m.addObject("success", map);
				
		return m;
	}

}
