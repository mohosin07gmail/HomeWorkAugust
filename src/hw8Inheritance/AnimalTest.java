package hw8Inheritance;

public class AnimalTest {

	public static void main(String[] args) {

		Animal animal = new Animal();// hierarchical inheritance. animal class is inherited by mammal, reptile and
										// birds.
		animal.animalInfo();

		Mammal mammal = new Mammal();
		mammal.mammalInfo();
		mammal.animalInfo();// single inheritance

		Reptile reptile = new Reptile();
		reptile.reptileInfo();
		reptile.animalInfo();

		Birds birds = new Birds();
		birds.birdsInfo();
		birds.animalInfo();

		Dog dog = new Dog();
		dog.dogInfo();
		dog.mammalInfo();
		dog.animalInfo();

		Snake snake = new Snake();
		snake.snakeInfo();
		snake.reptileInfo();
		snake.animalInfo();

		// multilevel inheritance
		Robin robin = new Robin();
		robin.robinInfo();
		robin.birdsInfo();
		robin.animalInfo();

		// multilevel inheritance
		BullDog bullDog = new BullDog();
		bullDog.bullDogInfo();
		bullDog.dogInfo();
		bullDog.mammalInfo();
		bullDog.animalInfo();

		// multilevel inheritance
		Cobra cobra = new Cobra();
		cobra.cobraInfo();
		cobra.snakeInfo();
		cobra.reptileInfo();
		cobra.animalInfo();

	}

}
