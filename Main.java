public class Main{
    public static void main(String args[]){
        Vehicle car = new Vehicle("12345678", "sedan", "toyota", "corolla",
                "American", 2021, 5000, new String[]{null}, "compact", "black",
                "I4", 34, "gasoline", "Beaumont", 340);
        System.out.println(car.model);
    }
}