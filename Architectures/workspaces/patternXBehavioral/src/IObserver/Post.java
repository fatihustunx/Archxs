package IObserver;

import javax.imageio.IIOImage;

public class Post {
	
	private String baslik;
	private IIOImage resim;
	private String icerik;
	private TakipEdilen takipEdilen;
	
	public Post(TakipEdilen takipEdilen, IIOImage resim, String baslik) {
		this.takipEdilen=takipEdilen;
		this.resim=resim;
		this.baslik=baslik;
	}
	
	public Post(TakipEdilen takipEdilen, String icerik, String baslik) {
		this.takipEdilen=takipEdilen;
		this.icerik=icerik;
		this.baslik=baslik;
	}
	

	public String getBaslik() {
		return baslik;
	}

	public void setBaslik(String baslik) {
		this.baslik = baslik;
	}

	public IIOImage getResim() {
		return resim;
	}

	public void setResim(IIOImage resim) {
		this.resim = resim;
	}

	public String getIcerik() {
		return icerik;
	}

	public void setIcerik(String icerik) {
		this.icerik = icerik;
	}

	public TakipEdilen getTakipEdilen() {
		return takipEdilen;
	}

	public void setTakipEdilen(TakipEdilen takipEdilen) {
		this.takipEdilen = takipEdilen;
	}
}
