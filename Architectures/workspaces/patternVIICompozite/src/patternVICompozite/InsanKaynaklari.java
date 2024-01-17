package patternVICompozite;

import java.util.ArrayList;
import java.util.List;

public class InsanKaynaklari implements Calisan{

	private List<Calisan> calisanListe;
	
	public InsanKaynaklari() {	
		calisanListe= new ArrayList<>();
	}
	
	public void calisanEkle(Calisan calisan) {
		calisanListe.add(calisan);
	}
	
	public void calisanCikar(Calisan calisan) {
		calisanListe.remove(calisan);
	}

	@Override
	public void bilgiGoster() {

		for (Calisan calisan : calisanListe) {
			calisan.bilgiGoster();
		}
	}
	
}
