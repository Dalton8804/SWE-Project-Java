import java.util.HashMap;
import java.util.ArrayList;

public class test {
    
    public static void main(String args[]){
        Vehicle v = new Vehicle("String VIN", "String type", "String make", "String model",
        "String country", 2020, 40000, new String[]{"String[] addedFeatures"},
        "String size", "String color"," String transmission", "String engineCylinders", 0, "String fuelType",
        "String currentLocation", 350, 0);
        System.out.println(v.getPrice());

        
    }
    
}