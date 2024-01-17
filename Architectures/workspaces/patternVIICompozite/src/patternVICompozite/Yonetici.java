package patternVICompozite;

public class Yonetici implements Calisan{

	private int kurumId;
	private String isim;
	private String yoneticiBilgi;
	
	public Yonetici(int kurumId, String isim) {
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
	public String getYoneticiBilgi() {
		return yoneticiBilgi;
	}
	public void setYoneticiBilgi(String yoneticiBilgi) {
		this.yoneticiBilgi = yoneticiBilgi;
	}
	
	public void yoneticilikYap() {
		System.out.println(getIsim() + "  " + yoneticiBilgi);
	}

	@Override
	public void bilgiGoster() {
		System.out.println(getKurumId() + " - " + getIsim());		
	}
	
}
