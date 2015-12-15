package SchinBehn;

import java.util.ArrayList;

public class utOrder {

	private ArrayList<orderrad> orders = new ArrayList<orderrad>();
	private orderrad owner = new orderrad();
	private String orderNummer;
	private String orderDatum;
	private String leveransDatum;
	private String leveransAdress;
	private double totaltPris;
	private String bestallare;
	private String bestallningsDatum;

	public ArrayList<orderrad> getOrders() {
		return orders;
	}

	public void setOrders(ArrayList<orderrad> orders) {
		this.orders = orders;
	}

	public orderrad getOwner() {
		return owner;
	}

	public void setOwner(orderrad owner) {
		this.owner = owner;
	}

	public String getOrderNummer() {
		return orderNummer;
	}

	public void setOrderNummer(String orderNummer) {
		this.orderNummer = orderNummer;
	}

	public String getOrderDatum() {
		return orderDatum;
	}

	public void setOrderDatum(String orderDatum) {
		this.orderDatum = orderDatum;
	}

	public String getLeveransDatum() {
		return leveransDatum;
	}

	public void setLeveransDatum(String leveransDatum) {
		this.leveransDatum = leveransDatum;
	}

	public String getLeveransAdress() {
		return leveransAdress;
	}

	public void setLeveransAdress(String leveransAdress) {
		this.leveransAdress = leveransAdress;
	}

	public double getTotaltPris() {
		return totaltPris;
	}

	public void setTotaltPris(double totaltPris) {
		this.totaltPris = totaltPris;
	}

	public String getBestallare() {
		return bestallare;
	}

	public void setBestallare(String bestallare) {
		this.bestallare = bestallare;
	}

	public String getBestallningsDatum() {
		return bestallningsDatum;
	}

	public void setBestallningsDatum(String bestallningsDatum) {
		this.bestallningsDatum = bestallningsDatum;
	}

	public void addOrderrad(orderrad o) {
		orders.add(o);
	}

}
