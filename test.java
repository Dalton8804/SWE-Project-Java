import java.util.HashMap;
import java.util.ArrayList;

public class test {
    static ListOfCars bigAssVehicleList = new ListOfCars();
    
    static ArrayList<Vehicle> carArrayList = bigAssVehicleList.getListOfCars();
    public static void main(String args[]){
        FilterTest ft = new FilterTest();
        
        System.out.println(filterList(ft.getFilterObj()));
        System.out.println("Make of first car: "+carArrayList.get(0).getMake());

        
    }
    public static ArrayList<Vehicle> filterList(Filters filterObject) {

        ArrayList<Vehicle> filtered = new ArrayList<Vehicle>();

        for (Vehicle v:carArrayList) {
            boolean meetsCriteria = true;
            if (filterObject.make != null) { //Check if they are filtering on this prop
                if (filterObject.make != v.make) {
                    meetsCriteria = false;
                } 
            }
            if (filterObject.model != null) { //Check if they are filtering on this prop
                if (filterObject.model != v.model) {
                    meetsCriteria = false;
                } 
            }
            if (filterObject.country != null) { //Check if they are filtering on this prop
                if (filterObject.country != v.country) {
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
                if (filterObject.size != v.size) {
                    meetsCriteria = false;
                } 
            }
            if (filterObject.color != null) { //Check if they are filtering on this prop
                if (filterObject.color != v.color) {
                    meetsCriteria = false;
                } 
            }
            if (filterObject.transmission != null) { //Check if they are filtering on this prop
                if (filterObject.transmission != v.transmission) {
                    meetsCriteria = false;
                } 
            }
            if (filterObject.numberCylinders != null) { //Check if they are filtering on this prop
                if (filterObject.numberCylinders != v.engineCylinders) {
                    meetsCriteria = false;
                } 
            }
            if (filterObject.mpg != 0) { //Check if they are filtering on this prop
                if (filterObject.mpg != v.mpg) {
                    meetsCriteria = false;
                } 
            }
            if (filterObject.fuelType != null) { //Check if they are filtering on this prop
                if (filterObject.fuelType != v.fuelType) {
                    meetsCriteria = false;
                } 
            }
            if (filterObject.currentLocation != null) { //Check if they are filtering on this prop
                if (filterObject.currentLocation != v.currentLocation) {
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


            if (meetsCriteria == true) {
                filtered.add(v);
            }
        }
        return filtered;
    }
}