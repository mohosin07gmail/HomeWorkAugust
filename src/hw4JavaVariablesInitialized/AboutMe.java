package hw4JavaVariablesInitialized;

public class AboutMe {
	// Variable is declared here
	public String myCity;
	// Variable is initialized here
	public String myName = "hussain";
	public byte myAge = 36;
	public short myHouseNumber = 56;
	public int myMortgage = 1000;
	public float myHeight = 5.7f;
	public double myGrade = 3.68;
	public long myBankBalance = 343553456l;
	public char myGender = 'M';
	public boolean fullTimeStudent = true;

	// constructor is initialized
	public AboutMe() {
		System.out.println(":------------ This is all about Myself ------------:");
	}

	// method is initialized
	public void aboutMe() {
		System.out.println("name: " + myName + "\nage: " + myAge + "\nhouse number: " + myHouseNumber + "\nmortgate: "
				+ myMortgage + "\nheight: " + myHeight + "\ngrade: " + myGrade + "\nbank balance: " + myBankBalance
				+ "\ngender: " + myGender + "\nfull time student: " + fullTimeStudent);
	}

}
