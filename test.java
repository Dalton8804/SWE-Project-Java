<<<<<<< HEAD
import java.util.HashMap;
import java.util.ArrayList;

public class test {
    
    public static void main(String args[]){
        ListOfCars carList = new ListOfCars();

        carList = Sort.makeCars(1000, carList);
        ListOfCars.serialize();
    }
    
}
=======
import java.util.Arrays;
import java.util.Comparator;

public class test {
    User[] users = new User[]{
        new User("username", "email", "password", 1000),
        new User("dalton", "email", "password", 1000),
        new User("chandler", "email", "password", 1000)};

    Comparator<User> userComp = Comparator.comparing(User::getUsername);
    int[] arr = {2,3,1,5,1,6,2};
    /*Arrays.sort(arr);
    CONTEXT
    Arrays.sort giving errors, have no idea why
    sorry whoever tries this next :)
    
    */

}
>>>>>>> 1e1d282ee50080210ff42e07bd13a87b9775c630
