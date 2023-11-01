package dependencyDemo;

public class Doctor implements Staff {
	
private String experience;
private Hospital hospital;

public Hospital getHospital() {
	return hospital;
}

public void setHospital(Hospital hospital) {
	this.hospital = hospital;
}

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
