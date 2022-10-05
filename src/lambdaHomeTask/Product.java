package predicateTest;

public class Product {
	/* Pre Conditions
	- Define a Product class with name, price, category, grade
	- Define a Response class with response body, status code, response type */
	
	String name;
	int price;
	String category;
	String grade;
	
	public Product(String name, int price, String category, String grade) {
		super();
		this.name = name;
		this.price = price;
		this.category = category;
		this.grade = grade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

}
