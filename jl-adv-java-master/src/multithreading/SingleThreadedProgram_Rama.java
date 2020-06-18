package multithreading;

//Process is RamaHavingLunch
public class SingleThreadedProgram_Rama {
	public static void main(String[] args) {
		System.out.println("Rama begins the party!");
		SingleThreadedProgram_Rama multithreadedProgram_Rama = new SingleThreadedProgram_Rama();
		multithreadedProgram_Rama.drinkCoke();
		multithreadedProgram_Rama.eatPizza();
		System.out.println("Rama walks away in bliss!");
	}

	public void eatPizza() {
		System.out.println("Smells The Pizza");
		System.out.println("Thoughts ::: What a treat today...");
		System.out.println("Pounce and eat");
		System.out.println("Looks aroung and sees Deva too a pizaa... says Hi Deva");

	}

	public void drinkCoke() {
		System.out.println("Rama wonders how to open the bottle....");
		System.out.println("Rama barks and the waiter opens the bottle");
		System.out.println("Rama drinks the coke");
		System.out.println("Rama pays the bill through credit card which is attached to his collar...");
	}
}
