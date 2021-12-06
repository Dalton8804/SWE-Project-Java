<<<<<<< HEAD
import java.util.HashMap;
public abstract class Page {
    HashMap<String, String> appState;
    Page(HashMap<String, String> appState){
        this.appState = appState;
    }
    public abstract String render();
=======
public class Page {
    int value;
    Page(){}
    Page(int value){
        this.value = value;
    }


>>>>>>> 1e1d282ee50080210ff42e07bd13a87b9775c630
}
