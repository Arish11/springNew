package dependencyDemo;

public class App {

	public static void main(String[] args) {
		
		//This is an example of dependency where if we can partially avoid changing the names by using the interface but we still
		//have to update the new keyword to instantiate the object.
		
		Staff obj = new Doctor();
		obj.assist();
		
		Staff obj1 = new Nurse();
		obj1.assist();
	}

}
