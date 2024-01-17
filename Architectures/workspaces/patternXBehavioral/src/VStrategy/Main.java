package VStrategy;

public class Main {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub

		Context context= new Context();
		
		context.setDavranis(new NormalHiz());
		context.calistir();
		Thread.sleep(2000);
		
		context.setDavranis(new YuksekHiz());
		context.calistir();
		Thread.sleep(2000);
		
		context.setDavranis(new NitroHiz());
		context.calistir();
		Thread.sleep(2000);
	}

}
