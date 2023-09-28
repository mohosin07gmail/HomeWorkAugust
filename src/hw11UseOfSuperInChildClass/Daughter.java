package hw11UseOfSuperInChildClass;

public class Daughter {

	public String birthMonth;
	public int age;

	public Daughter() {
		System.out.println("this is daughter constructor");
	};

	public Daughter(String birthMonth, int age) {
		this.birthMonth = birthMonth;
		this.age = age;
		System.out.println("this is daughter parameter constructor: " + birthMonth + age);
	};

	public void daughter() {
		System.out.println("this is daughter method");
	}

	public void daughterInfo(String birthMonth, int age) {
		System.out.println("this is daughter parameterized method: " + birthMonth + age);
	}

}
