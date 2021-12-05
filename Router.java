import java.util.HashMap;

public class Router {
    private HashMap<String, Page> allRoutes;
    private String currentRoute;
    private boolean running;

    Router(String name, Page defaultPage){
        this.allRoutes = new HashMap<String,Page>();
        this.allRoutes.put(name, defaultPage);
        this.allRoutes.put("default", defaultPage);
        this.currentRoute = "default";
    }

    public void addPage(String label, page){
        allRoutes.put(label, page);
    }

    public Page loadPage(){
        return allRoutes.get(currentRoute);
    }

    public void startRouter(){
        while(running){
            Page currentPage = loadPage();
            currentRoute = currentPage.render();
        }
    }
}
