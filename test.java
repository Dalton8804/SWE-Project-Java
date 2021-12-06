import java.util.HashMap;
import java.util.ArrayList;

public class test {
    
    public static void main(String args[]){
        ListOfCars carList = new ListOfCars();

        carList = Sort.makeCars(1000, carList);
        ListOfCars.serialize();
    }
    
}