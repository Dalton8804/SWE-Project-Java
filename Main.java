import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.plugins.tiff.ExifGPSTagSet;

public class Main {
   public static void main(String args[]) {

    }

    public static void exitApp(){
       ListOfCars.serialize();
       ListOfUsers.serialize();
    }
}