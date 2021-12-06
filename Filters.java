class Filters {
    public String make = null;
    public String model = null;
    public String country = null;
    public int year=0;
    public int mileage=0;
    public String size = null;
    public String color = null;
    public String transmission = null;
    public String numberCylinders = null;
    public int mpg=0;
    public String fuelType = null;
    public String currentLocation = null;
    public int monthlyPayment=0;
    public int minPrice=0;
    public int maxPrice=99999999;

    public Filters(){}

    public Filters(String make, String model, String country, int year, 
    int mileage, String size, String color, String transmission, 
    String numberOfCyl, int mpg, String fuelType, String currentLocation, int monthlyPayment, int minPrice, int maxPrice){
      this.make = make;
      this.model = model;
      this.country = country;
      this.year = year;
      this.mileage = mileage;
      this.size = size;
      this.color = color;
      this.transmission = transmission;
      this.numberCylinders = numberOfCyl;
      this.mpg = mpg;
      this.fuelType = fuelType;
      this.currentLocation = currentLocation;
      this.monthlyPayment = monthlyPayment;
      this.minPrice = minPrice;
      this.maxPrice = maxPrice;
    }
  }