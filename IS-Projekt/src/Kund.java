import java.util.ArrayList;

public class Kund {
	private String orgNr;
	private String orgName;
	private String billingAdress;
	private String client;
	private String contactPerson;
	private String emailAdress;
	private String telNr;
	private String agreement;
	private ArrayList <Order> order = new ArrayList<Order>();
	
	public String getOrgNr() {
		return orgNr;
	}
	
	public void setOrgNr(String orgNr) {
		this.orgNr = orgNr;
	}
	
	public String getOrgName() {
		return orgName;
	}
	
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
	
	public String getBillingAdress() {
		return billingAdress;
	}
	
	public void setBillingAdress(String billingAdress) {
		this.billingAdress = billingAdress;
	}
	
	public String getClient() {
		return client;
	}
	
	public void setClient(String client) {
		this.client = client;
	}
	
	public String getContactPerson() {
		return contactPerson;
	}
	
	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}
	
	public String getEmailAdress() {
		return emailAdress;
	}
	
	public void setEmailAdress(String emailAdress) {
		this.emailAdress = emailAdress;
	}
	
	public String getTelNr() {
		return telNr;
	}
	
	public void setTelNr(String telNr) {
		this.telNr = telNr;
	}
	
	public String getAgreement() {
		return agreement;
	}
	
	public void setAgreement(String agreement) {
		this.agreement = agreement;
	}
	
	public void addOrder(Order order) {
		this.getOrder().add(order);
	}

	public ArrayList<Order> getOrder() {
		return this.order;
	}
	
	public void setOrder (ArrayList<Order> value) {
		this.order = value;
	}
	
	public Order findOrder(String ordNbr) {
		for (Order o : order) {
			if (o.getOrderNbr().equals(ordNbr)) {
				return o;
			}
		}
		return null;
	}
}
