package d4.interfacepractice;

public class Car implements Vehicle {
	protected String name;
	protected String type;
	protected boolean isOn;
	protected int fuelLevel;
	
	public Car() {
		this.getCarStatus();
	}
	public Car(String name,String type, boolean isOn, int fuelLevel) {
		this.name = name;
		this.type = type;
		this.isOn = isOn;
		this.fuelLevel = fuelLevel;
	}
	
	@Override
	public void start() {
		if(!isOn) {
			isOn= true;
		}
		else {
			System.err.println("Car is already ON.");
		}
		
	}
	@Override
	public void stop() {
		if(isOn) {
			isOn= false;
		}
		else {
			System.err.println("Car is already OFF.");
		}
		
	}
	@Override
	public void getFuelLevel() {
		System.out.println("Car fuel level is " + fuelLevel);
	}
	public void getCarStatus() {
		if(isOn == true) {
			System.out.println("Car status is ON.");
		}
		else {
			System.out.println("Car status is OFF.");
		}
	}
	public static void main(String[] args) {
		Car c1 = new Car("GWAGON","SUV",false,90);
		
		Vehicle c2 = new Car("GWAGON","SUV",false,90); //interface reference to class
		c1.start();
//		c2.getFuelLevel();
	}
}
