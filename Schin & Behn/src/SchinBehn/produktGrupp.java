package SchinBehn;

import java.util.ArrayList;

public class produktGrupp {

	private ArrayList<utProdukt> produktGrupp;
	private String ansvarig;
	private String produktGruppsNamn;

	public ArrayList<utProdukt> getProduktGrupp() {
		return produktGrupp;
	}

	public void setProduktGrupp(ArrayList<utProdukt> produktGrupp) {
		this.produktGrupp = produktGrupp;
	}

	public produktGrupp() {
		setProduktGrupp(new ArrayList<utProdukt>());
	}

	public String getAnsvarig() {
		return ansvarig;
	}

	public void setAnsvarig(String ansvarig) {
		this.ansvarig = ansvarig;
	}

	public String getProduktGruppsNamn() {
		return produktGruppsNamn;
	}

	public void setProduktGruppsNamn(String produktGruppsNamn) {
		this.produktGruppsNamn = produktGruppsNamn;
	}

}
