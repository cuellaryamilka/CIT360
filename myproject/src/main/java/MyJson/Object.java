package MyJson;

public class Object {
	
	// creating the members of the object
	public int id;
	public String employee;
	public String houseName[];
	public int price[];
	
	// creating getters and setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmployee() {
		return employee;
	}
	public void setEmployee(String employee) {
		this.employee = employee;
	}
	public String[] getHouseName() {
		return houseName;
	}
	public void setHouseName(String[] houseName) {
		this.houseName = houseName;
	}
	public int[] getPrice() {
		return price;
	}
	public void setPrice(int[] price) {
		this.price = price;
	}
	

}
