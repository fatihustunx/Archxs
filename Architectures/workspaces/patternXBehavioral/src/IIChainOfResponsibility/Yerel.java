package IIChainOfResponsibility;

public class Yerel extends Servis{

	@Override
	public void uygula(Istek istek) {
		
		int ilkIP=IpCozumle.get(istek.getIp());
		
		if(ilkIP<100) {
			System.out.println("Yerel aðdaki " + istek.getIp() + " adresine " + istek.getTip() + " isteði yapýldý.");	
		}
		else {
			if(getSonraki()!=null) {
				getSonraki().uygula(istek);
			}
		}
	}

}
