import java.util.Scanner;
class Input {
    private static Input inputInstance = null;
    
    static Scanner in;
    
    private Input(){
        this.in = new Scanner(System.in);
    }

    public static Input getInstance(){
        if(inputInstance == null){
            return new Input();
        } else {
            return inputInstance;
        }
    }

    public void close(){
        in.close();
    }

    public int getInt(){
        int intInput = in.nextInt();
        in.nextLine();
        return  intInput;
    }

    public String getLine(){
        String stringInput = in.nextLine();
        return stringInput;
    }
    
}