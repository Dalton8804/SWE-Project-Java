import java.util.ArrayList; // import the ArrayList class
import java.util.Scanner;  // Import the Scanner class
import java.util.logging.Filter;

public class FilterFun {

  

  public static void main(String[] args) {
    FilterFun ft = new FilterFun();
    ft.getFilterObj();
  }

  public Filters getFilterObj() {

    Scanner scan = new Scanner(System.in);  // Get user input
    System.out.println();
    System.out.println("Please select filtering criteria (digits separated by space)\n");
    System.out.println("Make (1)");
    System.out.println("Model (2)");
    System.out.println("Country (3)");
    System.out.println("Year (4)");
    System.out.println("Mileage (5)");
    System.out.println("Size (6)");
    System.out.println("Color (7)");
    System.out.println("Transmission (8)");
    System.out.println("Number Cylinders (9)");
    System.out.println("MPG (10)");
    System.out.println("Fuel Type (11)");
    System.out.println("Current Location (12)");
    System.out.println("Monthly Payment (13)");
    System.out.println("Price (14)\n\n");

    ArrayList<Integer> filters = new ArrayList(); //Split list of input integers
    String str = scan.nextLine();
    for(String i:str.split(" ")){
      filters.add(Integer.parseInt(i));
    }

    Filters f = new Filters();

    if (filters.contains(1)) { //Check input integers to prompt accordingly
      System.out.println("Make to search: " );
      f.make = scan.nextLine();
    }
    if (filters.contains(2)) { //Check input integers to prompt accordingly
      System.out.println("Model to search: " );
      f.model = scan.nextLine();
    }
    if (filters.contains(3)) { //Check input integers to prompt accordingly
      System.out.println("Country to search: " );
      f.country = scan.nextLine();
    }
    if (filters.contains(4)) { //Check input integers to prompt accordingly
      System.out.println("Year to search: " );
      f.year = Integer.parseInt(scan.nextLine());
    }
    if (filters.contains(5)) { //Check input integers to prompt accordingly
      System.out.println("Max Mileage: " );
      f.mileage = Integer.parseInt(scan.nextLine());
    }
    if (filters.contains(6)) { //Check input integers to prompt accordingly
      System.out.println("Size to search: " );
      f.size = scan.nextLine();
    }
    if (filters.contains(7)) { //Check input integers to prompt accordingly
      System.out.println("Color to search: " );
      f.color = scan.nextLine();
    }
    if (filters.contains(8)) { //Check input integers to prompt accordingly
      System.out.println("Transmission to search (Manual / Auto): " );
      f.transmission = scan.nextLine();
    }
    if (filters.contains(9)) { //Check input integers to prompt accordingly
      System.out.println("Number of Cyllinders to search: " );
      f.numberCylinders = scan.nextLine();
    }
    if (filters.contains(10)) { //Check input integers to prompt accordingly
      System.out.println("Minimum MPG: " );
      f.mpg = Integer.parseInt(scan.nextLine());
    }
    if (filters.contains(11)) { //Check input integers to prompt accordingly
      System.out.println("Fuel Type to search (Gas / Electric): " );
      f.fuelType = scan.nextLine();
    }
    if (filters.contains(12)) { //Check input integers to prompt accordingly
      System.out.println("Current location to search: " );
      f.currentLocation = scan.nextLine();
    }
    if (filters.contains(13)) { //Check input integers to prompt accordingly
      System.out.println("Max monthly payment: " );
      f.monthlyPayment = Integer.parseInt(scan.nextLine());
    }
    if (filters.contains(14)) { //Check input integers to prompt accordingly
      System.out.println("Max price: " );
      f.maxPrice = Integer.parseInt(scan.nextLine());
      System.out.println("Min price: " );
      f.minPrice = Integer.parseInt(scan.nextLine());
    }

    return f;
  }

  public ArrayList<Vehicle> filterList(Filters filterObject,ListOfCars VehicleList) {

    ArrayList<Vehicle> filtered = new ArrayList<Vehicle>();
    ArrayList<Vehicle> carArrayList = VehicleList.getListOfCars();
    for (Vehicle v:carArrayList) {
        boolean meetsCriteria = true;
        if (filterObject.make != null) { //Check if they are filtering on this prop
            if (!filterObject.make.equalsIgnoreCase(v.make)) {
                meetsCriteria = false;
            } 
        }
        if (filterObject.model != null) { //Check if they are filtering on this prop
            if (!filterObject.model.equalsIgnoreCase(v.model)) {
                meetsCriteria = false;
            } 
        }
        if (filterObject.country != null) { //Check if they are filtering on this prop
            if (!filterObject.country.equalsIgnoreCase(v.country)) {
                meetsCriteria = false;
            } 
        }
        if (filterObject.year != 0) { //Check if they are filtering on this prop
            if (filterObject.year != v.year) {
                meetsCriteria = false;
            } 
        }
        if (filterObject.mileage != 0) { //Check if they are filtering on this prop
            if (filterObject.mileage != v.mileage) {
                meetsCriteria = false;
            } 
        }
        if (filterObject.size != null) { //Check if they are filtering on this prop
            if (!filterObject.size.equalsIgnoreCase(v.size)) {
                meetsCriteria = false;
            } 
        }
        if (filterObject.color != null) { //Check if they are filtering on this prop
            if (!filterObject.color.equalsIgnoreCase(v.color)) {
                meetsCriteria = false;
            } 
        }
        if (filterObject.transmission != null) { //Check if they are filtering on this prop
            if (!filterObject.transmission.equalsIgnoreCase(v.transmission)) {
                meetsCriteria = false;
            } 
        }
        if (filterObject.numberCylinders != null) { //Check if they are filtering on this prop
            if (!filterObject.numberCylinders.equalsIgnoreCase(v.engineCylinders)) {
                meetsCriteria = false;
            } 
        }
        if (filterObject.mpg != 0) { //Check if they are filtering on this prop
            if (filterObject.mpg != v.mpg) {
                meetsCriteria = false;
            } 
        }
        if (filterObject.fuelType != null) { //Check if they are filtering on this prop
            if (!filterObject.fuelType.equalsIgnoreCase(v.fuelType)) {
                meetsCriteria = false;
            } 
        }
        if (filterObject.currentLocation != null) { //Check if they are filtering on this prop
            if (!filterObject.currentLocation.equalsIgnoreCase(v.currentLocation)) {
                meetsCriteria = false;
            } 
        }
        if (filterObject.monthlyPayment != 0) { //Check if they are filtering on this prop
            if (filterObject.monthlyPayment < v.monthlyPayments) {
                meetsCriteria = false;
            } 
        }
        if (filterObject.maxPrice != 99999999) { //Check if they are filtering on this prop
            if (filterObject.maxPrice < v.price || v.price < filterObject.minPrice) {
                meetsCriteria = false;
            } 
        }
        if (filterObject.userTag != null) { //Check if they are filtering on this prop
            if (!filterObject.userTag.equalsIgnoreCase(v.userTag)) {
                meetsCriteria = false;
            } 
        }


        if (meetsCriteria == true) {
            filtered.add(v);
        }
    }
    return filtered;
}
}


