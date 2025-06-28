package Spring.demo1.demo;

import Spring.demo1.demo.file.Car;
import Spring.demo1.demo.file.Lambo;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//@SpringBootApplication
public class Demo1Application {

	public static void main(String[] args) {
		// Spring Boot default runner (commented out here to understand what we do in Spring)
		// SpringApplication.run(Demo1Application.class, args);

		// Creates and loads the Spring container by reading bean definitions from ApplicationContext.xml
		//Also for this we need to create this ApplicationContext.xml file and put some boilerplate code there
		//write xml schema for spring on the web and copy the equivalent version from the web
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

		// The context object holds all beans defined in the XML file.
		// getBean("lamboid") retrieves the bean with id "lamboid".
		// We typecast it to the desired type — Car (interface) and Lambo (class).
		Car car1 = (Car) context.getBean("lamboid");
		Lambo car = (Lambo) context.getBean("lamboid");

		// Calling the speed() method normally on both references
		car.speed();
		car1.speed();
	}
}
