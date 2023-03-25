package Part_2;

public class PorscheFactory extends AbstractFactory{
    private String factory_name;
    private Car car;
    private static PorscheFactory instance = null;

    private PorscheFactory(){
        this.car = new PorscheCar();
        factory_name = "Porsche Factory";
    }

    public static PorscheFactory getFactory(){
        if(instance == null){
            instance = new PorscheFactory();
        }
        return instance;
    }
    @Override
    public void print_factory_name() {
        System.out.println(this.getClass().getName());
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
