import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.*;

import javax.imageio.plugins.tiff.ExifGPSTagSet;

public class Main {
   public static void main(String args[]) {
         /*LoginPage login = new LoginPage(new HashMap<String,String>(), new ListOfCars(), new ListOfUsers());
         exitApp();
         login.render(); // Class cast exception ListOfUser.java line 43, in checkName();*/
         ListOfCars carList = new ListOfCars();
         exitApp();
         carList.addCar(new Vehicle("4 compare test"));
         carList.addCar(new Vehicle("1 compare test"));
         carList.addCar(new Vehicle("3 compare test"));
         carList.addCar(new Vehicle("2 compare test"));
         System.out.println(carList.getListOfCars());
         Collections.sort(carList.getListOfCars(), Comparator.comparing((Vehicle car) -> car.getVIN())); 
         System.out.println(carList.getListOfCars());

      }

    public static void exitApp(){
       ListOfCars.serialize();
       ListOfUsers.serialize();
    }
}