import java.io.Serializable;

class Vehicle implements Serializable{
    String VIN,type,make,model,country,size,color,engine,fuelType,currentLocation;
    int year,mileage,mpg;
    double monthlyPayments;
    String[] addedFeatures;

    Vehicle(String VIN, String type, String make, String model,
            String country, int year, int mileage, String[] addedFeatures,
            String size, String color, String engine, int mpg, String fuelType,
            String currentLocation, double monthlyPayments) {
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
        this.engine = engine;
        this.mpg = mpg;
        this.fuelType = fuelType;
        this.currentLocation = currentLocation;
        this.monthlyPayments = monthlyPayments;
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

    public String getEngine() {
        return this.engine;
    }
    public void setEngine(String engine) {
        this.engine = engine;
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
    public void setMonthlyPayments(double monthlyPayments) {
        this.monthlyPayments = monthlyPayments;
    }

    public String[] getAddedFeatures() {
        return this.addedFeatures;
    }
    public void setAddedFeatures(String[] addedFeatures) {
        this.addedFeatures = addedFeatures;
    }

    public String toString(){
        String str = "";
        return str;
    }

}