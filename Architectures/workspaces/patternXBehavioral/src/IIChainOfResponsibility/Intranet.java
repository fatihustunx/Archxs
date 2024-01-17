package IIChainOfResponsibility;

public class Intranet extends Servis{

	@Override
	public void uygula(Istek istek) {
		
		int ilkIP=IpCozumle.get(istek.getIp());
		
		if(ilkIP<200 && ilkIP>100) {
			System.out.println("Intranet aðdaki " + istek.getIp() + " adresine " + istek.getTip() + " isteði yapýldý.");	
		}
		else {
			if(getSonraki()!=null) {
				getSonraki().uygula(istek);
			}
		}		
	}

}
