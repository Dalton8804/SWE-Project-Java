import java.util.HashMap;

public class CarDetail extends Page {

  enum Action {
    USER,
    EXIT,
    HOME,
    DEFAULT,
  }

  private ListOfCars carList;
  private ListOfUsers usersList;
  private Vehicle selectedVehicle;
  private HashMap<String, String> appState;

  CarDetail(
    HashMap<String, String> appState,
    ListOfCars carList,
    ListOfUsers usersList
  ) {
    super(appState);
    this.carList = carList;
    this.usersList = usersList;
  }

  public Action getAction(int actionCode) {
    switch (actionCode) {
      case 2:
        return Action.USER;
      case 3:
        return Action.HOME;
      case 4:
        return Action.EXIT;
      default:
        return Action.DEFAULT;
    }
  }

  @Override
  public String render() {
    int selectedCarIndex = Integer.parseInt(appState.get("selectedCar")) - 1;
    // Finds the currently selected car in list by Index
    if (selectedCarIndex >= 0 && selectedCarIndex < carList.size()) {
      selectedVehicle = carList.getCar(selectedCarIndex);
    } else {
      System.out.println("Invalid selection!");
      return "home";
    }

    return "default";
  }
}
