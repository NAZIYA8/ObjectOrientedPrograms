package model;

public class Marie {

	public String stock_name;
	public int number_of_shares;
	public double share_price;
	public double totalPrice;

	public String getStock_name() {
		return stock_name;
	}

	public void setStock_name(String stock_name) {
		this.stock_name = stock_name;
	}

	public int getNumber_of_shares() {
		return number_of_shares;
	}

	public void setNumber_of_shares(int number_of_shares) {
		this.number_of_shares = number_of_shares;
	}

	public double getShare_price() {
		return share_price;
	}

	public void setShare_price(double share_price) {
		this.share_price = share_price;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	@Override
	public String toString() {
		return "Parle [stock_name=" + stock_name + ", number_of_shares=" + number_of_shares + ", share_price="
				+ share_price + ", totalPrice=" + totalPrice + "]";
	}
}
