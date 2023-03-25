package Part_2;

public class Plane implements Vehicle{
    protected String vehicle_type = "plane";

    @Override
    public String vehicle_info() {
        return vehicle_type;
    }
}
