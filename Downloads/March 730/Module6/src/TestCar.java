
public class TestCar {

	public static void main(String[] args) {
		Car obj = new Car();//parent class object and parent class reference
		System.out.println(obj.wheels);
		System.out.println(obj.windows);
		obj.start();
		obj.accel();
		obj.stop();
		//obj.fillFuel();//child class method cannot execute
		
		System.out.println("***************");
		BMW b = new BMW();//child class object and child class reference
		b.start();//overridden method executes
		b.accel();
		b.stop();
		b.fillFuel();
		System.out.println("***************");
		
		Car c = new BMW();//child class object and parent class reference
		c.start();//overridden method executes
		c.accel();
		c.stop();
		//c.fillFuel();//newly implemented method cannot execute
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
