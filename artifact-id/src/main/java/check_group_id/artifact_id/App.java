
package check_group_id.artifact_id;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Resource resource = new ClassPathResource("");
        BeanFactory studentBeanFactory = new XmlBeanFactory(resource);
        studentBeanFactory.getBean("");
    }
}
