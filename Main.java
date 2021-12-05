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
         
         /* FUNCTIONING COMPARATOR SHIT YUHHHHHHH
         ListOfCars carList = new ListOfCars();
         exitApp();
         System.out.println(carList.getListOfCars());
         Collections.sort(carList.getListOfCars(), Comparator.comparing((Vehicle car) -> car.getVIN())); 
         System.out.println(carList.getListOfCars());
         */

         // PRINTS THE NUMBERS OF VEHICLES
         ListOfCars carList = new ListOfCars();
         UserList userList = new UserList();
         AppState appState = new AppState();
         System.out.println(carList.getListOfCars().size());
         Router router = new Router();
         /* GENERATES 1000 CARS AND SERIALIZES THEM
         carList = Sort.makeCars(1000,carList);
         System.out.println(carList.getCar(0));
         carList.serialize();*/


      }

    public static void exitApp(){
       //ListOfCars.serialize();
       ListOfUsers.serialize();
    }
}