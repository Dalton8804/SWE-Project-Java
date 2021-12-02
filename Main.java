import java.util.Scanner;

public class Main {
    static User currentUser;
    static UserList Users = getUsersFromFile();
    static Boolean AppRunning = true;
    static int iterationCount = 0;
    static boolean awaitingInput = true;
    public static void main(String args[]) {
        onStartUp();
    }

    public static void onStartUp(){
        Scanner input = new Scanner(System.in);
        while(AppRunning){
            System.out.print("Enter your username: ");
            String Username = input.nextLine();
            if (Users.checkName(Username)){
                System.out.println("Hello "+Username+"! Please enter your password :) You have 5 tries!");
                String Password;
                int triesLeft = 5;
                currentUser = Users.getUserByName(Username);
                while(true){
                    Password = input.nextLine();
                    if (Password.equals(currentUser.getPassword())) {
                        System.out.println("Welcome Back!");
                        AppRunning = false;
                        Home.HomePage();
                        break;
                    } else {
                        triesLeft--;
                        System.out.println("Password is Incorrect, you have " + triesLeft +" tries left.");
                    }
                }
                //
            } else {
                System.out.print("Please enter your email: ");
                String email = input.nextLine();
                System.out.print("\nPlease create a password: ");
                String Password = input.nextLine();
                currentUser = new User(Username, email, Password, getNewID());
                Users.addUser(currentUser);
                Home.HomePage();

            }
            System.out.println(currentUser.getUsername()+" "+currentUser.getEmail()+" "+currentUser.getPassword());
            iterationCount++;
        }
        input.close();
    }
    public static int getNewID(){
        return 10; // change to random 8 digit int later
    }

    public static UserList getUsersFromFile(){
        //pull serialized objects from file
        return new UserList();
    }

    public static void killApp(){
        AppRunning = false;
    }
}