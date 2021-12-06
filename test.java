import java.util.HashMap;
import java.util.ArrayList;

public class test {
    static ListOfCars bigAssVehicleList = new ListOfCars();
    
    public static void main(String args[]){
        FilterFun ft = new FilterFun();
        bigAssVehicleList = Sort.makeCars(1000, bigAssVehicleList);
        System.out.println(ft.filterList(ft.getFilterObj(),bigAssVehicleList));
        ListOfCars.serialize();
        

        
    }
    
}