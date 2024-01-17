package IObserver;

public class Sayfa extends TakipEdilen{

	public Sayfa(String isim) {
		super(isim);
	}
	
	@Override
	public void paylas(Post post) {
		System.out.println(getIsim() + " sayfasý " + post.getBaslik() + " paylaþtý.");
		tumunuBilgilendir(post);	
		}
}
