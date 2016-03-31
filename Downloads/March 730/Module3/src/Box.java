
public class Box {

	public double l;
	public double w;
	public double h;
	
	public Box() {//constructor with no arguments
		l=1.0;
		w=1.0;
		h=1.0;
	}
	
	public Box(double len, double wid, double hei) {//constructor with 3 arguments
		l=len;
		w=wid;
		h=hei;
	}
	
	public Box(double len, double wid) {//constructor with 2 arguments
		l=len;
		w=wid;
		h=10.0;//always h = 10.0
	}
		
	public double volume(){
		
		return l*w*h;
	}

}
