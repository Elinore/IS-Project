package SchinBehn;

public class utProdukt {

	private utProdukt owner = new utProdukt();
	private double pris;
	private String produktNummer;
	private String produktNamn;
	private String info;
	private int lagerStatus;

	public utProdukt getOwner() {
		return owner;
	}

	public void setOwner(utProdukt owner) {
		this.owner = owner;
	}

	public double getPris() {
		return pris;
	}

	public void setPris(double pris) {
		this.pris = pris;
	}

	public String getProduktNummer() {
		return produktNummer;
	}

	public void setProduktNummer(String produktNummer) {
		this.produktNummer = produktNummer;
	}

	public String getProduktNamn() {
		return produktNamn;
	}

	public void setProduktNamn(String produktNamn) {
		this.produktNamn = produktNamn;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public int getLagerStatus() {
		return lagerStatus;
	}

	public void setLagerStatus(int lagerStatus) {
		this.lagerStatus = lagerStatus;
	}

}
