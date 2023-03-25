package Part_2;

public class MastercraftFactory extends AbstractFactory{
    private String factory_name;
    private Boat boat;
    private static MastercraftFactory instance =null; // Singleton

    private MastercraftFactory(){ // SET to private for singleton
        this.boat = new MastercraftBoat(); // specifically a honda
        factory_name = "Mastercraft Factory";
    }

    public static MastercraftFactory getFactory(){// Enforces Singleton (must be static)
        if(instance == null){
            instance = new MastercraftFactory();
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
