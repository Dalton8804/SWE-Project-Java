import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;

class Vehicle implements Serializable{
    String VIN,type,make,model,country,size,color, transmission,engineCylinders, fuelType,currentLocation;
    int year,mileage,mpg, price;
    double monthlyPayments;
    String[] addedFeatures;
    public String userTag;

    Vehicle(String VIN, String type, String make, String model,
            String country, int year, int mileage, String[] addedFeatures,
            String size, String color, String transmission, String engineCylinders, int mpg, String fuelType,
            String currentLocation, double monthlyPayments, int price) {
        this.VIN = VIN;
        this.type = type;
        this.make = make;
        this.model = model;
        this.country = country;
        this.year = year;
        this.mileage = mileage;
        this.addedFeatures = addedFeatures;
        this.size = size;
        this.color = color;
        this.transmission = transmission;
        this.engineCylinders = engineCylinders;
        this.mpg = mpg;
        this.fuelType = fuelType;
        this.currentLocation = currentLocation;
        this.monthlyPayments = monthlyPayments;
        if (price>0)
            this.price = price;
        this.price = calcPrice();
    }

    private int calcPrice() {
        return (int)Math.floor(Math.random()*(47000-25000)+25000);
    }

    // Simple constructor for testing. Delete this when no longer needed
    Vehicle(String VIN) { this.VIN = VIN; }

    public String getVIN() {
        return this.VIN;
    }
    public void setVIN(String VIN) {
        this.VIN = VIN;
    }

    public String getType() {
        return this.type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public String getMake() {
        return this.make;
    }
    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return this.model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public String getCountry() {
        return this.country;
    }
    public void setCountry(String country) {
        this.country = country;
    }

    public String getSize() {
        return this.size;
    }
    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return this.color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public String getTransmission() {
        return this.transmission;
    }
    public String getEngineCylinders(){
        return this.engineCylinders;
    }
    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public void setEngineCylinders(String engineCylinders){
        this.engineCylinders = engineCylinders;
    }

    public String getFuleType() {
        return this.type;
    }
    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getCurrentLocation() {
        return this.currentLocation;
    }
    public void setCurrentLocation(String currentLocation) {
        this.currentLocation = currentLocation;
    }

    public int getYear() {
        return this.year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    public int getMileage() {
        return this.mileage;
    }
    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public int getMPG() {
        return this.mpg;
    }
    public void setMPG(int mpg) {
        this.mpg = mpg;
    }

    public double getMonthlyPayments() {
        return this.monthlyPayments;
    }
    public int getPrice(){
        return this.price;
    }
    public void setMonthlyPayments(double monthlyPayments) {
        this.monthlyPayments = monthlyPayments;
    }
    public void setPrice(int price1){
        this.price = price1;
    }

    public String[] getAddedFeatures() {
        return this.addedFeatures;
    }
    public void setAddedFeatures(String[] addedFeatures) {
        this.addedFeatures = addedFeatures;
    }

    public String toString(){
        String str = "---Price: $" + this.price + " VIN: " + this.getVIN() + " Make: " + this.make + " Model: " + this.model + " Country: " + this.country + " Type: " + this.type +
                " Year: " + this.year + " Milage: " + this.mileage + " Optional Features: " + printFeatures() + "\n\tSize: " + this.size + " Color: " +
                this.color + " Transmission: " + this.transmission + " Engine Cylinders: " + this.engineCylinders + " MPG: " + this.mpg + " Fuel Type: " + this.fuelType + " Location: " + this.currentLocation;
        return str;
    }

    private String printFeatures() {
        String temp = "";
        if(addedFeatures.length != 0)
        temp = temp + "{";
        else
            return "{None}";
        for (int i = 0; i < this.addedFeatures.length; i++) {
            if (this.addedFeatures.length - 1 == i)
                temp = temp + this.addedFeatures[i] + "} ";
            else
                temp = temp + this.addedFeatures[i] + ", ";
        }
        return temp;
    }
    public void setUserTag(String userName){
        this.userTag = userName;
    }
}