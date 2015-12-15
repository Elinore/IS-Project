package SchinBehn;

import java.util.ArrayList;

public class kund {
	ArrayList<utOrder> orders = new ArrayList<utOrder>();
	private utOrder owner = new utOrder();
	private String orgNummer;
	private String firmaNamn;
	private String fakturaAdress;
	private String beställare;
	private String kontaktperson;
	private String email;
	private String telenr;
	private String avtal;

	
	public void setOrders(ArrayList<utOrder> newOrder) {
		orders = newOrder;
	}

	public ArrayList<utOrder> getOrders() {
		return orders;
	}

	public utOrder getOwner() {
		return owner;
	}

	public void setOwner(utOrder owner) {
		this.owner = owner;
	}

	public String getOrgNummer() {
		return orgNummer;
	}

	public void setOrgNummer(String orgNummer) {
		this.orgNummer = orgNummer;
	}

	public String getFirmaNamn() {
		return firmaNamn;
	}

	public void setFirmaNamn(String firmaNamn) {
		this.firmaNamn = firmaNamn;
	}

	public String getFakturaAdress() {
		return fakturaAdress;
	}

	public void setFakturaAdress(String fakturaAdress) {
		this.fakturaAdress = fakturaAdress;
	}

	public String getKontaktperson() {
		return kontaktperson;
	}

	public void setKontaktperson(String kontaktperson) {
		this.kontaktperson = kontaktperson;
	}

	public String getBeställare() {
		return beställare;
	}

	public void setBeställare(String beställare) {
		this.beställare = beställare;
	}

	public String getTelenr() {
		return telenr;
	}

	public void setTelenr(String telenr) {
		this.telenr = telenr;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAvtal() {
		return avtal;
	}

	public void setAvtal(String avtal) {
		this.avtal = avtal;
	}

}
