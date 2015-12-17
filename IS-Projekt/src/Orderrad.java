import java.util.ArrayList;

public class Orderrad {
	private int quantity;
	private double price;
	private ArrayList<Produkt> productList = new ArrayList<Produkt>();
	
	public void printList() {
		for (int i = 0; i < productList.size(); i++) {
			System.out.println("Produktnamn: " + productList.get(i).getProductName() + " Produktpris: " + productList.get(i).getPrice() + "kr ");
		}
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public ArrayList <Produkt> getProductList() {
		return this.productList;
	}
	
	public void addProduktList (Produkt product) {
		this.getProductList().add(product);
	}
}
