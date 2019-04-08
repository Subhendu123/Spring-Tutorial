package check_group_id.dependencyCheck;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DependencyCheckTest {

	public static void main(String args[]) {
		ApplicationContext context = new ClassPathXmlApplicationContext("/check_group_id/dependencyCheck/dependencyCheckTest.xml");
		Employee emp = (Employee)context.getBean("employeeObject");
		System.out.println(emp.printAll());
	}
}
