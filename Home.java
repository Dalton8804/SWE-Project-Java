import java.util.Collections;
import java.util.Comparator;
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
    DEFAULT,
  }

  private int carListCursor;
  private ListOfUsers userList;
  private ListOfCars carList;

  Home(
    HashMap<String, String> appState,
    ListOfCars carList,
    ListOfUsers userList
  ) {
    super(appState);
    this.carListCursor = -4;
    this.carList = carList;
    this.userList = userList;
  }

  public void getCarSelection(Input input) {
    System.out.println("Please enter an index:");
    String index = input.getLine();
    appState.put("selectedCar", index);
    return;
  }

  public Action getAction(int actionCode) {
    if (carListCursor == -4) {
      switch (actionCode) {
        case 0:
          return Action.GOTONEXTPAGE;
        case 1:
          return Action.GOTOUSER;
        case 2:
          return Action.EXIT;
        default:
          return Action.DEFAULT;
      }
    } else {
      switch (actionCode) {
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

  private void listCars() {
    System.out.println("Results for page " + (carListCursor / 4));
    for (
      int i = carListCursor;
      i < carListCursor + 4 && i < carList.size();
      i++
    ) {
      Vehicle c = carList.getCar(i);
      System.out.println(
        (i + 1) +
        ". Price: $" +
        c.getPrice() +
        ", Vin: " +
        c.getVIN() +
        ", Make: " +
        c.getMake() +
        ", Model: " +
        c.getModel()
      );
    }
    return;
  }

  private void nextPage() {
    if (carListCursor < carList.size() - 1) {
      this.carListCursor = carListCursor + 4;
      listCars();
    } else {
      System.out.println("No more pages...");
    }
  }

  private void prevPage() {
    if (this.carListCursor >= 4) {
      this.carListCursor = carListCursor - 4;
      listCars();
    } else {
      System.out.println("You are on the first page already");
    }
  }

    @Override
    public String render() {
        int sortingCounter = 0;
        System.out.println("Welcome to car app Home!");
        System.out.println("0 List cars for sale, 1 go to my page, 2 exit");
        Input input = Input.getInstance();
        while(true){  
            int actionCode = input.getInt();
            if (actionCode==0 && sortingCounter==0){
                sortOffer();
                sortingCounter++;
            }
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
            if(carListCursor == -4){
                System.out.println("0 List all cars for sale, 1 Go to my page, 3 Exit");
            } else {
                System.out.println("0 Go to next page, 1 Go to previous page, 2  Go to my account page, 3 Go to a car by vin, 4 Exit");
            }
        }
    }

    private void sortOffer() {
        System.out.println("Before we display the cars, would you like to sort by an attribute?");
        System.out.println("Sort by 1: Make, 2: Price, 3: Year, 4: None just let me see the cars please :)");
        Input input = Input.getInstance();
        int choice = input.getInt();
        switch (choice){
            case 1: 
                Collections.sort(carList.getListOfCars(), Comparator.comparing((Vehicle car) -> car.getMake()));
            break;
            case 2: 
                Collections.sort(carList.getListOfCars(), Comparator.comparing((Vehicle car) -> car.getPrice()));
            break;
            case 3: 
                Collections.sort(carList.getListOfCars(), Comparator.comparing((Vehicle car) -> car.getYear()));
            break;
            case 4: break;
        }
    }
}
