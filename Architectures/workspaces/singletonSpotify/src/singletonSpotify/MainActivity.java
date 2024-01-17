package singletonSpotify;

public class MainActivity implements Activity{
	
	private MediaPlayer mediaPlayer;

	@Override
	public void onCreate() {
		mediaPlayer=MediaPlayer.getMediaPlayer();
		//mediaPlayer=new MediaPlayer();
	}
	
	public void oynat(Kanal kanal) {
		mediaPlayer.kanalSec(kanal);
		mediaPlayer.oynat();
	}
	
	public void durdur() {
		mediaPlayer.durdur();
	}
}
