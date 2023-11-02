package dependencyDemo;

import org.springframework.stereotype.Component;

@Component
public class Doctor implements Staff {
	
private String experience;
public String getExperience() {
	return experience;
}

public void setExperience(String experience) {
	this.experience = experience;
}

public void assist() {
	System.out.println("I am a doctor");
}
}
