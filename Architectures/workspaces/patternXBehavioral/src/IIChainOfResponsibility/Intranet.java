package IIChainOfResponsibility;

public class Intranet extends Servis{

	@Override
	public void uygula(Istek istek) {
		
		int ilkIP=IpCozumle.get(istek.getIp());
		
		if(ilkIP<200 && ilkIP>100) {
			System.out.println("Intranet a�daki " + istek.getIp() + " adresine " + istek.getTip() + " iste�i yap�ld�.");	
		}
		else {
			if(getSonraki()!=null) {
				getSonraki().uygula(istek);
			}
		}		
	}

}
