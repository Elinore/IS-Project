

public class TestKund {
	
	public static void main(String[] args) {
		Kund k = new Kund();
		k.setOrgNr("123");
		k.setTelNr("1");
		
		Kund k2 = new Kund();
		k2.setOrgNr("124");
		k2.setTelNr("2");
		
		KundRegister kr = new KundRegister();
		kr.addKund(k);
		kr.addKund(k2);
		
		for (Kund kund : kr.getKunder()) {
			System.out.println (kund.getOrgNr());
		}
		
		System.out.println(kr.findKund("123").getTelNr());
		
		Order o = new Order();
		o.setOrderNbr("30");
		k.addOrder(o);
		
		o = new Order();
		o.setOrderNbr("40");
		k.addOrder(o);
		
		o = new Order();
		o.setOrderNbr("11");
		k2.addOrder(o);
		
		o = new Order();
		o.setOrderNbr("12");
		k2.addOrder(o);
		
		for (Order order : k.getOrder()) {
			System.out.println(order.getOrderNbr());
		}
		
		Kommunikation co = new Kommunikation();
		co.setAdministrator("Eva");
		co.setComment("Comment");
		co.setDate("123015");
		k.addKommunikation(co);
		
		k.printList();
		
		Orderrad ord = new Orderrad();
		ord.setQuantity(2);
		ord.setPrice(0);
		
		Produkt p = new Produkt();
		p.setProductName("Korv");
		p.setPrice(300);
		ord.addProduktList(p);
		
		ord.printList();
	}
}
