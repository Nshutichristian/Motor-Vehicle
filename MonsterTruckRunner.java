

import java.util.Scanner;

public class MonsterTruckRunner {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		MotorVehicle myMotorVehicle= new MotorVehicle();
		MotorVehicle hisMotorVehicle= new MotorVehicle("Grave Digger","black","gasoline");
		
		MonsterTruck myMonsterTruck= new MonsterTruck(10,2,"donut");
		MonsterTruck hisMonsterTruck= new MonsterTruck(20,10,"sidewinder");
		
		int year= hisMotorVehicle.TruckYear();
		
		
		System.out.print("=======================\n");
		System.out.print("       Max D INFO      \n");
		System.out.print("=======================\n");
		
		System.out.print("Name: " + myMotorVehicle.getTruckName()+"\n");
		System.out.print("Body Type: "+ myMotorVehicle.getTruckBodyType()+"\n");
		System.out.print("power Plant: "+ myMotorVehicle.getTruckPowerPlant()+"\n" );
		System.out.print("Year: "+ myMotorVehicle.getTruckYearBuilt()+"\n");
		System.out.print("# Wins: "+ myMonsterTruck.getNumberOfWins()+"\n");
		System.out.print("# Losses: "+ myMonsterTruck.getNumberOfLosses()+"\n");
		System.out.print("Special tricks: "+ myMonsterTruck.getSpecialManeuver()+"\n");
		//System.out.print("Win Percentage: "+ percentage+"\n");
		
		System.out.print("\n");
		System.out.print("=======================\n");
		System.out.print("   Grave Digger INFO   \n");
		System.out.print("=======================\n");
		
		System.out.print("Name: " + hisMotorVehicle.getTruckName()+"\n");
		System.out.print("Body Type: "+ hisMotorVehicle.getTruckBodyType()+"\n");
		System.out.print("power Plant: "+ hisMotorVehicle.getTruckPowerPlant()+"\n" );
		System.out.print("Year: "+ year+"\n");
		
		System.out.print("# Wins: "+ hisMonsterTruck.getNumberOfWins()+"\n");
		System.out.print("# Losses: "+ hisMonsterTruck.getNumberOfLosses()+"\n");
		System.out.print("Special tricks: "+ hisMonsterTruck.getSpecialManeuver()+"\n");
		//System.out.print("Win Percentage: "+ percentage+"\n");
	}

}
