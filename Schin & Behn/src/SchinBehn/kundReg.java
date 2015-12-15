package SchinBehn;

import java.util.ArrayList;

public class kundReg {
	private ArrayList<kund> kunder;

	public kundReg() {
		kunder = new ArrayList<kund>();
	}

	public ArrayList<kund> getKunder() {
		return kunder;
	}

	public void setKunder(ArrayList<kund> newKunder) {
		kunder = newKunder;
	}

	public void addKund(kund k) {
		kunder.add(k);
	}

	public kund findKund(String orgNr) {
		for (kund tmp : kunder) {
			if (orgNr.equals(tmp)) {
				return tmp;
			}
		}
		return null;
	}

}
