import java.io.Serializable;
import java.util.ArrayList;


public class ListOfCars implements Serializable{
    ArrayList<Vehicle> carList = new ArrayList<Vehicle>();
    ListOfCars(Vehicle car){
        this.carList.add(car);
    }

    ListOfCars(){}

    public void addCar(Vehicle car){
        this.carList.add(car);
    }

    public Vehicle getCar(int index){
        return carList.get(index);
    }

    public ArrayList<Vehicle> getListOfCars(){
        return this.carList;
    }
    // This doesn't work. Not sure why yet
    //public String toString(){
        //String list = ListOfCars.get(0).getVIN() + ", ";
        //for(int i = 1; i < this.ListOfCars.size(); i++){
           //list.concat(ListOfCars.get(i).getVIN() + ", ");
        //}
        //return list;
    //}
}
