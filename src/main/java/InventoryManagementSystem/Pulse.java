package InventoryManagementSystem;

public class Pulse {
	private String name;
	private int weight;
	private int pricePerKg;
	private int totalPrice;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getPricePerKg() {
		return pricePerKg;
	}

	@Override
	public String toString() {
		return "Pulse [name=" + name + ", weight=" + weight + ", pricePerKg=" + pricePerKg + ", totalPrice="
				+ totalPrice + "]";
	}

	public void setPricePerKg(int pricePerKg) {
		this.pricePerKg = pricePerKg;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

}
