
public class TestBox {

	public static void main(String[] args) {
		Box a = new Box();//constructor with no parameters is called
		System.out.println(a.volume());
		a.l=10.10;
		a.w=20.20;
		a.h=30.30;
		System.out.println(a.volume());
		
		Box c = new Box(11.11, 22.22, 33.33);//constructor with 3 parameters is called
		System.out.println(c.l);
		System.out.println(c.w);
		System.out.println(c.h);
		System.out.println(c.volume());
		
		Box d = new Box(10.11, 20.33);//constructor with 2 parameters is called
		System.out.println(d.l);
		System.out.println(d.w);
		System.out.println(d.h);
		System.out.println(d.volume());
		
		
	}

}
