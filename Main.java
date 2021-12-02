import java.util.Scanner;

public class Main {
    static UserList Users = new UserList();
    public static void main(String args[]) {
        onStartUp();

    }
    public static void onStartUp(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your username: ");
        String Username = input.nextLine();
        if (Users.checkName(Username)){
            System.out.println("Hello "+Username+"! Please enter your password :) You have 5 tries!");
            String Password;
            int triesLeft = 5;
            User currUser = Users.getUser(Username);
            while(true){
                Password = input.nextLine();
                if (Password==currUser.getPassword()) {
                    System.out.println("Welcome Back!");
                    break;
                } else {
                    triesLeft--;
                    System.out.println("Password is Incorrect, you have " + triesLeft +" tries left.");
                }
            }
        } else {
            System.out.println("Please enter your email :)");
            String email = input.nextLine();
            System.out.println("Please create a password :)");
            String Password = input.nextLine();
            Users.addUser(new User(Username, email, Password, getNewID()));
        }
        System.out.println(Users.getUserList());
        input.close();
    }
    public static int getNewID(){
        return 10; // change to random 8 digit int later
    }
}