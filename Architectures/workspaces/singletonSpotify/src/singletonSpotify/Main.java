package singletonSpotify;

public class Main {

	public static void main(String[] args) {

		MainActivity mainActivity=new MainActivity();
		ListActivity listActivity=new ListActivity();
		
		listActivity.onCreate();
		
		Kanal kanal=listActivity.kanalSec(0);
		mainActivity.onCreate();
		mainActivity.oynat(kanal);
		
		Main.sleep2(5000);
		
		kanal=listActivity.kanalSec(1);
		mainActivity.onCreate();
		mainActivity.oynat(kanal);
		
		//mainActivity.durdur();
		
	}

	public static void sleep2(int sure) {
		try {
			Thread.sleep(sure);
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
	}

}
