class Vehicle {
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

    public String toString(){
        String str = "";
        return str;
    }

}