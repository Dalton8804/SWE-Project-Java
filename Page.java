import java.util.HashMap;

public abstract class Page {
    HashMap<String,String> AppState;

    Page(HashMap<String,String> AppState){ this.AppState = AppState;}
    
    public String render(){
        return "next route";
    }
}
