package entities;

public class Workers {
	private int id;
	private String name;
	private double baseSlary;
	
	public Workers() {
	}
	public Workers(int id, String name, double baseSlary) {
		this.id = id;
		this.name = name;
		this.baseSlary = baseSlary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBaseSlary() {
		return baseSlary;
	}
	public void setBaseSlary(double baseSlary) {
		this.baseSlary = baseSlary;
	}
	
	public void increaseSalary(double percent) {
		baseSlary += baseSlary * percent / 100;
	}
	@Override
	public String toString() {
		return id + ", " + name + ", $ " + String.format("%.2f", baseSlary);
	
}
	
}
