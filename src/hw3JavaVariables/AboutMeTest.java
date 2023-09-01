package hw3JavaVariables;

public class AboutMeTest {

	public static void main(String[] args) {
		// object is instantiated
		AboutMe objAboutMe = new AboutMe();
		// myHouseNumber, myMortgage, myHeight, myGrade, myGrade, myBankBalance,
		// myGender, fullTimeStudent
		System.out.println("name: " + objAboutMe.myName + "\nage: " + objAboutMe.myAge + "\nhouse number: "
				+ objAboutMe.myHouseNumber + "\nmortgage: " + objAboutMe.myMortgage + "\nheight: " + objAboutMe.myHeight
				+ "\ngrade: " + objAboutMe.myGrade + "\nbank balance: " + objAboutMe.myBankBalance + "\ngender: "
				+ objAboutMe.myGender + "\nfull time student: " + objAboutMe.fullTimeStudent);

		// method is implemented
		objAboutMe.aboutMe();
	}
}
