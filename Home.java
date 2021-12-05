import java.util.HashMap;
import java.util.Scanner;

public class Home extends Page {

    enum Action {
        LIST,
        GOTOUSER,
        GOTONEXTPAGE,
        GOTOPREVPAGE,
        GOTOCAR,
        EXIT,
        DEFAULT
    }

    private int carListCursor;

    private int carListCursor = 0;
    private ListOfUsers userList;
    private ListOfCars carList;

    Home(HashMap<String, String> appState, ListOfCars carList, ListOfUsers userList) {
        this.carListCursor = 0;
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
                case default:
                    return Action.DEFAULT;
            }
        }else{
            switch(actionCode){
                case 0:
                    return Action.GOTONEXTPAGE;
                case 1:
                    return Action.GOTOPREVPAGE;
                case 2:
                    return Action.GOTOUSER;
                case 3:
                    return Action.GOTOCAR;
                case 4:
                    return Action.EXIT;
                case default:
                    return Action.DEFAULT;
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
                case Action.LIST:
                    break;
                case Action.GOTOUSER:
                    break;
                case Action.GOTONEXTPAGE:
                    break;
                case Action.GOTOPREVPAGE:
                    break;
                case Action.GOTOCAR:
                    break;
                case Action.EXIT:
                    break;
                case Action.DEFAULT:
                    break;
            }
            if(carListCursor == 0){
                System.out.println("0 List all cars for sale, 1 go to my page, 3 exit");
            } else {
                System.out.println("0 go to next page, 1 go to previous page, 2  go to my page, 3  go to a car by vin, 4 exit");
            }
        }
        return "home";
    }
}
