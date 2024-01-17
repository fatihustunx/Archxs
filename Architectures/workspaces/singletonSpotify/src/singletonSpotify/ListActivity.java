package singletonSpotify;

import java.util.ArrayList;

public class ListActivity implements Activity {
	
	ArrayList<Kanal> kanalListesi;
	
	@Override
	public void onCreate() {
		kanalListesi=kanalListesi();
	}
	
	public Kanal kanalSec(int index) {
		return kanalListesi.get(index);
	}
	
	public ArrayList<Kanal> kanalListesi(){
		ArrayList<Kanal> kanalListesi=new ArrayList<>();
		Kanal kanal1=new Kanal("Kanal 1", "www.kanal1.com");
		Kanal kanal2=new Kanal("Kanal 2", "www.kanal2.com");
		kanalListesi.add(kanal1);
		kanalListesi.add(kanal2);
		return kanalListesi;
	}
}
