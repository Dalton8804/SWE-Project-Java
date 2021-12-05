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
        userList = new ArrayList<User>();
        try {
            FileInputStream fileIn = new FileInputStream("../data/userListSerialization.txt");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            userList = (ArrayList<User>) in.readObject();
            in.close();
            fileIn.close();
         } catch (IOException i) {
            return;
         } catch (ClassNotFoundException c) {
            return;
         }
    }

    public void addUser(User user){
        try{
            this.userList.add(user);
        }
        catch(NullPointerException n){
            this.userList = new ArrayList<User>();
            this.userList.add(user);
        }
    }

    public User getUser(int index){
        return userList.get(index);
    }

    public ArrayList<User> getUserList() {
        return this.userList;
    }

    public Boolean checkName(String name){
        if (userList==null)
            return false;
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
            FileOutputStream fos = new FileOutputStream("../data/userListSerialization.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(userList);
          }
          catch(IOException i){
             System.out.println("yuh");
          }
    }

    public void deleteUser(String removeName) {
        ArrayList<User> toRemove = new ArrayList<User>();
        for (User u: userList)
            if (u.getUsername().equals(removeName))
                toRemove.add(u);

        userList.removeAll(toRemove);
    }
}
