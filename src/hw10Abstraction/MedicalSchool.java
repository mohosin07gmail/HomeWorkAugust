package hw10Abstraction;

public abstract class MedicalSchool extends NursingSchool {
	/*
	 * only one keyword extends
	 * abstract class can inherit abstract class or regular class no interface
	 * only one inheritance is possible in abstract class*/

	public MedicalSchool() {// constructor can be created in the abstract class.

	};

	public abstract void anatomyLab();

	public void biochemistryLab() {
		System.out.println("this is non abstract or implemented method");
	}

}
