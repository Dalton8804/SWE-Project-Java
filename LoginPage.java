<<<<<<< HEAD
import java.util.HashMap;
import java.util.Scanner;

public class LoginPage extends Page {

  HashMap<String, String> appState;
  ListOfUsers userList;
  ListOfCars carList;
  String nextRoute = "default";

  LoginPage(
    HashMap<String, String> appState,
    ListOfCars carList,
    ListOfUsers userList
  ) {
    super(appState);
    this.appState = appState;
    this.carList = carList;
    this.userList = userList;
  }

  public String render() {
    Main.clearScreen();
    Input input = Input.getInstance();
    System.out.println("Welcome! Please start by entering your username :)");

    String username = input.getLine();

    // Account Exists
    if (userList.checkName(username)) {
      Main.clearScreen();
      System.out.println("Welcome back " + username + "!");
      System.out.println("Please enter your password");
      while (true) {
        String password = input.getLine();
        if (userList.getUserByName(username).getPassword().equals(password)) {
          Main.clearScreen();
          System.out.println(
            "Choose an option (enter the number of your selection):"
          );
          System.out.println("1: Home, 2: Account, 3: Logout, 4: Exit");
          int choice = input.getInt();
          switch (choice) {
            case 1:
              //  render Home
              //  returns home string to router to display
              nextRoute = "home";
              break;
            case 2:
              //  render Account
              //  returns account string to router to display
              nextRoute = "account";
              break;
            case 3:
              //  render Logout
              //  returns logout string to router to restart app
              nextRoute = "login";
              System.out.println("Thanks for visiting!");
              break;
            case 4:
              return "exit";
          }
          break;
        } else {
          System.out.println("Your password is incorrect. Please try again");
        }
      }
    }
    // Account Doesnt Exist, Account creation
    else {
      Main.clearScreen();
      System.out.println("You must be new here.");
      System.out.println("Please enter your email.");
      String email = input.getLine();
      System.out.println("Enter a new password.");
      String password = input.getLine();
      System.out.println("Enter your DL number for security purposes");
      System.out.println(
        "We will not steal your identity ;) (Unless your name is Stefan Andrei)"
      );
      String dlNumber = input.getLine();
      userList.addUser(new User(username, email, password, dlNumber));
    }
    appState.put("username", username);
    appState.put("email", userList.getUserByName(username).getEmail());
    appState.put("password", userList.getUserByName(username).getPassword());
    appState.put("id", userList.getUserByName(username).getID());

    return nextRoute;
  }
=======
public class LoginPage extends Page{
    LoginPage(){}
    
    LoginPage(int value){
        super(value);
    }

    public void Display(){
        System.out.println("This is the Login Page");
    }
>>>>>>> 1e1d282ee50080210ff42e07bd13a87b9775c630
}
