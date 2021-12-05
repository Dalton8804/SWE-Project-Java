import java.util.HashMap;
import java.util.Scanner;

public class LoginPage extends Page{

    HashMap<String,String> appState;
    ListOfUsers userList;
    ListOfCars carList;
    String nextRoute;
    
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
            while(true){
                String password = in.nextLine();
                if (userList.getUserByName(username).getPassword().equals(password)){
                    System.out.println("Choose an option (enter the number of your selection):");
                    System.out.println("1: Home, 2: Account, 3: Logout, 4: Exit");
                    int choice = in.nextInt();
                    in.nextLine();
                    switch(choice){
                        case 1: 
                            //  render Home 
                            //  returns home string to router to display
                            nextRoute =  "home";
                            break;
                        case 2: 
                            //  render Account 
                            //  returns account string to router to display
                            nextRoute =  "account";
                            break;
                        case 3: 
                            //  render Logout 
                            //  returns logout string to router to restart app
                            nextRoute = "login";
                            System.out.println("Thanks for visiting!");
                            break;
                        case 4: 
                            Main.exitApp(); 
                        break;
                    }
                    break;
                }
                else {
                    System.out.println("Your password is incorrect. Please try again");
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
            System.out.println("Enter your DL number for security purposes");
            System.out.println("We will not steal your identity ;) (Unless your name is Stefan Andrei)");
            String dlNumber = in.nextLine();
            userList.addUser(new User(username,email,password,dlNumber));
            
        }
        appState.put("username",username);
        appState.put("email",userList.getUserByName(username).getEmail());
        appState.put("password",userList.getUserByName(username).getPassword());
        appState.put("id",userList.getUserByName(username).getID());
        in.close();
        
        return nextRoute;
    }
}
