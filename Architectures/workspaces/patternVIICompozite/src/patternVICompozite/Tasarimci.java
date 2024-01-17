package patternVICompozite;

public class Tasarimci implements Calisan {

	private int kurumId;
	private String isim;
	private String tasarimciBilgi;
	
	public Tasarimci(int kurumId, String isim) {
		setKurumId(kurumId);
		setIsim(isim);
	}
	
	public int getKurumId() {
		return kurumId;
	}
	public void setKurumId(int kurumId) {
		this.kurumId = kurumId;
	}
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	public String getTasarimciBilgi() {
		return tasarimciBilgi;
	}
	public void setTasarimciBilgi(String tasarimciBilgi) {
		this.tasarimciBilgi = tasarimciBilgi;
	}

	public void tasarimYap() {
		System.out.println(getIsim() + "  " + tasarimciBilgi );
	}
	
	@Override
	public void bilgiGoster() {
		System.out.println(getKurumId() + " - " + getIsim());
	}
	
}
