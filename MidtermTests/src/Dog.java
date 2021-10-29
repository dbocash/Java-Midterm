
public class Dog extends Pet{
	private String breed;
	
	public Dog(String Name, double Price, int Weight, String Breed) {
		super(Name, Price, Weight);
		this.breed = Breed;
	}
	@Override
	public String breed() {
		return getBreed();
	}
	
	@Override
	public String toString() {
		return String.format("Dog: [" + super.toString() + "]" );
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}
}
