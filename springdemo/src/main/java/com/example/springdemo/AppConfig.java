import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {

        // Load Spring container from XML config
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Get Car bean
        Car car = context.getBean("car", Car.class);

        // Call method
        car.drive();
    }
}
