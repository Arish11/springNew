package dependencyDemo;

public class App {

	public static void main(String[] args) {
		
		//This is an example of dependency where if we want to use nurse/doc we will have to change the app everytime.
		
		Doctor obj = new Doctor();
		obj.assist();
		
		Nurse obj1 = new Nurse();
		obj1.assist();
	}

}
