import java.io.Serializable;

class Vehicle implements Serializable {

  String VIN, type, make, model, country, size, color, transmission, engineCylinders, fuelType, currentLocation;
  int year, mileage, mpg;
  double price;
  double monthlyPayments;
  String[] addedFeatures;
  public String userTag;

  Vehicle(
    String VIN,
    String type,
    String make,
    String model,
    String country,
    int year,
    int mileage,
    String[] addedFeatures,
    String size,
    String color,
    String transmission,
    String engineCylinders,
    int mpg,
    String fuelType,
    String currentLocation,
    double monthlyPayments,
    int price
  ) {
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
    if (price == 0) {
      this.price =
        calcPrice(type, size, transmission, fuelType, mileage, 2021 - year);
    } else {
      this.price = price;
    }
  }

  // Simple constructor for testing. Delete this when no longer needed
  Vehicle(String VIN) {
    this.VIN = VIN;
  }

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

  public String getEngineCylinders() {
    return this.engineCylinders;
  }

  public void setTransmission(String transmission) {
    this.transmission = transmission;
  }

  public void setEngineCylinders(String engineCylinders) {
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

  public double getPrice() {
    return this.price;
  }

  public void setMonthlyPayments(double monthlyPayments) {
    this.monthlyPayments = monthlyPayments;
  }

  public void setPrice(int price1) {
    this.price = price1;
  }

  public String[] getAddedFeatures() {
    return this.addedFeatures;
  }

  public void setAddedFeatures(String[] addedFeatures) {
    this.addedFeatures = addedFeatures;
  }

  public String toString() {
    String str =
      "---Price: $" +
      this.price +
      " VIN: " +
      this.getVIN() +
      " Make: " +
      this.make +
      " Model: " +
      this.model +
      " Country: " +
      this.country +
      " Type: " +
      this.type +
      " Year: " +
      this.year +
      " Milage: " +
      this.mileage +
      " Optional Features: " +
      printFeatures() +
      "\n\tSize: " +
      this.size +
      " Color: " +
      this.color +
      " Transmission: " +
      this.transmission +
      " Engine Cylinders: " +
      this.engineCylinders +
      " MPG: " +
      this.mpg +
      " Fuel Type: " +
      this.fuelType +
      " Location: " +
      this.currentLocation;
    return str;
  }

  private String printFeatures() {
    String temp = "";
    if (addedFeatures.length != 0) temp = temp + "{"; else return "{None}";
    for (int i = 0; i < this.addedFeatures.length; i++) {
      if (this.addedFeatures.length - 1 == i) temp =
        temp + this.addedFeatures[i] + "} "; else temp =
        temp + this.addedFeatures[i] + ", ";
    }
    return temp;
  }

  public void setUserTag(String userName) {
    this.userTag = userName;
  }

  private static double calcPrice(
    String typeChoice,
    String sizeChoice,
    String transmission,
    String fuel,
    int mileage,
    int age
  ) {
    double totalCost = 0;
    int typeChoice1 = 1;
    int sizeChoice1 = 1;
    int fuelChoice1 = 1;
    String a[] = {
      "coupe",
      "crossover",
      "truck",
      "sedan",
      "sports car",
      "hatchback",
    };
    for (int i = 0; i < a.length; i++) {
      if (a[i].equals(typeChoice.toLowerCase())) {
        typeChoice1 = i + 1;
        break;
      }
    }
    String b[] = { "compact", "mid-sized", "full-sized" };
    for (int i = 0; i < b.length; i++) {
      if (b[i].equals(sizeChoice.toLowerCase())) {
        sizeChoice1 = i + 1;
        break;
      }
    }
    String c[] = { "gasoline", "diesel", "electric" };
    for (int i = 0; i < c.length; i++) {
      if (c[i].equals(fuel.toLowerCase())) {
        fuelChoice1 = i + 1;
        break;
      }
    }

    switch (typeChoice1) { //this gets the initial cost for the calculation
      case 1:
        {
          switch (sizeChoice1) {
            case 1:
              totalCost = 20000;
              break;
            case 2:
              totalCost = 28000;
              break;
            case 3:
              totalCost = 34000;
              break;
          }
          break;
        } //coupes cost around 34 full-sized, 28 mid-sized, 20000 compact
      case 2:
        {
          switch (sizeChoice1) {
            case 1:
              totalCost = 20000;
              break;
            case 2:
              totalCost = 25000;
              break;
            case 3:
              totalCost = 40000;
              break;
          }
        }
        break; //crossovers cost around 40 full-sized 25 midsized, 20 compact
      case 3:
        {
          switch (sizeChoice1) {
            case 1:
              totalCost = 22000;
              break;
            case 2:
              totalCost = 30000;
              break;
            case 3:
              totalCost = 38000;
              break;
          }
        }
        break; //trucks cost around 38 full-sized, 30 mid-sized, 22 compact
      case 4:
        {
          switch (sizeChoice1) {
            case 1:
              totalCost = 23000;
              break;
            case 2:
              totalCost = 30000;
              break;
            case 3:
              totalCost = 40000;
              break;
          }
        }
        break; //sedans cost around 40 full-sized, 30 mid-sized, and 23 compact
      case 5:
        {
          switch (sizeChoice1) {
            case 1:
              totalCost = 36000;
              break;
            case 2:
              totalCost = 43000;
              break;
            case 3:
              totalCost = 50000;
              break;
          }
        }
        break; //sports cars cost around 36 compact, 43 mid-sized, 50 full-sized
      case 6:
        {
          switch (sizeChoice1) {
            case 1:
              totalCost = 15000;
              break;
            case 2:
              totalCost = 20000;
              break;
            case 3:
              totalCost = 24000;
              break;
          }
        }
        break; //hatchbacks cost around 24, 20, 15
      default:
        System.out.println("you messed it up!");
        break;
    }

    if (fuelChoice1 == 2) totalCost = totalCost + 2250; else if (
      fuelChoice1 == 3
    ) totalCost = totalCost + 19000; //electric cars are more expensive to buy at first
    if ((transmission.toLowerCase()).equals("manual")) totalCost =
      totalCost - 2000; //manuals cost about 2000 less than automatics

    if (mileage <= 3000) totalCost = totalCost - (2 * mileage); //first 3000 miles average costs 2 dollars a mile
    if (mileage >= 3000) totalCost =
      totalCost - 6000 - (.08 * (mileage - 3000)); //after that it is .08 a mile average

    if (age >= 1) totalCost = totalCost * .75;

    while (--age > 0) totalCost = totalCost * .83;
    double finalAnswer = Math.round(totalCost * 100.0) / 100.0;
    //System.out.println("You Vehicles approximate worth is: $" + finalAnswer);
    return finalAnswer;
  }
}
