import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import study.beans.Person;
import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings("ALL")
public class FirstSpringTest {

	@Test
	public void  test(){
		BeanFactory bf = new XmlBeanFactory(new ClassPathResource("beans.xml"));
		Person persion = (Person) bf.getBean("person");
		System.out.println(persion.getName());
		Assert.assertEquals("huangshi", persion.getName());
	}
}
