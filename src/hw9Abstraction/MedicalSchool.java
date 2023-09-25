package hw9Abstraction;

public abstract class MedicalSchool {

	public MedicalSchool() {// constructor can be created in the abstract class.

	};

	public abstract void anatomyLab();

	public void biochemistryLab() {
		System.out.println("this is non abstract or implemented method");
	}

}
