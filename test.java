import java.util.ArrayList;
import java.util.HashMap;

public class test {

  public static void main(String args[]) {
    ListOfCars carList = new ListOfCars();

    carList = Sort.makeCars(1000, carList);
    ListOfCars.serialize();
  }
}
