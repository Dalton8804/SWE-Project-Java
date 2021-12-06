import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class AccountPage extends Page{

    HashMap<String,String> appState;
    ListOfCars carList;
    ListOfUsers userList;
    String nextRoute;

    Scanner input = new Scanner(System.in);

    public AccountPage(HashMap<String,String> appState, ListOfCars carList, ListOfUsers userList){
        super(appState);
        this.appState = appState;
        this.carList = carList;
        this.userList = userList;
    }
    public String render(){
        Main.clearScreen();
        System.out.println("Welcome to your Account Page "+ appState.get("username")+"!");
        System.out.println("1: View Listings, 2: Edit Account, 3: Logout, 4: Exit App");
        int choice = input.nextInt();
        switch(choice){
            case 1:
                renderViewListings();
                // Use germy's filtering to filter by vehicles that match the user id
                // display only the vehicles for sale by active user
            break;
            case 2:
                renderEditAccount();
            break;
            case 3: 
                nextRoute = "login";
            break;
            case 4: 
                nextRoute="exit";
            break;
        }
        return nextRoute;
    }
    private void renderEditAccount() {
        Main.clearScreen();
        System.out.println("Which attribute would you like to edit?"+'\n'+
            "1: Username, 2: Email, 3: Password, 4: Delete Account, 5: None,take me back");
        int choice = input.nextInt();
        input.nextLine();
        Main.clearScreen();
        switch(choice){
            case 1: 
                System.out.println("What would you like us to call you instead?");
                String newName = input.nextLine();
                userList.getUserByName(appState.get("username")).setName(newName);
                appState.put("username", newName);
                ListOfUsers.serialize();
                
            break;
            case 2: 
                System.out.println("What would you like your new email to be?"); 
                String newEmail = input.nextLine();
                userList.getUserByName(appState.get("username")).setEmail(newEmail);
                appState.put("email", newEmail);
                ListOfUsers.serialize();
            break;
            case 3: 
                System.out.println("What would you like your new password to be?");
                String newPass = input.nextLine();
                userList.getUserByName(appState.get("username")).setPassword(newPass);
                appState.put("password", newPass);
                ListOfUsers.serialize();
            break;
            case 4: 
                System.out.println("Are you sure you want to delete your account?"+'\n'+
                    "This step is permanent and will delete all of your listed vehicles as well."+'\n'+
                    "Type \'yes\' without quotes if you still want to continue.");
                if (input.nextLine().equals("yes"))
                    userList.deleteUser(appState.get("username"));
                    
            break;
            case 5: break;
            default: break;
        }
        if (choice!=4)
            nextRoute="account";
        else 
            nextRoute ="login";
    }
    private void renderViewListings() {
        Main.clearScreen();
        listCars(carList.getListOfCars()); // YOURE WORKING HERE DUMB FUCK
        System.out.println("1: List New Vehicle, 2: Remove Listed Vehicle, 3: Return to Account, 4: Exit App");
        int choice = input.nextInt();
        input.nextLine();
        switch (choice){
            case 1: 
                System.out.println("Enter VIN(17 digit string including uppercase letters and digits only):");
                String VIN = input.nextLine();
                System.out.println("Enter type(coupe, suv, truck, etc.):");
                String type = input.nextLine();
                System.out.println("Enter make:");
                String make = input.nextLine();
                System.out.println("Enter model:");
                String model = input.nextLine();
                System.out.println("Enter country of production:");    
                String country = input.nextLine();
                System.out.println("Enter year:");
                int year = input.nextInt();
                System.out.println("Enter mileage:");
                int mileage = input.nextInt();
                input.nextLine();
                System.out.println("Enter added features(seperate multiple features by comma):");
                String optionalFeaturesString = input.nextLine(); // parse into array
                optionalFeaturesString = optionalFeaturesString.trim();
                String[] addedFeatures = optionalFeaturesString.split(",");
                System.out.println("Enter size(compact, mid-size, full-size):");
                String size = input.nextLine();
                System.out.println("Enter color:");
                String color = input.nextLine();
                System.out.println("Enter transmission(auto or manual):");
                String transmission  = input.nextLine();
                System.out.println("Enter number of cylinders in engine:");
                String engineCylinders = input.nextLine();
                System.out.println("Enter miles per gallon:");
                int mpg = input.nextInt();
                input.nextLine();
                System.out.println("Enter fuel type(gasoline, diesel):");
                String fuelType = input.nextLine();
                System.out.println("Enter current location:");
                String currentLocation = input.nextLine();
                System.out.println("Enter monthly payments:");
                int monthlyPayments = input.nextInt();
                System.out.println("Enter price (if you dont know put 0, we will calculate price for you):");
                int price = input.nextInt();
                input.nextLine();
                Vehicle newCar = new Vehicle(VIN, type, make, model,
                        country, year, mileage, addedFeatures,
                        size, color, transmission, engineCylinders,
                        mpg, fuelType, currentLocation, monthlyPayments, price);

                newCar.setUserTag(appState.get("username"));
                carList.addCar(newCar);
                nextRoute="account";
            break;
            case 2: 
                System.out.println("Enter the VIN of the car you would like to remove");
                String VINtoRemove = input.nextLine();
                carList.removeCar(VINtoRemove);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {}
                nextRoute="account";
            break;
            case 3: nextRoute="account";break;
            case 4: nextRoute="exit"; break;
        }
        
    }
    private ArrayList<Vehicle> filterUsersCars() {
        FilterFun ft = new FilterFun();
        Filters filter = new Filters();
        filter.userTag = appState.get("username");
        ArrayList<Vehicle> listOfUsersCars = new ArrayList<Vehicle>();
        listOfUsersCars = ft.filterList(filter, carList);

        return listOfUsersCars;
    }

    private void listCars(ArrayList<Vehicle> arr){
        int i=0;
        System.out.println("List of Cars");
        for(Vehicle v: arr){
            if (v.userTag.equals(appState.get("username"))) {
                System.out.println((i + 1) + ". Price: "+v.getPrice()+", Vin: " + v.getVIN() + ", Make: " + v.getMake() + ", Model: " + v.getModel());
                i++;
            }
        }
    }
}
