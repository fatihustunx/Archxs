package IIChainOfResponsibility;

public class Yerel extends Servis{

	@Override
	public void uygula(Istek istek) {
		
		int ilkIP=IpCozumle.get(istek.getIp());
		
		if(ilkIP<100) {
			System.out.println("Yerel a�daki " + istek.getIp() + " adresine " + istek.getTip() + " iste�i yap�ld�.");	
		}
		else {
			if(getSonraki()!=null) {
				getSonraki().uygula(istek);
			}
		}
	}

}
