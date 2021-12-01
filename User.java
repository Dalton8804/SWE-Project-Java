public class User {
    private String username;
    private String email;
    private String password;
    private int id;
    User(String username, String email, String password,  int id){
        this.username = username;
        this.email = email;
        this.password = password;
        this.id = id;
    }
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
}
