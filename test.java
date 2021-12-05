import java.util.HashMap;

public class test {
    public static void main(String args[]){
        HashMap<String,String> a = new HashMap<String,String>();
        a.put("username", "dalton");
        a.put("email", "davery@lamar.edu");
        System.out.println(a.get("username"));
    }
}
