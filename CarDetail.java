import java.util.HashMap; 

public class CarDetail extends Page{

    private ListOfCars carList;
    private ListOfUsers usersList;
    private Vehicle selectedVehicle;
    private HashMap<String, String> appState;


    CarDetail(HashMap<String, String> appState, ListOfCars carList, ListOfUsers usersList){
        super(appState);
        this.carList = carList;
        this.usersList = usersList;
    }



    @Override
    public String render(){
        int selectedCarIndex = Integer.parseInt(appState.get("selectedCar")) - 1;
        // Finds the currently selected car in list by Index
        if(selectedCarIndex >= 0 && selectedCarIndex < carList.size()){
            selectedVehicle = carList.getCar(selectedCarIndex);
        }else{
            System.out.println("Invalid selection!");
            return "home";
        }

        

        return "default";
    }
}
