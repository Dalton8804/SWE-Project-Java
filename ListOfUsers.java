import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

class ListOfUsers implements Serializable{
    static ArrayList<User> userList;
   
    ListOfUsers(){
        try {
            FileInputStream fileIn = new FileInputStream("userListSerialization.txt");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            userList = (ArrayList<User>) in.readObject();
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

    public void addUser(User user){
        this.userList.add(user);
    }

    public User getUser(int index){
        return userList.get(index);
    }

    public ArrayList<User> getUserList() {
        return this.userList;
    }

    public Boolean checkName(String name){
        for (User u: userList){
            if (u.getUsername().equals(name)){
                return true;
            }
        }
        return false;
    }
    public User getUserByName(String username) {
        for (User u: userList){
            if (u.getUsername().equals(username)){
                return u;
            }
        }
        return null;
    }

    public static void serialize(){
        try{
            FileOutputStream fos = new FileOutputStream("userListSerialization.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(userList);
          }
          catch(IOException i){
             System.out.println("yuh");
          }
    }
}