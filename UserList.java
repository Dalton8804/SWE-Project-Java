import java.util.ArrayList;

class UserList{
    static ArrayList<User> ListOfUsers = new ArrayList<User>();
    UserList(User user){
        this.ListOfUsers.add(user);
    }
    UserList(){

    }
    public void addUser(User user){
        this.ListOfUsers.add(user);
    }
    public ArrayList<User> getUserList() {
        return ListOfUsers;
    }

    public static Boolean checkName(String name){
        for (User u: ListOfUsers){
            if (u.getUsername().equals(name)){
                return true;
            }
        }
        return false;
    }

}
