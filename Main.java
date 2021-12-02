import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String args[]) {

        UserList userlist = new UserList();

        // example serialization
        try {
            FileOutputStream fileOut =
            new FileOutputStream("userList.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(userlist);
            out.close();
            fileOut.close();
         } catch (IOException i) {
            i.printStackTrace();
         }

         // example deserialization
         UserList userlist2 = null;
         try {
            FileInputStream fileIn = new FileInputStream("userList.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            userlist2 = (UserList) in.readObject();
            in.close();
            fileIn.close();
         } catch (IOException i) {
            i.printStackTrace();
            return;
         } catch (ClassNotFoundException c) {
            c.printStackTrace();
            return;
         }
    }
}