
public class MotorVehicle {

	private int truckYearBuilt;
	private String truckName;
	private String truckBodyType;
	private String truckPowerPlant;
	
	public MotorVehicle()
	{
		this("Big Foot", "Blue", "Diesel");
	}
	public MotorVehicle(String truckName, String truckBodyType, String truckPowerPlant)
	{
		this.truckName=truckName;
		this.truckBodyType=truckBodyType;
		this.truckPowerPlant=truckPowerPlant;
	}
	
	public int getTruckYearBuilt() {
		return 2022;
	}
	public void setTruckYearBuilt(int truckYearBuilt) 
	{
		this.truckYearBuilt = truckYearBuilt;
	}
	public String getTruckName() {
		return truckName;
	}
	public void setTruckName(String truckName) {
		this.truckName = truckName;
	}
	public String getTruckBodyType() {
		return truckBodyType;
	}
	public void setTruckBodyType(String truckBodyType) {
		this.truckBodyType = truckBodyType;
	}
	public String getTruckPowerPlant() {
		return truckPowerPlant;
	}
	public void setTruckPowerPlant(String truckPowerPlant) {
		this.truckPowerPlant = truckPowerPlant;
	}
	public int TruckYear()
	{
		int year=2021;
		return year;
	}
	
	
	@Override
	public String toString() {
		return "MotorVehicle [truckYearBuilt=" + truckYearBuilt + ", truckName=" + truckName + ", truckBodyType="
				+ truckBodyType + ", truckPowerPlant=" + truckPowerPlant + ", toString()=" + super.toString() + "]";
	}
	
}
