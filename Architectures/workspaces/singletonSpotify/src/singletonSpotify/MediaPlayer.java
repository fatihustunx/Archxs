package singletonSpotify;

public class MediaPlayer implements Runnable {

	private Kanal kanal;
	private boolean kontrol;
	private static MediaPlayer mediaPlayer;
	
	public static MediaPlayer getMediaPlayer() {
		if(mediaPlayer==null) {
			mediaPlayer=new MediaPlayer();
		}
		return mediaPlayer;
	}
	
	private MediaPlayer() {
		
	}
	
	public void kanalSec(Kanal kanal) {
		this.kanal=kanal;
	}
	
	public void oynat() {
		kontrol=true;
		new Thread(this).start();
		// start fonkksiyonu run'ý çalýþtýrýr !
	}
	
	public void durdur() {
		kontrol=false;
	}
	
	@Override
	public void run() {
		
		while(kontrol) {
			Main.sleep2(2000);
			System.out.println(kanal.getIsim()+ " kanalý"+
			kanal.getLink() + " linki üzerinden oynatýlýyor.");
		}
	}
}
