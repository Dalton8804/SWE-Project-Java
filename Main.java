import java.util.HashMap;



public class Main {
   public static void main(String args[]) {
      
         HashMap<String,String> appState = new HashMap<String,String>();
         ListOfCars carList = new ListOfCars();
         ListOfUsers userList = new ListOfUsers();
         LoginPage login = new LoginPage(appState, carList, userList);
         Home home = new Home(appState,carList,userList);
         AccountPage account = new AccountPage(appState,carList,userList);
         Router router = new Router("login",login);
         router.addPage("home", home);
         router.addPage("account", account);
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
         //GENERATES 1000 CARS AND SERIALIZES THEM
         /*ListOfCars carList = new ListOfCars();
         //carList = Sort.makeCars(10,carList);
         carList.serialize();
         String[] arr = carList.getCar(60).getAddedFeatures();
         for(String x: arr)
            System.out.println(x);
         System.out.println(carList.size());*/


      }

    public static void exitApp(){
       ListOfCars.serialize();
       ListOfUsers.serialize();
    }
}