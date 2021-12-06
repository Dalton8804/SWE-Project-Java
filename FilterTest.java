import java.util.ArrayList; // import the ArrayList class
import java.util.Scanner;  // Import the Scanner class
import java.util.logging.Filter;

public class FilterTest {

  

  public static void main(String[] args) {
    FilterTest ft = new FilterTest();
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
}
/*
After you get the Filter obj, pass the obj into the filter function for the Vehicle list

Something like this:

ArrayList<Vehicle> bigAssVehicleList;


public List<Vehicle> filterList(Filters filterObject) {

  List<Vehicle> filtered = new List<Vehicle>;

  for (Vehicle v in bigAssVehicleList) {
    boolean meetsCriteria = true;

    if (filterObject.make != null) { //Check if they are filtering on this prop
      if (filterObject.make != v.make) {
        meetsCriteria = false;
      } 
    }

    .....Repeat this block for every property ^^^




    if meetsCriteria == true {
      filtered.add(v);
    }
  }

}*/

