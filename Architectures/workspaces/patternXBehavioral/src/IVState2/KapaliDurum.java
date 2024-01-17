package IVState2;

public class KapaliDurum implements IDroneDurum{
	
	private Drone d;
	
	public KapaliDurum(Drone drone) {
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

		System.out.println("Drone zaten duruyor !");
	}

	@Override
	public void yerdeCalis() {

		System.out.println("Drone yerde çalýþmaya baþladý..");
		
		d.durumDegistir(d.yerdeDurum);
		
		//setState
		//d.durumDegistir(new YerdeDurum());
	}

	@Override
	public void yuksel() {

		System.out.println("Drone yerde çalýþmadan yükselemez !!");
	}

}
