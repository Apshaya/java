public class CabRide {
String carName, driveName, pickLocation, dropLocation;
int noPassengers,runKM;
double priceperKM = 25.50;
double cabFare;

public CabRide(string carName,string driveName){
this.carName=carName;
this.driveName=driveName;
}
public double calculateCabFare(){
    this.cabFare=priceperKM*runKM;
    return cabFare;
}
public string getCarName(){
    return carName;
}
public string getDriveName(){
    return driveName;
}
public double getCabFare(){
    return cabFare;
}
public void setPickLocation(String pickLocation){
    this.pickLocation=pickLocation;
}
public String getPickLocation(){
    return pickLocation;
}
public void setDropLocation(String DropLocation){
    this.DropLocation=dropLocation;  
}
public String getDropLocation(){
    return dropLocation; 
}    
public void setNoPasengers(int noPasengers){
    this.noPasengers=noPasengers;          
}
public int getNopassengers(){
    return noPasengers;
}
public void setRunKM(int runKM) {
    this.runKM=runKM;
}
public int getRunKM(){
    return runKM;
}
public void DisplatRideDetails(){
    system.out.println("--Ride Details--\n\n");
    system.out.println("Car Name : "+ getCarName());
    system.out.println("Driver Name : "+ getDriveName());
    system.out.println("Pickup Location : "+ pickLocation());
    system.out.println("Drop Location : "+ getDropLocation());
    system.out.println("No of passengers : "+ getNopassengers());
    system.out.println("Kilometers of Ride : "+ getRunKM());
    system.out.println("Total Fare for the ride : "+ calculateCabFare());
    system.out.println("\n\n--Thank you--");
}
}
