package Part_2;

public class BoeingFactory extends AbstractFactory{
    private String factory_name;
    private Plane plane;
    private static BoeingFactory instance =null;

    private BoeingFactory(){
        this.plane = new BoeingPlane();
        factory_name = "Boeing Factory";
    }

    public static BoeingFactory getFactory(){
        if(instance == null){
            instance = new BoeingFactory();
        }
        return instance;
    }

    @Override
    public void print_factory_name() {
        System.out.print(this.getClass().getName());
    }

    @Override
    public void build_vehicle() {
        System.out.println(factory_name + " built a " + this.plane.vehicle_info());
    }

    @Override
    public void repair_vehicle() {
        System.out.println(factory_name + " repaired a " + this.plane.vehicle_info());
    }

    @Override
    public void restore_vehicle() {
        System.out.println(factory_name + " restored a " + this.plane.vehicle_info());
    }

    @Override
    public Vehicle get_vehicle() {
        return plane;
    }
}
