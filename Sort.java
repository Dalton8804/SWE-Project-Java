import java.lang.reflect.Array;
import java.util.*;

/*
    Vehicle name = new Vehicle((String VIN, String type, String make, String model,
    String country, int year, int mileage, String[] addedFeatures,
    String size, String color, String engine, int mpg, String fuelType,
    String currentLocation, double monthlyPayments));
 */
public class Sort
{

    private static ArrayList<Vehicle> sortBy(ArrayList<String> filters, ArrayList<Vehicle> carList) {
        ArrayList<Vehicle> finalCars = new ArrayList<>();

        for(int i=0;i<carList.size();i++)
        {
            //if(carList.get(i).addedFeatures )
        }
        return null;
    }

    public static ListOfCars makeCars(int num, ListOfCars carList)
    {

        for(int i = 0;i < num;i++)
        {
                String VIN = "";
                String model = "";
                String make = "";
                String type = "";
                String country = "";
                String size = "";
                String color = "";
                String transmission  = "";
                String engineCylinders = "";
                String fuelType = "";
                String currentLocation = "";
                int monthlyPayments = 0;
                int price = 0;
                country = "";
                int year = 0;
                int mileage = 0;
                int mpg = 0;

                String cars[] = {"Audi", "BMW", "Chevrolet", "Chrysler", "Dacia", "Dodge", "Ford", "Honda", "Jaguar", "Jeep", "Kia", "Land Rover", "Lexus", "Mazda", "Mitsubishi", "Nissan", "Opel", "Subaru", "Toyota", "Volkswagen", "Volvo"};

                String Audi[] = {"100","100 Avant","80","80 Avant","80 Cabrio","90","A1","A2","A3","A3 Cabriolet","A3 Limuzina","A3 Sportback","A4","A4 Allroad","A4 Avant","A4 Cabriolet","A5","A5 Cabriolet","A5 Sportback","A6","A6 Allroad","A6 Avant","A7","A8","A8 Long","Q3","Q5","Q7","R8","RS4 Cabriolet","RS4/RS4 Avant","RS5","RS6 Avant","RS7","S3/S3 Sportback","S4 Cabriolet","S4/S4 Avant","S5/S5 Cabriolet","S6/RS6","S7","S8","SQ5","TT Coupé","TT Roadster","TTS"};
                String BMW[] = {"i3","i8","M3","M4","M5","M6","Rad 1","Rad 1 Cabrio","Rad 1 Coupé","Rad 2","Rad 2 Active Tourer","Rad 2 Coupé","Rad 2 Gran Tourer","Rad 3","Rad 3 Cabrio","Rad 3 Compact","Rad 3 Coupé","Rad 3 GT","Rad 3 Touring","Rad 4","Rad 4 Cabrio","Rad 4 Gran Coupé","Rad 5","Rad 5 GT","Rad 5 Touring","Rad 6","Rad 6 Cabrio","Rad 6 Coupé","Rad 6 Gran Coupé","Rad 7","Rad 8 Coupé","X1","X3","X4","X5","X6","Z3","Z3 Coupé","Z3 Roadster","Z4","Z4 Roadster"};
                String Chevrolet[] = {"Alero","Aveo","Camaro","Captiva","Corvette","Cruze","Cruze SW","Epica","Equinox","Evanda","HHR","Kalos","Lacetti","Lacetti SW","Lumina","Malibu","Matiz","Monte Carlo","Nubira","Orlando","Spark","Suburban","Tacuma","Tahoe","Trax"};
                String Chrysler[] = {"300 C","300 C Touring","300 M","Crossfire","Grand Voyager","LHS","Neon","Pacifica","Plymouth","PT Cruiser","Sebring","Sebring Convertible","Stratus","Stratus Cabrio","Town & Country","Voyager"};
                String Dacia[] = {"Dokker","Duster","Lodgy","Logan","Logan MCV","Logan Van","Sandero","Solenza"};
                String Dodge[] = {"Avenger","Caliber","Challenger","Charger","Grand Caravan","Journey","Magnum","Nitro","RAM","Stealth","Viper"};
                String Ford[] = {"Aerostar","B-Max","C-Max","Cortina","Cougar","Edge","Escort","Escort Cabrio","Escort kombi","Explorer","F-150","F-250","Fiesta","Focus","Focus C-Max","Focus CC","Focus kombi","Fusion","Galaxy","Grand C-Max","Ka","Kuga","Maverick","Mondeo","Mondeo Combi","Mustang","Orion","Puma","Ranger","S-Max","Sierra","Street Ka","Tourneo Connect","Tourneo Custom","Transit","Transit","Transit Bus","Transit Connect LWB","Transit Courier","Transit Custom","Transit kombi","Transit Tourneo","Transit Valnik","Transit Van","Transit Van 350","Windstar"};
                String Honda[] = {"Accord","Accord Coupé","Accord Tourer","City","Civic","Civic Aerodeck","Civic Coupé","Civic Tourer","Civic Type R","CR-V","CR-X","CR-Z","FR-V","HR-V","Insight","Integra","Jazz","Legend","Prelude"};
                String Jaguar[] = {"Daimler","F-Pace","F-Type","S-Type","Sovereign","X-Type","X-model Estate","XE","XF","XJ","XJ12","XJ6","XJ8","XJ8","XJR","XK","XK8 Convertible","XKR","XKR Convertible"};
                String Jeep[] = {"Cherokee","Commander","Compass","Grand Cherokee","Patriot","Renegade","Wrangler"};
                String Kia[] = {"Avella","Besta","Carens","Carnival","Cee`d","Cee`d SW","Cerato","K 2500","Magentis","Opirus","Optima","Picanto","Pregio","Pride","Pro Cee`d","Rio","Rio Combi","Rio sedan","Sephia","Shuma","Sorento","Soul","Sportage","Venga"};
                String LandRover[] = {"109","Defender","Discovery","Discovery Sport","Freelander","Range Rover","Range Rover Evoque","Range Rover Sport"};
                String Lexus[] = {"CT","GS","GS 300","GX","IS","IS 200","IS 250 C","IS-F","LS","LX","NX","RC F","RX","RX 300","RX 400h","RX 450h","SC 430"};
                String Mazda[] = {"121","2","3","323","323 Combi","323 Coupé","323 F","5","6","6 Combi","626","626 Combi","B-Fighter","B2500","BT","CX-3","CX-5","CX-7","CX-9","Demio","MPV","MX-3","MX-5","MX-6","Premacy","RX-7","RX-8","Xedox 6"};
                String Mitsubishi[] = {"3000 GT","ASX","Carisma","Colt","Colt CC","Eclipse","Fuso canter","Galant","Galant Combi","Grandis","L200","L200 Pick up","L200 Pick up Allrad","L300","Lancer","Lancer Combi","Lancer Evo","Lancer Sportback","Outlander","Pajero","Pajeto Pinin","Pajero Pinin Wagon","Pajero Sport","Pajero Wagon","Space Star"};
                String Nissan[] = {"100 NX","200 SX","350 Z","350 Z Roadster","370 Z","Almera","Almera Tino","Cabstar E - T","Cabstar TL2 Valnik","e-NV200","GT-R","Insterstar","Juke","King Cab","Leaf","Maxima","Maxima QX","Micra","Murano","Navara","Note","NP300 Pickup","NV200","NV400","Pathfinder","Patrol","Patrol GR","Pickup","Pixo","Primastar","Primastar Combi","Primera","Primera Combi","Pulsar","Qashqai","Serena","Sunny","Terrano","Tiida","Trade","Vanette Cargo","X-Trail"};
                String Opel[] = {"Agila","Ampera","Antara","Astra","Astra cabrio","Astra caravan","Astra coupé","Calibra","Campo","Cascada","Corsa","Frontera","Insignia","Insignia kombi","Kadett","Meriva","Mokka","Movano","Omega","Signum","Vectra","Vectra Caravan","Vivaro","Vivaro Kombi","Zafira"};
                String Subaru[] = {"BRZ","Forester","Impreza","Impreza Wagon","Justy","Legacy","Legacy Wagon","Legacy Outback","Levorg","Outback","SVX","Tribeca","Tribeca B9","XV"};
                String Toyota[] = {"4-Runner","Auris","Avensis","Avensis Combi","Avensis Van Verso","Aygo","Camry","Carina","Celica","Corolla","Corolla Combi","Corolla sedan","Corolla Verso","FJ Cruiser","GT86","Hiace","Hiace Van","Highlander","Hilux","Land Cruiser","MR2","Paseo","Picnic","Prius","RAV4","Sequoia","Starlet","Supra","Tundra","Urban Cruiser","Verso","Yaris","Yaris Verso"};
                String Volkswagen[] = {"Amarok","Beetle","Bora","Bora Variant","Caddy","Caddy Van","Life","California","Caravelle","CC","Crafter","Crafter Van","Crafter Kombi","CrossTouran","Eos","Fox","Golf","Golf Cabrio","Golf Plus","Golf Sportvan","Golf Variant","Jetta","LT","Lupo","Multivan","New Beetle","New Beetle Cabrio","Passat","Passat Alltrack","Passat CC","Passat Variant","Passat Variant Van","Phaeton","Polo","Polo Van","Polo Variant","Scirocco","Sharan","T4","T4 Caravelle","T4 Multivan","T5","T5 Caravelle","T5 Multivan","T5 Transporter Shuttle","Tiguan","Touareg","Touran"};
                String Volvo[] = {"240","340","360","460","850","850 kombi","C30","C70","C70 Cabrio","C70 Coupé","S40","S60","S70","S80","S90","V40","V50","V60","V70","V90","XC60","XC70","XC90"};

                make = cars[(int)Math.floor(Math.random()*(cars.length)+0)];

                if(make.equals("Audi"))
                    model = Audi[(int)Math.floor(Math.random()*(Audi.length)+0)];
                else if(make.equals("BMW"))
                    model = BMW[(int)Math.floor(Math.random()*(BMW.length)+0)];
                else if(make.equals("Chevrolet"))
                    model = Chevrolet[(int)Math.floor(Math.random()*(Chevrolet.length)+0)];
                else if(make.equals("Chrysler"))
                    model = Chrysler[(int)Math.floor(Math.random()*(Chrysler.length)+0)];
                else if(make.equals("Dacia"))
                    model = Dacia[(int)Math.floor(Math.random()*(Dacia.length)+0)];
                else if(make.equals("Dodge"))
                    model = Dodge[(int)Math.floor(Math.random()*(Dodge.length)+0)];
                else if(make.equals("Ford"))
                    model = Ford[(int)Math.floor(Math.random()*(Ford.length)+0)];
                else if(make.equals("Honda"))
                    model = Honda[(int)Math.floor(Math.random()*(Honda.length)+0)];
                else if(make.equals("Jaguar"))
                    model = Jaguar[(int)Math.floor(Math.random()*(Jaguar.length)+0)];
                else if(make.equals("Jeep"))
                    model = Jeep[(int)Math.floor(Math.random()*(Jeep.length)+0)];
                else if(make.equals("Kia"))
                    model = Kia[(int)Math.floor(Math.random()*(Kia.length)+0)];
                else if(make.equals("Land Rover"))
                    model = LandRover[(int)Math.floor(Math.random()*(LandRover.length)+0)];
                else if(make.equals("Lexus"))
                    model = Lexus[(int)Math.floor(Math.random()*(Lexus.length)+0)];
                else if(make.equals("Mazda"))
                    model = Mazda[(int)Math.floor(Math.random()*(Mazda.length)+0)];
                else if(make.equals("Mitsubishi"))
                    model = Mitsubishi[(int)Math.floor(Math.random()*(Mitsubishi.length)+0)];
                else if(make.equals("Nissan"))
                    model = Nissan[(int)Math.floor(Math.random()*(Nissan.length)+0)];
                else if(make.equals("Opel"))
                    model = Opel[(int)Math.floor(Math.random()*(Opel.length)+0)];
                else if(make.equals("Subaru"))
                    model = Subaru[(int)Math.floor(Math.random()*(Subaru.length)+0)];
                else if(make.equals("Toyota"))
                    model = Toyota[(int)Math.floor(Math.random()*(Toyota.length)+0)];
                else if(make.equals("Volkswagen"))
                    model = Volkswagen[(int)Math.floor(Math.random()*(Volkswagen.length)+0)];
                else if(make.equals("Volvo"))
                    model = Volvo[(int)Math.floor(Math.random()*(Volvo.length)+0)];

                String colors[] = {"white", "black", "gray", "silver", "red", "blue"};
                color = colors[(int)Math.floor(Math.random()*(colors.length)+0)];

                mileage = (int)Math.floor(Math.random()*(150001)+0);//milage between 0-150,000

                String states[] = {"Alabama","Arizona", "California", "Colorado", "Connecticut","Delaware", "Florida", "Georgia", "Iowa", "Idaho", "Illinois", "Indiana", "Kansas", "Kentucky", "Louisiana", "Massachusetts", "Maryland", "Maine", "Michigan", "Minnesota", "Missouri", "Mississippi", "Montana", "North Carolina", " North Dakota", "Nebraska", "New Hampshire", "New Jersey", "New Mexico", "Nevada", "New York", "Ohio", "Oklahoma", "Oregon", "Pennsylvania", "Rhode Island", "South Carolina", "South Dakota", "Tennessee", "Texas", "Utah", "Virginia", "Virgin Islands", "Vermont", "Washington", "Wisconsin", "West Virginia", "Wyoming"};
                currentLocation = states[(int)Math.floor(Math.random()*(states.length)+0)];

                year = (int)Math.floor(Math.random()*(2021-2010)+2010);//not accurate that would take a lot of work

                String countryManufacture[] = {"China", "United States", "Japan", "Germany", "India", "Mexico"};
                if(make.equals("Tesla"))
                    country = "United States";
                else
                    country = countryManufacture[(int)Math.floor(Math.random()*(countryManufacture.length)+0)];

                String optFeatures[] = {"bluetooth", "navigation system", "car lighter", "leather seats", "heated seats", "cooled seats", "keyless starter"};
                String[] addedFeatures = new String[(int)Math.floor(Math.random()*(optFeatures.length)+0)];
                HashSet<String> temp = new HashSet<>();
                int w = 0;
                String othertemp;
                int count = addedFeatures.length;
                while (0 < count && w < addedFeatures.length) {
                    othertemp = optFeatures[(int) Math.floor(Math.random() * (optFeatures.length) + 0)];
                    if(temp.contains(othertemp))
                        continue;
                    else
                    {
                        temp.add(othertemp);
                        addedFeatures[w] = othertemp;
                        w++;
                        count--;
                    }
                }

                monthlyPayments = (int) Math.floor(Math.random() * (600) + 400);

                mpg = (int) Math.floor(Math.random() * (36-20) + 20);

                String type1[] = {"coupe", "crossover", "truck", "sedan", "sports car", "hatchback"};//this will be very off so keep that in mind!!!!
                type = type1[(int)Math.floor(Math.random()*(type1.length)+0)];

                String fuels[] = {"diesel", "gasoline"};
                fuelType = fuels[(int)Math.floor(Math.random()*(fuels.length)+0)];
                //we need to add like 100 electric cars or something.--------------------------------------------------------------------------------------------------------------------------------

                String transmission1[] = {"Manual", "Automatic", "CVT", "Semi-automatic", "dual-clutch"};
                transmission = transmission1[(int)Math.floor(Math.random()*(transmission1.length)+0)];

                String cylinders[] = {"4 cylinder engine", "5 cylinder engine", "6 cylinder engine", "7 cylinder engine", "8 cylinder engine"};
                engineCylinders = cylinders[(int)Math.floor(Math.random()*(cylinders.length)+0)];

                String sizes[] = {"compact", "mid-size", "full-size"};
                if(model.equals("truck"))//add more special cases later perhaps
                    size = sizes[(int)Math.floor(Math.random()*(sizes.length-1)+1)];//excluding compact
                else if(model.equals(""))//find what models are too small for full-sized
                    size = sizes[(int)Math.floor(Math.random()*(sizes.length-1)+0)];//excluding full-size
                else
                    size = sizes[(int)Math.floor(Math.random()*(sizes.length)+0)];//the rest


                Vehicle newCar = new Vehicle(VIN, type, make, model,
                        country, year, mileage, addedFeatures,
                        size, color, transmission, engineCylinders,
                        mpg, fuelType, currentLocation, monthlyPayments, price);


                carList.addCar(newCar);
            }
            return carList;
        }
}