package check_group_id.artifact_id;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestClassMain {

	public static void main(String[] args) {
		
		Logger logger = Logger.getLogger(TestClassMain.class);
		Resource resource = new ClassPathResource("/check_group_id/artifact_id/studentBeanConfig.xml");
		BasicConfigurator.configure();
		logger.info(resource + ": is the resource");
        BeanFactory studentBeanFactory = new XmlBeanFactory(resource);
        EmployeeBean firstEmployee = (EmployeeBean) studentBeanFactory.getBean("employeeBean");
        System.out.print(firstEmployee.getEmployeeName() + " : " 
        		+firstEmployee.getAge() + " : "
        		+firstEmployee.getContactDetails());
         
         
         logger.debug("DEBugging message");
	}

}
