package saxParserExample;

public class Food {
	
	private String name;
	private double price;
	private String description;
	private double calories;

	public Food(String name, float price, String description, float calories) {
		this.name=name;
		this.price=price;
		this.description=description;
		this.calories=calories;
	}
	
	public Food() {
		// TODO Auto-generated constructor stub
	}

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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getCalories() {
		return calories;
	}

	public void setCalories(double calories) {
		this.calories = calories;
	}
	
	
}