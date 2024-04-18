public class School {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Mr. Smith", 35, 10, "Math");
        teacher.showQuote();

        Workers[] workersArray = new Workers[3];
        workersArray[0] = new Teacher("Ms. Brown", 40, 15, "History");
        workersArray[1] = new Teacher("Mr. White", 50, 20, "Science");
        workersArray[2] = new Teacher("Ms. Black", 45, 18, "English");
        
		for (Workers worker : workersArray) {
			System.out.println(worker.getName() + " " + worker.getAge() + " " + worker.getExperience());
			if (worker instanceof Teacher) {
				System.out.println(((Teacher) worker).getSubject());
			}
		}

        if (workersArray[0] instanceof Teacher) {
            System.out.println("Teacher is a Worker");
        } else {
            System.out.println("Teacher is not a Worker");
        }
    }
}