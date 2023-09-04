package hw5Q1Constructor;

public class Computer {
	//brand, model, operating system, price, grade (consider grade as char), and madeInUSA (boolean type)
	public String brand;
	public String model;
	public String operatingSystem;
	public int price;
	public char grade;
	public boolean madeInUsa;
	
	public Computer() {
		System.out.println("This is from the default Constructor of Computer class");
	}
	
	public Computer(String brand, String model, String operatingSystem, int price, char grade, boolean madeInUsa){
		this.brand = brand;
		this.model = model;
		this.operatingSystem = operatingSystem;
		this.price = price;
		this.grade = grade;
		this.madeInUsa = madeInUsa;
		
		//My Brand: Apple, Model: MacBook Air, Operating system: MacOS Mojave, Price: $800, Grade: A, and Made in the USA? Ans: false.
		System.out.println("my brand: " + brand + "\nmodel: " + model + "\noperating system: " + operatingSystem + "\nprice: " + price + "\ngrade: " + grade + "\nmade in USA: " + madeInUsa);
		
	}
	
	
	
	
	
	
	
	
	

}
