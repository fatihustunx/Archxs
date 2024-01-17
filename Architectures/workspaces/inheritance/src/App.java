
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A a=new A();
		a.a="public";
		a.b="protected";
		System.out.println(a.a);
		System.out.println(a.b);
		
		a.setC("private");
		System.out.println(a.getC());
	}

}
