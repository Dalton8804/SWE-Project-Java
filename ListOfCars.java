import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class ListOfCars implements Serializable {

  static ArrayList<Vehicle> carList;

  ListOfCars() {
    carList = new ArrayList<Vehicle>();
    try {
      FileInputStream fileIn = new FileInputStream(
        "../data/carListSerialization.txt"
      );
      ObjectInputStream in = new ObjectInputStream(fileIn);
      carList = (ArrayList<Vehicle>) in.readObject();
      in.close();
      fileIn.close();
    } catch (IOException i) {
      i.printStackTrace();
      System.out.println("IOException");
      return;
    } catch (ClassNotFoundException c) {
      c.printStackTrace();
      System.out.println("ClassNotFoundException");
      return;
    }
  }

  public void addCar(Vehicle car) {
    this.carList.add(car);
  }

  public Vehicle getCar(int index) {
    return carList.get(index);
  }

  public int size() {
    return carList.size();
  }

  public ArrayList<Vehicle> getListOfCars() {
    return this.carList;
  }

  public static void serialize() {
    try {
      FileOutputStream fos = new FileOutputStream(
        "../data/carListSerialization.txt"
      );
      ObjectOutputStream oos = new ObjectOutputStream(fos);
      oos.writeObject(carList);
    } catch (IOException i) {
      System.out.println("IOException on Serialization");
    }
  }

  public void removeCar(String VINtoRemove) {
    ArrayList<Vehicle> toRemove = new ArrayList<Vehicle>();
    for (Vehicle v : carList) {
      if (v.getVIN().equals(VINtoRemove)) {
        toRemove.add(v);
      }
    }
    if (toRemove.size() > 0) {
      carList.removeAll(toRemove);
      System.out.println("Removed vehicle with vin " + VINtoRemove);
    } else {
      System.out.println("No car with such vin.");
    }
  }

  public void removeCarByIndex(int index) {
    this.carList.remove(index);
  }
}
