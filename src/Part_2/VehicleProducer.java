package Part_2;

public class VehicleProducer {

    public static AbstractFactory getFactory(String vehicle_type, String vehicle_make){
        AbstractFactory factory = null;

        if(vehicle_type.equals("Car")){
            if(vehicle_make.equals("Honda")){
                factory = HondaFactory.getFactory();
            }
            else if(vehicle_make.equals("Porsche")){
                factory = PorscheFactory.getFactory();
            }
            else if(vehicle_make.equals("Tesla")){
                factory = TeslaFactory.getFactory();
            }
        }
        return factory;
    }
}
