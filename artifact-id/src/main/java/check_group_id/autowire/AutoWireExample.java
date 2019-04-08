package check_group_id.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoWireExample {

	public static void main(String args[]) {
		ApplicationContext context = new ClassPathXmlApplicationContext("/check_group_id/autowire/context.xml");
		School school = (School)context.getBean("school");
		System.out.println(school.getStudent().getName());
	}
}
