import java.util.HashMap;

public class Router {
    HashMap<String, Page> allRoutes = new HashMap<String,Page>();
    String currentRoute;
    boolean running = true;
    
    public Page loadPage(){
        return this.allRoutes.get(currentRoute);
    }

    public void startRouter(){
        while(running){
            Page currentPage = loadPage();
            currentRoute = currentPage.render();
        }
    }
}
