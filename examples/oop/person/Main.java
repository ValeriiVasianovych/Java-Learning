public class Main {
	public static void main(String[] args) {
		Person andrew = new Person();
		andrew.name = "Andrew";
		andrew.height = 188.4;
		andrew.weight = 84.6;
		andrew.age = 21;
		andrew.say("Hello my name is " + andrew.name);
		System.out.println(andrew.name + "\n" + andrew.height + "\n" + andrew.weight + "\n" + andrew.age + "\n \n");

		Person victor = new Person();
		victor.name = "Victor";
		victor.height = 188.4;
		victor.weight = 84.6;
		victor.age = 21;
		victor.say("Hi I'm " + victor.name);
		System.out.println(victor.name + "\n" + victor.height + "\n" + victor.weight + "\n" + victor.age);
	}
}