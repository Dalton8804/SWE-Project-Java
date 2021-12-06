import java.util.HashMap;

public class CarDetail extends Page {

  enum Action {
    USER,
    EXIT,
    HOME,
    BUY,
    DEFAULT,
  }

  private ListOfCars carList;
  private ListOfUsers usersList;
  private Vehicle selectedVehicle;
  private HashMap<String, String> appState;
  private int selectedCarIndex;

  CarDetail(
    HashMap<String, String> appState,
    ListOfCars carList,
    ListOfUsers usersList
  ) {
    super(appState);
    this.carList = carList;
    this.usersList = usersList;
    this.selectedCarIndex = Integer.parseInt(appState.get("selectedCar")) - 1;
  }

  public Action getAction(int actionCode) {
    switch (actionCode) {
      case 0:
        return Action.BUY;
      case 1:
        return Action.USER;
      case 2:
        return Action.HOME;
      case 3:
        return Action.EXIT;
      default:
        return Action.DEFAULT;
    }
  }

  public boolean buyCar(Input input) {
    System.out.println(
      "Are you sure you would like to buy this car? 0 CONTINUE, 1 CANCEL"
    );
    int choice = input.getInt();
    if (choice == 1) {
      return false;
    }
    System.out.println("Enter your credit card number: ");
    String cardNumber = input.getLine();
    carList.removeCarByIndex(selectedCarIndex);
    return true;
  }

  @Override
  public String render() {
    Input input = Input.getInstance();
    // Finds the currently selected car in list by Index
    if (
      selectedCarIndex >= 0 && selectedCarIndex < carList.getListOfCars().size()
    ) {
      selectedVehicle = carList.getCar(selectedCarIndex);
    } else {
      System.out.println("Invalid selection!");
      return "home";
    }
    System.out.println(selectedVehicle.toString());

    while (true) {
      System.out.println("0 Buy car, 1 My Account, 2 Home, 3 EXIT");
      int actionCode = input.getInt();
      Action action = getAction(actionCode);
      switch (action) {
        case USER:
          return "account";
        case HOME:
          return "home";
        case BUY:
          if (buyCar(input)) {
            return "home";
          }
          break;
        case EXIT:
          return "exit";
        case DEFAULT:
          break;
      }
    }
  }
}
