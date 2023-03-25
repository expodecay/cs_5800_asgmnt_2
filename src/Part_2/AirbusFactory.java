package Part_2;

public class AirbusFactory extends AbstractFactory{
    private String factory_name;
    private Plane plane;
    private static AirbusFactory instance =null;

    private AirbusFactory(){
        this.plane = new AirbusPlane();
        factory_name = "Airbus Factory";
    }

    public static AirbusFactory getFactory(){
        if(instance == null){
            instance = new AirbusFactory();
        }
        return instance;
    }

    @Override
    public void print_factory_name() {
        System.out.print(this.getClass().getName());
    }

    @Override
    public void build_vehicle() {
        System.out.println(factory_name + " built a " + this.plane.vehicle_info() + "LOCATION" + this);
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
