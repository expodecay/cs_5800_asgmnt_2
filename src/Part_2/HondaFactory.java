package Part_2;

public class HondaFactory extends AbstractFactory{
    private String factory_name;
    private Car car;
    private static HondaFactory instance =null; // Singleton

    private HondaFactory(){ // SET to private for singleton
        this.car = new HondaCar(); // specifically a honda
        factory_name = "Honda Factory";
    }

    public static HondaFactory getFactory(){// Enforces Singleton (must be static)
        if(instance == null){
            instance = new HondaFactory();
        }
        return instance;
    }

    @Override
    public void print_factory_name() {
        System.out.print(this.getClass().getName());
    }

    @Override
    public void build_vehicle() {
        System.out.println(factory_name + " built a " + this.car.vehicle_info());
    }

    @Override
    public void repair_vehicle() {
        System.out.println(factory_name + " repaired a " + this.car.vehicle_info());
    }

    @Override
    public void restore_vehicle() {
        System.out.println(factory_name + " restored a " + this.car.vehicle_info());
    }

    @Override
    public Vehicle get_vehicle() {
        return car;
    }


}
