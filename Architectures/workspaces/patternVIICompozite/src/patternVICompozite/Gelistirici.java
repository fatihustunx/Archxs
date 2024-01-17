package patternVICompozite;

public class Gelistirici implements Calisan{
	
	private int kurumId;
	private String isim;
	private String gelistiriciBilgi;
	
	public Gelistirici(int kurumId, String isim) {
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
	public String getGelistiriciBilgi() {
		return gelistiriciBilgi;
	}
	public void setGelistiriciBilgi(String gelistiriciBilgi) {
		this.gelistiriciBilgi = gelistiriciBilgi;
	}
	
	public void gelistirmeYap() {
		System.out.println(getIsim() + "  " + gelistiriciBilgi);
	}

	@Override
	public void bilgiGoster() {
		System.out.println(getKurumId() + " - " + getIsim());		
	}
}
