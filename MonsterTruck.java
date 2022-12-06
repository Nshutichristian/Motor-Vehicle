
public class MonsterTruck extends MotorVehicle 

{

	private int numberOfWins;
	private int numberOfLosses;
	private String specialManeuver;
	
	
	
	public MonsterTruck() 
	{
		
	}
	
	public MonsterTruck(int numberOfWins, int numberOfLosses, String specialManeuver)
	{
		this.numberOfWins=numberOfWins;
		this.numberOfLosses=numberOfLosses;
		this.specialManeuver=specialManeuver;
	}

	public int getNumberOfWins()
	{
		return numberOfWins;
	}

	public void setNumberOfWins(int numberOfWins) {
		this.numberOfWins = numberOfWins;
	}

	public int getNumberOfLosses() {
		return numberOfLosses;
	}

	public void setNumberOfLosses(int numberOfLosses) {
		this.numberOfLosses = numberOfLosses;
	}

	public String getSpecialManeuver() {
		return specialManeuver;
	}

	public void setSpecialManeuver(String specialManeuver) {
		this.specialManeuver = specialManeuver;
	}
	


	@Override
	public String toString() {
		return "MonsterTruck [numberOfWins=" + numberOfWins + ", numberOfLosses=" + numberOfLosses
				+ ", specialManeuver=" + specialManeuver + ", getTruckYearBuilt()=" + getTruckYearBuilt()
				+ ", getTruckName()=" + getTruckName() + ", getTruckBodyType()=" + getTruckBodyType()
				+ ", getTruckPowerPlant()=" + getTruckPowerPlant() + ", toString()=" + super.toString() + "]";
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
