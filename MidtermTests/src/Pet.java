
public abstract class Pet {
	private String name;
	private double price;
	private int weight;
	
	public Pet(String Name, double Price, int Weight) {
		name = Name;
		price = Price;
		weight = Weight;
	}
	
	public Pet(){	
	}
	
	@Override
	public String toString() {
		return String.format( "name = %s , price = %s, weight = %s, breed = %s", 
				getName(), getPrice(), getWeight(), breed() );}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public abstract String breed();
}
