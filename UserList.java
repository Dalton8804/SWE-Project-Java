import java.io.Serializable;
import java.util.ArrayList;

class UserList implements Serializable{
    ArrayList<User> ListOfUsers = new ArrayList<User>();
    UserList(User user){
        this.ListOfUsers.add(user);
    }
    UserList(){}

    public void addUser(User user){
        this.ListOfUsers.add(user);
    }
    public ArrayList<User> getUserList() {
        return this.ListOfUsers;
    }

    public Boolean checkName(String name){
        for (User u: ListOfUsers){
            if (u.getUsername().equals(name)){
                return true;
            }
        }
        return false;
    }
    public User getUserByName(String username) {
        for (User u: ListOfUsers){
            if (u.getUsername().equals(username)){
                return u;
            }
        }
        return null;
    }
}
