import java.util.Scanner;

public class Home {
    static boolean awaitingInput = true;
    public static void HomePage(){

        Scanner in = new Scanner(System.in);

        System.out.println("Home");
        while(awaitingInput){
            System.out.println("What would you like to do?");
            System.out.println("Choose one: Browse Listings(1), View Account(2), Log Out(3), Exit(4)");
            int nextStep = in.nextInt();
            in.nextLine();
            switch(nextStep){
                case 1: awaitingInput = false; break;
                case 2: awaitingInput = false; break;
                case 3: awaitingInput = false; break;
                case 4: Main.killApp(); break;
            }
        }
        
        in.close();
    
    }
}
