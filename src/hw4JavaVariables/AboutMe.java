package hw4JavaVariables;

public class AboutMe {
	// variables are declared
	public String name;
	public byte age;
	public short houseNumber;
	public int mortgage;
	public float height;
	public double grade;
	public long bankBalance;
	public char gender;
	public boolean fullTimeStudent;

	// constructor is declared
	public AboutMe() {
		System.out.println("This is all about us");
	}

	// method is implemented
	public void aboutMe() {
		System.out.println("name: " + name + "\nage: " + age + "\nhouse number: " + houseNumber + "\nmortgage: "
				+ mortgage + "\nheight: " + height + "\ngrade: " + grade + "\nbank balance: " + bankBalance
				+ "\ngender: " + gender + "\nfull time student: " + fullTimeStudent);
	}

}
