import java.util.HashMap;
import java.util.Scanner;

public class LoginPage extends Page{
    HashMap<String,String> appState;
    ListOfUsers userList;
    ListOfCars carList;
    LoginPage(HashMap<String,String> appState, ListOfCars carList, ListOfUsers userList){
        super(appState);
        this.appState = appState;
        this.carList = carList;
        this.userList = userList;
    }

    public String render(){

        Scanner in = new Scanner(System.in);
        System.out.println("Welcome! Please start by entering your username :)");
        
        String username = in.nextLine();

        // Account Exists
        if(userList.checkName(username)){
            System.out.println("Welcome back "+username+"!");
            System.out.println("Please enter your password");
            while(true);
                String password = in.nextLine();
                if (userList.getUserByName(username).getPassword().equals(password)){
                    System.out.println("Choose an option (enter the number of your selection):");
                    System.out.println("1: Home, 2: Account, 3: Logout, 4: Exit");
                    int choice = in.nextInt();
                    in.next();
                    switch(choice){
                        case 1: /* render Home? */ break;
                        case 2: /* render Account? */ break;
                        case 3: /* Logout */ break;
                        case 4: Main.exitApp(); break;
                    }
                    break;
                }
                else {
                    int numberOfTries = 5;
                    while (numberOfTries>0){
                        System.out.println("Your password is incorrect, try again");
                        /// ENTER ACTUAL FUNCTINOAL SHIT HERE



                    }
                }
        }
        // Account Doesnt Exist, Account creation
        else {
            System.out.println("You must be new here.");
            System.out.println("Please enter your email.");
            String email = in.nextLine();
            System.out.println("Enter a new password.");
            String password = in.nextLine();
            userList.addUser(new User(username, email, password, getNewID()));
        }
        in.close();
        String nextRoute = "";
        return nextRoute;
    }

    public int getNewID(){
        return 12345678; // change to random 8 digit int
    }
}
