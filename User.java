import java.io.Serializable;
import java.util.Random;

public class User implements Serializable{
    private String username;
    private String email;
    private String password;
    private String dlNum;
    // arraylist of cars listed for sale
    User(String username, String email, String password, String dlNum){
        this.username = username;
        this.email = email;
        this.password = password;
        this.dlNum = dlNum;
    }
    // Simple constructor for testing. Delete this when no longer needed
    User(String username){
        this.username = username;
    }
    User(){};
    public void setPassword(String password){
        this.password = password;
    }
    public String getPassword(){
        return this.password;
    }
    public String getUsername() {
        return this.username;
    }
    public String getEmail() {
        return this.email;
    }
    public String getID(){
        return this.dlNum;
    }
}
