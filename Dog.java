package training.day1;

public class Dog implements Animal {
	
	public void bark() {
		System.out.println("Dog is barking");
	}

	public static void main(String[] args) {
		Dog d = new Dog();
		d.bark();

	}

}
