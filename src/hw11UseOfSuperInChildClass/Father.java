
package hw11UseOfSuperInChildClass;

public class Father {

	public String name;
	public int age;
	public char sex;
	public boolean usCitizen;
	public String familyName;

	public Father() {
		System.out.println("this is default constructor");
	}

	public Father(String name, int age, char sex, boolean usCitizen) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.usCitizen = usCitizen;
		System.out.println("this is parameterized constructor");

	};

	public void father() {
		System.out.println("this is a regular void type method");
	}

	public void fatherInfo(String name, int age, char sex, boolean usCitizen) {
		System.out.println("this is parameterized method: " + name + age + sex + usCitizen);
	}

}
