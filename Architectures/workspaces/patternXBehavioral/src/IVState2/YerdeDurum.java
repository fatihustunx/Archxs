package IVState2;

public class YerdeDurum implements IDroneDurum{
	
	private Drone d;
	
	public YerdeDurum(Drone drone) {
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

		System.out.println("Drone durduruluyor..");
		
		d.durumDegistir(d.kapaliDurum);
		
		//setState
		//d.durumDegistir(new Kapal�Durum());
	}

	@Override
	public void yerdeCalis() {

		System.out.println("Drone zaten yerde �al���yor !");
	}

	@Override
	public void yuksel() {

		System.out.println("Drone y�kselmeye ba�lad�...");

		d.durumDegistir(d.havadaDurum);
		
		//setState
		//d.durumDegistir(new HavadaDurum());
	}

}
