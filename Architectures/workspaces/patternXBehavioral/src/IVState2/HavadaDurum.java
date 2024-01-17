package IVState2;

public class HavadaDurum implements IDroneDurum {
	
	private Drone d;
	
	public HavadaDurum(Drone drone) {
		d=drone;
	}
	
	/*
	private Drone d;
	
	public void setDrone(Drone drone) {
		d=drone;
	}
	*/

	@Override
	public void durdur() {

		System.out.println("Drone yere inmeden durdurulamaz !!");
	}

	@Override
	public void yerdeCalis() {

		System.out.println("Drone yere inmeye baþladý..");
		
		d.durumDegistir(d.yerdeDurum);
		
		//setState
		//d.durumDegistir(new YerdeDurum());
	}

	@Override
	public void yuksel() {

		System.out.println("Drone zaten havada !");
	}

}
