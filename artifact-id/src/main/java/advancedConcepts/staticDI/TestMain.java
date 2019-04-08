package advancedConcepts.staticDI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("/advancedConcepts/staticDI/context.xml");
		//Car c = (Car)context.getBean("Car.class");
		Car c = (Car)context.getBean("car");
		System.out.println(c.getValues());
	}

}
