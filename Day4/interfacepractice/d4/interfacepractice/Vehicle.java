package d4.interfacepractice;

public interface Vehicle {
	void start();
	void stop();
	void getFuelLevel();
	default String getVehicleType() {
		return "Unknown Vehicle";
	}
	static boolean serviceRequired() {
		return true;
	}
}
