package hw10Abstraction;

public class ColumbiaUniversity extends MedicalSchool {
	/*
	 * only one keyword extends
	 * regular class can inherit regular class or abstract class but no interface
	 * only one inheritance is possible*/

//	public void chemistry (); method declaration or abstract method is not possible in a regular class. 

	public void biology() {
		System.out.println("this is a non abstract or emplemented method");
	}

	public ColumbiaUniversity() {

	}

	@Override
	public void anatomyLab() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hygiene() {
		// TODO Auto-generated method stub
		
	}

}
