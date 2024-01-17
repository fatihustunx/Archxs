package singletonSpotify;

public class Kanal {

	private String isim,link;
	
	public Kanal(String isim, String link) {
		setIsim(isim);
		setLink(link);
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}
}
