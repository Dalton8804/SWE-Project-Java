import java.util.HashMap;
import java.util.Scanner;

public class Home extends Page {

    enum Action {
        LIST,
        GOTOUSER,
        GOTOCAR,
    }
    HashMap<String, String> appState;
    private int carListCursor = 0;
    private ListOfUsers userList;
    private ListOfCars carList;

    Home(HashMap<String, String> appState, ListOfCars carList, ListOfUsers userList) {
        super(appState);
        this.carListCursor = 0;
        this.appState = appState;
        this.carList = carList;
        this.userList = userList;
    }


    @Override
    public String render() {
        System.out.println("Welcome to car app Home!");
        System.out.println("0 List all cars for sale, 1 go to my page, 2 exit");
        Scanner input = new Scanner(System.in);
        while(true){
            int action = input.nextInt();
            switch(action){
                case LIST:
                    System.out.println("Listing cars");
                    break;
                case GOTOUSER:
                    return "user";
                case GOTOCAR:
                    String selectedCar = getCarSelection();
                    appState.put("selectedCar", selectedCar);
                    return "cardetail";
                case default:
                    System.out.println("Invalid input!");
                    break;
            }
            if(carListCursor == 0){
                System.out.println("0 List all cars for sale, 1 go to my page");
            } else {
                System.out.println("0 go to next page, 1 go to previous page, 2  go to my page, 3 ")
            }
        }
        return "home";
    }
}
