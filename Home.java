import java.util.HashMap;
public class Home extends Page {
    Home(HashMap<String, String> appState){
        super(appState);

    }
    @Override
    public String render() {
     return "nextpage";
    }
}
