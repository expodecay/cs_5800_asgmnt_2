package Part_2;

public class EmbraerFactory extends AbstractFactory{
    private String factory_name;
    private Plane plane;
    private static EmbraerFactory instance =null;

    private EmbraerFactory(){
        this.plane = new EmbraerPlane();
        factory_name = "Embraer Factory";
    }

    public static EmbraerFactory getFactory(){
        if(instance == null){
            instance = new EmbraerFactory();
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
