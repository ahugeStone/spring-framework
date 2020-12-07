import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import study.beans.Person;

@SuppressWarnings("ALL")
public class SpringTest {
	public static void main(String[] args) {
		BeanFactory bf = new XmlBeanFactory(new ClassPathResource("beans.xml"));
		Person persion = (Person) bf.getBean("person");
		System.out.println(persion.getName());
	}
}
