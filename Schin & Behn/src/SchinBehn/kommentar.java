package SchinBehn;

public class kommentar {

	private kund owner = new kund();
	private String handl�ggare;
	private String kommentar;
	private String datum;

	public kund getOwner() {
		return owner;
	}

	public void setOwner(kund owner) {
		this.owner = owner;
	}

	public String getHandl�ggare() {
		return handl�ggare;
	}

	public void setHandl�ggare(String handl�ggare) {
		this.handl�ggare = handl�ggare;
	}

	public String getKommentar() {
		return kommentar;
	}

	public void setKommentar(String kommentar) {
		this.kommentar = kommentar;
	}

	public String getDatum() {
		return datum;
	}

	public void setDatum(String datum) {
		this.datum = datum;
	}

}
