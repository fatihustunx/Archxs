package IIChainOfResponsibility;

public class Internet extends Servis {

	@Override
	public void uygula(Istek istek) {
		
		int ilkIP=IpCozumle.get(istek.getIp());
		
		if(ilkIP<255 && ilkIP>200) {
			System.out.println("Internet aðýndaki " + istek.getIp() + " adresine " + istek.getTip() + " isteði yapýldý.");	
		}
		else {
			if(getSonraki()!=null) {
				getSonraki().uygula(istek);
			}
		}		
	}

}
