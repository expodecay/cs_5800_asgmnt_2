package Part_2;

public class Boat implements Vehicle{
    protected String vehicle_type = "plane";

    @Override
    public String vehicle_info() {
        return vehicle_type;
    }
}
