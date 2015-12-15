package SchinBehn;

public class kommentar {

	private kund owner = new kund();
	private String handläggare;
	private String kommentar;
	private String datum;

	public kund getOwner() {
		return owner;
	}

	public void setOwner(kund owner) {
		this.owner = owner;
	}

	public String getHandläggare() {
		return handläggare;
	}

	public void setHandläggare(String handläggare) {
		this.handläggare = handläggare;
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
