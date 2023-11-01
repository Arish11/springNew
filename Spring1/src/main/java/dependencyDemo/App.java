package dependencyDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		//This is an example of dependency where if we can partially avoid changing the names by using the interface but we still
		//have to update the new keyword to instantiate the object.
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		Staff obj = context.getBean(Doctor.class);
		obj.assist();
		
		Staff obj1 =  context.getBean(Nurse.class);
		obj1.assist();
		
	}

}
