package entities;

public class Convertion {
	private double price;
	private double comprar;

	

	public Convertion() {
	}
	
	public Convertion(double price, double comprar) {
		this.price = price;
		this.comprar = comprar;
	}


	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
	public double getComprar() {
		return comprar;
	}

	public void setComprar(double comprar) {
		this.comprar = comprar;
	}

	public double currencyConverter() {
		double total  = comprar *  price ;
		return total + (total * 0.06);
	}

	@Override
	public String toString() {
		return "$ " + String.format("%.2f",currencyConverter());
	}
	
	
}
