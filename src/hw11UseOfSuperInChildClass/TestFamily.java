package hw11UseOfSuperInChildClass;

public class TestFamily {

	public static void main(String[] args) {

		Father father1 = new Father();

		Father father2 = new Father("hussain", 35, 'M', true);

		father1.father();
		father1.fatherInfo("abdul", 40, 'M', false);

		Daughter daughter1 = new Daughter();
		Daughter daughter2 = new Daughter("november", 6);

		daughter1.daughter();
		daughter1.daughterInfo("november", 6);

	}

}
