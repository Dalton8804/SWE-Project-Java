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
        HOME,
        DEFAULT
    }

    private int carListCursor;
    private ListOfUsers userList;
    private ListOfCars carList;

    Home(HashMap<String, String> appState, ListOfCars carList, ListOfUsers userList) {
        super(appState);
        this.carListCursor = 0;
        this.carList = carList;
        this.userList = userList;
    }

    public void getCarSelection(Input input){
        System.out.println("Please enter a vin:");
        String vin = input.getLine();
        appState.put("selectedCar", vin);
        return;
    }

    public Action getAction(int actionCode){
        if(carListCursor == 0){
            switch(actionCode){
                case 0:
                    return Action.GOTONEXTPAGE;
                case 1:
                    return Action.GOTOUSER;
                case 2:
                    return Action.EXIT;
                default:
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
                default:
                    return Action.DEFAULT;
            }
        }
    }

    private void listCars(){
        System.out.println("Results for page " + (carListCursor));
        for(int i = carListCursor * 4; i < carListCursor + 4 && i < carList.size(); i++){
            Vehicle c = carList.getCar(i);
            System.out.println(i + ". Vin: " + c.getVIN() + ", Make: " + c.getMake() + ", Model: " + c.getModel());
        }

    }

    private void nextPage(){
        if(carListCursor < carList.size() - 1){
            carListCursor += 1;
            listCars();
        } else {
            System.out.println("No more pages...");
        }
    }

   private void prevPage(){
        if(carListCursor > 0){
            carListCursor -= 1;
            listCars();
        } else {
            System.out.println("You are on the first page already");
        }
   }

    @Override
    public String render() {
        System.out.println("Welcome to car app Home!");
        System.out.println("0 List cars for sale, 1 go to my page, 2 exit");
        Input input = Input.getInstance();
        while(true){  
            int actionCode = input.getInt();
            Action action = getAction(actionCode);
            switch(action){
                case GOTOUSER:
                    return "account";
                case GOTONEXTPAGE:
                    nextPage();
                    break;
                case GOTOPREVPAGE:
                    prevPage();
                    break;
                case GOTOCAR:
                    getCarSelection(input);
                    return "cardetail";
                case EXIT:
                    return "exit";
                case HOME: 
                    break;
                case DEFAULT:
                    break;
            }
            if(carListCursor == 0){
                System.out.println("0 List all cars for sale, 1 go to my page, 3 exit");
            } else {
                System.out.println("0 go to next page, 1 go to previous page, 2  go to my page, 3  go to a car by vin, 4 exit");
            }
        }
    }
}
