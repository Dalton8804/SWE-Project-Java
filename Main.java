import java.util.Scanner;

public class Main {
    String[] Usernames = User.getUsers();
    public static void main(String args[]) {


    }
    public static void onStartUp(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your username: ");
        String Username = input.nextLine();
        if (Usernames.contains(Username)){

        }
        System.out.println("Username");
    }
}