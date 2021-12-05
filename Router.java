import java.util.HashMap;

public class Router {
    private HashMap<String, Page> allRoutes;
    private String currentRoute;
    private boolean running;
    private boolean dev;
    Router(String name, Page defaultPage){
        this.allRoutes = new HashMap<String,Page>();
        this.allRoutes.put(name, defaultPage);
        this.allRoutes.put("default", defaultPage);
        this.currentRoute = "default";
        this.dev = false;
    }

    // This enables debug logging
    public void logging(){
        this.dev = true;
    }

    public void addPage(String label, Page page){
        allRoutes.put(label, page);
    }

    public Page loadPage(){
        if(dev){
            System.out.println("Switching to " + currentRoute);
        }
        return allRoutes.get(currentRoute);
    }

    public void startRouter(){
        while(running){
            Page currentPage = loadPage();
            currentRoute = currentPage.render();
            if(dev){
                System.out.println("the next page " + currentRoute);
            }
        }
    }
}
