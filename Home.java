import java.util.HashMap;
import java.util
public class Home extends Page {

    enum Action {
        LIST,
        GOTOUSER,
        GOTONEXTPAGE,
        GOTOPREVPAGE,
        GOTOCAR,
        EXIT
    }

    private int carListCursor;


    Home(HashMap<String, String> appState, ListOfCars carList, ListOfUsers userList){
        this.carListCursor = 0;
        this.appState = appState;
        this.carList = carList;
        this.userList = userList;
        super(appState);
    }

    public String getCarSelection(Scanner input){
        System.out.println("Please enter a vin:");
        String vin = input.nextLine();
        return vin;
    }

    public Action getAction(int actionCode){
        if(carListCursor > 0){
            switch(actionCode){
                case 0:
                    return Action.LIST;
                case 1:
                    return Action.GOTOUSER;
                case 2:
                    return Action.EXIT;
            }
        }else{
            switch(actionCode){
                case 0:
                    return

            }
        }
    }

    @Override
    public String render() {
        System.out.println("Welcome to car app Home!");
        System.out.println("0 List all cars for sale, 1 go to my page, 2 exit");
        Scanner input = new Scanner(System.in);
        while(true){
            int actionCode = input.nextInt();
            int action = getAction(actionCode);
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
                System.out.println("0 go to next page, 1 go to previous page, 2  go to my page, 3  go to a car by vin");
            }
        }
        return "home";
    }
}
