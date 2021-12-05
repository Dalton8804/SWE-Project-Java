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
         HashMap<String,String> appState = new HashMap<String,String>();
         ListOfCars carList = new ListOfCars();
         ListOfUsers userList = new ListOfUsers();
         LoginPage login = new LoginPage(appState, carList, userList);
         Home home = new Home(appState,carList,userList);
         Router router = new Router("login",login);
         router.addPage("home", home);
         router.logging();
         router.startRouter();
         

         
         /* FUNCTIONING COMPARATOR SHIT YUHHHHHHH
         ListOfCars carList = new ListOfCars();
         exitApp();
         System.out.println(carList.getListOfCars());
         Collections.sort(carList.getListOfCars(), Comparator.comparing((Vehicle car) -> car.getVIN())); 
         System.out.println(carList.getListOfCars());
         */

         // PRINTS THE NUMBERS OF VEHICLES
         /* GENERATES 1000 CARS AND SERIALIZES THEM
         carList = Sort.makeCars(1000,carList);
         System.out.println(carList.getCar(0));
         carList.serialize();*/


      }

    public static void exitApp(){
       ListOfCars.serialize();
       ListOfUsers.serialize();
    }
}