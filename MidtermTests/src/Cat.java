
public class Cat extends Pet{
private String breed;
	
public Cat(String Name, double Price, int Weight, String Breed) {
	super(Name, Price, Weight);
	this.breed = Breed;
}
	@Override
	public String breed() {
		return getBreed();
	}
	
	@Override
	public String toString() {
		return String.format("Cat: [" + super.toString() + "]" );
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

}
