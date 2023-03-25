package Part_2;

public class BertramFactory extends AbstractFactory{
    private String factory_name;
    private Boat boat;
    private static BertramFactory instance =null; // Singleton

    private BertramFactory(){ // SET to private for singleton
        this.boat = new BertramBoat(); // specifically a honda
        factory_name = "Bertram Factory";
    }

    public static BertramFactory getFactory(){// Enforces Singleton (must be static)
        if(instance == null){
            instance = new BertramFactory();
        }
        return instance;
    }

    @Override
    public void print_factory_name() {
        System.out.print(this.getClass().getName());
    }

    @Override
    public void build_vehicle() {
        System.out.println(factory_name + " built a " + this.boat.vehicle_info());
    }

    @Override
    public void repair_vehicle() {
        System.out.println(factory_name + " repaired a " + this.boat.vehicle_info());
    }

    @Override
    public void restore_vehicle() {
        System.out.println(factory_name + " restored a " + this.boat.vehicle_info());
    }

    @Override
    public Vehicle get_vehicle() {
        return boat;
    }
}
