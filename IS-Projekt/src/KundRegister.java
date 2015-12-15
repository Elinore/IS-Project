import java.util.ArrayList;

public class KundRegister {
private ArrayList<Kund> kunder = new ArrayList<Kund>();
	
	public ArrayList<Kund> getKunder() {
		return this.kunder;
	}
	
	public void setKunder(ArrayList<Kund> value) {
		this.kunder = value;
	}
	
	public void addKund(Kund kund) {
		this.getKunder().add(kund);
	}
	
	public Kund findKund(String orgNr) {
		for (Kund k : kunder) {
			if (k.getOrgNr().equals(orgNr)) {
				return k;
			}
		}
		return null;
	}

}
