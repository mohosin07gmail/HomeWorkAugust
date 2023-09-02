package hw4JavaVariables;

public class AboutMeTest {

	public static void main(String[] args) {

		AboutMe aboutMe = new AboutMe(); // constructor is initialized
		// variables are initialized
		aboutMe.name = "Hussain";
		aboutMe.age = 36;
		aboutMe.houseNumber = 56;
		aboutMe.mortgage = 1000;
		aboutMe.height = 5.7f;
		aboutMe.grade = 3.68;
		aboutMe.bankBalance = 23451246l;
		aboutMe.gender = 'M';
		aboutMe.fullTimeStudent = true;

		aboutMe.aboutMe();// method is initialized

		AboutMe alex = new AboutMe();// constructor is initialized
		// variables are initialized
		alex.name = "Alex";
		alex.age = 38;
		alex.houseNumber = 78;
		alex.mortgage = 1500;
		alex.height = 4.5f;
		alex.grade = 3.51;
		alex.bankBalance = 321654987l;
		alex.gender = 'M';
		alex.fullTimeStudent = false;

		alex.aboutMe();// method is initialized

	}

}
