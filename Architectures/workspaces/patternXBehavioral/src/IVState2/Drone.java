package IVState2;

public class Drone {

	public IDroneDurum kapaliDurum;
	public IDroneDurum yerdeDurum;
	public IDroneDurum havadaDurum;
	
	private	IDroneDurum droneDurum;
	
	public Drone() {
		kapaliDurum = new KapaliDurum(this);
		yerdeDurum = new YerdeDurum(this);
		havadaDurum = new HavadaDurum(this);
		
		droneDurum=kapaliDurum;
		
		//droneDurum = new KapalýDurum();
		//droneDurum.setDrone(this);
	}
	
	public void durumDegistir(IDroneDurum droneDurum) {	
		this.droneDurum=droneDurum;
		
		//droneDurum.setDrone(this);
	}
	
	public void droneDurdur() {	
		droneDurum.durdur();
	}
	
	public void droneYerdeCalis() {	
		droneDurum.yerdeCalis();
	}
	
	public void droneYuksel() {
		droneDurum.yuksel();
	}
	
}
