package check_group_id.constructorInjections;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Logger;
import org.apache.log4j.lf5.AppenderFinalizer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		
		Logger logger = Logger.getLogger(TestMain.class);
		
		BasicConfigurator.configure();
		logger.info("Main is execting............."+ ConsoleAppender.SYSTEM_ERR);
		ApplicationContext appContext = new ClassPathXmlApplicationContext("/check_group_id/constructorInjections/beansDeclaration.xml");
		logger.info("applicationContext is created successfully!!");
		Human human = (Human) appContext.getBean("player");
		logger.info("human is created");
		System.out.println(human.getName());
	}

}
