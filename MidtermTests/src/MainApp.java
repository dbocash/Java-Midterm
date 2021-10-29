
public class MainApp {
	public static void main(String args[]) {
		Pet pet[] = new Pet[4];
		pet[0] = new Dog("Fido", 1000.0, 50, "Dalmation");
		pet[1] = new Cat("Mittens", 25.0, 3, "Persian"); 
		pet[2] = new Dog("Pemi", 200.0, 30, "Australian Shephard");
		pet[3] = new Cat("Sparky", 4000.0, 20, "Maine Coon");
		
		for (Pet currentPet : pet) {
			System.out.println(currentPet);
		}
	}
}
