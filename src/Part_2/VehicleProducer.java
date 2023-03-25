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
        if(vehicle_type.equals("Plane")){
            if(vehicle_make.equals("Airbus")){
                factory = AirbusFactory.getFactory();
            }
            else if(vehicle_make.equals("Boeing")){
                factory = BoeingFactory.getFactory();
            }
            else if(vehicle_make.equals("Embraer")){
                factory = EmbraerFactory.getFactory();
            }
        }
        if(vehicle_type.equals("Boat")){
            if(vehicle_make.equals("SeaRay")){
                factory = SeaRayFactory.getFactory();
            }
            else if(vehicle_make.equals("Mastercraft")){
                factory = MastercraftFactory.getFactory();
            }
            else if(vehicle_make.equals("Bertram")){
                factory = BertramFactory.getFactory();
            }
        }
        return factory;
    }
}
