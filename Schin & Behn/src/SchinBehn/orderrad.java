package SchinBehn;

public class orderrad {
	private utOrder owner = new utOrder();
	private int antal;
	private double pris;

	
	public utOrder getOwner() {
		return owner;
	}

	public void setOwner(utOrder owner) {
		this.owner = owner;
	}

	public void setAntal(int newAntal) {
		antal = newAntal;
	}

	public int getAntal() {
		return antal;
	}

	public void setPris(double newPris) {
		pris = newPris;
	}

	public double getPris() {
		return pris;
	}

}
