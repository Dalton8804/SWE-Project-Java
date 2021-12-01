import java.util.Scanner;

public class Main {
    String[] Usernames = User.getUsers();
    public static void main(String args[]) {


    }
    public static void onStartUp(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your username: ");
        String Username = input.nextLine();;
        if (Usernames.contains(Username)){
            System.out.println("Hello "+Username+"! Please enter your password :) You have 5 tries!");
            String Password;
            int triesLeft = 5;
            while(true){
                Password = input.nextLine();
                if (Password==Username.getPass()) {
                    System.out.println("Welcome Back!");
                    break;
                } else {
                    triesLeft--;
                    System.out.println("Password is Incorrect, you have " + triesLeft +" tries left.");
                }
            }
        } else {
            User.addUser(Username);
            System.out.println("Please create a password :)");
            User.setPassword(input.nextLine());
        }
        System.out.println("Username");
    }
}