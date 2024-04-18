public class Main {
	public static void main(String[] args) {
		Dog dog = new Dog("Ben", 3);
		Cat cat = new Cat("Fifi", 2);


		dog.makeSound();
		cat.makeSound();

		if (dog instanceof Animal) {
			System.out.println("Dog is an instance of Animal");
		}
		
		if (cat instanceof Animal) {
            System.out.println("Cat is an instance of Animal");
        }
	}
}