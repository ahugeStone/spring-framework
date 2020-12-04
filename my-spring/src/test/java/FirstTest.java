import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import study.beans.Person;

public class FirstTest {

	@Test
	public void  test(){
		BeanFactory bf = new XmlBeanFactory(new ClassPathResource("beans.xml"));
		Person persion = (Person) bf.getBean("person");
		Assert.assertEquals("huangshi", persion.getName());
	}
}
