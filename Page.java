import java.util.HashMap;
public abstract class Page {
    HashMap<String, String> appState;
    Page(HashMap<String, String> appState){
        this.appState = appState;
    }
    public abstract String render();
}
