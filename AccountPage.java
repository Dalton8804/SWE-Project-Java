import java.util.HashMap;

public class AccountPage {
    HashMap<String,String> appState;
    ListOfCars carList;
    ListOfUsers userList;
    AccountPage(HashMap<String,String> appState, ListOfCars carList, ListOfUsers userList){
        this.appState = appState;
        this.carList = carList;
        this.userList = userList;
    }
    String render(){
        return "Render AccountPage";
    }
}
