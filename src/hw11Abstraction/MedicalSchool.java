package hw11Abstraction;

public abstract class MedicalSchool extends NursingSchool {
	/*
	 * two keyword extends and implements
	 * abstract class can inherit abstract class or regular class with extends or interface with implements
	 * only one inheritance with extend keyword and multiple inheritance with implements */

	public MedicalSchool() {// constructor can be created in the abstract class.

	};

	public abstract void anatomyLab();

	public void biochemistryLab() {
		System.out.println("this is non abstract or implemented method");
	}

}
